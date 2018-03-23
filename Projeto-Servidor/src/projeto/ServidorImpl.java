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
    private ArrayList<Clientes> ListaClientes;
    private ClienteChatInterface cliente;
            
    public ServidorImpl() throws RemoteException {
        super();
        this.ListaClientes = new ArrayList<>();
    }

    @Override
    public int receberMensagemCliente(String apelidoOrigem, String apelidoDestino, String mensagem) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int conectar(String apelido, String nome, String ipCliente, String portaCliente) throws RemoteException {
            try {
                for(int i=0;i<ListaClientes.size();i++)
                    if(ListaClientes.get(i).getApelido().equals(apelido))
                        return 1;
                Clientes c = new Clientes(nome, apelido, ipCliente, Integer.parseInt(portaCliente));
                ListaClientes.add(c);

                for(int i=0;i<ListaClientes.size();i++) {
                    cliente = (ClienteChatInterface) Naming.lookup("rmi://" + ListaClientes.get(i).getIP() + ":" + ListaClientes.get(i).getPorta() + "/olaMundo");
                    
                    for(int j=0;j<ListaClientes.size();j++)
                        if(ListaClientes.get(i).getApelido().equals(apelido))
                            cliente.receberNovaConexao(ListaClientes.get(j).getApelido(), ListaClientes.get(j).getNome());
                }
                
                return 0;
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desconectar(String apelido, String ipCliente, String portaCliente) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
