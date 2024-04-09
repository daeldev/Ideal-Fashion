
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tela_de_Vendas extends javax.swing.JInternalFrame {
   
    public Tela_de_Vendas() {
        initComponents();  
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        CorrigeOTracoNoInicio = new javax.swing.JTextField();
        Atendente = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JTUsuario = new javax.swing.JTextField();
        JTSenha = new javax.swing.JPasswordField();
        JCMostrarSenha = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Limpar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        camponome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoquantidade = new javax.swing.JTextField();
        campocodigo = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        campopreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        carrinho = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        campototal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(246, 242, 242));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CorrigeOTracoNoInicio.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        CorrigeOTracoNoInicio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(CorrigeOTracoNoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1284, 0, 0, 0));

        Atendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/3.1.png"))); // NOI18N
        jPanel4.add(Atendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 255));
        jLabel14.setText("Bem-vindo!");

        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/1.png"))); // NOI18N

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 255));
        jLabel15.setText("Efetue o seu login.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(pc)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pc))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 100));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Senha");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        JTUsuario.setBackground(new java.awt.Color(246, 242, 242));
        JTUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JTUsuario.setForeground(new java.awt.Color(204, 204, 204));
        JTUsuario.setText("Insira o seu nome de usuário");
        JTUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        JTUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTUsuarioMousePressed(evt);
            }
        });
        JTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTUsuarioActionPerformed(evt);
            }
        });
        jPanel4.add(JTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 334, 30));

        JTSenha.setBackground(new java.awt.Color(246, 242, 242));
        JTSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JTSenha.setForeground(new java.awt.Color(204, 204, 204));
        JTSenha.setText("@abcdefghijk");
        JTSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        JTSenha.setEchoChar('\u25cf');
        JTSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTSenhaMousePressed(evt);
            }
        });
        JTSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTSenhaActionPerformed(evt);
            }
        });
        jPanel4.add(JTSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 331, 30));

        JCMostrarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JCMostrarSenha.setText("Mostrar senha");
        JCMostrarSenha.setBorder(null);
        JCMostrarSenha.setFocusable(false);
        JCMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCMostrarSenhaActionPerformed(evt);
            }
        });
        jPanel4.add(JCMostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 330, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Usuário");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/2.2.png"))); // NOI18N

        Limpar.setText("jMenuItem1");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Limpar);

        setBorder(null);
        setClosable(true);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));

        jLabel5.setText("Nome");

        camponome.setBackground(new java.awt.Color(51, 51, 51));
        camponome.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Quantidade");

        jLabel7.setText("Preço");

        jLabel8.setText("Código");

        campoquantidade.setBackground(new java.awt.Color(51, 51, 51));
        campoquantidade.setForeground(new java.awt.Color(255, 255, 255));

        campocodigo.setBackground(new java.awt.Color(51, 51, 51));
        campocodigo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campocodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campocodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocodigoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        campopreco.setBackground(new java.awt.Color(51, 51, 51));
        campopreco.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(camponome)
                    .addComponent(campoquantidade)
                    .addComponent(campocodigo)
                    .addComponent(campopreco, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campopreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(campocodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 220));

        carrinho.setBackground(new java.awt.Color(246, 242, 242));
        carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Preço", "Código", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(carrinho);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 499, 480));

        jPanel3.setBackground(new java.awt.Color(246, 242, 242));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("TOTAL");

        campototal.setBackground(new java.awt.Color(51, 51, 51));
        campototal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campototal.setForeground(new java.awt.Color(255, 255, 255));
        campototal.setEnabled(false);
        campototal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campototalActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PAGAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CANCELAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(campototal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campototal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 211));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Dados do Produto");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Total da Venda");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
        if(q == JOptionPane.YES_OPTION){
            DefaultTableModel modelo = (DefaultTableModel) carrinho.getModel();
            modelo.setNumRows(0);
            campocodigo.setText("");
            camponome.setText("");
            campopreco.setText("");
            campoquantidade.setText("");
            campototal.setText("");
        }

        else if(q == JOptionPane.NO_OPTION){

        }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(campototal.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Total inválido.")
            ;
        }else{
            TipoPagamento formaPagamento = new TipoPagamento();
            formaPagamento.setPagamento(campototal.getText());
            Forma_de_Pagamento fp = new Forma_de_Pagamento();
            fp.Pegarpagamento(formaPagamento);
            fp.setVisible(true);
            TelaAtendenteNova.jDesktopPane1.add(fp);
            fp.toFront();
            this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void campototalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campototalActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_campototalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     DefaultTableModel modelo = (DefaultTableModel) carrinho.getModel();

     // Verifica se alguma linha está selecionada no carrinho
    if (carrinho.getSelectedRow() != -1) {
    // Obtém o subtotal do produto selecionado
    double subtotalRemovido = Double.parseDouble(modelo.getValueAt(carrinho.getSelectedRow(), 4).toString());

    // Remove a linha do produto selecionado do modelo da tabela
    modelo.removeRow(carrinho.getSelectedRow());

    // Recalcula o total acumulado após a remoção do produto
    double novoTotal = 0;
    for (int i = 0; i < modelo.getRowCount(); i++) {
        novoTotal += Double.parseDouble(modelo.getValueAt(i, 4).toString());
    }

    // Atualiza o campo campototal com o novo total acumulado
    campototal.setText(Double.toString(novoTotal));
} else {
    JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
                
        DefaultTableModel modelo = (DefaultTableModel) carrinho.getModel();
        double preco, quantidade, subtotal, acumulador = 0;
        try{
            preco = Double.parseDouble(campopreco.getText().replaceAll(",", "."));
            quantidade = Double.parseDouble(campoquantidade.getText());
            subtotal = preco*quantidade;
            acumulador = 0;
            Object[] dados = {camponome.getText(), campoquantidade.getText(), campopreco.getText(), campocodigo.getText(), subtotal};
            for (int i = 0; i < carrinho.getRowCount(); i++){
               acumulador += Double.valueOf(carrinho.getValueAt(i, 4).toString());
            }
            campototal.setText(Double.toString(acumulador+subtotal));
            modelo.addRow(dados);
            }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Dados do produto inválido");
            campocodigo.setText("");
            campopreco.setText("");
            campoquantidade.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTUsuarioMousePressed

    private void JTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTUsuarioActionPerformed

    private void JTSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTSenhaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTSenhaMousePressed

    private void JTSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTSenhaActionPerformed

    private void JCMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCMostrarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCMostrarSenhaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        if(carrinho.getSelectedRow() != -1){

            DefaultTableModel modelo = (DefaultTableModel) carrinho.getModel();
            modelo.removeRow(carrinho.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed

    private void campocodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JTextField CorrigeOTracoNoInicio;
    private javax.swing.JLabel Fundo;
    private javax.swing.JCheckBox JCMostrarSenha;
    private javax.swing.JPasswordField JTSenha;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JFormattedTextField campocodigo;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField campopreco;
    private javax.swing.JTextField campoquantidade;
    private javax.swing.JTextField campototal;
    private javax.swing.JTable carrinho;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pc;
    // End of variables declaration//GEN-END:variables
}
