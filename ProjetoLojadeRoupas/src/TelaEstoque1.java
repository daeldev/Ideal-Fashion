
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
public class TelaEstoque1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque1() {
        initComponents();

        DefaultTableModel modelot = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelot));
        
             
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
        jTable1 = new javax.swing.JTable();
        camponome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campotamanho = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campopreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        campoquantidade = new javax.swing.JTextField();
        campocodigo = new javax.swing.JTextField();

        Limpar.setText("jMenuItem1");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        setBorder(null);
        setClosable(true);
        setTitle("Sistema de Estoque");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Nome do Produto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jTable1.setBackground(new java.awt.Color(246, 242, 242));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"a", "Blusa", "50", "15,00", "1"},
                {"b", "Calça", "50", "20,00", "2"},
                {"c", "Regata", "50", "22,00", "3"}
            },
            new String [] {
                "Nome", "Tamanho", "Quantidade", "Preço", "Código"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 0, 564, 565));

        camponome.setBackground(new java.awt.Color(51, 51, 51));
        camponome.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(camponome, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 89, 250, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Tamanho");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        campotamanho.setBackground(new java.awt.Color(51, 51, 51));
        campotamanho.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(campotamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 160, 250, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        campopreco.setBackground(new java.awt.Color(51, 51, 51));
        campopreco.setForeground(new java.awt.Color(255, 255, 255));
        campopreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoprecoActionPerformed(evt);
            }
        });
        jPanel1.add(campopreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 110, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Preço");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Código do Produto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADICIONAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 129, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("REMOVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 129, -1));

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ATUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 130, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setText("REMOVER TUDO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 130, -1));

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EXPORTAR DADOS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("IMPORTAR DADOS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        campoquantidade.setBackground(new java.awt.Color(51, 51, 51));
        campoquantidade.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(campoquantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 255, -1));

        campocodigo.setBackground(new java.awt.Color(51, 51, 51));
        campocodigo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(campocodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 255, -1));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          if(jTable1.getSelectedRow() != -1){             
             jTable1.setValueAt(camponome.getText(), jTable1.getSelectedRow(), 0);
             jTable1.setValueAt(campotamanho.getText(), jTable1.getSelectedRow(), 1);
             jTable1.setValueAt(campoquantidade.getText(), jTable1.getSelectedRow(), 2);
             jTable1.setValueAt(campopreco.getText(), jTable1.getSelectedRow(), 3);
             jTable1.setValueAt(campocodigo.getText(), jTable1.getSelectedRow(), 4);        
          }else{
             JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");              
          }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        if (camponome.getText().isEmpty() || !"PpMmGg".contains(campotamanho.getText()) || campoquantidade.getText().isEmpty() || campopreco.getText().isEmpty() || campocodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Verifique os dados do produto");
        }else{
            try{
                int quantidade = Integer.parseInt(campoquantidade.getText());
                double preco = Double.valueOf(campopreco.getText());
                int codigo = Integer.parseInt(campocodigo.getText());
                DefaultTableModel modelot = (DefaultTableModel) jTable1.getModel();
                Object[] dados = {camponome.getText(), campotamanho.getText(), campoquantidade.getText() , campopreco.getText() , campocodigo.getText()};
                modelot.addRow(dados);
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERRO: Verifique a quantidade, o preço ou o código do produto");
            }
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(jTable1.getSelectedRow() != -1){
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.removeRow(jTable1.getSelectedRow());
        
         }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
            if(q == JOptionPane.YES_OPTION){   
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setNumRows(0);
            
            }
            
            else if(q == JOptionPane.NO_OPTION){
                
            }
        

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
           String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Ideal Fashion\\Ideal-Fashion\\Ideal-Fashion\\ProjetoLojadeRoupas\\src\\Dados Tabelas\\dadosestoque";
             File file = new File(FilePath) ;
        try {
            FileWriter fwe = new FileWriter(file);
            BufferedWriter bwe = new BufferedWriter(fwe);
            
            for (int i = 0; i < jTable1.getRowCount(); i ++){ // rows
                for(int j = 0; j <  jTable1.getColumnCount(); j ++){ // colunas
                    bwe.write(jTable1.getValueAt (i, j).toString() + " ");
                    
                }
           bwe.newLine();
           
            }            
            
            bwe.close();
            fwe.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(TelaEstoque1.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        
        
        
        
         
        
         String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Ideal Fashion\\Ideal-Fashion\\Ideal-Fashion\\ProjetoLojadeRoupas\\src\\Dados Tabelas\\dadosestoque";
             File file = new File(FilePath) ;  
        
        try {
            FileReader frE = new FileReader (file);
            BufferedReader brE = new BufferedReader(frE);
            
            DefaultTableModel modelo = ( DefaultTableModel)jTable1.getModel();
            Object [ ] lines = brE.lines().toArray();
            
            for (int i = 0 ; i < lines.length; i ++){
                String [ ] row = lines[i].toString().split(" ");
                modelo.addRow(row);
                
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaEstoque1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() != -1){
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.removeRow(jTable1.getSelectedRow());     
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() != -1){
             
             camponome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
             campotamanho.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
             campoquantidade.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
             campopreco.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
             campocodigo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
         }
    }//GEN-LAST:event_jTable1MouseClicked

    private void campoprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoprecoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JTextField campocodigo;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField campopreco;
    private javax.swing.JTextField campoquantidade;
    private javax.swing.JTextField campotamanho;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
