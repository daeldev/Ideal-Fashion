package Atendente;


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


public class Clientes extends javax.swing.JInternalFrame { 
    
    
    public Clientes() { 
     
     initComponents();
      DefaultTableModel modelot = (DefaultTableModel) JTClientes.getModel();
        JTClientes.setRowSorter(new TableRowSorter(modelot));
        String FilePath = "/home/Aluno.Tarde/Desktop/Alex/Alex 221/LP2/Exercicios em Casa/Ideal-Fashion2/Java/src/DadosTabelas/Clientes";
        File file = new File(FilePath) ;      
        try {
            FileReader frE = new FileReader (file);
            BufferedReader brE = new BufferedReader(frE);
            
            DefaultTableModel modelo = ( DefaultTableModel)JTClientes.getModel();
            Object [ ] lines = brE.lines().toArray();
            
            for (int i = 0 ; i < lines.length; i ++){
                String [ ] row = lines[i].toString().split(" ");
                modelo.addRow(row);             
            }        
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }       
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        Limpar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JTTelefone = new javax.swing.JFormattedTextField();
        JTNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTCPF = new javax.swing.JFormattedTextField();
        JBAdicionar = new javax.swing.JButton();
        JBAtualizar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        JBRemoverTudo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JCBSexo = new javax.swing.JComboBox<>();
        JTDataNasc = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
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

        JTClientes.setBackground(new java.awt.Color(246, 242, 242));
        JTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone", "Data de Nascimento", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTClientesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTClientesMouseReleased(evt);
            }
        });
        JTClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 550, 430));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTTelefone.setBackground(new java.awt.Color(255, 255, 255));
        JTTelefone.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanel2.add(JTTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 200, -1));

        JTNome.setBackground(new java.awt.Color(255, 255, 255));
        JTNome.setForeground(new java.awt.Color(0, 0, 0));
        JTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNomeActionPerformed(evt);
            }
        });
        jPanel2.add(JTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 200, -1));

        jLabel8.setText("Telefone:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel9.setText("CPF:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel10.setText("Nome:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        JTCPF.setBackground(new java.awt.Color(255, 255, 255));
        JTCPF.setForeground(new java.awt.Color(0, 0, 0));
        try {
            JTCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCPFActionPerformed(evt);
            }
        });
        jPanel2.add(JTCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 200, -1));

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("ADICIONAR");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 120, 41));

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("ATUALIZAR");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 120, 41));

        JBRemover.setBackground(new java.awt.Color(255, 0, 51));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("REMOVER");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });
        jPanel2.add(JBRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 120, 40));

        JBRemoverTudo.setBackground(new java.awt.Color(255, 51, 51));
        JBRemoverTudo.setForeground(new java.awt.Color(255, 255, 255));
        JBRemoverTudo.setText("REMOVER TUDO");
        JBRemoverTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverTudoActionPerformed(evt);
            }
        });
        jPanel2.add(JBRemoverTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 120, 40));

        jLabel2.setText("Sexo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        JCBSexo.setBackground(new java.awt.Color(255, 255, 255));
        JCBSexo.setForeground(new java.awt.Color(0, 0, 0));
        JCBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
        jPanel2.add(JCBSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 200, -1));

        JTDataNasc.setBackground(new java.awt.Color(255, 255, 255));
        JTDataNasc.setForeground(new java.awt.Color(0, 0, 0));
        try {
            JTDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(JTDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 200, -1));

        jLabel1.setText("Data de Nascimento");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 380, 400));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("Clientes Cadastrados");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setText("Dados do Cliente");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 40));

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
    
           //Adiciona os dados ao banco de dados
        
        //Instância a classe DTO
        DTO dto = new DTO();
        
        //Intância a classe FuncionarioDTO de DTO
        DTO.ClienteDTO clienteDTO = dto.new ClienteDTO();
        
        //Seta os dados fornecidos para o FuncionarioDTO
        clienteDTO.setNome(JTNome.getText());       
        clienteDTO.setCPF(JTCPF.getText());
        clienteDTO.setTelefone(JTTelefone.getText());
        clienteDTO.setData_nascimento(JTDataNasc.getText());
        clienteDTO.setSexo(JCBSexo.getSelectedItem().toString());
        
        //Instância a classe ConexaoCi
        ConexaoCi clienteDAO = new ConexaoCi();
        
        //Executa o insert dos dados setados na classe funcionarioDTO ao banco de dados através do funcionarioDAO
        int Resultado = clienteDAO.AdicionarCliente(clienteDTO);

        //Verifica se o cadastro foi efetuado com sucesso.
        if(Resultado != -1){
            //Grava os dados setados na classe funcionarioDTO para a tabela de cadastros através de um vetor
            DefaultTableModel Tabela = (DefaultTableModel) JTClientes.getModel();
            Object[] dados = {clienteDTO.getIdcliente(), clienteDTO.getNome(), clienteDTO.getCPF(), clienteDTO.getTelefone(), clienteDTO.getdata_nascimento(), clienteDTO.getSexo()};
            Tabela.addRow(dados);

            //Salva a tabela
            String FilePath = "/home/Aluno.Tarde/Desktop/Alex/Alex 221/LP2/Exercicios em Casa/Ideal-Fashion2/Java/src/DadosTabelas/Clientes";
            File file = new File(FilePath);
            try {
                FileWriter fwe = new FileWriter(file);
                BufferedWriter bwe = new BufferedWriter(fwe);
                for (int i = 0; i < JTClientes.getRowCount(); i ++){
                    for(int j = 0; j <  JTClientes.getColumnCount(); j ++){
                        bwe.write(JTClientes.getValueAt (i, j).toString() + " ");
                    }
                    bwe.newLine();
                }            
                bwe.close();
                fwe.close();
            }catch (IOException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                                             
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed

if(JTClientes.getSelectedRow() != -1){
        
        DefaultTableModel modelop = (DefaultTableModel) JTClientes.getModel();
        modelop.removeRow(JTClientes.getSelectedRow());    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }    
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTClientesMouseClicked

//         if(JTTabela.getSelectedRow() != -1){
//             
//             JTCodigo.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 0).toString());
//             JTNome.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 1).toString());
//             JTCPF.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 2).toString());           
//             JTTelefone.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 3).toString());
//         }

    }//GEN-LAST:event_JTClientesMouseClicked

    private void JTClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTClientesKeyReleased

    }//GEN-LAST:event_JTClientesKeyReleased

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
               if(JTClientes.getSelectedRow() != -1){                       
                JTClientes.setValueAt(JTNome.getText(), JTClientes.getSelectedRow(), 1);   
                 JTClientes.setValueAt(JTCPF.getText(), JTClientes.getSelectedRow(), 2);
                 JTClientes.setValueAt(JCBSexo.getSelectedItem(), JTClientes.getSelectedRow(), 5);
                 JTClientes.setValueAt(JTTelefone.getText(), JTClientes.getSelectedRow(), 3);
                 JTClientes.setValueAt(JTDataNasc.getText(),JTClientes.getSelectedRow(),4);           
        }else{
             JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");
          }              
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void JBRemoverTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverTudoActionPerformed

        int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
        if(q == JOptionPane.YES_OPTION){
            DefaultTableModel modelo = (DefaultTableModel) JTClientes.getModel();
            modelo.setNumRows(0);

        }

        else if(q == JOptionPane.NO_OPTION){

        }

    }//GEN-LAST:event_JBRemoverTudoActionPerformed

    private void JTClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTClientesMouseReleased
        // TODO add your handling code here:
   
    }//GEN-LAST:event_JTClientesMouseReleased

    private void jPanel1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jPanel1VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1VetoableChange

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
//        // TODO add your handling code here:
//        if (evt.isPopupTrigger()){
//            jPopupMenu2.show(this, evt.getX(), evt.getY());
//        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void JTTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTelefoneActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
//        // TODO add your handling code here:
//        if(JTTabela.getSelectedRow() != -1){
//        
//        DefaultTableModel modelo = (DefaultTableModel) JTTabela.getModel();
//        modelo.removeRow(JTTabela.getSelectedRow());     
//        }else{
//            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
//        }
    }//GEN-LAST:event_LimparActionPerformed

    private void JTCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCPFActionPerformed

    private void JTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JButton JBRemoverTudo;
    private javax.swing.JComboBox<String> JCBSexo;
    private javax.swing.JFormattedTextField JTCPF;
    private static javax.swing.JTable JTClientes;
    private javax.swing.JFormattedTextField JTDataNasc;
    private javax.swing.JTextField JTNome;
    private javax.swing.JFormattedTextField JTTelefone;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
