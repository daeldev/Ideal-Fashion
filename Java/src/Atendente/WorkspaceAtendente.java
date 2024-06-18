package Atendente;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aluno.Tarde
 */
public class WorkspaceAtendente extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtendenteNova
     */
    public WorkspaceAtendente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WorkspaceAtendente = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        JBClientes = new javax.swing.JButton();
        JBLogout = new javax.swing.JButton();
        JBVendas = new javax.swing.JButton();
        JBAjuda = new javax.swing.JButton();
        iconeStatus = new javax.swing.JPanel();
        Status = new javax.swing.JLabel();
        Atendente = new javax.swing.JLabel();
        Quadrado = new javax.swing.JLabel();
        Barra = new javax.swing.JLabel();
        Opções = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Workspace");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBClientes.setBackground(new java.awt.Color(51, 51, 51));
        JBClientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBClientes.setForeground(new java.awt.Color(255, 255, 255));
        JBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Ícones/8.2.png"))); // NOI18N
        JBClientes.setText("Clientes");
        JBClientes.setBorder(null);
        JBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientesActionPerformed(evt);
            }
        });
        jPanel1.add(JBClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 190, 50));

        JBLogout.setBackground(new java.awt.Color(51, 51, 51));
        JBLogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBLogout.setForeground(new java.awt.Color(255, 255, 255));
        JBLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Ícones/8.4.png"))); // NOI18N
        JBLogout.setText("Logout");
        JBLogout.setBorder(null);
        JBLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(JBLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 190, 50));

        JBVendas.setBackground(new java.awt.Color(51, 51, 51));
        JBVendas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBVendas.setForeground(new java.awt.Color(255, 255, 255));
        JBVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Ícones/8.1.png"))); // NOI18N
        JBVendas.setText("Vendas");
        JBVendas.setBorder(null);
        JBVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVendasActionPerformed(evt);
            }
        });
        jPanel1.add(JBVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 50));

        JBAjuda.setBackground(new java.awt.Color(51, 51, 51));
        JBAjuda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBAjuda.setForeground(new java.awt.Color(255, 255, 255));
        JBAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Ícones/8.3.png"))); // NOI18N
        JBAjuda.setText("Ajuda");
        JBAjuda.setBorder(null);
        JBAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAjudaActionPerformed(evt);
            }
        });
        jPanel1.add(JBAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 190, 50));

        iconeStatus.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout iconeStatusLayout = new javax.swing.GroupLayout(iconeStatus);
        iconeStatus.setLayout(iconeStatusLayout);
        iconeStatusLayout.setHorizontalGroup(
            iconeStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        iconeStatusLayout.setVerticalGroup(
            iconeStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(iconeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 10, 10));

        Status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setText("Conectado");
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 30));

        Atendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Atendente/3.1.png"))); // NOI18N
        jPanel1.add(Atendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        Quadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Atendente/4.1.png"))); // NOI18N
        jPanel1.add(Quadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        Barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Atendente/5.1.png"))); // NOI18N
        jPanel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 0, 1040, -1));

        Opções.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Outros/6.1.png"))); // NOI18N
        jPanel1.add(Opções, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Fundos/9.1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        WorkspaceAtendente.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout WorkspaceAtendenteLayout = new javax.swing.GroupLayout(WorkspaceAtendente);
        WorkspaceAtendente.setLayout(WorkspaceAtendenteLayout);
        WorkspaceAtendenteLayout.setHorizontalGroup(
            WorkspaceAtendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        WorkspaceAtendenteLayout.setVerticalGroup(
            WorkspaceAtendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WorkspaceAtendente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WorkspaceAtendente)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVendasActionPerformed
        // TODO add your handling code here:       
        DadosCliente Dados = new DadosCliente();
        WorkspaceAtendente.add(Dados);     
        Dados.setVisible(true);
        Dados.setBounds(450, 100, 408, 513);
        
//        Carrinho carrinho = new Carrinho();
//        WorkspaceAtendente.add(carrinho);     
//        carrinho.setVisible(true);
//        carrinho.setBounds(247, 97, 1035, 620);

//        Pagamento pagamento = new Pagamento();
//        WorkspaceAtendente.add(pagamento);     
//        pagamento.setVisible(true);
//        pagamento.setBounds(450, 100, 357, 503);
    }//GEN-LAST:event_JBVendasActionPerformed

    private void JBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientesActionPerformed
        // TODO add your handling code here:
        Clientes CadastrarClientes = new Clientes();
        WorkspaceAtendente.add(CadastrarClientes);     
        CadastrarClientes.setVisible(true); 
        CadastrarClientes.setBounds(247, 97, 1035, 620);
    }//GEN-LAST:event_JBClientesActionPerformed

    private void JBAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAjudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Precisa de alguma ajuda? Entre em contato com algum superior.");
    }//GEN-LAST:event_JBAjudaActionPerformed

    private void JBLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLogoutActionPerformed
        // TODO add your handling code here:
        int Option = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
        if(Option == JOptionPane.YES_OPTION){
            LoginAtendente Logout = new LoginAtendente();
            this.dispose();
            Logout.setVisible(true);
        }
    }//GEN-LAST:event_JBLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorkspaceAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkspaceAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkspaceAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkspaceAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkspaceAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JLabel Barra;
    private javax.swing.JButton JBAjuda;
    private javax.swing.JButton JBClientes;
    private javax.swing.JButton JBLogout;
    private javax.swing.JButton JBVendas;
    private javax.swing.JLabel Opções;
    private javax.swing.JLabel Quadrado;
    private javax.swing.JLabel Status;
    public static javax.swing.JDesktopPane WorkspaceAtendente;
    private javax.swing.JPanel iconeStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
