package projeto;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import sun.rmi.registry.RegistryImpl;

/**
 *
 * @author jhana
 */
public class TelaCliente extends javax.swing.JFrame {
    private String ServidorIP;
    private int ServidorPorta;
    private String ClienteNome, ClienteApelido, ClienteIP;
    private int ClientePorta;
    private ServidorChatInterface servidor;
    private DefaultListModel listModel;
    
    public TelaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF_ServidorIP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_ServidorPorta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_ClienteNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TF_ClienteApelido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TF_ClientePorta = new javax.swing.JTextField();
        B_Login = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        L_UsuariosAtivos = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TP_Chat = new javax.swing.JTextPane();
        TF_Mensagem = new javax.swing.JTextField();
        B_Enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CLIENTE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("DADOS DO SERVIDOR QUE DESEJA SE CONECTAR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("IP:");

        TF_ServidorIP.setText("localhost");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PORTA:");

        TF_ServidorPorta.setText("1099");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DADOS CLIENTES");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("NOME:");

        TF_ClienteNome.setText("teste");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("APELIDO:");

        TF_ClienteApelido.setText("muitoloko");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("PORTA:");

        TF_ClientePorta.setText("1098");

        B_Login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B_Login.setText("Login");
        B_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LoginActionPerformed(evt);
            }
        });

        B_Logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B_Logout.setText("Logout");
        B_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LogoutActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("USUÁRIOS ATIVOS");

        jScrollPane1.setToolTipText("");

        L_UsuariosAtivos.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        L_UsuariosAtivos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(L_UsuariosAtivos);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("CHAT");

        TP_Chat.setEditable(false);
        jScrollPane2.setViewportView(TP_Chat);

        B_Enviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B_Enviar.setText("Enviar");
        B_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_EnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TF_ServidorIP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TF_ServidorPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(TF_ClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(TF_ClienteApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TF_ClientePorta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(B_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(TF_Mensagem)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B_Enviar))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_ServidorIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_ServidorPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TF_ClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TF_ClienteApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_ClientePorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Login)
                            .addComponent(B_Logout))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_Mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Enviar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        
        ClienteIP = "localhost";
        listModel = new DefaultListModel();
        adicionarCliente("Todos", null);
        
        B_Logout.setEnabled(false);
        TF_Mensagem.setEnabled(false);
        B_Enviar.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void B_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LoginActionPerformed
        try {
            if(TF_ServidorIP.getText().isEmpty() || TF_ServidorPorta.getText().isEmpty() || TF_ClienteNome.getText().isEmpty() ||
                    TF_ClienteApelido.getText().isEmpty() || TF_ClientePorta.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
                return;
            }
            ServidorIP = TF_ServidorIP.getText();
            ServidorPorta = Integer.parseInt(TF_ServidorPorta.getText());
            ClienteNome = TF_ClienteNome.getText();
            ClienteApelido = TF_ClienteApelido.getText();
            ClientePorta = Integer.parseInt(TF_ClientePorta.getText());
            
            
            // Passo 4 - Registrando o serviço em uma determinada porta.
            RegistryImpl registryImpl = new RegistryImpl(ClientePorta);

            // Passo 5 - Instanciando a classe ClienteImpl que é do tipo ClienteInterface.
            ClienteChatInterface cliente = new ClienteImpl(this);

            // Passo 6
            // Possibilitando que a instância contendo métodos remotos fique visível ao Servidor. Além do IP e PORTA, deve-se associar um nome a instância.
            // Parâmetros: String (IP, Porta e nome do serviço) e Objeto com métodos remotos.
            Naming.rebind("rmi://" + ClienteIP + ":" + ClientePorta + "/olaMundo", cliente);
            JOptionPane.showMessageDialog(rootPane, "Cliente registrado!");

            // Passo 7
            // Recuperando o objeto remoto do servidor.
            // Para obtê-lo é necessário indicar o IP, Porta e Nome do serviço (nome associado a instância do objeto remoto)
            servidor = (ServidorChatInterface) Naming.lookup("rmi://" + ServidorIP + ":" + ServidorPorta + "/olaMundo");
            int resultado = servidor.conectar(ClienteApelido, ClienteNome, ClienteIP, Integer.toString(ClientePorta));
            
            if(resultado == 0) {
                habilitarDesabilitarCampos(false);
                JOptionPane.showMessageDialog(rootPane, "Conectado com sucesso!");
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Erro ao conectar. Apelido ou Porta já estão sendo usados!");
        } catch (RemoteException | MalformedURLException | NotBoundException ex) {
            //JOptionPane.showMessageDialog(rootPane, "Erro inesperado!");
            JOptionPane.showMessageDialog(rootPane, "Erro ao conectar. Apelido ou Porta já estão sendo usados!");
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_LoginActionPerformed

    private void B_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LogoutActionPerformed
        try {
            servidor.desconectar(ClienteApelido, ClienteIP, Integer.toString(ClientePorta));
            JOptionPane.showMessageDialog(rootPane, "Você se desconectou!");
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro inesperado!");
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_LogoutActionPerformed

    private void B_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_EnviarActionPerformed
        try {
            if(TF_Mensagem.getText().isEmpty())
                return;
            
            String apelidoDestino = L_UsuariosAtivos.getSelectedValue();
            String mensagem = TF_Mensagem.getText();
            int resultado = servidor.receberMensagemCliente(ClienteApelido, apelidoDestino, mensagem);
            
            TF_Mensagem.setText("");
            if(resultado == 1)
                JOptionPane.showMessageDialog(rootPane, "Erro inesperado ao enviar mensagem!");
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro inesperado!");
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_EnviarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Enviar;
    private javax.swing.JButton B_Login;
    private javax.swing.JButton B_Logout;
    private javax.swing.JList<String> L_UsuariosAtivos;
    private javax.swing.JTextField TF_ClienteApelido;
    private javax.swing.JTextField TF_ClienteNome;
    private javax.swing.JTextField TF_ClientePorta;
    private javax.swing.JTextField TF_Mensagem;
    private javax.swing.JTextField TF_ServidorIP;
    private javax.swing.JTextField TF_ServidorPorta;
    private javax.swing.JTextPane TP_Chat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    protected void receberMensagem(String apelido, String mensagem) {
        TP_Chat.setText(TP_Chat.getText() + apelido + ": " + mensagem + "\n");
    }
    
    protected void adicionarCliente(String apelido, String nome) {
        for(int i=0;i<listModel.size();i++)
            if(ClienteApelido.equals(apelido) || listModel.getElementAt(i).toString().equals(apelido))
                return;
        
        L_UsuariosAtivos.removeAll();
        listModel.addElement(apelido);
        L_UsuariosAtivos.setModel(listModel);
        L_UsuariosAtivos.setSelectedIndex(0);
    }
    
    protected void removerCliente(String apelido, String nome) {
        for(int i=0;i<listModel.size();i++)
            if(listModel.getElementAt(i).equals(apelido))
                listModel.remove(i);
        
        if(ClienteApelido.equals(apelido)) {
            habilitarDesabilitarCampos(true);
            
            listModel.removeAllElements();
            listModel.addElement("Todos");
        }
        L_UsuariosAtivos.removeAll();
        L_UsuariosAtivos.setModel(listModel);
        L_UsuariosAtivos.setSelectedIndex(0);
    }
    
    private void habilitarDesabilitarCampos(boolean comando) {
        TF_ServidorIP.setEnabled(comando);
        TF_ServidorPorta.setEnabled(comando);
        TF_ClienteNome.setEnabled(comando);
        TF_ClienteApelido.setEnabled(comando);
        TF_ClientePorta.setEnabled(comando);
        
        B_Login.setEnabled(comando);
        B_Logout.setEnabled(!comando);
        TF_Mensagem.setEnabled(!comando);
        B_Enviar.setEnabled(!comando);
    }
}
