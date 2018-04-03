package projeto;

public class Cliente {
    private String Nome, Apelido, IP;
    private int Porta;

    public Cliente(String Nome, String Apelido, String IP, int Porta) {
        this.Nome = Nome;
        this.Apelido = Apelido;
        this.IP = IP;
        this.Porta = Porta;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public int getPorta() {
        return Porta;
    }

    public void setPorta(int Porta) {
        this.Porta = Porta;
    }
}
