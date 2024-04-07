
import javax.swing.JOptionPane;


public class Forma_de_Pagamento extends javax.swing.JInternalFrame {

    
    public Forma_de_Pagamento() {
        initComponents();
    }
    public void Pegarpagamento(TipoPagamento pagamento){
        jtfSubtotal.setText(pagamento.getPagamento().replaceAll("\\.", ","));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgAVista = new javax.swing.ButtonGroup();
        jbgCartao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfAVista = new javax.swing.JTextField();
        jtfTroco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfSubtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfParcelas = new javax.swing.JTextField();
        jcbCartao = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbFinalizarVenda = new javax.swing.JButton();
        jbCancelarVenda = new javax.swing.JButton();
        jrbAVista = new javax.swing.JRadioButton();
        jrbCartao = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Forma de Pagamento");

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

        jtfTroco.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Troco");

        jtfSubtotal.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Subtotal");

        jtfParcelas.setEditable(false);

        jcbCartao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x Sem Juros", "2x Sem Juros", "3x Sem Juros", "4x Sem Juros", "5x Sem Juros", "6x Com Juros 5,00", "7x Com Juros 5,00", "8x Com Juros 7,00", "9x Com Juros 7,50", "10x Com Juros 9,00" }));
        jcbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCartaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Parcelas a Pagar");

        jbFinalizarVenda.setText("FINALIZAR COMPRA");
        jbFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarVendaActionPerformed(evt);
            }
        });

        jbCancelarVenda.setText("CANCELAR COMPRA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jbFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jbCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jbgAVista.add(jrbAVista);
        jrbAVista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrbAVista.setForeground(new java.awt.Color(0, 0, 0));
        jrbAVista.setText("Á Vista");
        jrbAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAVistaActionPerformed(evt);
            }
        });

        jbgCartao.add(jrbCartao);
        jrbCartao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrbCartao.setForeground(new java.awt.Color(0, 0, 0));
        jrbCartao.setText("Cartão");
        jrbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCartaoActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(179, 179, 179))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jrbAVista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbCartao)
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAVista)
                    .addComponent(jrbCartao))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAVista))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jtfAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAVistaActionPerformed
        
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
            
            }
         }
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
      
        JOptionPane.showMessageDialog(null, "Venda realizada com Sucesso");
        Tela_de_Vendas telavenda= new Tela_de_Vendas();
        TelaAtendenteNova.jDesktopPane1.add(telavenda);
        telavenda.setVisible(true);
     
    }//GEN-LAST:event_jbFinalizarVendaActionPerformed

    private void jcbCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCartaoActionPerformed
      
         if(jrbCartao.isSelected()){
         jTextField1.setText(jcbCartao.getSelectedItem().toString());
         Double totalReal = Double.valueOf(jtfSubtotal.getText().replaceAll(",", "."));
         String parcelas = String.valueOf((String) jcbCartao.getSelectedItem());
      
               switch (parcelas) {
                 case "1x Sem Juros" -> {
                     Double calculo = totalReal / 1;
                     jtfParcelas.setText(String.format("1x de R$ %.2f Sem Juros",calculo));
                     }
                 case "2x Sem Juros" -> {
                     Double calculo = totalReal / 2;
                     jtfParcelas.setText(String.format("2x de R$ %.2f Sem Juros",calculo));
                     }
                 case "3x Sem Juros" -> {
                     Double calculo = totalReal / 3;
                     jtfParcelas.setText(String.format("3x de R$ %.2f Sem Juros",calculo));
                     }
                 case "4x Sem Juros" -> {
                     Double calculo = totalReal / 4;
                     jtfParcelas.setText(String.format("4x de R$ %.2f Sem Juros",calculo));
                 }
                 case "5x Sem Juros" -> {
                     Double calculo = totalReal / 5;
                     jtfParcelas.setText(String.format("5x de R$ %.2f Sem Juros",calculo));
                 }
                 case "6x Com Juros 5,00" -> {
                     Double juros = totalReal * 0.05;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 6;
                     jtfParcelas.setText(String.format("6x de R$ %.2f Com Juros",calculo));
                     }
                 case "7x Com Juros 5,00" -> {
                     Double juros = totalReal * 0.05;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 7;
                     jtfParcelas.setText(String.format("7x de R$ %.2f Com Juros",calculo));
                     }
                 case "8x Com Juros 7,00" -> {
                     Double juros = totalReal * 0.07;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 8;
                     jtfParcelas.setText(String.format("8x de R$ %.2f Com Juros",calculo));
                     }
                 case "9x Com Juros 7,50" -> {
                     Double juros = totalReal * 0.075;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 9;
                     jtfParcelas.setText(String.format("9x de R$ %.2f Com Juros",calculo));
                     }
                 case "10x Com Juros 9,00" -> {
                     Double juros = totalReal * 0.09;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 10;
                     jtfParcelas.setText(String.format("10x de R$ %.2f Com Juros",calculo));
                     }
                 default -> {
                 }
               }
         }
    }//GEN-LAST:event_jcbCartaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
