/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Telas;

import br.UFSC.ine5612.trabalho.Controlador.ControladorCartao;
import br.UFSC.ine5612.trabalho.Controlador.ControladorCompra;
import br.UFSC.ine5612.trabalho.Controlador.ControladorProduto;
import br.UFSC.ine5612.trabalho.Controlador.ControladorSenha;
import br.UFSC.ine5612.trabalho.Entidades.Produto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ismael
 */
public class TelaCompra extends javax.swing.JFrame {

    private static TelaCompra instancia;

    /**
     * Creates new form TerminalUI
     */
    private TelaCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public static TelaCompra getInstancia() {
        if (instancia == null) {
            instancia = new TelaCompra();
        }
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoInsereCodigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        botaoCancelarCompra = new javax.swing.JButton();
        botaoCancelarProduto = new javax.swing.JButton();
        txtTerminal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        campoTotalCompra = new javax.swing.JTextField();
        txtTotalCompra = new javax.swing.JLabel();
        botaoEnter = new javax.swing.JButton();
        botaoFinalizaCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoInsereCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoInsereCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoInsereCodigo.setText("Digite o código de barras");
        campoInsereCodigo.setBorder(null);
        campoInsereCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoInsereCodigoFocusGained(evt);
            }
        });
        campoInsereCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoInsereCodigoActionPerformed(evt);
            }
        });
        campoInsereCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoInsereCodigoKeyPressed(evt);
            }
        });

        tabelaProdutos.setAutoCreateRowSorter(true);
        tabelaProdutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaProdutos.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null},
                {"", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Produto", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaProdutos.setToolTipText("");
        tabelaProdutos.setColumnSelectionAllowed(true);
        tabelaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaProdutos.setMinimumSize(new java.awt.Dimension(80, 50));
        tabelaProdutos.setRowHeight(50);
        tabelaProdutos.setRowMargin(2);
        tabelaProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tabelaProdutos);
        tabelaProdutos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setMinWidth(150);
            tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabelaProdutos.getColumnModel().getColumn(0).setMaxWidth(150);
            tabelaProdutos.getColumnModel().getColumn(2).setMinWidth(100);
            tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaProdutos.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        botaoCancelarCompra.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        botaoCancelarCompra.setText("Cancelar Compra");
        botaoCancelarCompra.setBorder(null);
        botaoCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarCompraActionPerformed(evt);
            }
        });

        botaoCancelarProduto.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        botaoCancelarProduto.setText("Cancelar Produto");
        botaoCancelarProduto.setBorder(null);
        botaoCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarProdutoActionPerformed(evt);
            }
        });

        txtTerminal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtTerminal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTerminal.setText("Terminal de caixa");

        campoTotalCompra.setEditable(false);
        campoTotalCompra.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        campoTotalCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTotalCompra.setText("R$ = 0,00");
        campoTotalCompra.setBorder(null);
        campoTotalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTotalCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoTotalCompra)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoTotalCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtTotalCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotalCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalCompra.setText("Total da compra");

        botaoEnter.setText("ENTER");
        botaoEnter.setBorder(null);
        botaoEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnterActionPerformed(evt);
            }
        });
        botaoEnter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoEnterKeyPressed(evt);
            }
        });

        botaoFinalizaCompra.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        botaoFinalizaCompra.setText("FINALIZAR COMPRA");
        botaoFinalizaCompra.setBorder(null);
        botaoFinalizaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizaCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoFinalizaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTerminal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoInsereCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCancelarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCancelarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoInsereCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(botaoEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(botaoCancelarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(botaoFinalizaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoInsereCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoInsereCodigoActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_campoInsereCodigoActionPerformed

    private void botaoCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarProdutoActionPerformed
        int linha = tabelaProdutos.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para ser cancelado!", "Aviso de Produto", JOptionPane.DEFAULT_OPTION);
        } else {
            JPasswordField pf = new JPasswordField();
            int confirm = JOptionPane.showConfirmDialog(null, pf, "Insira a senha do Administrador!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (confirm == JOptionPane.OK_OPTION) {
                String senha = new String(pf.getPassword());
                if (ControladorSenha.getInstancia().verificaSenha(senha)) {
                    tabelaProdutos.removeRowSelectionInterval(linha, linha);
                    atualizaTabela(ControladorCompra.getInstancia().removeProduto((int) tabelaProdutos.getValueAt(linha, 0)));
                    ((DefaultTableModel) tabelaProdutos.getModel()).removeRow(linha);
                }
            }
        }

        //ControladorCompra.getInstancia().showTelaSenha();
    }//GEN-LAST:event_botaoCancelarProdutoActionPerformed

    private void campoTotalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTotalCompraActionPerformed

    }//GEN-LAST:event_campoTotalCompraActionPerformed

    private void botaoEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnterActionPerformed
        // TODO add your handling code here:
        ArrayList<Produto> produtos = ControladorCompra.getInstancia().verificaProduto(campoInsereCodigo.getText());
        atualizaTabela(produtos);
    }//GEN-LAST:event_botaoEnterActionPerformed
    private void atualizaTabela(ArrayList<Produto> produtos) {
        int linha = 0;
        float precoTotal = 0;
        for (Produto p : produtos) {
            tabelaProdutos.setValueAt(p.getCodProduto(), linha, 0);
            tabelaProdutos.setValueAt(p.getNome(), linha, 1);
            String preco = String.valueOf(p.getPreco()).replace(".", ",");
            tabelaProdutos.setValueAt("R$ " + preco, linha, 2);

            linha++;
            precoTotal += p.getPreco();
        }
        campoTotalCompra.setText("R$ = " + String.valueOf(precoTotal).replace(".", ","));
    }

    private void botaoCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarCompraActionPerformed
        JPasswordField pf = new JPasswordField();
        int confirm = JOptionPane.showConfirmDialog(null, pf, "Insira a senha do Administrador!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (confirm == JOptionPane.OK_OPTION) {
            String senha = new String(pf.getPassword());
            if (ControladorSenha.getInstancia().verificaSenha(senha)) {
                for (int i = 0; i <= ControladorCompra.getInstancia().getTamanhoLista(); i++) {
                    tabelaProdutos.setValueAt("", i, 0);
                    tabelaProdutos.setValueAt("", i, 1);
                    tabelaProdutos.setValueAt("", i, 2);
                    ((DefaultTableModel) tabelaProdutos.getModel()).removeRow(i);
                }
                tabelaProdutos.setValueAt("", 0, 0);
                tabelaProdutos.setValueAt("", 0, 1);
                tabelaProdutos.setValueAt("", 0, 2);
                campoTotalCompra.setText("R$ = 0,00");
                campoInsereCodigo.setText("Digite o código de barras");
                ControladorCompra.getInstancia().cancelarCompra();
            }
        }
    }//GEN-LAST:event_botaoCancelarCompraActionPerformed

    private void botaoFinalizaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizaCompraActionPerformed
        // TODO add your handling code here:
        ControladorCartao.getInstancia().showTelaCartao();
    }//GEN-LAST:event_botaoFinalizaCompraActionPerformed

    private void campoInsereCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoInsereCodigoFocusGained
        // TODO add your handling code here:
        campoInsereCodigo.setText("");
    }//GEN-LAST:event_campoInsereCodigoFocusGained

    private void botaoEnterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEnterKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botaoEnterKeyPressed

    private void campoInsereCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoInsereCodigoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ArrayList<Produto> produtos = ControladorCompra.getInstancia().verificaProduto(campoInsereCodigo.getText());
            atualizaTabela(produtos);
            campoInsereCodigo.setText("");
        }
    }//GEN-LAST:event_campoInsereCodigoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarCompra;
    private javax.swing.JButton botaoCancelarProduto;
    private javax.swing.JButton botaoEnter;
    private javax.swing.JButton botaoFinalizaCompra;
    private javax.swing.JTextField campoInsereCodigo;
    private javax.swing.JTextField campoTotalCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JLabel txtTerminal;
    private javax.swing.JLabel txtTotalCompra;
    // End of variables declaration//GEN-END:variables

    public void limpaTela() {
        for (int i = 0; i <= ControladorCompra.getInstancia().getTamanhoLista(); i++) {
            tabelaProdutos.setValueAt("", i, 0);
            tabelaProdutos.setValueAt("", i, 1);
            tabelaProdutos.setValueAt("", i, 2);
            ((DefaultTableModel) tabelaProdutos.getModel()).removeRow(i);
        }
        tabelaProdutos.setValueAt("", 0, 0);
        tabelaProdutos.setValueAt("", 0, 1);
        tabelaProdutos.setValueAt("", 0, 2);
        campoTotalCompra.setText("R$ = 0,00");
        campoInsereCodigo.setText("Digite o código de barras");
        dispose();
    }

}
