/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Modelos;

import ConexaoBanco.Conexao;
import Outros.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class FrmCadastro_Modelo extends javax.swing.JFrame {
    Conexao connector = new Conexao();
    Utilitarios toolbox = new Utilitarios();
    
    /**
     * Creates new form FrmCadastro_Modelo
     */
    public FrmCadastro_Modelo() {
        initComponents();
        AlteraModoOperacaoForm(ModoOperacaoForm.PADRAO);
        try {
            lblUsuario.setText(GerenciadorViveiros.usuarioAtual.getCodigo());
            connector.Conectar();
            lblNoDataFound.setVisible(false); //Apenas exibir em casos de tabelas sem dados
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na carga desta tela: " + e,
                    "Erro!", JOptionPane.ERROR_MESSAGE);
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

        popTabelaPrincipal = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        lblTituloForm = new javax.swing.JLabel();
        tblPrincipal = new javax.swing.JToolBar();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnAlterar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tplPrincipal = new javax.swing.JTabbedPane();
        pnlMestre = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMestre = new javax.swing.JTable();
        lblRegistroAtual = new javax.swing.JLabel();
        lblDe = new javax.swing.JLabel();
        lblRegistroTotal = new javax.swing.JLabel();
        lblNoDataFound = new javax.swing.JLabel();
        pnlDetalhe = new javax.swing.JPanel();
        pnlCampoTxt1 = new javax.swing.JPanel();
        lblCampoTxt1 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        pnlCampoMtxt1 = new javax.swing.JPanel();
        lblCampoFtxt1 = new javax.swing.JLabel();
        ftxtCampo1 = new javax.swing.JFormattedTextField();
        pnlCampoCbx1 = new javax.swing.JPanel();
        lblCampoCbx1 = new javax.swing.JLabel();
        cbxCampo1 = new javax.swing.JComboBox();
        pnlCampoChk1 = new javax.swing.JPanel();
        chkCampo1 = new javax.swing.JCheckBox();
        pnlCampoTxp1 = new javax.swing.JPanel();
        lblCampoTxp1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txpCampo1 = new javax.swing.JTextPane();
        pnlDicas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblAjuda = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");
        popTabelaPrincipal.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        popTabelaPrincipal.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        popTabelaPrincipal.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        popTabelaPrincipal.add(jMenuItem4);

        setLocation(new java.awt.Point(0, 55));
        setMinimumSize(new java.awt.Dimension(850, 550));

        lblTituloForm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTituloForm.setText("Título do Formulário");

        tblPrincipal.setFloatable(false);
        tblPrincipal.setRollover(true);
        tblPrincipal.setToolTipText("");

        btnPrimeiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrimeiro.setFocusable(false);
        btnPrimeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrimeiro.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPrimeiro.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPrimeiro.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPrimeiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tblPrincipal.add(btnPrimeiro);

        btnAnterior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAnterior.setFocusable(false);
        btnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnterior.setMaximumSize(new java.awt.Dimension(50, 50));
        btnAnterior.setMinimumSize(new java.awt.Dimension(50, 50));
        btnAnterior.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tblPrincipal.add(btnAnterior);

        btnProximo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProximo.setFocusable(false);
        btnProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProximo.setMaximumSize(new java.awt.Dimension(50, 50));
        btnProximo.setMinimumSize(new java.awt.Dimension(50, 50));
        btnProximo.setPreferredSize(new java.awt.Dimension(50, 50));
        btnProximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tblPrincipal.add(btnProximo);

        btnUltimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUltimo.setText("Ultimo");
        btnUltimo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnUltimo.setFocusable(false);
        btnUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUltimo.setMaximumSize(new java.awt.Dimension(50, 50));
        btnUltimo.setMinimumSize(new java.awt.Dimension(50, 50));
        btnUltimo.setPreferredSize(new java.awt.Dimension(50, 50));
        btnUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tblPrincipal.add(btnUltimo);
        tblPrincipal.add(jSeparator1);

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAlterar.setFocusable(false);
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnAlterar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnAlterar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        tblPrincipal.add(btnAlterar);

        btnIncluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnIncluir.setFocusable(false);
        btnIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIncluir.setMaximumSize(new java.awt.Dimension(50, 50));
        btnIncluir.setMinimumSize(new java.awt.Dimension(50, 50));
        btnIncluir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        tblPrincipal.add(btnIncluir);

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPesquisar.setFocusable(false);
        btnPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPesquisar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        tblPrincipal.add(btnPesquisar);

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnExcluir.setFocusable(false);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setMaximumSize(new java.awt.Dimension(50, 50));
        btnExcluir.setMinimumSize(new java.awt.Dimension(50, 50));
        btnExcluir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        tblPrincipal.add(btnExcluir);
        tblPrincipal.add(jSeparator2);

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConfirmar.setFocusable(false);
        btnConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirmar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnConfirmar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnConfirmar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnConfirmar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tblPrincipal.add(btnConfirmar);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCancelar.setFocusable(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCancelar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCancelar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        tblPrincipal.add(btnCancelar);

        tplPrincipal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblMestre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblMestre.setComponentPopupMenu(popTabelaPrincipal);
        jScrollPane1.setViewportView(tblMestre);

        lblRegistroAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRegistroAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistroAtual.setText("00000");

        lblDe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDe.setText("de");

        lblRegistroTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRegistroTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistroTotal.setText("00000");

        lblNoDataFound.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNoDataFound.setForeground(new java.awt.Color(255, 0, 0));
        lblNoDataFound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoDataFound.setText("Sem Registros Encontrados!");

        javax.swing.GroupLayout pnlMestreLayout = new javax.swing.GroupLayout(pnlMestre);
        pnlMestre.setLayout(pnlMestreLayout);
        pnlMestreLayout.setHorizontalGroup(
            pnlMestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
            .addGroup(pnlMestreLayout.createSequentialGroup()
                .addComponent(lblRegistroAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblDe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegistroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNoDataFound, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlMestreLayout.setVerticalGroup(
            pnlMestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMestreLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlMestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistroAtual)
                    .addComponent(lblDe)
                    .addComponent(lblRegistroTotal)
                    .addComponent(lblNoDataFound))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        tplPrincipal.addTab("          Pesquisas          ", pnlMestre);

        lblCampoTxt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCampoTxt1.setText("Campo Texto");

        txtCampo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlCampoTxt1Layout = new javax.swing.GroupLayout(pnlCampoTxt1);
        pnlCampoTxt1.setLayout(pnlCampoTxt1Layout);
        pnlCampoTxt1Layout.setHorizontalGroup(
            pnlCampoTxt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoTxt1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCampoTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCampoTxt1Layout.setVerticalGroup(
            pnlCampoTxt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoTxt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCampoTxt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampoTxt1)
                    .addComponent(txtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCampoFtxt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCampoFtxt1.setText("Campo Msk");

        ftxtCampo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlCampoMtxt1Layout = new javax.swing.GroupLayout(pnlCampoMtxt1);
        pnlCampoMtxt1.setLayout(pnlCampoMtxt1Layout);
        pnlCampoMtxt1Layout.setHorizontalGroup(
            pnlCampoMtxt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoMtxt1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCampoFtxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCampoMtxt1Layout.setVerticalGroup(
            pnlCampoMtxt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoMtxt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCampoMtxt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampoFtxt1)
                    .addComponent(ftxtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCampoCbx1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCampoCbx1.setText("Campo Cbx");

        javax.swing.GroupLayout pnlCampoCbx1Layout = new javax.swing.GroupLayout(pnlCampoCbx1);
        pnlCampoCbx1.setLayout(pnlCampoCbx1Layout);
        pnlCampoCbx1Layout.setHorizontalGroup(
            pnlCampoCbx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoCbx1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCampoCbx1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCampoCbx1Layout.setVerticalGroup(
            pnlCampoCbx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoCbx1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCampoCbx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampoCbx1)
                    .addComponent(cbxCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        chkCampo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkCampo1.setText("Campo Check");

        javax.swing.GroupLayout pnlCampoChk1Layout = new javax.swing.GroupLayout(pnlCampoChk1);
        pnlCampoChk1.setLayout(pnlCampoChk1Layout);
        pnlCampoChk1Layout.setHorizontalGroup(
            pnlCampoChk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoChk1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(chkCampo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCampoChk1Layout.setVerticalGroup(
            pnlCampoChk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoChk1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkCampo1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblCampoTxp1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCampoTxp1.setText("Campo TxtArea");

        jScrollPane2.setViewportView(txpCampo1);

        javax.swing.GroupLayout pnlCampoTxp1Layout = new javax.swing.GroupLayout(pnlCampoTxp1);
        pnlCampoTxp1.setLayout(pnlCampoTxp1Layout);
        pnlCampoTxp1Layout.setHorizontalGroup(
            pnlCampoTxp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoTxp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCampoTxp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCampoTxp1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(pnlCampoTxp1Layout.createSequentialGroup()
                        .addComponent(lblCampoTxp1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addGap(173, 173, 173))))
        );
        pnlCampoTxp1Layout.setVerticalGroup(
            pnlCampoTxp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoTxp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCampoTxp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDetalheLayout = new javax.swing.GroupLayout(pnlDetalhe);
        pnlDetalhe.setLayout(pnlDetalheLayout);
        pnlDetalheLayout.setHorizontalGroup(
            pnlDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCampoTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCampoMtxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCampoCbx1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCampoChk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCampoTxp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        pnlDetalheLayout.setVerticalGroup(
            pnlDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlCampoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCampoChk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetalheLayout.createSequentialGroup()
                        .addComponent(pnlCampoMtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCampoCbx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlCampoTxp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        tplPrincipal.addTab("          Detalhes          ", pnlDetalhe);

        pnlDicas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(" Usuário:");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblAjuda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlDicasLayout = new javax.swing.GroupLayout(pnlDicas);
        pnlDicas.setLayout(pnlDicasLayout);
        pnlDicasLayout.setHorizontalGroup(
            pnlDicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDicasLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDicasLayout.setVerticalGroup(
            pnlDicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDicasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tplPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTituloForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(pnlDicas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tblPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloForm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplPrincipal)
                .addGap(6, 6, 6)
                .addComponent(pnlDicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlteraModoOperacaoForm(ModoOperacaoForm.ALTERACAO);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        AlteraModoOperacaoForm(ModoOperacaoForm.INCLUSAO);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        AlteraModoOperacaoForm(ModoOperacaoForm.PESQUISA);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        AlteraModoOperacaoForm(ModoOperacaoForm.EXCLUSAO);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        AlteraModoOperacaoForm(ModoOperacaoForm.PADRAO);
    }//GEN-LAST:event_btnCancelarActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastro_Modelo().setVisible(true);
            }
        });
    }
    
    private void AlteraModoOperacaoForm(ModoOperacaoForm estado) {
        switch(estado){
            case PADRAO:
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                btnIncluir.setEnabled(true);
                btnPesquisar.setEnabled(true);
                btnCancelar.setEnabled(false);
                btnConfirmar.setEnabled(false);
                btnPrimeiro.setEnabled(true);
                btnAnterior.setEnabled(true);
                btnProximo.setEnabled(true);
                btnUltimo.setEnabled(true);
                
                tplPrincipal.setSelectedIndex(0);
                break;
                
            case PESQUISA:
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnIncluir.setEnabled(false);
                btnPesquisar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnConfirmar.setEnabled(true);
                btnPrimeiro.setEnabled(true);
                btnAnterior.setEnabled(true);
                btnProximo.setEnabled(true);
                btnUltimo.setEnabled(true);
                
                tplPrincipal.setSelectedIndex(1);
                break;
                
            case INCLUSAO:
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnPesquisar.setEnabled(false);
                btnCancelar.setEnabled(true);
                btnConfirmar.setEnabled(true);
                btnPrimeiro.setEnabled(false);
                btnAnterior.setEnabled(false);
                btnProximo.setEnabled(false);
                btnUltimo.setEnabled(false);
                
                tplPrincipal.setSelectedIndex(1);
                break;
                
            case EXCLUSAO:
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(true);
                btnIncluir.setEnabled(false);
                btnPesquisar.setEnabled(false);
                btnCancelar.setEnabled(true);
                btnConfirmar.setEnabled(true);
                btnPrimeiro.setEnabled(true);
                btnAnterior.setEnabled(true);
                btnProximo.setEnabled(true);
                btnUltimo.setEnabled(true);
                
                tplPrincipal.setSelectedIndex(0);
                break;
                
            case ALTERACAO:
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(false);
                btnIncluir.setEnabled(false);
                btnPesquisar.setEnabled(false);
                btnCancelar.setEnabled(true);
                btnConfirmar.setEnabled(true);
                btnPrimeiro.setEnabled(false);
                btnAnterior.setEnabled(false);
                btnProximo.setEnabled(false);
                btnUltimo.setEnabled(false);
                
                tplPrincipal.setSelectedIndex(1);
                break;
        }
        
        /*
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnIncluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);*/
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cbxCampo1;
    private javax.swing.JCheckBox chkCampo1;
    private javax.swing.JFormattedTextField ftxtCampo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAjuda;
    private javax.swing.JLabel lblCampoCbx1;
    private javax.swing.JLabel lblCampoFtxt1;
    private javax.swing.JLabel lblCampoTxp1;
    private javax.swing.JLabel lblCampoTxt1;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblNoDataFound;
    private javax.swing.JLabel lblRegistroAtual;
    private javax.swing.JLabel lblRegistroTotal;
    private javax.swing.JLabel lblTituloForm;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCampoCbx1;
    private javax.swing.JPanel pnlCampoChk1;
    private javax.swing.JPanel pnlCampoMtxt1;
    private javax.swing.JPanel pnlCampoTxp1;
    private javax.swing.JPanel pnlCampoTxt1;
    private javax.swing.JPanel pnlDetalhe;
    private javax.swing.JPanel pnlDicas;
    private javax.swing.JPanel pnlMestre;
    private javax.swing.JPopupMenu popTabelaPrincipal;
    private javax.swing.JTable tblMestre;
    private javax.swing.JToolBar tblPrincipal;
    private javax.swing.JTabbedPane tplPrincipal;
    private javax.swing.JTextPane txpCampo1;
    private javax.swing.JTextField txtCampo1;
    // End of variables declaration//GEN-END:variables
}
