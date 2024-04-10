
import javax.swing.JOptionPane;


public class Forma_de_Pagamento extends javax.swing.JInternalFrame {

    
    public Forma_de_Pagamento() {
        initComponents();
    }
    public void Pegarpagamento(TipoPagamento pagamento){
        jtfSubtotal.setText(pagamento.getPagamento());//.replaceAll("\\.", ","));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgAVista = new javax.swing.ButtonGroup();
        jbgCartao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtfAVista = new javax.swing.JTextField();
        jrbAVista = new javax.swing.JRadioButton();
        jrbCartao = new javax.swing.JRadioButton();
        jcbCartao = new javax.swing.JComboBox<>();
        jtfParcelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfTroco = new javax.swing.JTextField();
        jtfSubtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jbFinalizarVenda = new javax.swing.JButton();
        jbCancelarVenda = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));

        jtfAVista.setBackground(new java.awt.Color(51, 51, 51));
        jtfAVista.setForeground(new java.awt.Color(255, 255, 255));
        jtfAVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfAVistaMouseClicked(evt);
            }
        });
        jtfAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAVistaActionPerformed(evt);
            }
        });

        jbgAVista.add(jrbAVista);
        jrbAVista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrbAVista.setText("Á Vista");
        jrbAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAVistaActionPerformed(evt);
            }
        });

        jbgCartao.add(jrbCartao);
        jrbCartao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrbCartao.setText("Cartão");
        jrbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCartaoActionPerformed(evt);
            }
        });

        jcbCartao.setBackground(new java.awt.Color(51, 51, 51));
        jcbCartao.setForeground(new java.awt.Color(255, 255, 255));
        jcbCartao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x Sem Juros", "2x Sem Juros", "3x Sem Juros", "4x Sem Juros", "5x Sem Juros", "6x Com Juros 5,00", "7x Com Juros 5,00", "8x Com Juros 7,00", "9x Com Juros 7,50", "10x Com Juros 9,00" }));
        jcbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCartaoActionPerformed(evt);
            }
        });

        jtfParcelas.setEditable(false);
        jtfParcelas.setBackground(new java.awt.Color(51, 51, 51));
        jtfParcelas.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Troco");

        jtfTroco.setEditable(false);
        jtfTroco.setBackground(new java.awt.Color(51, 51, 51));
        jtfTroco.setForeground(new java.awt.Color(255, 255, 255));

        jtfSubtotal.setEditable(false);
        jtfSubtotal.setBackground(new java.awt.Color(51, 51, 51));
        jtfSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        jtfSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSubtotalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Subtotal");

        jTextField1.setEditable(false);

        jbFinalizarVenda.setBackground(new java.awt.Color(51, 153, 255));
        jbFinalizarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbFinalizarVenda.setText("FINALIZAR");
        jbFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarVendaActionPerformed(evt);
            }
        });

        jbCancelarVenda.setBackground(new java.awt.Color(255, 51, 51));
        jbCancelarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCancelarVenda.setText("CANCELAR");
        jbCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jbFinalizarVenda))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTroco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbAVista)
                            .addComponent(jtfAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jLabel4))))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addGap(64, 64, 64)))
                        .addComponent(jtfParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbCartao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbCancelarVenda))
                .addGap(60, 126, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 300, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 300, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 300, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 300, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAVista)
                    .addComponent(jrbCartao)
                    .addComponent(jcbCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(jtfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 185, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 185, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 174, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 174, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAVistaActionPerformed
     
    }//GEN-LAST:event_jtfAVistaActionPerformed

    private void jtfAVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfAVistaMouseClicked
     
    }//GEN-LAST:event_jtfAVistaMouseClicked

    private void jrbAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAVistaActionPerformed
         
    jbgCartao.clearSelection();
    jtfParcelas.setText("");
    }//GEN-LAST:event_jrbAVistaActionPerformed

    private void jrbCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCartaoActionPerformed
    
    jbgAVista.clearSelection();
    jtfAVista.setText("");
    jtfTroco.setText("");

    }//GEN-LAST:event_jrbCartaoActionPerformed

    private void jbFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarVendaActionPerformed

          try {
            
              if(jrbAVista.isSelected ()){
         Double dinheiroDoCliente = Double.valueOf(jtfAVista.getText());
         Double total = Double.valueOf(jtfSubtotal.getText());
         Double troco = dinheiroDoCliente - total;
         

                if(dinheiroDoCliente < 0 || troco < 0){
                JOptionPane.showMessageDialog(null, "Valor Inválido! Tente Novamente.");
                jtfAVista.setText("");
                jtfTroco.setText("");
            }   
                else{
                jtfTroco.setText(""+troco);    
                JOptionPane.showMessageDialog(null, "Venda Confirmada");
                JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");  
                }
         }
         
         if(jrbCartao.isSelected()){
         jTextField1.setText(jcbCartao.getSelectedItem().toString());
         Double totalReal = Double.valueOf(jtfSubtotal.getText());//.replaceAll(",", "."));
         String parcelas = String.valueOf((String) jcbCartao.getSelectedItem());
      
               switch (parcelas) {
                 case "1x Sem Juros" -> {
                     Double calculo = totalReal / 1;
                     jtfParcelas.setText(String.format("1x de R$ %.2f Sem Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                 }
                 case "2x Sem Juros" -> {
                     Double calculo = totalReal / 2;
                     jtfParcelas.setText(String.format("2x de R$ %.2f Sem Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     }
                 case "3x Sem Juros" -> {
                     Double calculo = totalReal / 3;
                     jtfParcelas.setText(String.format("3x de R$ %.2f Sem Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     }
                 case "4x Sem Juros" -> {
                     Double calculo = totalReal / 4;
                     jtfParcelas.setText(String.format("4x de R$ %.2f Sem Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                 }
                 case "5x Sem Juros" -> {
                     Double calculo = totalReal / 5;
                     jtfParcelas.setText(String.format("5x de R$ %.2f Sem Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                 }
                 case "6x Com Juros 5,00" -> {
                     Double juros = totalReal * 0.05;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 6;
                     jtfParcelas.setText(String.format("6x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     }
                 case "7x Com Juros 5,00" -> {
                     Double juros = totalReal * 0.05;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 7;
                     jtfParcelas.setText(String.format("7x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     }
                 case "8x Com Juros 7,00" -> {
                     Double juros = totalReal * 0.07;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 8;
                     jtfParcelas.setText(String.format("8x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     }
                 case "9x Com Juros 7,50" -> {
                     Double juros = totalReal * 0.075;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 9;
                     jtfParcelas.setText(String.format("9x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     }
                 case "10x Com Juros 9,00" -> {
                     Double juros = totalReal * 0.09;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 10;
                     jtfParcelas.setText(String.format("10x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     }
                 default -> {
                 }
               }
         }
        } catch (Exception e) {
                    
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro. Digite os valores novamente");
            jtfAVista.setText("");
            jtfTroco.setText("");
            jtfParcelas.setText("");
        }
          
        
    }//GEN-LAST:event_jbFinalizarVendaActionPerformed

    private void jcbCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCartaoActionPerformed
      
         
    }//GEN-LAST:event_jcbCartaoActionPerformed

    private void jbCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarVendaActionPerformed
        
         int resposta = JOptionPane.showConfirmDialog(null, "Deseja Cancelar a Venda?","Atenção",JOptionPane.YES_NO_OPTION);       
         if(resposta == JOptionPane.YES_NO_OPTION){
         JOptionPane.showMessageDialog(null, "Venda Cancelada");
         dispose();
         }
         else if(resposta == JOptionPane.NO_OPTION){         
         }
    }//GEN-LAST:event_jbCancelarVendaActionPerformed

    private void jtfSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSubtotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbCancelarVenda;
    private javax.swing.JButton jbFinalizarVenda;
    private javax.swing.ButtonGroup jbgAVista;
    private javax.swing.ButtonGroup jbgCartao;
    private javax.swing.JComboBox<String> jcbCartao;
    private javax.swing.JRadioButton jrbAVista;
    private javax.swing.JRadioButton jrbCartao;
    private javax.swing.JTextField jtfAVista;
    private javax.swing.JTextField jtfParcelas;
    private javax.swing.JTextField jtfSubtotal;
    private javax.swing.JTextField jtfTroco;
    // End of variables declaration//GEN-END:variables

    void setTotal(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
