package Atendente;
import Administrador.Estoque;
import Utilitários.ConexaoCi;
import Utilitários.DTO;
import Utilitários.TipoPagamento;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


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
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JBFinalizar = new javax.swing.JButton();
        JTTotal = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTParcelas = new javax.swing.JTextField();
        JCCartao = new javax.swing.JComboBox<>();
        JTVista = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JRVista = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        JRCartao = new javax.swing.JRadioButton();

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Dados do Produto");

        setBackground(new java.awt.Color(246, 242, 242));
        setBorder(null);
        setClosable(true);
        setTitle("Pagamento");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Forma de pagamento");

        jPanel1.setBackground(new java.awt.Color(246, 242, 242));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Total:");

        JBFinalizar.setBackground(new java.awt.Color(51, 102, 255));
        JBFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        JBFinalizar.setText("Confirmar");
        JBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFinalizarActionPerformed(evt);
            }
        });

        JTTotal.setEditable(false);
        JTTotal.setBackground(new java.awt.Color(51, 51, 51));
        JTTotal.setForeground(new java.awt.Color(255, 255, 255));
        JTTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTotalActionPerformed(evt);
            }
        });

        JBCancelar.setBackground(new java.awt.Color(255, 0, 0));
        JBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(JBFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(246, 242, 242));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Parcelas:");

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
        JCCartao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCCartaoItemStateChanged(evt);
            }
        });
        JCCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCCartaoActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Dinheiro:");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        JRVista.setBackground(new java.awt.Color(204, 204, 204));
        jbgAVista.add(JRVista);
        JRVista.setForeground(new java.awt.Color(51, 51, 51));
        JRVista.setText("Á vista");
        JRVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRVistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRVista)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JRVista, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        JRCartao.setBackground(new java.awt.Color(204, 204, 204));
        jbgAVista.add(JRCartao);
        JRCartao.setForeground(new java.awt.Color(51, 51, 51));
        JRCartao.setText("Cartão");
        JRCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRCartaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRCartao)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JRCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JCCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(JTVista, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
        if(JRVista.isSelected ()){
            try{
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
            }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro. Digite os valores novamente");
            JTVista.setText("");
            JTParcelas.setText("");
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
        

        CarrinhoBugado carrinho = new CarrinhoBugado();
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

            DTO.ClienteDTO clienteDTO = dto.new ClienteDTO();
            clienteDTO.getCPF();
            clienteDTO.getNome();
            clienteDTO.getTelefone();
            
            ConexaoCi produtoDAO = new ConexaoCi();
            int Resultado = produtoDAO.AdicionarRegistro(produtoDTO, clienteDTO);

            if(Resultado != -1){ 
                //Salva a tabela
                LocalDate dataAtual = LocalDate.now();  
                String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Daniel - 221\\Ideal Fashion\\Java\\src\\DadosTabelas\\Registro";
                File file = new File(FilePath) ;
                
                DTO.RegistroDTO registroDTO = dto.new RegistroDTO();
                try {
                    FileWriter fwe = new FileWriter(file);
                    BufferedWriter bwe = new BufferedWriter(fwe);
                    bwe.write(dataAtual + " ");
                    bwe.write(clienteDTO.getNome() + " ");
                    bwe.write(clienteDTO.getTelefone() + " ");
                    bwe.write(clienteDTO.getCPF() + " ");
                    bwe.write(Nome + " ");
                    bwe.write(Tamanho + " "); 
                    bwe.write(Quantidade + " ");
                    bwe.write(registroDTO.getNotaFiscal() + " ");
                    bwe.write(Total + " "); 
                    bwe.newLine();
                    bwe.close();
                    fwe.close();
                }catch (IOException ex) {
                    Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
            }
    }//GEN-LAST:event_JBFinalizarActionPerformed

    private void JTTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTotalActionPerformed

    private void JCCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCCartaoActionPerformed

    }//GEN-LAST:event_JCCartaoActionPerformed

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

    private void JCCartaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCCartaoItemStateChanged

    }//GEN-LAST:event_JCCartaoItemStateChanged

    private void JRCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRCartaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBFinalizar;
    private javax.swing.JComboBox<String> JCCartao;
    private javax.swing.JRadioButton JRCartao;
    private javax.swing.JRadioButton JRVista;
    private javax.swing.JTextField JTParcelas;
    private javax.swing.JTextField JTTotal;
    private javax.swing.JTextField JTVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.ButtonGroup jbgAVista;
    private javax.swing.ButtonGroup jbgCartao;
    // End of variables declaration//GEN-END:variables

    void setTotal(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
