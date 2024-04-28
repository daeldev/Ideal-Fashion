package Gerente;


import Administrador.Estoque;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Oruam
 */
public class Funcionarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaFuncionarios
     */
    public Funcionarios() {
        initComponents();
        String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Ideal Fashion\\Ideal-Fashion\\IdealFashion\\src\\DadosTabelas\\Funcionarios";
        File file = new File(FilePath) ;      
        try {
            FileReader frE = new FileReader (file);
            BufferedReader brE = new BufferedReader(frE);
            
            DefaultTableModel modelo = ( DefaultTableModel)JTFuncionarios.getModel();
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

        jButton6 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Limpar = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTFuncionarios = new javax.swing.JTable();
        JBAdicionar = new javax.swing.JButton();
        JBAtualizar = new javax.swing.JButton();
        JBExportar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        JTSexo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JTNomeSocial = new javax.swing.JTextField();
        JTCpf = new javax.swing.JFormattedTextField();
        JTAdmissao = new javax.swing.JFormattedTextField();
        JTData = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        JTNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFuncao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JBRemoverTudo = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();

        jButton6.setText("jButton6");

        Limpar.setText("jMenuItem1");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Limpar);

        setBorder(null);
        setClosable(true);
        setTitle("Funcionários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setInheritsPopupMenu(true);
        setName("Tela Funcionário"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTFuncionarios.setBackground(new java.awt.Color(246, 242, 242));
        JTFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Funcionário", "Função", "CPF", "Data Nasc", "Data De Admissão", "Sexo", "Nome Social"
            }
        ));
        JTFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTFuncionarios);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 16, 530, 520));

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("ADICIONAR");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, 41));

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("ATUALIZAR");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, 41));

        JBExportar.setBackground(new java.awt.Color(51, 102, 255));
        JBExportar.setForeground(new java.awt.Color(255, 255, 255));
        JBExportar.setText("EXPORTAR");
        JBExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExportarActionPerformed(evt);
            }
        });
        jPanel2.add(JBExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 95, 41));

        jPanel3.setBackground(new java.awt.Color(246, 242, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTSexo.setBackground(new java.awt.Color(51, 51, 51));
        JTSexo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(JTSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Data de Nascimento");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome do Funcionário");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Sexo");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        JTNomeSocial.setBackground(new java.awt.Color(51, 51, 51));
        JTNomeSocial.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(JTNomeSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 200, -1));

        JTCpf.setBackground(new java.awt.Color(51, 51, 51));
        JTCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            JTCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(JTCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, -1));

        JTAdmissao.setBackground(new java.awt.Color(51, 51, 51));
        JTAdmissao.setForeground(new java.awt.Color(255, 255, 255));
        try {
            JTAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTAdmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTAdmissaoActionPerformed(evt);
            }
        });
        jPanel3.add(JTAdmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, -1));

        JTData.setBackground(new java.awt.Color(51, 51, 51));
        JTData.setForeground(new java.awt.Color(255, 255, 255));
        try {
            JTData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTDataActionPerformed(evt);
            }
        });
        jPanel3.add(JTData, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Nome Social");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        JTNome.setBackground(new java.awt.Color(51, 51, 51));
        JTNome.setForeground(new java.awt.Color(255, 255, 255));
        JTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNomeActionPerformed(evt);
            }
        });
        jPanel3.add(JTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Função");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        JTFuncao.setBackground(new java.awt.Color(51, 51, 51));
        JTFuncao.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(JTFuncao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 200, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CPF");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Data de Admissão");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        JBRemoverTudo.setBackground(new java.awt.Color(255, 51, 51));
        JBRemoverTudo.setForeground(new java.awt.Color(255, 255, 255));
        JBRemoverTudo.setText("REMOVER TUDO");
        JBRemoverTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverTudoActionPerformed(evt);
            }
        });
        jPanel3.add(JBRemoverTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 130, 40));

        JBRemover.setBackground(new java.awt.Color(255, 0, 0));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("REMOVER");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });
        jPanel3.add(JBRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 120, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 360, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        if (JTNome.getText().isEmpty() || JTFuncao.getText().isEmpty() || JTCpf.getText().isEmpty() || JTData.getText().isEmpty() || JTAdmissao.getText().isEmpty() || JTSexo.getText().isEmpty() || JTNomeSocial.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Verifique os dados do funcionário");
        }else{
            DefaultTableModel modelot = (DefaultTableModel) JTFuncionarios.getModel();
            Object[] dados = {JTNome.getText(), JTFuncao.getText(), JTCpf.getText() , JTData.getText() , JTAdmissao.getText() , JTSexo.getText() , JTNomeSocial.getText() };
            modelot.addRow(dados);
        }      
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
        
           
          if(JTFuncionarios.getSelectedRow() != -1){            
             JTFuncionarios.setValueAt(JTNome.getText(), JTFuncionarios.getSelectedRow(), 0);
             JTFuncionarios.setValueAt(JTFuncao.getText(), JTFuncionarios.getSelectedRow(), 1);
             JTFuncionarios.setValueAt(JTCpf.getText(), JTFuncionarios.getSelectedRow(), 2);
             JTFuncionarios.setValueAt(JTData.getText(), JTFuncionarios.getSelectedRow(), 3);
             JTFuncionarios.setValueAt(JTAdmissao.getText(), JTFuncionarios.getSelectedRow(), 4);
             JTFuncionarios.setValueAt(JTSexo.getText(), JTFuncionarios.getSelectedRow(),5);
             JTFuncionarios.setValueAt(JTNomeSocial.getText(), JTFuncionarios.getSelectedRow(),6);              
          }else{
             JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");
          }              
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
       
          
    
        
        if(JTFuncionarios.getSelectedRow() != -1){
        
        DefaultTableModel modelop = (DefaultTableModel) JTFuncionarios.getModel();
        modelop.removeRow(JTFuncionarios.getSelectedRow());
       
        
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }    
        
        
        
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        if(JTFuncionarios.getSelectedRow() != -1){

            DefaultTableModel modelo = (DefaultTableModel) JTFuncionarios.getModel();
            modelo.removeRow(JTFuncionarios.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed

    private void JTFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFuncionariosMouseClicked
        // TODO add your handling code here:
        JTNome.setText(JTFuncionarios.getValueAt(JTFuncionarios.getSelectedRow(), 0).toString());
        JTFuncao.setText(JTFuncionarios.getValueAt(JTFuncionarios.getSelectedRow(), 1).toString());
        JTCpf.setText(JTFuncionarios.getValueAt(JTFuncionarios.getSelectedRow(), 2).toString());
        JTData.setText(JTFuncionarios.getValueAt(JTFuncionarios.getSelectedRow(), 3).toString());
        JTAdmissao.setText(JTFuncionarios.getValueAt(JTFuncionarios.getSelectedRow(), 4).toString());
        JTSexo.setText(JTFuncionarios.getValueAt(JTFuncionarios.getSelectedRow(), 5).toString());
        JTNomeSocial.setText(JTFuncionarios.getValueAt(JTFuncionarios.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_JTFuncionariosMouseClicked

    private void JBExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExportarActionPerformed
        // TODO add your handling code here:
        String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Ideal Fashion\\Ideal-Fashion\\IdealFashion\\src\\DadosTabelas\\Funcionarios";
             File file = new File(FilePath) ;
        try {
            FileWriter fwe = new FileWriter(file);
            BufferedWriter bwe = new BufferedWriter(fwe);
            
            for (int i = 0; i < JTFuncionarios.getRowCount(); i ++){ // rows
                for(int j = 0; j <  JTFuncionarios.getColumnCount(); j ++){ // colunas
                    bwe.write(JTFuncionarios.getValueAt (i, j).toString() + " ");
                    
                }
           bwe.newLine();
           
            }            
            
            bwe.close();
            fwe.close();
            
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBExportarActionPerformed

    private void JBRemoverTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverTudoActionPerformed

        int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
        if(q == JOptionPane.YES_OPTION){
            DefaultTableModel modelo = (DefaultTableModel) JTFuncionarios.getModel();
            modelo.setNumRows(0);

        }

        else if(q == JOptionPane.NO_OPTION){

        }

    }//GEN-LAST:event_JBRemoverTudoActionPerformed

    private void JTAdmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTAdmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTAdmissaoActionPerformed

    private void JTDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTDataActionPerformed

    }//GEN-LAST:event_JTDataActionPerformed

    private void JTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBExportar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JButton JBRemoverTudo;
    private javax.swing.JFormattedTextField JTAdmissao;
    private javax.swing.JFormattedTextField JTCpf;
    private javax.swing.JFormattedTextField JTData;
    private javax.swing.JTextField JTFuncao;
    private javax.swing.JTable JTFuncionarios;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTNomeSocial;
    private javax.swing.JTextField JTSexo;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}