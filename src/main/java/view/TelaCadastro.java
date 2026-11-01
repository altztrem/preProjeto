/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.UsuarioDao;
import entities.DataUsuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.Color;


/**
 *
 * @author gablinux
 */
public class TelaCadastro extends javax.swing.JFrame {
    private ImageIcon olhoAberto;
    private ImageIcon olhoFechado;
    private boolean olhoVisivel;
    boolean verif;
   DataUsuario inf = new DataUsuario();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadastro.class.getName());

    public TelaCadastro() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public class PainelGradiente extends JPanel {
    
     @Override
    protected void paintComponent(Graphics g) {
        // 1. Chama o método original para limpar a tela antes de desenhar
        super.paintComponent(g);
        
        // 2. Transforma o pincel em 2D
        Graphics2D g2d = (Graphics2D) g;
        
        // 3. Define as cores
        Color azulClaro = new Color(0,120,231);
        Color azulEscuro = new Color(0,51,102);
        
        
        // 4. Cria a mistura usando a altura dinâmica do painel (getHeight())
        GradientPaint degrade = new GradientPaint(0, 0, azulClaro, 0, getHeight(), azulEscuro);
        
        // 5. Aplica a mistura no pincel e pinta o retângulo inteiro
        g2d.setPaint(degrade);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 =  new PainelGradiente()
        ;
        jLabel33 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanelFundoCinza3 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabelEmail2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabelSenha2 = new javax.swing.JLabel();
        buttonCadastrar = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        AvisoNome = new javax.swing.JLabel();
        AvisoSenha = new javax.swing.JLabel();
        jtxtSenha = new javax.swing.JPasswordField();
        caixaTermo = new javax.swing.JCheckBox();
        jButtonOlho = new javax.swing.JButton();
        jLabelEmail3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabelEmail4 = new javax.swing.JLabel();
        buttonLimpar = new javax.swing.JButton();
        jLabelEmail5 = new javax.swing.JLabel();
        jLabelSenha3 = new javax.swing.JLabel();
        AvisoSenhaConf = new javax.swing.JLabel();
        txtSenhaConf = new javax.swing.JPasswordField();
        jButtonOlho3 = new javax.swing.JButton();
        AvisoEmail = new javax.swing.JLabel();
        AvisoTelefone = new javax.swing.JLabel();
        jComboSetor = new javax.swing.JComboBox<>();
        txtTelefone = new javax.swing.JFormattedTextField();
        AvisoSetor = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel29.setText("Telefone");

        jTextField5.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(846, 630));
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 749, 1248, 0);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(280, 280));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("HelpDesk");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistema de Chamados");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Crie sua Conta");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Acesse uma plataforma simples para");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("gerenciar e acompanhar seus chamados");

        jLabel37.setBackground(new java.awt.Color(0, 120, 231));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/helpdesk_icone_64.png"))); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesBrancos/chamado_32px_branco.png"))); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Suporte organizado em um só lugar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel36)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addGap(12, 12, 12))))
                .addGap(38, 38, 38))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel34))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel3))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel37))
                .addGap(159, 159, 159)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel45)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jPanelFundoCinza3.setBackground(new java.awt.Color(243, 247, 251));
        jPanelFundoCinza3.setPreferredSize(new java.awt.Dimension(674, 680));
        jPanelFundoCinza3.setRequestFocusEnabled(false);

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(23, 43, 67));
        jLabel39.setText("Cadastro");

        jLabelEmail2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail2.setForeground(new java.awt.Color(23, 43, 67));
        jLabelEmail2.setText("Nome Completo");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNomeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNomeMouseReleased(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabelSenha2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSenha2.setForeground(new java.awt.Color(23, 43, 67));
        jLabelSenha2.setText("Senha");

        buttonCadastrar.setBackground(new java.awt.Color(0, 120, 231));
        buttonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrar.setText("ENTRAR");
        buttonCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        jLabel41.setBackground(new java.awt.Color(153, 153, 153));
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));

        AvisoNome.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        AvisoNome.setForeground(new java.awt.Color(255, 0, 51));
        AvisoNome.setText("*");

        AvisoSenha.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        AvisoSenha.setForeground(new java.awt.Color(255, 0, 51));
        AvisoSenha.setText("*");

        jtxtSenha.setBackground(new java.awt.Color(255, 255, 255));
        jtxtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtSenha.setForeground(new java.awt.Color(0, 0, 0));
        jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jtxtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jjtxtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtSenhaFocusLost(evt);
            }
        });
        jtxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjtxtSenhaActionPerformed(evt);
            }
        });

        caixaTermo.setBackground(new java.awt.Color(255, 255, 255));
        caixaTermo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caixaTermo.setForeground(new java.awt.Color(23, 43, 67));
        caixaTermo.setText("Eu aceito os Termos de Uso e a Política de Privacidade");
        caixaTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTermoActionPerformed(evt);
            }
        });

        jButtonOlho.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOlho.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonOlho.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesAzul/olho_20px.png"))); // NOI18N
        jButtonOlho.setBorder(null);
        jButtonOlho.setBorderPainted(false);
        jButtonOlho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOlho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOlhoMouseClicked(evt);
            }
        });
        jButtonOlho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOlhoActionPerformed(evt);
            }
        });

        jLabelEmail3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail3.setForeground(new java.awt.Color(23, 43, 67));
        jLabelEmail3.setText("Setor");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmailMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtEmailMouseReleased(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabelEmail4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail4.setForeground(new java.awt.Color(23, 43, 67));
        jLabelEmail4.setText("E-mail");

        buttonLimpar.setBackground(new java.awt.Color(0, 120, 231));
        buttonLimpar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        buttonLimpar.setText("LIMPAR");
        buttonLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLimpar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        jLabelEmail5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail5.setForeground(new java.awt.Color(23, 43, 67));
        jLabelEmail5.setText("Telefone");

        jLabelSenha3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSenha3.setForeground(new java.awt.Color(23, 43, 67));
        jLabelSenha3.setText("Confirmação de senha");

        AvisoSenhaConf.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        AvisoSenhaConf.setForeground(new java.awt.Color(255, 0, 51));
        AvisoSenhaConf.setText("*");

        txtSenhaConf.setBackground(new java.awt.Color(255, 255, 255));
        txtSenhaConf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenhaConf.setForeground(new java.awt.Color(0, 0, 0));
        txtSenhaConf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSenhaConf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaConfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaConfFocusLost(evt);
            }
        });
        txtSenhaConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaConfActionPerformed(evt);
            }
        });

        jButtonOlho3.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOlho3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonOlho3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOlho3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesAzul/olho_20px.png"))); // NOI18N
        jButtonOlho3.setBorder(null);
        jButtonOlho3.setBorderPainted(false);
        jButtonOlho3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOlho3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOlho3MouseClicked(evt);
            }
        });
        jButtonOlho3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOlho3ActionPerformed(evt);
            }
        });

        AvisoEmail.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        AvisoEmail.setForeground(new java.awt.Color(255, 0, 51));
        AvisoEmail.setText("*");

        AvisoTelefone.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        AvisoTelefone.setForeground(new java.awt.Color(255, 0, 51));
        AvisoTelefone.setText("*");

        jComboSetor.setBackground(new java.awt.Color(255, 255, 255));
        jComboSetor.setForeground(new java.awt.Color(0, 0, 0));
        jComboSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       ", "Administração", "Informática", "Recursos Humanos", "Comercial/Vendas", "Marketing", "Logística", "Operacional", "Outros..." }));
        jComboSetor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jComboSetor.setPreferredSize(new java.awt.Dimension(142, 26));
        jComboSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSetorActionPerformed(evt);
            }
        });

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        AvisoSetor.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        AvisoSetor.setForeground(new java.awt.Color(255, 0, 51));
        AvisoSetor.setText("*");

        javax.swing.GroupLayout jPanelFundoCinza3Layout = new javax.swing.GroupLayout(jPanelFundoCinza3);
        jPanelFundoCinza3.setLayout(jPanelFundoCinza3Layout);
        jPanelFundoCinza3Layout.setHorizontalGroup(
            jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)))
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addComponent(jLabelEmail2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addComponent(jLabelSenha2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AvisoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOlho))
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addComponent(jLabelEmail3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AvisoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addComponent(jLabelEmail5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AvisoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addComponent(jLabelSenha3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AvisoSenhaConf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addComponent(txtSenhaConf, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOlho3))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                                .addComponent(jLabelEmail4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AvisoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboSetor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))))
                    .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(caixaTermo)))
                .addContainerGap(596, Short.MAX_VALUE))
        );
        jPanelFundoCinza3Layout.setVerticalGroup(
            jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoCinza3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail2)
                    .addComponent(AvisoNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail3)
                    .addComponent(AvisoSetor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail4)
                    .addComponent(AvisoEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail5)
                    .addComponent(AvisoTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha2)
                    .addComponent(AvisoSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOlho, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(7, 7, 7)
                .addComponent(jLabel40)
                .addGap(5, 5, 5)
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha3)
                    .addComponent(AvisoSenhaConf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSenhaConf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOlho3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caixaTermo)
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoCinza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCadastrar)
                    .addComponent(buttonLimpar))
                .addGap(347, 347, 347)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFundoCinza3, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFundoCinza3, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, -10, 1630, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailMouseReleased

    private void txtEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailMouseExited

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
    txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));

    }//GEN-LAST:event_txtEmailFocusGained

    private void jButtonOlhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOlhoActionPerformed
        olhoVisivel = !olhoVisivel;
        if(olhoVisivel){
            jButtonOlho.setIcon(olhoFechado);
        }else{
            jButtonOlho.setIcon(olhoAberto);

        }
    }//GEN-LAST:event_jButtonOlhoActionPerformed

    private void jButtonOlhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOlhoMouseClicked

    }//GEN-LAST:event_jButtonOlhoMouseClicked

    private void caixaTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTermoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTermoActionPerformed

    private void jjtxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjtxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jjtxtSenhaActionPerformed

    private void jjtxtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jjtxtSenhaFocusGained
        jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
    }//GEN-LAST:event_jjtxtSenhaFocusGained

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        VerificarCadastro();
        caixaTermo();
        if(verif==true && caixaTermo.isSelected()){
            setVisible(false);
            TelaPrincipal TelaPrincipal = new TelaPrincipal();
            TelaPrincipal.setVisible(true);
        
        
        }
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseReleased

    }//GEN-LAST:event_txtNomeMouseReleased

    private void txtNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseExited

    }//GEN-LAST:event_txtNomeMouseExited

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked

    }//GEN-LAST:event_txtNomeMouseClicked

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
    }//GEN-LAST:event_txtNomeFocusGained

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
       txtNome.setText("");
       AvisoNome.setText("");
       jComboSetor.setSelectedIndex(0);
       AvisoSetor.setText("");
       txtEmail.setText("");
       AvisoEmail.setText("");
       txtTelefone.setText("");
       AvisoTelefone.setText("");
       jtxtSenha.setText("");
       AvisoSenha.setText("");
       txtSenhaConf.setText("");
       AvisoSenhaConf.setText("");
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void txtSenhaConfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaConfFocusGained
        txtSenhaConf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
    }//GEN-LAST:event_txtSenhaConfFocusGained

    private void txtSenhaConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaConfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaConfActionPerformed

    private void jButtonOlho3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOlho3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOlho3MouseClicked

    private void jButtonOlho3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOlho3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOlho3ActionPerformed

    private void jComboSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSetorActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void jtxtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtSenhaFocusLost
        jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jtxtSenhaFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
  txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));

    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
         txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtSenhaConfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaConfFocusLost
          txtSenhaConf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_txtSenhaConfFocusLost

    public void VerificarCadastro(){
        verif=true;
        AvisoNome.setText("");
        AvisoEmail.setText("");
        AvisoSenha.setText("");
        AvisoTelefone.setText("");
        
        if(txtEmail.getText().indexOf('@')==-1){
            AvisoEmail.setText("* E-mail Invalido, Digite Novamente !");
            txtEmail.setText("");
            txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
            verif = false;

        }else if(txtEmail.getText().length()<7 ){
            AvisoEmail.setText("* Email incompleto ! ");
            txtEmail.setText("");
            txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
            verif = false;
        }

        if(jtxtSenha.getPassword().length<8){
            AvisoSenha.setText("* Mínimo 8 Digitos !");
            jtxtSenha.setText("");
            jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
            verif = false;

        }
        if (txtNome.getText().length() <=0) {
            AvisoNome.setText("* Nome incompleto !");
            txtNome.setText("");
            txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
            verif = false;
        }

        if (txtTelefone.getText().replaceAll("[^0-9]", "").length() < 11 ) {
            AvisoTelefone.setText("* Telefone incompleto !");
            txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
            verif = false;
        }
        if(jComboSetor.getSelectedIndex()==0){
        AvisoSetor.setText("Setor invalido !");
        jComboSetor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
        verif =  false;
        }
        
        
        
          if(!verif){
        return;
        }
      
        
        
    }
    
    
    
    
    
    
    private void caixaTermo(){
    if(caixaTermo.isSelected() && verif == true){
           
           
         

            //Remove As bordas Vermelhas.

            txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            
            char[] senha = jtxtSenha.getPassword();
            String senhaTexto = new String(senha);
            
            inf.setSenha(senhaTexto);
            inf.setNome(txtNome.getText());
            inf.setEmail(txtEmail.getText());
            inf.setPerfil("Usuario");
            inf.setTelefone(txtTelefone.getText().replaceAll("[^0-9]", "")); 
            inf.setSetor((String) jComboSetor.getSelectedItem());
                
            UsuarioDao dao = new UsuarioDao();
            dao.create(inf);
            
        }else if(!caixaTermo.isSelected()){
        
            JOptionPane.showMessageDialog(null, "Ative os termos e serviços ! ");
            return;
            
        }
    
    }
    
    
  
    public static void main(String args[]) {
        
        
       
        
        
        java.awt.EventQueue.invokeLater(() -> new TelaCadastro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoEmail;
    private javax.swing.JLabel AvisoNome;
    private javax.swing.JLabel AvisoSenha;
    private javax.swing.JLabel AvisoSenhaConf;
    private javax.swing.JLabel AvisoSetor;
    private javax.swing.JLabel AvisoTelefone;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JCheckBox caixaTermo;
    private javax.swing.JButton jButtonOlho;
    private javax.swing.JButton jButtonOlho3;
    private javax.swing.JComboBox<String> jComboSetor;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabelEmail2;
    private javax.swing.JLabel jLabelEmail3;
    private javax.swing.JLabel jLabelEmail4;
    private javax.swing.JLabel jLabelEmail5;
    private javax.swing.JLabel jLabelSenha2;
    private javax.swing.JLabel jLabelSenha3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelFundoCinza3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPasswordField jtxtSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenhaConf;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
