package projeto;

/**
 *
 * @author strei
 */
public class Clientes {
    private String Nome, Apelido, IP;
    private int Porta;

    public Clientes(String Nome, String Apelido, String IP, int Porta) {
        this.Nome = Nome;
        this.Apelido = Apelido;
        this.IP = IP;
        this.Porta = Porta;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Apelido
     */
    public String getApelido() {
        return Apelido;
    }

    /**
     * @param Apelido the Apelido to set
     */
    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    /**
     * @return the IP
     */
    public String getIP() {
        return IP;
    }

    /**
     * @param IP the IP to set
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * @return the Porta
     */
    public int getPorta() {
        return Porta;
    }

    /**
     * @param Porta the Porta to set
     */
    public void setPorta(int Porta) {
        this.Porta = Porta;
    }
}
