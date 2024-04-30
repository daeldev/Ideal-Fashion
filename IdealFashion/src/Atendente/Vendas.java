package Atendente;


import Atendente.Pagamento;
import Administrador.Estoque;
import Utilitários.TipoPagamento;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Vendas extends javax.swing.JInternalFrame {
   
    public Vendas() {
        initComponents();  
        String FilePath = "Coloque aqui o caminho do arquivo Estoque da pasta DadosTabelas.";
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JTNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTQuantidade = new javax.swing.JTextField();
        JTCodigo = new javax.swing.JFormattedTextField();
        JBAdicionar = new javax.swing.JButton();
        JBLimpar = new javax.swing.JButton();
        JTPreco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JTTamanho = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTVendas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JTTotal = new javax.swing.JTextField();
        JBPagar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTEstoque = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JTQuantidadeProduto = new javax.swing.JTextField();
        JBAtualizar = new javax.swing.JButton();
        JBExportar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

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

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));

        jLabel5.setText("Nome");

        JTNome.setBackground(new java.awt.Color(51, 51, 51));
        JTNome.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Quantidade");

        jLabel7.setText("Preço");

        jLabel8.setText("Código");

        JTQuantidade.setBackground(new java.awt.Color(51, 51, 51));
        JTQuantidade.setForeground(new java.awt.Color(255, 255, 255));

        JTCodigo.setBackground(new java.awt.Color(51, 51, 51));
        JTCodigo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            JTCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCodigoActionPerformed(evt);
            }
        });

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JBLimpar.setBackground(new java.awt.Color(255, 0, 0));
        JBLimpar.setForeground(new java.awt.Color(255, 255, 255));
        JBLimpar.setText("Limpar");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JTPreco.setBackground(new java.awt.Color(51, 51, 51));
        JTPreco.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Tamanho");

        JTTamanho.setBackground(new java.awt.Color(51, 51, 51));
        JTTamanho.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(JTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(JTTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 230));

        JTVendas.setBackground(new java.awt.Color(246, 242, 242));
        JTVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tamanho", "Quantidade", "Preço", "Código", "Subtotal"
            }
        ));
        JTVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTVendas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 499, 480));

        jPanel3.setBackground(new java.awt.Color(246, 242, 242));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("TOTAL");

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
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JBPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 211));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Dados do Produto");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Total da Venda");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jTabbedPane1.addTab("Carrinho", jPanel1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane3.setViewportView(JTEstoque);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 10, 564, 565));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        JTQuantidadeProduto.setBackground(new java.awt.Color(51, 51, 51));
        JTQuantidadeProduto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(JTQuantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 255, -1));

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("ATUALIZAR");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });
        jPanel8.add(JBAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 100, 40));

        JBExportar.setBackground(new java.awt.Color(51, 102, 255));
        JBExportar.setForeground(new java.awt.Color(255, 255, 255));
        JBExportar.setText("EXPORTAR");
        JBExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExportarActionPerformed(evt);
            }
        });
        jPanel8.add(JBExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 100, 40));

        jPanel6.setBackground(new java.awt.Color(246, 242, 242));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 310, 180));

        jTabbedPane1.addTab("Estoque", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 1035, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed

        int q = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
        if(q == JOptionPane.YES_OPTION){
            DefaultTableModel modelo = (DefaultTableModel) JTVendas.getModel();
            modelo.setNumRows(0);
            JTCodigo.setText("");
            JTNome.setText("");
            JTPreco.setText("");
            JTQuantidade.setText("");
            JTTotal.setText("");
            JTTamanho.setText("");
        }

        else if(q == JOptionPane.NO_OPTION){

        }
    
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPagarActionPerformed
        if(JTTotal.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Total inválido.")
            ;
        }else{
            TipoPagamento TP = new TipoPagamento();
            TP.setPagamento(JTTotal.getText());
            Pagamento FP = new Pagamento();
            FP.PegarPagamento(TP);
            FP.setVisible(true);
            WorkspaceAtendente.WorkspaceAtendente.add(FP);
            FP.toFront();
 
        }
    }//GEN-LAST:event_JBPagarActionPerformed

    private void JTTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTotalActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JTTotalActionPerformed

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed

     DefaultTableModel modelo = (DefaultTableModel) JTVendas.getModel();

     // Verifica se alguma linha está selecionada no carrinho
    if (JTVendas.getSelectedRow() != -1) {
    // Obtém o subtotal do produto selecionado
    double subtotalRemovido = Double.parseDouble(modelo.getValueAt(JTVendas.getSelectedRow(), 5).toString());

    // Remove a linha do produto selecionado do modelo da tabela
    modelo.removeRow(JTVendas.getSelectedRow());

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
        DefaultTableModel modelo = (DefaultTableModel) JTVendas.getModel();
        if(JTNome.getText().isEmpty() || JTTamanho.getText().isEmpty() || JTCodigo.getText().isEmpty()){                
            JOptionPane.showMessageDialog(rootPane, "ERRO: Verifique o nome, tamanho ou o código do produto");   
        }else if("PpMmGg".contains(JTTamanho.getText()) && "AaBbCc".contains(JTNome.getText())){
            try{
                double preco, quantidade, subtotal, acumulador = 0;
                preco = Double.parseDouble(JTPreco.getText().replaceAll(",", "."));
                quantidade = Double.parseDouble(JTQuantidade.getText());
                subtotal = preco*quantidade;
                acumulador = 0;            
                Object[] dados = {JTNome.getText(), JTTamanho.getText(), JTQuantidade.getText(), JTPreco.getText(), JTCodigo.getText(), subtotal};
                for (int i = 0; i < JTVendas.getRowCount(); i++){
                   acumulador += Double.valueOf(JTVendas.getValueAt(i, 5).toString());
                }
                JTTotal.setText(Double.toString(acumulador+subtotal));
                modelo.addRow(dados);
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERRO: Verifique o preço ou a quantidade do produto");      
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "ERRO: Verifique o tamanho ou o nome do produto");
        }              
    }//GEN-LAST:event_JBAdicionarActionPerformed

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
        if(JTVendas.getSelectedRow() != -1){

            DefaultTableModel modelo = (DefaultTableModel) JTVendas.getModel();
            modelo.removeRow(JTVendas.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed

    private void JTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCodigoActionPerformed

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
        if(JTEstoque.getSelectedRow() != -1){
            try{
                int quantidade = Integer.parseInt(JTQuantidadeProduto.getText());
                JTEstoque.setValueAt(quantidade, JTEstoque.getSelectedRow(), 2);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Verifique a quantidade");
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");
        }
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void JBExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExportarActionPerformed

        String FilePath = "Coloque aqui o caminho do arquivo Estoque da pasta DadosTabelas.";
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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_JBExportarActionPerformed

    private void JTEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTEstoqueMouseClicked
        // TODO add your handling code here:
        if(JTEstoque.getSelectedRow() != -1){            
             JTQuantidadeProduto.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 2).toString());
         }
    }//GEN-LAST:event_JTEstoqueMouseClicked

    private void JTVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTVendasMouseClicked
        // TODO add your handling code here:
        if(JTEstoque.getSelectedRow() != -1){
             
             JTNome.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 0).toString());
             JTTamanho.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 1).toString());
             JTQuantidade.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 2).toString());
             JTPreco.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 3).toString());
             JTCodigo.setText(JTEstoque.getValueAt(JTEstoque.getSelectedRow(), 4).toString());
         }
    }//GEN-LAST:event_JTVendasMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JTextField CorrigeOTracoNoInicio;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBExportar;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JButton JBPagar;
    private javax.swing.JCheckBox JCMostrarSenha;
    private javax.swing.JFormattedTextField JTCodigo;
    private static javax.swing.JTable JTEstoque;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTPreco;
    private javax.swing.JTextField JTQuantidade;
    private javax.swing.JTextField JTQuantidadeProduto;
    private javax.swing.JPasswordField JTSenha;
    private javax.swing.JTextField JTTamanho;
    private javax.swing.JTextField JTTotal;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.JTable JTVendas;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel pc;
    // End of variables declaration//GEN-END:variables
}
