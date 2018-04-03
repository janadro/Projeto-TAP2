package projeto;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.rmi.registry.RegistryImpl;

public class TelaServidor extends javax.swing.JFrame {
    private String ServidorIP;
    private int ServidorPorta;
    private DefaultTableModel tableModel;
    private DefaultListModel listModel;
    
    public TelaServidor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_PortaServidor = new javax.swing.JTextField();
        B_Registrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Clientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        L_Relatorios = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("SERVIDOR");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("INFORME A PORTA:");

        TF_PortaServidor.setText("1099");

        B_Registrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B_Registrar.setText("REGISTRAR");
        B_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RegistrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CLIENTES CONECTADOS");

        T_Clientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apelido", "Nome", "IP", "Porta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(T_Clientes);
        if (T_Clientes.getColumnModel().getColumnCount() > 0) {
            T_Clientes.getColumnModel().getColumn(0).setResizable(false);
            T_Clientes.getColumnModel().getColumn(1).setResizable(false);
            T_Clientes.getColumnModel().getColumn(2).setResizable(false);
            T_Clientes.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("RELATÓRIO DE CONEXÕES");

        jScrollPane3.setViewportView(L_Relatorios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TF_PortaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Registrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_PortaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Registrar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        
        ServidorIP = "localhost";
        tableModel = (DefaultTableModel) T_Clientes.getModel();
        listModel = new DefaultListModel();
    }//GEN-LAST:event_formWindowOpened

    private void B_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RegistrarActionPerformed
        try {
            if(TF_PortaServidor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Informe uma porta para o servidor!");
                return;
            }
            ServidorPorta = Integer.parseInt(TF_PortaServidor.getText());
            
            // Passo 1 - Registrando o serviço em uma determinada porta.
            RegistryImpl registryImpl = new RegistryImpl(ServidorPorta);
            
            // Passo 2 - Instanciando a classe ServidorImpl que é do tipo ServidorInterface.
            ServidorChatInterface servidor = new ServidorImpl(this);

            // Passo 3:
            // Possibilitando que a instância contendo métodos remotos fique visível aos clientes. Além do IP e PORTA, deve-se associar um nome a instância.
            // Parâmetros: String (IP, Porta e nome do serviço) e Objeto com métodos remotos.
            Naming.rebind("rmi://" + ServidorIP + ":" + ServidorPorta + "/olaMundo", servidor); 
            
            TF_PortaServidor.setEnabled(false);
            B_Registrar.setEnabled(false);
            JOptionPane.showMessageDialog(rootPane, "Servidor registrado!");
        } catch (RemoteException | MalformedURLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro inesperado!");
            Logger.getLogger(TelaServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_RegistrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaServidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Registrar;
    private javax.swing.JList<String> L_Relatorios;
    private javax.swing.JTextField TF_PortaServidor;
    private javax.swing.JTable T_Clientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    protected void adicionarCliente(String apelido, String nome, String ipCliente, String portaCliente) {
        tableModel.addRow(new Object[T_Clientes.getColumnCount()]);
        int i = tableModel.getRowCount()-1;
        
        T_Clientes.setValueAt(apelido, i, 0);
        T_Clientes.setValueAt(nome, i, 1);
        T_Clientes.setValueAt(ipCliente, i, 2);
        T_Clientes.setValueAt(portaCliente, i, 3);
        listarConexoes(apelido, true);
    }
    
    protected void removerCliente(String apelido) {
        for(int i=0;i<tableModel.getRowCount();i++) {
            if(T_Clientes.getValueAt(i, 0).equals(apelido)) {
                tableModel.removeRow(i);
                listarConexoes(apelido, false);
                break;
            }
        }
    }
    
    private void listarConexoes(String apelido, boolean flag) {
        String msg;
        if(flag)
            msg = apelido + " conectou!";
        else
            msg = apelido + " desconectou!";
            
        listModel.addElement(msg);
        L_Relatorios.setModel(listModel);
    }
    
    protected void listarMensagens(String apelidoOrigem, String apelidoDestino) {
        String msg = apelidoOrigem + " enviou mensagem para " + apelidoDestino + "!";
        listModel.addElement(msg);
        L_Relatorios.setModel(listModel);
    }
}
