package projeto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteImpl extends UnicastRemoteObject implements ClienteChatInterface{
    private final TelaCliente telaCliente;
    
    public ClienteImpl(TelaCliente telaCliente) throws RemoteException {
        super();
        this.telaCliente = telaCliente;
    }

    @Override
    public void receberMensagemServidor(String apelidoOrigem, String mensagem) throws RemoteException {
        try {
            telaCliente.receberMensagem(apelidoOrigem, mensagem);
        } catch (Exception ex) {
            Logger.getLogger(ClienteImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void receberNovaConexao(String apelido, String nome) throws RemoteException {
        telaCliente.adicionarCliente(apelido, nome);
    }

    @Override
    public void receberDesconexao(String apelido, String nome) throws RemoteException {
        telaCliente.removerCliente(apelido, nome);
    }
    
}
