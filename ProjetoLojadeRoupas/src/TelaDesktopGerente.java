
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
public class TelaDesktopGerente extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtendenteNova
     */
    public TelaDesktopGerente() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        JBClientes = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();
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
        setTitle("Àrea de Trabalho Atendente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBClientes.setBackground(new java.awt.Color(51, 51, 51));
        JBClientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBClientes.setForeground(new java.awt.Color(255, 255, 255));
        JBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Camada 16.png"))); // NOI18N
        JBClientes.setText("Metas");
        JBClientes.setBorder(null);
        JBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientesActionPerformed(evt);
            }
        });
        jPanel1.add(JBClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 190, 50));

        JBSair.setBackground(new java.awt.Color(51, 51, 51));
        JBSair.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBSair.setForeground(new java.awt.Color(255, 255, 255));
        JBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Camada 11.png"))); // NOI18N
        JBSair.setText("Logout");
        JBSair.setBorder(null);
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });
        jPanel1.add(JBSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 190, 50));

        JBVendas.setBackground(new java.awt.Color(51, 51, 51));
        JBVendas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBVendas.setForeground(new java.awt.Color(255, 255, 255));
        JBVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Camada 9.png"))); // NOI18N
        JBVendas.setText("Funcionários");
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
        JBAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Camada 10.png"))); // NOI18N
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

        Atendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/3.2.png"))); // NOI18N
        jPanel1.add(Atendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        Quadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/4.3.png"))); // NOI18N
        jPanel1.add(Quadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        Barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/5.3.png"))); // NOI18N
        jPanel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 0, 1040, -1));

        Opções.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/6.1.png"))); // NOI18N
        jPanel1.add(Opções, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/FundoWork.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVendasActionPerformed
        // TODO add your handling code here: 
        TelaFuncionarios Funcionarios = new TelaFuncionarios();
        jDesktopPane1.add(Funcionarios);     
        Funcionarios.setVisible(true);
        Funcionarios.setBounds(247, 97, 1035, 620);
    }//GEN-LAST:event_JBVendasActionPerformed

    private void JBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientesActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_JBClientesActionPerformed

    private void JBAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAjudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Precisa de alguma ajuda? Entre em contato com algum superior.");
    }//GEN-LAST:event_JBAjudaActionPerformed

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        // TODO add your handling code here:
        int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
        if(q == JOptionPane.YES_OPTION){
            TelaLogin Login = new TelaLogin();
            this.dispose();
            Login.setVisible(true);
        }
    }//GEN-LAST:event_JBSairActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAtendenteNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtendenteNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtendenteNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtendenteNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDesktopGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JLabel Barra;
    private javax.swing.JButton JBAjuda;
    private javax.swing.JButton JBClientes;
    private javax.swing.JButton JBSair;
    private javax.swing.JButton JBVendas;
    private javax.swing.JLabel Opções;
    private javax.swing.JLabel Quadrado;
    private javax.swing.JLabel Status;
    private javax.swing.JPanel iconeStatus;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
