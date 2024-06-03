package Atendente;


import java.awt.Color;
import javax.swing.JOptionPane;



public class Dados extends javax.swing.JInternalFrame {

    
    public Dados() {
        initComponents();
          
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Atendente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTNomeCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CorrigeBug = new javax.swing.JTextField();
        JTProsseguir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JTCpf = new javax.swing.JFormattedTextField();
        JTData = new javax.swing.JFormattedTextField();

        setBorder(null);
        setClosable(true);
        setTitle("Dados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Atendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Atendente/3.1.png"))); // NOI18N
        getContentPane().add(Atendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CPF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        JTNomeCliente.setBackground(new java.awt.Color(246, 242, 242));
        JTNomeCliente.setForeground(new java.awt.Color(204, 204, 204));
        JTNomeCliente.setText("Insira o nome do cliente");
        JTNomeCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        JTNomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTNomeClienteMousePressed(evt);
            }
        });
        JTNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(JTNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 334, 30));

        jPanel1.setBackground(new java.awt.Color(246, 242, 242));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Venda");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Outros/1.png"))); // NOI18N
        jPanel3.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 6, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Insira os dados da venda");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 57, -1, -1));

        CorrigeBug.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        CorrigeBug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrigeBugActionPerformed(evt);
            }
        });
        jPanel3.add(CorrigeBug, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 10, 10, 0));

        JTProsseguir.setBackground(new java.awt.Color(51, 153, 255));
        JTProsseguir.setForeground(new java.awt.Color(255, 255, 255));
        JTProsseguir.setText("Prosseguir");
        JTProsseguir.setBorder(null);
        JTProsseguir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTProsseguirFocusGained(evt);
            }
        });
        JTProsseguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTProsseguirMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTProsseguirMouseReleased(evt);
            }
        });
        JTProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTProsseguirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Data");

        JTCpf.setBackground(new java.awt.Color(246, 242, 242));
        JTCpf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        JTCpf.setForeground(new java.awt.Color(204, 204, 204));
        try {
            JTCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTCpf.setToolTipText("");
        JTCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTCpfMousePressed(evt);
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
                    .addComponent(JTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JTData, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JTProsseguir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(JTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(JTProsseguir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTProsseguirActionPerformed
        if(JTNomeCliente.getText().equals("Insira o nome do cliente") || JTCpf.getText().equals("   .   .   -  ") || JTData.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Insira os dados da venda.");
        }else{
            Vendas Venda;
            Venda = new Vendas();
            WorkspaceAtendente.WorkspaceAtendente.add(Venda);
            Venda.setVisible(true);
            Venda.toFront();
            Venda.setBounds(247, 97, 1035, 620);
            dispose();    
        }                      
    }//GEN-LAST:event_JTProsseguirActionPerformed

    private void JTNomeClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTNomeClienteMousePressed
        // TODO add your handling code here:
        if (JTNomeCliente.getText().equals("Insira o nome do cliente")){
            JTNomeCliente.setText("");
            JTNomeCliente.setForeground(Color.black);
        }
        if (String.valueOf(JTData.getText()).isEmpty()){
            JTData.setText("   .   .   -  ");
            JTData.setForeground(Color.gray);
        }
        if (String.valueOf(JTData.getText()).isEmpty()){
            JTData.setText("  /  /    ");
            JTData.setForeground(Color.gray);
        }  
    }//GEN-LAST:event_JTNomeClienteMousePressed

    private void JTNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNomeClienteActionPerformed

    private void JTProsseguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTProsseguirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProsseguirMouseClicked

    private void JTCpfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTCpfMousePressed
        // TODO add your handling code here:
        if (String.valueOf(JTCpf.getText()).equals(("   .   .   -  "))){
            JTCpf.setText("");
            JTCpf.setForeground(Color.black);
        }
        if (JTNomeCliente.getText().isEmpty()){
            JTNomeCliente.setText("Insira o nome do cliente");
            JTNomeCliente.setForeground(Color.gray);
        }
        if (String.valueOf(JTData.getText()).isEmpty()){
            JTData.setText("  /  /    ");
            JTData.setForeground(Color.gray);
        }
    }//GEN-LAST:event_JTCpfMousePressed

    private void JTDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTDataMousePressed
        // TODO add your handling code here:
        if (String.valueOf(JTData.getText()).equals(("  /  /    "))){
            JTData.setText("");
            JTData.setForeground(Color.black);
        }
        if (JTNomeCliente.getText().isEmpty()){
            JTNomeCliente.setText("Insira o nome do cliente");
            JTNomeCliente.setForeground(Color.gray);
        }
        if (String.valueOf(JTCpf.getText()).isEmpty()){
            JTCpf.setText("   .   .   -  ");
            JTCpf.setForeground(Color.gray);
        }
    }//GEN-LAST:event_JTDataMousePressed

    private void JTProsseguirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTProsseguirMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JTProsseguirMouseReleased

    private void CorrigeBugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrigeBugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorrigeBugActionPerformed

    private void JTProsseguirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTProsseguirFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProsseguirFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JTextField CorrigeBug;
    private javax.swing.JFormattedTextField JTCpf;
    private javax.swing.JFormattedTextField JTData;
    private javax.swing.JTextField JTNomeCliente;
    private javax.swing.JButton JTProsseguir;
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
