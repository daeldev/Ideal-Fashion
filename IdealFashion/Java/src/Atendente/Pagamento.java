package Atendente;
import Utilitários.ConexaoCi;
import Utilitários.TipoPagamento;
import Utilitários.UsuarioDTO;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class Pagamento extends javax.swing.JInternalFrame {

    
    public Pagamento() {
        initComponents();
    }
    public void PegarPagamento(TipoPagamento pagamento){
        JTSubtotal.setText(pagamento.getPagamento());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgAVista = new javax.swing.ButtonGroup();
        jbgCartao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JTVista = new javax.swing.JTextField();
        JRVista = new javax.swing.JRadioButton();
        JRCartao = new javax.swing.JRadioButton();
        JCCartao = new javax.swing.JComboBox<>();
        JTParcelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTTroco = new javax.swing.JTextField();
        JTSubtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        JBFinalizar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 242, 242));
        setBorder(null);
        setClosable(true);
        setTitle("Pagamento");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));

        JTVista.setBackground(new java.awt.Color(51, 51, 51));
        JTVista.setForeground(new java.awt.Color(255, 255, 255));
        JTVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTVistaMouseClicked(evt);
            }
        });
        JTVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTVistaActionPerformed(evt);
            }
        });

        jbgAVista.add(JRVista);
        JRVista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JRVista.setText("Á Vista");
        JRVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRVistaActionPerformed(evt);
            }
        });

        jbgCartao.add(JRCartao);
        JRCartao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JRCartao.setText("Cartão");
        JRCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRCartaoActionPerformed(evt);
            }
        });

        JCCartao.setBackground(new java.awt.Color(246, 242, 242));
        JCCartao.setForeground(new java.awt.Color(51, 51, 51));
        JCCartao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x", "2x", "3x", "4x", "5x", "6x Com Juros 5,00", "7x Com Juros 5,00", "8x Com Juros 7,00", "9x Com Juros 7,50", "10x Com Juros 9,00" }));
        JCCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCCartaoActionPerformed(evt);
            }
        });

        JTParcelas.setEditable(false);
        JTParcelas.setBackground(new java.awt.Color(51, 51, 51));
        JTParcelas.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Troco");

        JTTroco.setEditable(false);
        JTTroco.setBackground(new java.awt.Color(51, 51, 51));
        JTTroco.setForeground(new java.awt.Color(255, 255, 255));

        JTSubtotal.setEditable(false);
        JTSubtotal.setBackground(new java.awt.Color(51, 51, 51));
        JTSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        JTSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTSubtotalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Subtotal");

        jTextField1.setEditable(false);

        JBFinalizar.setBackground(new java.awt.Color(51, 153, 255));
        JBFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBFinalizar.setText("FINALIZAR");
        JBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFinalizarActionPerformed(evt);
            }
        });

        JBCancelar.setBackground(new java.awt.Color(255, 51, 51));
        JBCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBCancelar.setText("CANCELAR");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
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
                        .addComponent(JBFinalizar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTTroco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JRVista)
                            .addComponent(JTVista, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jLabel4))))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addGap(64, 64, 64)))
                        .addComponent(JTParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JRCartao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBCancelar))
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
                    .addComponent(JRVista)
                    .addComponent(JRCartao)
                    .addComponent(JCCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTVista, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(JTTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void JTVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTVistaActionPerformed
     
    }//GEN-LAST:event_JTVistaActionPerformed

    private void JTVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTVistaMouseClicked
     
    }//GEN-LAST:event_JTVistaMouseClicked

    private void JRVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRVistaActionPerformed
         
    jbgCartao.clearSelection();
    JTParcelas.setText("");
    }//GEN-LAST:event_JRVistaActionPerformed

    private void JRCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRCartaoActionPerformed
        jbgAVista.clearSelection();
        JTVista.setText("");
        JTTroco.setText("");

    }//GEN-LAST:event_JRCartaoActionPerformed

    private void JBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFinalizarActionPerformed
        try{    
            if(JRVista.isSelected ()){
                Double dinheiroDoCliente = Double.valueOf(JTVista.getText());
                Double total = Double.valueOf(JTSubtotal.getText());
                Double troco = dinheiroDoCliente - total;
                if(dinheiroDoCliente < 0 || troco < 0){
                    JOptionPane.showMessageDialog(null, "Valor Inválido! Tente Novamente.");
                    JTVista.setText("");
                    JTTroco.setText("");
                }else{
                    JTTroco.setText(""+troco);    
                    JOptionPane.showMessageDialog(null, "Venda Confirmada");
                    JOptionPane.showMessageDialog(null, "Imprimindo Nota Fiscal...");
                    JOptionPane.showMessageDialog(null, "Venda Finalizada!");  
                }
            }

            if(JRCartao.isSelected()){
                jTextField1.setText(JCCartao.getSelectedItem().toString());
                Double totalReal = Double.valueOf(JTSubtotal.getText());//.replaceAll(",", "."));
                String parcelas = String.valueOf((String) JCCartao.getSelectedItem());

                switch (parcelas) {
                    case "1x" -> {
                        Double calculo = totalReal / 1;
                        JTParcelas.setText(String.format("1x de R$ %.2f Sem Juros",calculo));
                    }
                    case "2x" -> {
                        Double calculo = totalReal / 2;
                        JTParcelas.setText(String.format("2x de R$ %.2f Sem Juros",calculo));
                    }
                    case "3x" -> {
                        Double calculo = totalReal / 3;
                        JTParcelas.setText(String.format("3x de R$ %.2f Sem Juros",calculo));
                    }
                    case "4x" -> {
                        Double calculo = totalReal / 4;
                        JTParcelas.setText(String.format("4x de R$ %.2f Sem Juros",calculo));
                    }
                    case "5x" -> {
                        Double calculo = totalReal / 5;
                        JTParcelas.setText(String.format("5x de R$ %.2f Sem Juros",calculo));
                    }
                    case "6x Com Juros 5,00" -> {
                        Double juros = totalReal * 0.05;
                        Double jurosSoma = totalReal + juros;
                        Double calculo = jurosSoma / 6;
                        JTParcelas.setText(String.format("6x de R$ %.2f Com Juros",calculo));
                    }
                    case "7x Com Juros 5,00" -> {
                        Double juros = totalReal * 0.05;
                        Double jurosSoma = totalReal + juros;
                        Double calculo = jurosSoma / 7;
                        JTParcelas.setText(String.format("7x de R$ %.2f Com Juros",calculo));
                    }
                    case "8x Com Juros 7,00" -> {
                        Double juros = totalReal * 0.07;
                        Double jurosSoma = totalReal + juros;
                        Double calculo = jurosSoma / 8;
                        JTParcelas.setText(String.format("8x de R$ %.2f Com Juros",calculo));
                    }
                    case "9x Com Juros 7,50" -> {
                        Double juros = totalReal * 0.075;
                        Double jurosSoma = totalReal + juros;
                        Double calculo = jurosSoma / 9;
                        JTParcelas.setText(String.format("9x de R$ %.2f Com Juros",calculo));
                    }
                    case "10x Com Juros 9,00" -> {
                        Double juros = totalReal * 0.09;
                        Double jurosSoma = totalReal + juros;
                        Double calculo = jurosSoma / 10;
                        JTParcelas.setText(String.format("10x de R$ %.2f Com Juros",calculo));
                    }
                    default -> {
                    }
                }
            }
            
            //Adiciona os dados da venda ao banco de dados
            UsuarioDTO ObjusuarioDTO = new UsuarioDTO();
            String Cliente = ObjusuarioDTO.getClienteRegistro();
            String Telefone = ObjusuarioDTO.getTelefoneRegistro();
            String CPFCliente = ObjusuarioDTO.getCPFRegistro();    
            
            Caixa Carrinho = new Caixa();
            for (int i = 0; i < Carrinho.JTVendas.getRowCount(); i++) {
                String Produto = Carrinho.JTVendas.getValueAt(i, 0).toString();
                String TamanhoProduto = Carrinho.JTVendas.getValueAt(i, 1).toString();
                int QuantidadeProduto = Integer.parseInt(Carrinho.JTVendas.getValueAt(i, 2).toString());
                Double Total = Double.valueOf(Carrinho.JTVendas.getValueAt(i, 5).toString());
                int Codigo = Integer.parseInt(Carrinho.JTVendas.getValueAt(i, 4).toString());
                
                ObjusuarioDTO.setClienteRegistro(Cliente);
                ObjusuarioDTO.setTelefoneRegistro(Telefone);
                ObjusuarioDTO.setCPFRegistro(CPFCliente);
                ObjusuarioDTO.setProdutoRegistro(Produto);
                ObjusuarioDTO.setTamanhoRegistro(TamanhoProduto);
                ObjusuarioDTO.setQuantidadeRegistro(QuantidadeProduto);
                ObjusuarioDTO.setTotalRegistro(Total);
                
                ConexaoCi ObjusuarioDAO = new ConexaoCi();
                int Resultado = ObjusuarioDAO.AdicionarRegistro(ObjusuarioDTO);

                if(Resultado != -1){
                    JOptionPane.showMessageDialog(null, "Venda finalizada");
                }else{
                    JOptionPane.showMessageDialog(null, "Erro na venda.");
                } 
            }        
        }catch (Exception e) {                
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro. Digite os valores novamente");
            JTVista.setText("");
            JTTroco.setText("");
            JTParcelas.setText("");
        }     
    }//GEN-LAST:event_JBFinalizarActionPerformed

    private void JCCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCCartaoActionPerformed
      
         
    }//GEN-LAST:event_JCCartaoActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        
         int resposta = JOptionPane.showConfirmDialog(null, "Deseja Cancelar a Venda?","Atenção",JOptionPane.YES_NO_OPTION);       
         if(resposta == JOptionPane.YES_NO_OPTION){
         JOptionPane.showMessageDialog(null, "Venda Cancelada");
         dispose();
         }
         else if(resposta == JOptionPane.NO_OPTION){         
         }
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTSubtotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBFinalizar;
    private javax.swing.JComboBox<String> JCCartao;
    private javax.swing.JRadioButton JRCartao;
    private javax.swing.JRadioButton JRVista;
    private javax.swing.JTextField JTParcelas;
    private javax.swing.JTextField JTSubtotal;
    private javax.swing.JTextField JTTroco;
    private javax.swing.JTextField JTVista;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.ButtonGroup jbgAVista;
    private javax.swing.ButtonGroup jbgCartao;
    // End of variables declaration//GEN-END:variables

    void setTotal(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
