
import java.awt.Color;
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
        jPanel2 = new javax.swing.JPanel();
        jrbAdministrador = new javax.swing.JRadioButton();
        jrbAtendente = new javax.swing.JRadioButton();
        jrbGerente = new javax.swing.JRadioButton();
        jrbNovoUser = new javax.swing.JRadioButton();
        Atendente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTSenha = new javax.swing.JPasswordField();
        JCMostrarSenha = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup3.add(jrbAdministrador);
        jrbAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbAdministrador.setText("Administrador");
        jrbAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAdministradorActionPerformed(evt);
            }
        });
        jPanel2.add(jrbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 260, 107, -1));

        buttonGroup2.add(jrbAtendente);
        jrbAtendente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbAtendente.setText("Atendente");
        jrbAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAtendenteActionPerformed(evt);
            }
        });
        jPanel2.add(jrbAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1081, 233, 98, -1));

        buttonGroup1.add(jrbGerente);
        jrbGerente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbGerente.setText("Gerente");
        jrbGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbGerenteActionPerformed(evt);
            }
        });
        jPanel2.add(jrbGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1081, 194, 98, -1));

        buttonGroup4.add(jrbNovoUser);
        jrbNovoUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbNovoUser.setText("Novo Usuário");
        jrbNovoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNovoUserActionPerformed(evt);
            }
        });
        jPanel2.add(jrbNovoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 293, 107, -1));

        Atendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/3.1.png"))); // NOI18N
        jPanel2.add(Atendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Bem-vindo!");

        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/1.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Efetue o seu login.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(pc)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Senha");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        JTUsuario.setBackground(new java.awt.Color(246, 242, 242));
        JTUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JTUsuario.setForeground(new java.awt.Color(204, 204, 204));
        JTUsuario.setText("Insira o seu nome de usuário");
        JTUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        JTUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTUsuarioMousePressed(evt);
            }
        });
        JTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(JTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 334, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Usuário");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        JTSenha.setBackground(new java.awt.Color(246, 242, 242));
        JTSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JTSenha.setForeground(new java.awt.Color(204, 204, 204));
        JTSenha.setText("@abcdefghijk");
        JTSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        JTSenha.setEchoChar('\u25cf');
        JTSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTSenhaMousePressed(evt);
            }
        });
        JTSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(JTSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 331, 30));

        JCMostrarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JCMostrarSenha.setText("Mostrar senha");
        JCMostrarSenha.setBorder(null);
        JCMostrarSenha.setFocusable(false);
        JCMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCMostrarSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(JCMostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 330, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 400, 420));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josiel\\Downloads\\2.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String login = JTUsuario.getText();
        String senha = String.valueOf(JTSenha.getPassword());
    
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
            JOptionPane.showMessageDialog(null, "Login ou senha incorreto! Por favor tente novamente.");
            JTUsuario.setText("Insira o seu nome de usuário");
            JTSenha.setText("@abcdefghijk");
            JTSenha.setEchoChar('\u25cf');
            JTSenha.setForeground(Color.gray);
            JCMostrarSenha.setSelected(false);           
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

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void JTSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTSenhaActionPerformed

    private void JTUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTUsuarioMousePressed
        // TODO add your handling code here:
        if (JTUsuario.getText().equals("Insira o seu nome de usuário")){
            JTUsuario.setText("");
            JTUsuario.setForeground(Color.black);
        }
        if (String.valueOf(JTSenha.getPassword()).isEmpty()){
            JTSenha.setText("@abcdefghijk");
            JTSenha.setForeground(Color.gray);
        }   
    }//GEN-LAST:event_JTUsuarioMousePressed

    private void JTSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTSenhaMousePressed
        // TODO add your handling code here:
        if (String.valueOf(JTSenha.getPassword()).equals(("@abcdefghijk"))){
            JTSenha.setText("");
            JTSenha.setForeground(Color.black);
        } 
        if (JTUsuario.getText().isEmpty()){
            JTUsuario.setText("Insira o seu nome de usuário");
            JTUsuario.setForeground(Color.gray);
        }       
    }//GEN-LAST:event_JTSenhaMousePressed

    private void JCMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCMostrarSenhaActionPerformed
        // TODO add your handling code here:
        if (JCMostrarSenha.isSelected()){
            if (String.valueOf(JTSenha.getPassword()).equals(("@abcdefghijk"))){
                JTSenha.setEchoChar('\u25cf');
                JTSenha.setForeground(Color.gray);
            }else{
                JTSenha.setEchoChar((char)0);
                JTSenha.setForeground(Color.black);
            }  
        }else{
            JTSenha.setEchoChar('\u25cf');
            JTSenha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_JCMostrarSenhaActionPerformed

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
    private javax.swing.JLabel Atendente;
    private javax.swing.JCheckBox JCMostrarSenha;
    private javax.swing.JPasswordField JTSenha;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton jrbAdministrador;
    private javax.swing.JRadioButton jrbAtendente;
    private javax.swing.JRadioButton jrbGerente;
    private javax.swing.JRadioButton jrbNovoUser;
    private javax.swing.JLabel pc;
    // End of variables declaration//GEN-END:variables
}
