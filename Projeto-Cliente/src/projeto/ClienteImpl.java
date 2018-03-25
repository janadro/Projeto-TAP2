package projeto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jhana
 */
public class ClienteImpl extends UnicastRemoteObject implements ClienteChatInterface{
    private final TelaCliente telaCliente;
    
    public ClienteImpl(TelaCliente telaCliente) throws RemoteException {
        super();
        this.telaCliente = telaCliente;
    }

    @Override
    public void receberMensagemServidor(String apelidoOrigem, String mensagem) throws RemoteException {
        telaCliente.receberMensagem(apelidoOrigem, mensagem);
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
