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
        JTNome = new javax.swing.JTextField();
        JTEmail = new javax.swing.JTextField();
        JBAdicionar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        JBAtualizar = new javax.swing.JButton();
        JBRemoverTudo = new javax.swing.JButton();
        JTCpf = new javax.swing.JFormattedTextField();
        JTTelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTResidencia = new javax.swing.JTextField();
        JBExportar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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
                "Nome", "Telefone", "E-mail", "CPF", "Residência"
            }
        ));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 6, 540, 500));

        JTNome.setBackground(new java.awt.Color(51, 51, 51));
        JTNome.setForeground(new java.awt.Color(255, 255, 255));
        JTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNomeActionPerformed(evt);
            }
        });
        jPanel1.add(JTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 220, -1));

        JTEmail.setBackground(new java.awt.Color(51, 51, 51));
        JTEmail.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(JTEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 220, -1));

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("ADICIONAR");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 41));

        JBRemover.setBackground(new java.awt.Color(255, 0, 51));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("REMOVER");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(JBRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 120, 40));

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("ATUALIZAR");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(JBAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 100, 41));

        JBRemoverTudo.setBackground(new java.awt.Color(255, 51, 51));
        JBRemoverTudo.setForeground(new java.awt.Color(255, 255, 255));
        JBRemoverTudo.setText("REMOVER TUDO");
        JBRemoverTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverTudoActionPerformed(evt);
            }
        });
        jPanel1.add(JBRemoverTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 120, 40));

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
        jPanel1.add(JTCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 220, -1));

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
        jPanel1.add(JTTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 220, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CPF");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        JTResidencia.setBackground(new java.awt.Color(51, 51, 51));
        JTResidencia.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(JTResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 220, -1));

        JBExportar.setBackground(new java.awt.Color(51, 102, 255));
        JBExportar.setForeground(new java.awt.Color(255, 255, 255));
        JBExportar.setText("EXPORTAR");
        JBExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExportarActionPerformed(evt);
            }
        });
        jPanel1.add(JBExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 100, 41));

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Telefone");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Residência");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addGap(123, 123, 123)
                .addComponent(jLabel6)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 370, 510));

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
        if(JTNome.getText().equals("") || JTCpf.getText().equals("") || JTEmail.getText().equals("") || JTResidencia.getText().equals("") || JTTelefone.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Insira os dados do cliente.");
        }else{
            DefaultTableModel modelo = (DefaultTableModel) JTTabela.getModel();
            Object[] dados = {JTNome.getText(), JTTelefone.getText(), JTEmail.getText(), JTCpf.getText(), JTResidencia.getText()};
            modelo.addRow(dados);
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed
  
    
    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed

        
        if(JTTabela.getSelectedRow() != -1){
        
        DefaultTableModel modelop = (DefaultTableModel) JTTabela.getModel();
        modelop.removeRow(JTTabela.getSelectedRow());
        
        JTNome.setText("");
        JTTelefone.setText("");
        JTEmail.setText("");
        
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
        
        

    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JTTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTabelaMouseClicked

         if(JTTabela.getSelectedRow() != -1){
             
             JTNome.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 0).toString());
             JTTelefone.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 1).toString());
             JTEmail.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 2).toString());
             JTCpf.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 3).toString());
             JTResidencia.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 4).toString());
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
        if(JTNome.getText().equals("") || JTCpf.getText().equals("   .   .   -  ") || JTEmail.getText().equals("") || JTResidencia.getText().equals("") || JTTelefone.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Insira os dados do cliente para atualizar.");
        }else{
            if(JTTabela.getSelectedRow() != -1){
             
             JTTabela.setValueAt(JTNome.getText(), JTTabela.getSelectedRow(), 0);
             JTTabela.setValueAt(JTTelefone.getText(), JTTabela.getSelectedRow(), 1);
             JTTabela.setValueAt(JTEmail.getText(), JTTabela.getSelectedRow(), 2);
             JTTabela.setValueAt(JTCpf.getText(), JTTabela.getSelectedRow(), 3);
             JTTabela.setValueAt(JTResidencia.getText(), JTTabela.getSelectedRow(), 4);
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
    private javax.swing.JTextField JTEmail;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTResidencia;
    private static javax.swing.JTable JTTabela;
    private javax.swing.JFormattedTextField JTTelefone;
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
