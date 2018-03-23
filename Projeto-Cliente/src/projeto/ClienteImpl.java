package projeto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jhana
 */
public class ClienteImpl extends UnicastRemoteObject implements ClienteChatInterface{

    TelaCliente telaCliente;
    
    public ClienteImpl(TelaCliente telaCliente) throws RemoteException {
        super();
        this.telaCliente = telaCliente;
    }

    @Override
    public void receberMensagemServidor(String apelidoOrigem, String mensagem) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receberNovaConexao(String apelido, String nome) throws RemoteException {
        telaCliente.ListarClientes(apelido, nome);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receberDesconexao(String apelido, String nome) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
