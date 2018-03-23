package projeto;

import java.rmi.*;
/**
 *
 * @author jhana
 */
public interface ClienteChatInterface extends Remote {
  
    // Receber mensagem do Servidor
    public void receberMensagemServidor(String apelidoOrigem, String mensagem) throws RemoteException;
    
    // Receber apelido e o nome de um cliente que acabou de se conectar no Servidor
    public void receberNovaConexao(String apelido, String nome) throws RemoteException;
    
    // Receber apelido e o nome de um cliente que acabou de se desconectar do Servidor
    public void receberDesconexao(String apelido, String nome) throws RemoteException;
}
