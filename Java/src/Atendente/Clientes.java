package Atendente;


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


public class Clientes extends javax.swing.JInternalFrame { 
    public Clientes() {
        initComponents();
   
    DefaultTableModel modelo = (DefaultTableModel)JTTabela.getModel();
    JTTabela.setRowSorter(new TableRowSorter(modelo));
    String FilePath = "Coloque aqui o caminho do arquivo Clientes da pasta DadosTabelas.";
             File file = new File(FilePath) ;  
        
        try {
            FileReader fr = new FileReader (file);
            BufferedReader br = new BufferedReader(fr);
            
            
            Object [ ] lines = br.lines().toArray();
            
            for (int i = 0 ; i < lines.length; i ++){
                String [ ] row = lines[i].toString().split(" ");
                modelo.addRow(row);
                
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        Limpar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTTabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JTTelefone = new javax.swing.JFormattedTextField();
        JTNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTCpf = new javax.swing.JFormattedTextField();
        JBAdicionar = new javax.swing.JButton();
        JBAtualizar = new javax.swing.JButton();
        JBExportar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        JBRemoverTudo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        jPopupMenu2.add(Limpar);

        setBorder(null);
        setClosable(true);
        setTitle("Cadastro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jPanel1VetoableChange(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTTabela.setBackground(new java.awt.Color(246, 242, 242));
        JTTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTTabelaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTTabelaMouseReleased(evt);
            }
        });
        JTTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTTabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTTabela);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 510, 430));

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTTelefone.setBackground(new java.awt.Color(51, 51, 51));
        JTTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            JTTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(JTTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 220, -1));

        JTNome.setBackground(new java.awt.Color(51, 51, 51));
        JTNome.setForeground(new java.awt.Color(255, 255, 255));
        JTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNomeActionPerformed(evt);
            }
        });
        jPanel2.add(JTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 220, -1));

        jLabel8.setText("Telefone:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel9.setText("CPF:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel10.setText("Nome:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        JTCpf.setBackground(new java.awt.Color(51, 51, 51));
        JTCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            JTCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCpfActionPerformed(evt);
            }
        });
        jPanel2.add(JTCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 220, -1));

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("ADICIONAR");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 41));

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("ATUALIZAR");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, 41));

        JBExportar.setBackground(new java.awt.Color(51, 102, 255));
        JBExportar.setForeground(new java.awt.Color(255, 255, 255));
        JBExportar.setText("EXPORTAR");
        JBExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExportarActionPerformed(evt);
            }
        });
        jPanel2.add(JBExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 100, 41));

        JBRemover.setBackground(new java.awt.Color(255, 0, 51));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("REMOVER");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });
        jPanel2.add(JBRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, 40));

        JBRemoverTudo.setBackground(new java.awt.Color(255, 51, 51));
        JBRemoverTudo.setForeground(new java.awt.Color(255, 255, 255));
        JBRemoverTudo.setText("REMOVER TUDO");
        JBRemoverTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverTudoActionPerformed(evt);
            }
        });
        jPanel2.add(JBRemoverTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 370, 340));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Clientes");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Dados do cliente");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

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

        setBounds(0, 0, 1035, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        if(JTNome.getText().equals("") || JTCpf.getText().equals("") || JTTelefone.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Insira os dados do cliente.");
        }else{
            DefaultTableModel modelo = (DefaultTableModel) JTTabela.getModel();
            Object[] dados = {JTNome.getText(), JTTelefone.getText(), JTCpf.getText()};
            modelo.addRow(dados);
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed
  
    
    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed

        
        if(JTTabela.getSelectedRow() != -1){
        
        DefaultTableModel modelop = (DefaultTableModel) JTTabela.getModel();
        modelop.removeRow(JTTabela.getSelectedRow());
        
        JTNome.setText("");
        JTTelefone.setText("");
        
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
        
        

    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JTTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTabelaMouseClicked

         if(JTTabela.getSelectedRow() != -1){
             
             JTNome.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 0).toString());
             JTTelefone.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 1).toString());           
             JTCpf.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 2).toString());
         }

    }//GEN-LAST:event_JTTabelaMouseClicked

    private void JTTabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTTabelaKeyReleased
       
        if(JTTabela.getSelectedRow() != -1){
             
             JTNome.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 0).toString());
             JTTelefone.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 1).toString());
             JTTelefone.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 2).toString());
         }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para Atualizar!");
        }
    }//GEN-LAST:event_JTTabelaKeyReleased

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
        if(JTNome.getText().equals("") || JTCpf.getText().equals("   .   .   -  ") || JTTelefone.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Insira os dados do cliente para atualizar.");
        }else{
            if(JTTabela.getSelectedRow() != -1){
             
             JTTabela.setValueAt(JTNome.getText(), JTTabela.getSelectedRow(), 0);
             JTTabela.setValueAt(JTTelefone.getText(), JTTabela.getSelectedRow(), 1);
             JTTabela.setValueAt(JTCpf.getText(), JTTabela.getSelectedRow(), 2);
         }
        }    
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void JBRemoverTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverTudoActionPerformed

            int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
            if(q == JOptionPane.YES_OPTION){   
            DefaultTableModel modelo = (DefaultTableModel) JTTabela.getModel();
            modelo.setNumRows(0);
            
            }
            
            else if(q == JOptionPane.NO_OPTION){
                
            }


    }//GEN-LAST:event_JBRemoverTudoActionPerformed

    private void JTTabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTabelaMouseReleased
        // TODO add your handling code here:
   
    }//GEN-LAST:event_JTTabelaMouseReleased

    private void jPanel1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jPanel1VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1VetoableChange

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()){
            jPopupMenu2.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void JTTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTelefoneActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        if(JTTabela.getSelectedRow() != -1){
        
        DefaultTableModel modelo = (DefaultTableModel) JTTabela.getModel();
        modelo.removeRow(JTTabela.getSelectedRow());     
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed

    private void JBExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExportarActionPerformed
        
      String FilePath = "Coloque aqui o caminho do arquivo Clientes da pasta DadosTabelas.";
      File file = new File(FilePath) ;
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i < JTTabela.getRowCount(); i ++){ // rows
                for(int j = 0; j <  JTTabela.getColumnCount(); j ++){ // colunas
                    bw.write(JTTabela.getValueAt (i, j).toString() + " ");
                    
                }
           bw.newLine();
          
            }            
            
            bw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBExportarActionPerformed

    private void JTCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCpfActionPerformed

    private void JTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBExportar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JButton JBRemoverTudo;
    private javax.swing.JFormattedTextField JTCpf;
    private javax.swing.JTextField JTNome;
    private static javax.swing.JTable JTTabela;
    private javax.swing.JFormattedTextField JTTelefone;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
