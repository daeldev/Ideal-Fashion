/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Atendente;
import Administrador.Estoque;
import Utilitários.ConexaoCi;
import Utilitários.DTO;
import Utilitários.TipoPagamento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Josiel
 */
public class CarrinhoBugado extends javax.swing.JInternalFrame {
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

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Código:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 40));

        JBLimpar.setBackground(new java.awt.Color(255, 0, 0));
        JBLimpar.setForeground(new java.awt.Color(255, 255, 255));
        JBLimpar.setText("Limpar");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });
        jPanel2.add(JBLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 90, 40));

        jLabel12.setText("Quantidade:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JSQuantidade.setToolTipText("");
        jPanel2.add(JSQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 50, -1));

        JTCodigo.setBackground(new java.awt.Color(51, 51, 51));
        JTCodigo.setForeground(new java.awt.Color(255, 255, 255));
        JTCodigo.setMinimumSize(new java.awt.Dimension(8, 19));
        JTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(JTCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 100, 20));

        jPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, 120));

        JTCarrinho.setBackground(new java.awt.Color(246, 242, 242));
        JTCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Tamanho", "Quantidade", "Preço", "Código", "Subtotal"
            }
        ));
        JTCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTCarrinhoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTCarrinho);

        jPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 540, 460));

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
        JBPagar.setText("PAGAR");
        JBPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPagarActionPerformed(evt);
            }
        });

        JBCancelar.setBackground(new java.awt.Color(255, 0, 0));
        JBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        JBCancelar.setText("CANCELAR");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JBPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 370, 140));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Carrinho");
        jPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Dados do Produto");
        jPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Total da Venda");
        jPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed

        int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
        if(q == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Venda Cancelada");
            dispose();
        }
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPagarActionPerformed
        if(JTTotal.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Total inválido.");
        }else{
            TipoPagamento TP = new TipoPagamento();
            TP.setPagamento(JTTotal.getText());
            Pagamento FP = new Pagamento();
            FP.setVisible(true);
            WorkspaceAtendente.WorkspaceAtendente.add(FP);
            FP.toFront();
        }
    }//GEN-LAST:event_JBPagarActionPerformed

    private void JTTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTotalActionPerformed

    private void JTCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTCarrinhoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCarrinhoMouseClicked

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
            JTTotal.setText(Double.toString(novoTotal));
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_JBLimparActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        DTO dto = new DTO();
        DTO.ProdutoDTO produtoDTO = dto.new ProdutoDTO();
        
        try{
            int Codigo = Integer.parseInt(JTCodigo.getText().toString());
            produtoDTO.setCodigo(Codigo);
            
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Formato inválido.");
        }
        
        produtoDTO.setQuantidade(Integer.valueOf(JSQuantidade.getValue().toString()));
        ConexaoCi Ci = new ConexaoCi();
        if (Ci.VerificarEstoque(produtoDTO)){
            int Acumulador = 0;
            double Quantidade, Subtotal;
            double Preco = produtoDTO.getPreco();
            String Produto = produtoDTO.getNome();
            Quantidade = Double.parseDouble(JSQuantidade.getValue().toString());
            Subtotal = Preco*Quantidade;

            DefaultTableModel modelo = (DefaultTableModel) JTCarrinho.getModel();
            Object[] dados = {Produto, produtoDTO.getTamanho(), JSQuantidade.getValue(), JTCodigo.getText(), Subtotal};

            for (int i = 0; i < JTCarrinho.getRowCount(); i++){
                Acumulador += Double.valueOf(JTCarrinho.getValueAt(i, 5).toString());
            }
            JTTotal.setText(Double.toString(Acumulador+Subtotal));
            modelo.addRow(dados);
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
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
