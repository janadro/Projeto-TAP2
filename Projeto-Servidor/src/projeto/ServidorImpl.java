package projeto;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jhana
 */
public class ServidorImpl extends UnicastRemoteObject implements ServidorChatInterface {
    private final TelaServidor telaServidor;
    private final ArrayList<Cliente> listaClientes;
    private ClienteChatInterface cliente;
            
    public ServidorImpl(TelaServidor telaServidor) throws RemoteException {
        super();
        this.telaServidor = telaServidor;
        this.listaClientes = new ArrayList<>();
    }

    @Override
    public int receberMensagemCliente(String apelidoOrigem, String apelidoDestino, String mensagem) throws RemoteException {
        try {
            if(apelidoDestino.equals("Todos")) {
                for(int i=0;i<listaClientes.size();i++) {
                    cliente = (ClienteChatInterface) Naming.lookup("rmi://" + listaClientes.get(i).getIP() + 
                        ":" + listaClientes.get(i).getPorta() + "/olaMundo");
                    cliente.receberMensagemServidor("[Todos] " + apelidoOrigem, mensagem);
                }
                telaServidor.listarMensagens(apelidoOrigem, apelidoDestino);
                return 0;
            }
            
            int origem = 0, destino = -1;
            for(int i=0;i<listaClientes.size();i++) {
                if(listaClientes.get(i).getApelido().equals(apelidoOrigem))
                    origem = i;
                if(listaClientes.get(i).getApelido().equals(apelidoDestino))
                    destino = i;
            }
            
            if(destino == -1)
                return 1;
                    
            cliente = (ClienteChatInterface) Naming.lookup("rmi://" + listaClientes.get(origem).getIP() + 
                    ":" + listaClientes.get(origem).getPorta() + "/olaMundo");
            cliente.receberMensagemServidor("Para [" + apelidoDestino + "]", mensagem);
            cliente = (ClienteChatInterface) Naming.lookup("rmi://" + listaClientes.get(destino).getIP() + 
                    ":" + listaClientes.get(destino).getPorta() + "/olaMundo");
            cliente.receberMensagemServidor("De [" + apelidoOrigem + "]", mensagem);
            
            telaServidor.listarMensagens(apelidoOrigem, apelidoDestino);
            return 0;
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

    @Override
    public int conectar(String apelido, String nome, String ipCliente, String portaCliente) throws RemoteException {
        try {
            // Percorre toda a lista e verifica se o Apelido ou a Porta ja estão sendo utilizados, se estiver retorna 1
            for(int i=0;i<listaClientes.size();i++)
                if(listaClientes.get(i).getApelido().equals(apelido) || listaClientes.get(i).getPorta() == Integer.parseInt(portaCliente))
                    return 1;

            // Cria um novo Cliente e adiciona a lista de clientes do servidor
            Cliente c = new Cliente(nome, apelido, ipCliente, Integer.parseInt(portaCliente));
            listaClientes.add(c);
            // Informa ao servidor o novo cliente conectado
            telaServidor.adicionarCliente(apelido, nome, ipCliente, portaCliente);

            // Informa a nova Lista de Cliente para todos os clientes
            for(int i=0;i<listaClientes.size();i++) {
                cliente = (ClienteChatInterface) Naming.lookup("rmi://" + listaClientes.get(i).getIP() + ":" + listaClientes.get(i).getPorta() + "/olaMundo");
                for(int j=0;j<listaClientes.size();j++)
                    cliente.receberNovaConexao(listaClientes.get(j).getApelido(), listaClientes.get(j).getNome());
            }
            return 0;
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

    @Override
    public void desconectar(String apelido, String ipCliente, String portaCliente) throws RemoteException {
        try {
            int indice = 0;
            for(int i=0;i<listaClientes.size();i++) {
                cliente = (ClienteChatInterface) Naming.lookup("rmi://" + listaClientes.get(i).getIP() + ":" + listaClientes.get(i).getPorta() + "/olaMundo");
                cliente.receberDesconexao(apelido, null);
                
                if(listaClientes.get(i).getApelido().equals(apelido))
                    indice = i;
            }
            
            listaClientes.remove(indice);
            telaServidor.removerCliente(apelido);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
}
