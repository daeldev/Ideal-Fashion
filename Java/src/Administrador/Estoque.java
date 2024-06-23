package Administrador;
import Utilitários.ConexaoCi;
import Utilitários.DTO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Aluno.Tarde
 */
public class Estoque extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaEstoque
     */
    
    public Estoque() {
        initComponents();

        DefaultTableModel modelot = (DefaultTableModel) JTEstoque.getModel();
        JTEstoque.setRowSorter(new TableRowSorter(modelot));
        String FilePath = "/home/Aluno.Tarde/Daniel - 221/IdealFashion/Ideal-Fashion/Java/src/DadosTabelas/Estoque";
        File file = new File(FilePath) ;      
        try {
            FileReader frE = new FileReader (file);
            BufferedReader brE = new BufferedReader(frE);
            
            DefaultTableModel modelo = ( DefaultTableModel)JTEstoque.getModel();
            Object [ ] lines = brE.lines().toArray();
            
            for (int i = 0 ; i < lines.length; i ++){
                String [ ] row = lines[i].toString().split(" ");
                modelo.addRow(row);             
            }        
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        Limpar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTEstoque = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JBAtualizar = new javax.swing.JButton();
        JBAdicionar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        JTProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTPreco = new javax.swing.JTextField();
        JCTamanho = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JSQuantidade = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        Limpar.setText("jMenuItem1");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        setBorder(null);
        setClosable(true);
        setTitle("Estoque");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JTEstoque.setBackground(new java.awt.Color(246, 242, 242));
        JTEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Tamanho", "Quantidade", "Preço", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTEstoque);

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("Atualizar");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 90, 41));

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 41));

        JBRemover.setBackground(new java.awt.Color(255, 0, 0));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("Remover");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });
        jPanel2.add(JBRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 90, 40));

        JTProduto.setBackground(new java.awt.Color(51, 51, 51));
        JTProduto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(JTProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 203, -1));

        jLabel1.setText("Produto:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        JTPreco.setBackground(new java.awt.Color(51, 51, 51));
        JTPreco.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(JTPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 80, -1));

        JCTamanho.setBackground(new java.awt.Color(246, 242, 242));
        JCTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "M", "G" }));
        jPanel2.add(JCTamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 43, -1));

        jLabel2.setText("Tamanho:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel4.setText("Preço:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel6.setText("Quantidade:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JSQuantidade.setToolTipText("");
        jPanel2.add(JSQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 50, -1));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setText("Estoque");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel10.setText("Dados do produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jLabel9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1036, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
        
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        DTO dto = new DTO();
        DTO.ProdutoDTO produtoDTO = dto.new ProdutoDTO();
        
        try{
            Double Preco = Double.valueOf(JTPreco.getText());
            produtoDTO.setPreco(Preco);         
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Formato inválido.");
        }
        
        produtoDTO.setQuantidade(Integer.valueOf(JSQuantidade.getValue().toString()));
        produtoDTO.setNome(JTProduto.getText());
        produtoDTO.setTamanho(JCTamanho.getSelectedItem().toString());         
        ConexaoCi conexaoCi = new ConexaoCi();
        int resultado = conexaoCi.AdicionarProduto(produtoDTO);
        if (resultado != -1) {
            DefaultTableModel modelo = (DefaultTableModel) JTEstoque.getModel();
            Object[] dados = {
                produtoDTO.getNome(),
                produtoDTO.getTamanho(),
                produtoDTO.getQuantidade(),
                produtoDTO.getPreco(),
                produtoDTO.getCodigo()
            };
            modelo.addRow(dados);

            // Salva a tabela
            String filePath = "/home/Aluno.Tarde/Daniel - 221/IdealFashion/Ideal-Fashion/Java/src/DadosTabelas/Estoque";
            File file = new File(filePath);
            try (FileWriter fwe = new FileWriter(file); BufferedWriter bwe = new BufferedWriter(fwe)) {
                for (int i = 0; i < JTEstoque.getRowCount(); i++) {
                    for (int j = 0; j < JTEstoque.getColumnCount(); j++) {
                        bwe.write(JTEstoque.getValueAt(i, j).toString() + " ");
                    }
                    bwe.newLine();
                }
            } catch (IOException ex) {
                Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
        
        if(JTEstoque.getSelectedRow() != -1){
        
        DefaultTableModel modelo = (DefaultTableModel) JTEstoque.getModel();
        modelo.removeRow(JTEstoque.getSelectedRow());
        
         }else{
            JOptionPane.showMessageDialog(null, "ERRO: Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        if(JTEstoque.getSelectedRow() != -1){
        
        DefaultTableModel modelo = (DefaultTableModel) JTEstoque.getModel();
        modelo.removeRow(JTEstoque.getSelectedRow());     
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed

    private void JTEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTEstoqueMouseClicked
        // TODO add your handling code here:
        if(JTEstoque.getSelectedRow() != -1){
             JTProduto.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 0).toString());
             JCTamanho.setSelectedItem(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 1).toString());
             JSQuantidade.setValue(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 2).toString());
             JTPreco.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 3).toString());
         }
    }//GEN-LAST:event_JTEstoqueMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JComboBox<String> JCTamanho;
    private javax.swing.JSpinner JSQuantidade;
    private static javax.swing.JTable JTEstoque;
    private javax.swing.JTextField JTPreco;
    private javax.swing.JTextField JTProduto;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
