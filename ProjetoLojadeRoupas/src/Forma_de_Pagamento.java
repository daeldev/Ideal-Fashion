
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
        jrbAVista = new javax.swing.JRadioButton();
        jrbCartao = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jbFinalizarVenda = new javax.swing.JButton();
        jbCancelarVenda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Forma de Pagamento");

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

        jtfTroco.setEditable(false);
        jtfTroco.setBackground(new java.awt.Color(51, 51, 51));
        jtfTroco.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Troco");

        jtfSubtotal.setEditable(false);
        jtfSubtotal.setBackground(new java.awt.Color(51, 51, 51));
        jtfSubtotal.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Subtotal");

        jtfParcelas.setEditable(false);
        jtfParcelas.setBackground(new java.awt.Color(51, 51, 51));
        jtfParcelas.setForeground(new java.awt.Color(255, 255, 255));

        jcbCartao.setBackground(new java.awt.Color(51, 51, 51));
        jcbCartao.setForeground(new java.awt.Color(255, 255, 255));
        jcbCartao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x Sem Juros", "2x Sem Juros", "3x Sem Juros", "4x Sem Juros", "5x Sem Juros", "6x Com Juros 5,00", "7x Com Juros 5,00", "8x Com Juros 7,00", "9x Com Juros 7,50", "10x Com Juros 9,00" }));
        jcbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCartaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Parcelas a Pagar");

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

        jTextField1.setEditable(false);

        jbFinalizarVenda.setBackground(new java.awt.Color(51, 153, 255));
        jbFinalizarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbFinalizarVenda.setText("FINALIZAR COMPRA");
        jbFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarVendaActionPerformed(evt);
            }
        });

        jbCancelarVenda.setBackground(new java.awt.Color(255, 51, 51));
        jbCancelarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCancelarVenda.setText("CANCELAR COMPRA");
        jbCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarVendaActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(179, 179, 179))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbAVista))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbCartao)
                                    .addComponent(jcbCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(212, 212, 212))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCartao)
                    .addComponent(jrbAVista))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
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
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
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
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
                 }
                 case "2x Sem Juros" -> {
                     Double calculo = totalReal / 2;
                     jtfParcelas.setText(String.format("2x de R$ %.2f Sem Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
                     }
                 case "3x Sem Juros" -> {
                     Double calculo = totalReal / 3;
                     jtfParcelas.setText(String.format("3x de R$ %.2f Sem Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
                     }
                 case "4x Sem Juros" -> {
                     Double calculo = totalReal / 4;
                     jtfParcelas.setText(String.format("4x de R$ %.2f Sem Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
                 }
                 case "5x Sem Juros" -> {
                     Double calculo = totalReal / 5;
                     jtfParcelas.setText(String.format("5x de R$ %.2f Sem Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
                 }
                 case "6x Com Juros 5,00" -> {
                     Double juros = totalReal * 0.05;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 6;
                     jtfParcelas.setText(String.format("6x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
                     }
                 case "7x Com Juros 5,00" -> {
                     Double juros = totalReal * 0.05;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 7;
                     jtfParcelas.setText(String.format("7x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
                     }
                 case "8x Com Juros 7,00" -> {
                     Double juros = totalReal * 0.07;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 8;
                     jtfParcelas.setText(String.format("8x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
                     }
                 case "9x Com Juros 7,50" -> {
                     Double juros = totalReal * 0.075;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 9;
                     jtfParcelas.setText(String.format("9x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
                     }
                 case "10x Com Juros 9,00" -> {
                     Double juros = totalReal * 0.09;
                     Double jurosSoma = totalReal + juros;
                     Double calculo = jurosSoma / 10;
                     jtfParcelas.setText(String.format("10x de R$ %.2f Com Juros",calculo));
                     JOptionPane.showMessageDialog(null, "Venda Confirmada!");
                     JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                     JOptionPane.showMessageDialog(null, "Venda Finalizada!");
                     Tela_de_Vendas telavenda = new Tela_de_Vendas ();
                     telavenda.setVisible(true);
                     TelaAtendenteNova.jDesktopPane1.add(telavenda);
                     telavenda.toFront();
                     this.dispose();
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
         Tela_de_Vendas telavenda = new Tela_de_Vendas ();
         telavenda.setVisible(true);
         TelaAtendenteNova.jDesktopPane1.add(telavenda);
         telavenda.toFront();
         this.dispose();
         }
         else if(resposta == JOptionPane.NO_OPTION){
             
         }
    }//GEN-LAST:event_jbCancelarVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
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
