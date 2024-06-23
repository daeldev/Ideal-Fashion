package Administrador;


import Gerente.LoginGerente;
import Atendente.LoginAtendente;
import Utilitários.ConexaoCi;
import Utilitários.DTO;
import Utilitários.UsuarioSenha;
import java.awt.Color;
import javax.swing.JOptionPane;


public class LoginAdministrador extends javax.swing.JFrame {

   UsuarioSenha login_administrador = new UsuarioSenha("administrador","123");
    
    public LoginAdministrador() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Administrador = new javax.swing.JLabel();
        CorrigeOTracoNoInicio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTUsuario = new javax.swing.JTextField();
        JTSenha = new javax.swing.JPasswordField();
        JCMostrarSenha = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        JBLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Gerente");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Atendente");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Administrador");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 0, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 0, 204)));
        jPanel4.setForeground(new java.awt.Color(255, 0, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, 70, -1));

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Administrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Administrador/3.3.png"))); // NOI18N
        jPanel2.add(Administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        CorrigeOTracoNoInicio.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        CorrigeOTracoNoInicio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(CorrigeOTracoNoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1284, 0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Bem-vindo!");

        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Outros/1.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Efetue o seu login.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        JBLogin.setBackground(new java.awt.Color(51, 153, 255));
        JBLogin.setForeground(new java.awt.Color(255, 255, 255));
        JBLogin.setText("Login");
        JBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLoginActionPerformed(evt);
            }
        });
        jPanel2.add(JBLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 330, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Usuário");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 400, 420));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Administrador/2.1.png"))); // NOI18N
        jPanel1.add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTUsuarioActionPerformed

    private void JBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLoginActionPerformed
        String usuario = JTUsuario.getText();
        String senha = String.valueOf(JTSenha.getPassword());
        
        DTO dto = new DTO();
        DTO.FuncionarioDTO funcionarioDTO = dto.new FuncionarioDTO();
        funcionarioDTO.setUsuario(usuario);
        funcionarioDTO.setSenha(senha);
        
        ConexaoCi Ci = new ConexaoCi();
        
        if(Ci.VerificarAdministrador(funcionarioDTO)){       
            WorkspaceAdministrador AdministradorDesktop = new WorkspaceAdministrador();
            this.dispose();
            AdministradorDesktop.setVisible(true);    
        }else{
            JOptionPane.showMessageDialog(null, "Login ou senha incorreto! Por favor tente novamente.");
            JTUsuario.setText("Insira o seu nome de usuário");
            JTSenha.setText("@abcdefghijk");
            JTSenha.setEchoChar('\u25cf');
            JTSenha.setForeground(Color.gray);
            JCMostrarSenha.setSelected(false);           
        }        
    }//GEN-LAST:event_JBLoginActionPerformed

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
                JCMostrarSenha.setSelected(false);
            }else{
                JTSenha.setEchoChar((char)0);
                JTSenha.setForeground(Color.black);
            }  
        }else{
            JTSenha.setEchoChar('\u25cf');
            JTSenha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_JCMostrarSenhaActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        LoginGerente LoginGerente = new LoginGerente();
        this.dispose();
        LoginGerente.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:     
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        LoginAtendente LoginAtendente = new LoginAtendente();
        this.dispose();
        LoginAtendente.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Administrador;
    private javax.swing.JTextField CorrigeOTracoNoInicio;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton JBLogin;
    private javax.swing.JCheckBox JCMostrarSenha;
    private javax.swing.JPasswordField JTSenha;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pc;
    // End of variables declaration//GEN-END:variables
}
