package Administrador;


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
        String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Ideal Fashion\\Ideal-Fashion\\IdealFashion\\src\\DadosTabelas\\Estoque";
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTEstoque = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTQuantidade = new javax.swing.JTextField();
        JTCodigoProduto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        JBAtualizar = new javax.swing.JButton();
        JBAdicionar = new javax.swing.JButton();
        JBExportar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        JBRemoverTudo = new javax.swing.JButton();
        JTPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTNomeProduto = new javax.swing.JTextField();
        JTTamanho = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Nome do Produto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        JTEstoque.setBackground(new java.awt.Color(246, 242, 242));
        JTEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tamanho", "Quantidade", "Preço", "Código"
            }
        ));
        JTEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTEstoque);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 25, 564, 540));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Tamanho");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Código do Produto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        JTQuantidade.setBackground(new java.awt.Color(51, 51, 51));
        JTQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(JTQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 200, 230, -1));

        JTCodigoProduto.setBackground(new java.awt.Color(51, 51, 51));
        JTCodigoProduto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(JTCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 270, 230, -1));

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("ATUALIZAR");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("ADICIONAR");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JBExportar.setBackground(new java.awt.Color(51, 102, 255));
        JBExportar.setForeground(new java.awt.Color(255, 255, 255));
        JBExportar.setText("EXPORTAR");
        JBExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExportarActionPerformed(evt);
            }
        });

        JBRemover.setBackground(new java.awt.Color(255, 0, 0));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("REMOVER");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });

        JBRemoverTudo.setBackground(new java.awt.Color(255, 0, 0));
        JBRemoverTudo.setForeground(new java.awt.Color(255, 255, 255));
        JBRemoverTudo.setText("REMOVER TUDO");
        JBRemoverTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverTudoActionPerformed(evt);
            }
        });

        JTPreco.setBackground(new java.awt.Color(51, 51, 51));
        JTPreco.setForeground(new java.awt.Color(255, 255, 255));
        JTPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTPrecoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Preço");

        JTNomeProduto.setBackground(new java.awt.Color(51, 51, 51));
        JTNomeProduto.setForeground(new java.awt.Color(255, 255, 255));

        JTTamanho.setBackground(new java.awt.Color(51, 51, 51));
        JTTamanho.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JBAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(JBAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(JBRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBRemoverTudo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JTNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(JTTamanho))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JTNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(JTTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBRemoverTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 350, 500));

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

        setBounds(0, 0, 1035, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
          if(JTEstoque.getSelectedRow() != -1){             
             JTEstoque.setValueAt(JTNomeProduto.getText(), JTEstoque.getSelectedRow(), 0);
             JTEstoque.setValueAt(JTTamanho.getText(), JTEstoque.getSelectedRow(), 1);
             JTEstoque.setValueAt(JTQuantidade.getText(), JTEstoque.getSelectedRow(), 2);
             JTEstoque.setValueAt(JTPreco.getText(), JTEstoque.getSelectedRow(), 3);
             JTEstoque.setValueAt(JTCodigoProduto.getText(), JTEstoque.getSelectedRow(), 4);        
          }else{
             JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");              
          }   
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
      
        if (JTNomeProduto.getText().isEmpty() || !"PpMmGg".contains(JTTamanho.getText()) || JTQuantidade.getText().isEmpty() || JTPreco.getText().isEmpty() || JTCodigoProduto.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Verifique os dados do produto");
        }else{
            try{
                int quantidade = Integer.parseInt(JTQuantidade.getText());
                double preco = Double.valueOf(JTPreco.getText());
                int codigo = Integer.parseInt(JTCodigoProduto.getText());
                DefaultTableModel modelot = (DefaultTableModel) JTEstoque.getModel();
                Object[] dados = {JTNomeProduto.getText(), JTTamanho.getText(), JTQuantidade.getText() , JTPreco.getText() , JTCodigoProduto.getText()};
                modelot.addRow(dados);
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERRO: Verifique a quantidade, o preço ou o código do produto");
            }
        }   
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
        
        if(JTEstoque.getSelectedRow() != -1){
        
        DefaultTableModel modelo = (DefaultTableModel) JTEstoque.getModel();
        modelo.removeRow(JTEstoque.getSelectedRow());
        
         }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JBRemoverTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverTudoActionPerformed

        int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
            if(q == JOptionPane.YES_OPTION){   
            DefaultTableModel modelo = (DefaultTableModel) JTEstoque.getModel();
            modelo.setNumRows(0);
            
            }
            
            else if(q == JOptionPane.NO_OPTION){
                
            }
        

    }//GEN-LAST:event_JBRemoverTudoActionPerformed

    private void JBExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExportarActionPerformed
        
           String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Ideal Fashion\\Ideal-Fashion\\IdealFashion\\src\\DadosTabelas\\Estoque";
             File file = new File(FilePath) ;
        try {
            FileWriter fwe = new FileWriter(file);
            BufferedWriter bwe = new BufferedWriter(fwe);
            
            for (int i = 0; i < JTEstoque.getRowCount(); i ++){ // rows
                for(int j = 0; j <  JTEstoque.getColumnCount(); j ++){ // colunas
                    bwe.write(JTEstoque.getValueAt (i, j).toString() + " ");
                    
                }
           bwe.newLine();
           
            }            
            
            bwe.close();
            fwe.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        
    }//GEN-LAST:event_JBExportarActionPerformed

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
             
             JTNomeProduto.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 0).toString());
             JTTamanho.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 1).toString());
             JTQuantidade.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 2).toString());
             JTPreco.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 3).toString());
             JTCodigoProduto.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 4).toString());
         }
    }//GEN-LAST:event_JTEstoqueMouseClicked

    private void JTPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTPrecoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBExportar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JButton JBRemoverTudo;
    private javax.swing.JTextField JTCodigoProduto;
    private static javax.swing.JTable JTEstoque;
    private javax.swing.JTextField JTNomeProduto;
    private javax.swing.JTextField JTPreco;
    private javax.swing.JTextField JTQuantidade;
    private javax.swing.JTextField JTTamanho;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}