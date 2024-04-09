
import java.awt.Color;
import javax.swing.JOptionPane;



public class DadosCompra extends javax.swing.JInternalFrame {

    
    public DadosCompra() {
        initComponents();
          
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Atendente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTUsuario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CorrigeBug = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JTCPF = new javax.swing.JFormattedTextField();
        JTData = new javax.swing.JFormattedTextField();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Atendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/3.1.png"))); // NOI18N
        getContentPane().add(Atendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CPF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        JTUsuario.setBackground(new java.awt.Color(246, 242, 242));
        JTUsuario.setForeground(new java.awt.Color(204, 204, 204));
        JTUsuario.setText("Insira o nome do cliente");
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
        getContentPane().add(JTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 334, 30));

        jPanel1.setBackground(new java.awt.Color(246, 242, 242));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Venda");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/1.png"))); // NOI18N
        jPanel3.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 6, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Insira os dados da venda");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 57, -1, -1));

        CorrigeBug.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        jPanel3.add(CorrigeBug, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 10, 10, 0));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Prosseguir");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Data");

        JTCPF.setBackground(new java.awt.Color(246, 242, 242));
        JTCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        JTCPF.setForeground(new java.awt.Color(204, 204, 204));
        try {
            JTCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTCPF.setToolTipText("");
        JTCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTCPFMousePressed(evt);
            }
        });

        JTData.setBackground(new java.awt.Color(246, 242, 242));
        JTData.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        JTData.setForeground(new java.awt.Color(204, 204, 204));
        try {
            JTData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTDataMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JTData, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(JTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(JTUsuario.getText().equals("Insira o nome do cliente") || JTCPF.getText().equals("   .   .   -  ") || JTData.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Insira os dados da venda.");
        }else{
            Tela_de_Vendas Venda = new Tela_de_Vendas();
            this.dispose();
            Venda.setVisible(true);
        }                      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTUsuarioMousePressed
        // TODO add your handling code here:
        if (JTUsuario.getText().equals("Insira o nome do cliente")){
            JTUsuario.setText("");
            JTUsuario.setForeground(Color.black);
        }
        if (String.valueOf(JTData.getText()).isEmpty()){
            JTData.setText("   .   .   -  ");
            JTData.setForeground(Color.gray);
        }
        if (String.valueOf(JTData.getText()).isEmpty()){
            JTData.setText("  /  /    ");
            JTData.setForeground(Color.gray);
        }  
    }//GEN-LAST:event_JTUsuarioMousePressed

    private void JTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTUsuarioActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void JTCPFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTCPFMousePressed
        // TODO add your handling code here:
        if (String.valueOf(JTCPF.getText()).equals(("   .   .   -  "))){
            JTCPF.setText("");
            JTCPF.setForeground(Color.black);
        }
        if (JTUsuario.getText().isEmpty()){
            JTUsuario.setText("Insira o nome do cliente");
            JTUsuario.setForeground(Color.gray);
        }
        if (String.valueOf(JTData.getText()).isEmpty()){
            JTData.setText("  /  /    ");
            JTData.setForeground(Color.gray);
        }
    }//GEN-LAST:event_JTCPFMousePressed

    private void JTDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTDataMousePressed
        // TODO add your handling code here:
        if (String.valueOf(JTData.getText()).equals(("  /  /    "))){
            JTData.setText("");
            JTData.setForeground(Color.black);
        }
        if (JTUsuario.getText().isEmpty()){
            JTUsuario.setText("Insira o nome do cliente");
            JTUsuario.setForeground(Color.gray);
        }
        if (String.valueOf(JTCPF.getText()).isEmpty()){
            JTCPF.setText("   .   .   -  ");
            JTCPF.setForeground(Color.gray);
        }
    }//GEN-LAST:event_JTDataMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JTextField CorrigeBug;
    private javax.swing.JFormattedTextField JTCPF;
    private javax.swing.JFormattedTextField JTData;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pc;
    // End of variables declaration//GEN-END:variables
}
