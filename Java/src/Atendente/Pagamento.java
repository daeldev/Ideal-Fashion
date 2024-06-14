package Atendente;
import Administrador.Estoque;
import Utilitários.ConexaoCi;
import Utilitários.DTO;
import Utilitários.TipoPagamento;
import Utilitários.UsuarioDTO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Pagamento extends javax.swing.JInternalFrame {

    
    public Pagamento() {
        initComponents();
    }
    public void PegarPagamento(TipoPagamento pagamento){
        JTTotal.setText(pagamento.getPagamento());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgAVista = new javax.swing.ButtonGroup();
        jbgCartao = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JTParcelas = new javax.swing.JTextField();
        JCCartao = new javax.swing.JComboBox<>();
        JRCartao = new javax.swing.JRadioButton();
        JRVista = new javax.swing.JRadioButton();
        JTVista = new javax.swing.JTextField();
        JTTotal = new javax.swing.JTextField();
        JBFinalizar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Dados do Produto");

        setBackground(new java.awt.Color(246, 242, 242));
        setBorder(null);
        setClosable(true);
        setTitle("Pagamento");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(246, 242, 242));

        JTParcelas.setEditable(false);
        JTParcelas.setBackground(new java.awt.Color(51, 51, 51));
        JTParcelas.setForeground(new java.awt.Color(255, 255, 255));
        JTParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTParcelasActionPerformed(evt);
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

        jbgCartao.add(JRCartao);
        JRCartao.setText("Cartão");
        JRCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRCartaoActionPerformed(evt);
            }
        });

        jbgAVista.add(JRVista);
        JRVista.setText("Á Vista");
        JRVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRVistaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTVista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRVista))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JRCartao)
                        .addGap(18, 18, 18)
                        .addComponent(JCCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRVista)
                    .addComponent(JRCartao)
                    .addComponent(JCCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTVista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 370, 140));

        JTTotal.setEditable(false);
        JTTotal.setBackground(new java.awt.Color(51, 51, 51));
        JTTotal.setForeground(new java.awt.Color(255, 255, 255));
        JTTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTotalActionPerformed(evt);
            }
        });
        jPanel2.add(JTTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, 30));

        JBFinalizar.setBackground(new java.awt.Color(51, 102, 255));
        JBFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        JBFinalizar.setText("Finalizar");
        JBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFinalizarActionPerformed(evt);
            }
        });
        jPanel2.add(JBFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 120, 43));

        JBCancelar.setBackground(new java.awt.Color(255, 0, 0));
        JBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 43));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Total:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Forma de pagamento");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja Cancelar a Venda?","Atenção",JOptionPane.YES_NO_OPTION);
        if(resposta == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null, "Venda Cancelada");
            dispose();
        }
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFinalizarActionPerformed
        try{
            if(JRVista.isSelected ()){
                Double dinheiroDoCliente = Double.valueOf(JTVista.getText());
                Double total = Double.valueOf(JTTotal.getText());
                Double troco = dinheiroDoCliente - total;
                if(dinheiroDoCliente < 0 || troco < 0){
                    JOptionPane.showMessageDialog(null, "ERRO: Valor Inválido! Tente Novamente.");
                    JTVista.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Troco: "+ troco);
                    JOptionPane.showMessageDialog(null, "Venda Finalizada.");
                }
            }

            if(JRCartao.isSelected()){
                Double totalReal = Double.valueOf(JTTotal.getText());//.replaceAll(",", "."));
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
        

        Carrinho carrinho = new Carrinho();
        for (int i = 0; i < carrinho.JTCarrinho.getRowCount(); i++) {
            DTO dto = new DTO();
            DTO.ProdutoDTO produtoDTO = dto.new ProdutoDTO();
            
            String Nome = carrinho.JTCarrinho.getValueAt(i, 0).toString();
            String Tamanho = carrinho.JTCarrinho.getValueAt(i, 1).toString();
            int Quantidade = Integer.parseInt(carrinho.JTCarrinho.getValueAt(i, 2).toString());
            Double Total = Double.valueOf(carrinho.JTCarrinho.getValueAt(i, 5).toString());

            produtoDTO.setNome(Nome);
            produtoDTO.setTamanho(Tamanho);
            produtoDTO.setQuantidade(Quantidade);
            produtoDTO.setTotal(Total);

            ConexaoCi produtoDAO = new ConexaoCi();
            int Resultado = produtoDAO.AdicionarRegistro(produtoDTO);

            if(Resultado != -1){ 
                //Salva a tabela
                LocalDate dataAtual = LocalDate.now();  
                String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Daniel - 221\\Ideal Fashion\\Java\\src\\DadosTabelas\\Registro";
                File file = new File(FilePath) ;
                
                try {
                    FileWriter fwe = new FileWriter(file);
                    BufferedWriter bwe = new BufferedWriter(fwe);
                    bwe.write(dataAtual + " ");
                    bwe.write(ObjusuarioDTO.getClienteRegistro() + " ");
                    bwe.write(ObjusuarioDTO.getTelefoneRegistro() + " ");
                    bwe.write(ObjusuarioDTO.getCPFRegistro() + " ");
                    bwe.write(ProdutoRegistro + " ");
                    bwe.write(TamanhoProduto + " "); 
                    bwe.write(QuantidadeProduto + " ");
                    bwe.write(ObjusuarioDTO.getNotaFiscalRegistro() + " ");
                    bwe.write(TotalRegistro + " "); 
                    bwe.newLine();
                    bwe.close();
                    fwe.close();
                }catch (IOException ex) {
                    Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro. Digite os valores novamente");
            JTVista.setText("");
            JTParcelas.setText("");
        }  
    }//GEN-LAST:event_JBFinalizarActionPerformed

    private void JTTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTotalActionPerformed

    private void JCCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCCartaoActionPerformed

    }//GEN-LAST:event_JCCartaoActionPerformed

    private void JRCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRCartaoActionPerformed
        jbgAVista.clearSelection();
        JTVista.setText("");
    }//GEN-LAST:event_JRCartaoActionPerformed

    private void JRVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRVistaActionPerformed

        jbgCartao.clearSelection();
        JTParcelas.setText("");
    }//GEN-LAST:event_JRVistaActionPerformed

    private void JTVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTVistaActionPerformed

    }//GEN-LAST:event_JTVistaActionPerformed

    private void JTVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTVistaMouseClicked

    }//GEN-LAST:event_JTVistaMouseClicked

    private void JTParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTParcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTParcelasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBFinalizar;
    private javax.swing.JComboBox<String> JCCartao;
    private javax.swing.JRadioButton JRCartao;
    private javax.swing.JRadioButton JRVista;
    private javax.swing.JTextField JTParcelas;
    private javax.swing.JTextField JTTotal;
    private javax.swing.JTextField JTVista;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.ButtonGroup jbgAVista;
    private javax.swing.ButtonGroup jbgCartao;
    // End of variables declaration//GEN-END:variables

    void setTotal(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
