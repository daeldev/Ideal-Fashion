
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {

   Login_Senha login_atendente = new Login_Senha("atendente","atendente");
   Login_Senha login_gerente = new Login_Senha("gerente","gerente");
   Login_Senha login_administrador = new Login_Senha("adm","123");
   Login_Senha login_novo_user = new Login_Senha("novo","novo");
    
    public TelaLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jLogin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jrbAdministrador = new javax.swing.JRadioButton();
        jrbAtendente = new javax.swing.JRadioButton();
        jrbGerente = new javax.swing.JRadioButton();
        jrbNovoUser = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha");

        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });

        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jrbAdministrador);
        jrbAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbAdministrador.setForeground(new java.awt.Color(0, 0, 0));
        jrbAdministrador.setText("Administrador");
        jrbAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAdministradorActionPerformed(evt);
            }
        });

        buttonGroup2.add(jrbAtendente);
        jrbAtendente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbAtendente.setForeground(new java.awt.Color(0, 0, 0));
        jrbAtendente.setText("Atendente");
        jrbAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAtendenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbGerente);
        jrbGerente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbGerente.setForeground(new java.awt.Color(0, 0, 0));
        jrbGerente.setText("Gerente");
        jrbGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbGerenteActionPerformed(evt);
            }
        });

        buttonGroup4.add(jrbNovoUser);
        jrbNovoUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbNovoUser.setForeground(new java.awt.Color(0, 0, 0));
        jrbNovoUser.setText("Novo Usuário");
        jrbNovoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNovoUserActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuários");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(jrbAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbNovoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(447, 447, 447)
                                    .addComponent(jrbAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbGerente)
                        .addGap(18, 18, 18)
                        .addComponent(jrbAtendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbAdministrador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbNovoUser)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    String login = jLogin.getText();
    String senha = String.valueOf(jSenha.getPassword());
    String msg = "Login ou senha incorreto! Por favor tente novamente.";
    
    if(jrbGerente.isSelected() && (login.equals(login_gerente.getLogin())) && senha.equals(login_gerente.getSenha())){
        
        TelaGerente telagerente = new TelaGerente();
        this.dispose();
        telagerente.setVisible(true);    
    }
    else if(jrbAtendente.isSelected() && (login.equals(login_atendente.getLogin())) && senha.equals(login_atendente.getSenha())){
        
        TelaAtendenteNova telagerente = new TelaAtendenteNova();
        this.dispose();
        telagerente.setVisible(true);    
    }
    else if(jrbAdministrador.isSelected() && (login.equals(login_administrador.getLogin())) && senha.equals(login_administrador.getSenha())){
        
        TelaAdministrador TLD = new TelaAdministrador();
        this.dispose();
        TLD.setVisible(true);    
    }
    else if(jrbNovoUser.isSelected() && (login.equals(login_novo_user.getLogin())) && senha.equals(login_novo_user.getSenha())){
        
        TelaGerente telagerente = new TelaGerente();
        this.dispose();
        telagerente.setVisible(true);    
    }
    else{
         JOptionPane.showMessageDialog(null, msg);
         jLogin.setText("");
         jSenha.setText("");    
    }
         

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jrbGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbGerenteActionPerformed
           buttonGroup2.clearSelection();
           buttonGroup3.clearSelection(); 
           buttonGroup4.clearSelection(); 
    }//GEN-LAST:event_jrbGerenteActionPerformed

    private void jrbAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAtendenteActionPerformed
           buttonGroup1.clearSelection();
           buttonGroup3.clearSelection(); 
           buttonGroup4.clearSelection();      
    }//GEN-LAST:event_jrbAtendenteActionPerformed

    private void jrbAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAdministradorActionPerformed
           buttonGroup1.clearSelection();
           buttonGroup2.clearSelection(); 
           buttonGroup4.clearSelection();  
    }//GEN-LAST:event_jrbAdministradorActionPerformed

    private void jrbNovoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNovoUserActionPerformed
           buttonGroup1.clearSelection();
           buttonGroup2.clearSelection(); 
           buttonGroup3.clearSelection();     
    }//GEN-LAST:event_jrbNovoUserActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JRadioButton jrbAdministrador;
    private javax.swing.JRadioButton jrbAtendente;
    private javax.swing.JRadioButton jrbGerente;
    private javax.swing.JRadioButton jrbNovoUser;
    // End of variables declaration//GEN-END:variables
}
