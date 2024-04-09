
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


public class TabelaCliente extends javax.swing.JInternalFrame {

    
    public TabelaCliente() {
        initComponents();
   
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    jTable1.setRowSorter(new TableRowSorter(modelo));
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        Limpar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        camponome = new javax.swing.JTextField();
        campoemail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        campocpf = new javax.swing.JFormattedTextField();
        campotelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        camporesidencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        jPopupMenu2.add(Limpar);

        setBorder(null);
        setClosable(true);
        setTitle("Cadastro de Clientes");

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

        jTable1.setBackground(new java.awt.Color(246, 242, 242));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Alex", "(21)00000-0000", "gmail", "000.000.000-00", "Anchieta"},
                {"Daniel", "(21)11111-1111", "gmail", "111.111.111-11", "Belford Roxo"},
                {"Eduardo", "(21)22222-2222", "gmail", "222.222.222-22", "Anchieta"}
            },
            new String [] {
                "Nome", "Telefone", "E-mail", "CPF", "Residência"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        camponome.setBackground(new java.awt.Color(51, 51, 51));
        camponome.setForeground(new java.awt.Color(255, 255, 255));
        camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponomeActionPerformed(evt);
            }
        });

        campoemail.setBackground(new java.awt.Color(51, 51, 51));
        campoemail.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADICIONAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REMOVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ATUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REMOVER TUDO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        campocpf.setBackground(new java.awt.Color(51, 51, 51));
        campocpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campocpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campocpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocpfActionPerformed(evt);
            }
        });

        campotelefone.setBackground(new java.awt.Color(51, 51, 51));
        campotelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campotelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(21) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campotelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotelefoneActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Telefone");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CPF");

        camporesidencia.setBackground(new java.awt.Color(51, 51, 51));
        camporesidencia.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Residência");

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EXPORTAR DADOS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("IMPORTAR DADOS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(camponome)
                            .addComponent(campotelefone)
                            .addComponent(campoemail)
                            .addComponent(campocpf)
                            .addComponent(camporesidencia)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campotelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campocpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(camporesidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(camponome.getText().equals("") || campocpf.getText().equals("") || campoemail.getText().equals("") || camporesidencia.getText().equals("") || campotelefone.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Insira os dados do cliente.");
        }else{
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            Object[] dados = {camponome.getText(), campotelefone.getText(), campoemail.getText(), campocpf.getText(), camporesidencia.getText()};
            modelo.addRow(dados);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
  
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        if(jTable1.getSelectedRow() != -1){
        
        DefaultTableModel modelop = (DefaultTableModel) jTable1.getModel();
        modelop.removeRow(jTable1.getSelectedRow());
        
        camponome.setText("");
        campotelefone.setText("");
        campoemail.setText("");
        
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
        
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

         if(jTable1.getSelectedRow() != -1){
             
             camponome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
             campotelefone.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
             campoemail.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
             campocpf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
             camporesidencia.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
         }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
       
        if(jTable1.getSelectedRow() != -1){
             
             camponome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
             campotelefone.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
             campotelefone.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
         }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para Atualizar!");
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(camponome.getText().equals("") || campocpf.getText().equals("   .   .   -  ") || campoemail.getText().equals("") || camporesidencia.getText().equals("") || campotelefone.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Insira os dados do cliente para atualizar.");
        }else{
            if(jTable1.getSelectedRow() != -1){
             
             jTable1.setValueAt(camponome.getText(), jTable1.getSelectedRow(), 0);
             jTable1.setValueAt(campotelefone.getText(), jTable1.getSelectedRow(), 1);
             jTable1.setValueAt(campoemail.getText(), jTable1.getSelectedRow(), 2);
             jTable1.setValueAt(campocpf.getText(), jTable1.getSelectedRow(), 3);
             jTable1.setValueAt(camporesidencia.getText(), jTable1.getSelectedRow(), 4);
         }
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

            int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
            if(q == JOptionPane.YES_OPTION){   
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setNumRows(0);
            
            }
            
            else if(q == JOptionPane.NO_OPTION){
                
            }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jTable1MouseReleased

    private void jPanel1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jPanel1VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1VetoableChange

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()){
            jPopupMenu2.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void campotelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotelefoneActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() != -1){
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.removeRow(jTable1.getSelectedRow());     
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
      String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Ideal Fashion\\Ideal-Fashion\\Ideal-Fashion\\ProjetoLojadeRoupas\\src\\Dados Tabelas\\dadosestoque";
      File file = new File(FilePath) ;
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i < jTable1.getRowCount(); i ++){ // rows
                for(int j = 0; j <  jTable1.getColumnCount(); j ++){ // colunas
                    bw.write(jTable1.getValueAt (i, j).toString() + " ");
                    
                }
           bw.newLine();
          
            }            
            
            bw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(TabelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     
        
         String FilePath = "C:\\Users\\Josiel\\Desktop\\Daniel\\Programação\\Faetec\\Ideal Fashion\\Ideal-Fashion\\Ideal-Fashion\\ProjetoLojadeRoupas\\src\\Dados Tabelas\\dadosestoque";
             File file = new File(FilePath) ;  
        
        try {
            FileReader fr = new FileReader (file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel modelo = ( DefaultTableModel)jTable1.getModel();
            Object [ ] lines = br.lines().toArray();
            
            for (int i = 0 ; i < lines.length; i ++){
                String [ ] row = lines[i].toString().split(" ");
                modelo.addRow(row);
                
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TabelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void campocpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocpfActionPerformed

    private void camponomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JFormattedTextField campocpf;
    private javax.swing.JTextField campoemail;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField camporesidencia;
    private javax.swing.JFormattedTextField campotelefone;
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
