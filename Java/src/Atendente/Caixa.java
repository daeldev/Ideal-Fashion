/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Atendente;

import static Atendente.WorkspaceAtendente.WorkspaceAtendente;
import Utilitários.ConexaoCi;
import Utilitários.DTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josiel
 */
public class Caixa extends javax.swing.JInternalFrame {

    /**
     * Creates new form Carrinho1
     */
    public Caixa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        JBAdicionar = new javax.swing.JButton();
        JBLimpar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        JSQuantidade = new javax.swing.JSpinner();
        JTCodigo = new javax.swing.JTextField();
        JBAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTCarrinho = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JTTotal = new javax.swing.JTextField();
        JBPagar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));

        jLabel8.setText("Código:");

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JBLimpar.setBackground(new java.awt.Color(255, 0, 0));
        JBLimpar.setForeground(new java.awt.Color(255, 255, 255));
        JBLimpar.setText("Remover");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        jLabel12.setText("Quantidade:");

        JSQuantidade.setToolTipText("");

        JTCodigo.setBackground(new java.awt.Color(51, 51, 51));
        JTCodigo.setForeground(new java.awt.Color(255, 255, 255));
        JTCodigo.setMinimumSize(new java.awt.Dimension(8, 19));
        JTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCodigoActionPerformed(evt);
            }
        });

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("Atualizar");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JSQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JSQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        JTCarrinho.setBackground(new java.awt.Color(246, 242, 242));
        JTCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Tamanho", "Quantidade", "Preço", "Código", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTCarrinhoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTCarrinho);

        jPanel3.setBackground(new java.awt.Color(246, 242, 242));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Total:");

        JTTotal.setBackground(new java.awt.Color(51, 51, 51));
        JTTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTTotal.setForeground(new java.awt.Color(255, 255, 255));
        JTTotal.setEnabled(false);
        JTTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTotalActionPerformed(evt);
            }
        });

        JBPagar.setBackground(new java.awt.Color(51, 102, 255));
        JBPagar.setForeground(new java.awt.Color(255, 255, 255));
        JBPagar.setText("Confirmar");
        JBPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPagarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JBPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel10.setText("Carrinho");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel14.setText("Dados do Produto");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel15.setText("Total da Venda");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addGap(30, 30, 30)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean VerificarProduto(int Codigo){
        for (int i = 0; i < JTCarrinho.getRowCount(); i++){
            if(Integer.parseInt(JTCarrinho.getValueAt(i, 4).toString()) == Codigo){
                return false;
            }
        }
        return true;
    }
    
    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        DTO dto = new DTO();
        DTO.ProdutoDTO produtoDTO = dto.new ProdutoDTO();
        
        try{
            int Codigo = Integer.parseInt(JTCodigo.getText().toString());
            produtoDTO.setCodigo(Codigo); 
            
            if (VerificarProduto(Integer.parseInt(JTCodigo.getText().toString()))){
                produtoDTO.setQuantidade(Integer.valueOf(JSQuantidade.getValue().toString()));
                ConexaoCi Ci = new ConexaoCi();
                if (Ci.VerificarEstoque(produtoDTO)){
                    int Acumulador = 0;
                    double Preco = produtoDTO.getPreco();
                    int Quantidade = Integer.parseInt(JSQuantidade.getValue().toString());
                    double Subtotal = Preco*Quantidade;
                    String Produto = produtoDTO.getNome();

                    DefaultTableModel modelo = (DefaultTableModel) JTCarrinho.getModel();
                    Object[] dados = {Produto, produtoDTO.getTamanho(), Quantidade, Preco, produtoDTO.getCodigo(), Subtotal};

                    for (int i = 0; i < JTCarrinho.getRowCount(); i++){
                        Acumulador += Double.valueOf(JTCarrinho.getValueAt(i, 5).toString());
                    }
                    JTTotal.setText(Double.toString(Acumulador+Subtotal));
                    modelo.addRow(dados);

                    JTCodigo.setText("");
                    JSQuantidade.setValue(0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "ERRO: Produto já adicionado.");
            }  
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Verifique o código.");
        } 
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) JTCarrinho.getModel();
        // Verifica se alguma linha está selecionada no carrinho
        if (JTCarrinho.getSelectedRow() != -1) {
            // Obtém o subtotal do produto selecionado
            double subtotalRemovido = Double.parseDouble(modelo.getValueAt(JTCarrinho.getSelectedRow(), 5).toString());

            // Remove a linha do produto selecionado do modelo da tabela
            modelo.removeRow(JTCarrinho.getSelectedRow());

            // Recalcula o total acumulado após a remoção do produto
            double novoTotal = 0;
            for (int i = 0; i < modelo.getRowCount(); i++) {
                novoTotal += Double.parseDouble(modelo.getValueAt(i, 5).toString());
            }

            // Atualiza o campo campototal com o novo total acumulado
            JTCodigo.setText("");
            JSQuantidade.setValue(0);
            JTTotal.setText(Double.toString(novoTotal));  
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_JBLimparActionPerformed

    private void JTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCodigoActionPerformed

    private void JTCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTCarrinhoMouseClicked
        if(JTCarrinho.getSelectedRow() != -1){
             JTCodigo.setText(JTCarrinho.getValueAt(JTCarrinho.getSelectedRow(), 4).toString());
             JSQuantidade.setValue(JTCarrinho.getValueAt(JTCarrinho.getSelectedRow(), 2));
         }
        
    }//GEN-LAST:event_JTCarrinhoMouseClicked

    private void JTTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTotalActionPerformed
    
    private void JBPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPagarActionPerformed
        DTO dto = new DTO();
        DTO.VendaDTO vendaDTO = dto.new VendaDTO();
        
        try{
            vendaDTO.setTotal(Double.valueOf(JTTotal.getText()));
            DefaultTableModel Carrinho = (DefaultTableModel) JTCarrinho.getModel();

            Pagamento pagamento = new Pagamento();  
            pagamento.Pagamento(vendaDTO, Carrinho);

            WorkspaceAtendente.add(pagamento);
            pagamento.setVisible(true);
            pagamento.setBounds(450, 100, 379, 527);      
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o carrinho.");
        } 
            
    }//GEN-LAST:event_JBPagarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed

        int q = JOptionPane.showConfirmDialog(null,"Deseja cancelar a venda?","Atenção", JOptionPane.YES_NO_OPTION);
        if(q == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
        // TODO add your handling code here:
        DTO dto = new DTO();
        DTO.ProdutoDTO produtoDTO = dto.new ProdutoDTO();
        if(JTCarrinho.getSelectedRow() != -1){    
            int Quantidade = Integer.parseInt(JSQuantidade.getValue().toString());
            int Codigo = Integer.parseInt(JTCarrinho.getValueAt(JTCarrinho.getSelectedRow(), 4).toString());
            
            produtoDTO.setQuantidade(Quantidade);
            produtoDTO.setCodigo(Codigo);
            
            ConexaoCi Ci = new ConexaoCi();
            if (Ci.VerificarEstoque(produtoDTO)){
                double Preco = Double.valueOf(JTCarrinho.getValueAt(JTCarrinho.getSelectedRow(), 3).toString());
                double Subtotal = Preco*Quantidade;
                
                JTCarrinho.setValueAt(Quantidade, JTCarrinho.getSelectedRow(), 2);
                JTCarrinho.setValueAt(Subtotal, JTCarrinho.getSelectedRow(), 5);
                
                int Acumulador = 0;
                for (int i = 0; i < JTCarrinho.getRowCount(); i++){
                    Acumulador += Double.valueOf(JTCarrinho.getValueAt(i, 5).toString());
                }
                JTTotal.setText(Double.toString(Acumulador));
                JTCodigo.setText("");
                JSQuantidade.setValue(0);
            }   
        }else{
            JOptionPane.showMessageDialog(rootPane, "ERRO: Selecione um produto.");
        } 
    }//GEN-LAST:event_JBAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JButton JBPagar;
    private javax.swing.JSpinner JSQuantidade;
    public javax.swing.JTable JTCarrinho;
    private javax.swing.JTextField JTCodigo;
    private javax.swing.JTextField JTTotal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
