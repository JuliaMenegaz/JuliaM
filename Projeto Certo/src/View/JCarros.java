/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.DAO;
import Model.ModeloTabela;
import Model.Carro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class JCarros extends javax.swing.JFrame {

    private int index = -1;
    private Carro carroEmEdicao;

    /**
     * Creates new form JCarros
     */
    //private ModeloTabela modeloTabela;
    private JTabelaDeCarros jTabelaDeCarros;

    public JCarros(JTabelaDeCarros jTabelaDeCarros) {
        //this.modeloTabela = modeloTabela;
        this.jTabelaDeCarros = jTabelaDeCarros;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //
        txtId2.setVisible(false);
        setTitle("Cadastro de cliente");
        btnIncluirCadastro.setVisible(true);
        //btnSalvar.setVisible(false);
    }

    public JCarros(int index, Carro carro, JTabelaDeCarros jTabelaDeCarros) {
        setTitle("Alterar Carro: " + carro.getModelo());
        this.carroEmEdicao = carro;
        this.jTabelaDeCarros = jTabelaDeCarros;
        //this.modeloTabela = modeloTabela;
        
        initComponents();
        preencherCampos(carro);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        txtId2.setVisible(false);
        btnIncluirCadastro.setVisible(false);
        //btnSalvar.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCaracteristicas = new javax.swing.JTextField();
        txtAcessorios = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnIncluirCadastro = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtId2 = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastros de Carros");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Marca");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Modelo");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ano");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Estado");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Valor ");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cor");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Acessórios");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Caracteristicas");

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setForeground(new java.awt.Color(0, 0, 0));

        txtAno.setBackground(new java.awt.Color(255, 255, 255));
        txtAno.setForeground(new java.awt.Color(0, 0, 0));

        txtCor.setBackground(new java.awt.Color(255, 255, 255));
        txtCor.setForeground(new java.awt.Color(0, 0, 0));

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));

        txtCaracteristicas.setBackground(new java.awt.Color(255, 255, 255));
        txtCaracteristicas.setForeground(new java.awt.Color(0, 0, 0));

        txtAcessorios.setBackground(new java.awt.Color(255, 255, 255));
        txtAcessorios.setForeground(new java.awt.Color(0, 0, 0));

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setForeground(new java.awt.Color(0, 0, 0));

        btnIncluirCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnIncluirCadastro.setForeground(new java.awt.Color(0, 0, 0));
        btnIncluirCadastro.setText("CADASTRAR");
        btnIncluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirCadastroActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtId2.setText("jTextField1");
        txtId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                            .addComponent(btnIncluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCaracteristicas, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAcessorios, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(80, 80, 80)
                        .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirCadastroActionPerformed
        //if (carroEmEdicao != null) {
        carroEmEdicao = new Carro("", txtMarca.getText(), txtModelo.getText(), txtAno.getText(), txtCor.getText(), txtEstado.getText(), txtCaracteristicas.getText(), txtAcessorios.getText(), txtValor.getText());
        txtId2.setVisible(false);
        DAO dao = new DAO();
        try {
            dao.cadastrarCarro(carroEmEdicao);
            //modeloTabela.atualizarCarro(carroEmEdicao);
            jTabelaDeCarros.adicionaCarro(carroEmEdicao);
            JOptionPane.showMessageDialog(this, "Carro alterado com sucesso!");
            this.dispose();
        } catch (SQLException ex) {
            //Coloca uma pagina de erro aqui pro usuario saber que deu merda
            Logger.getLogger(JCarros.class.getName()).log(Level.SEVERE, null, ex);
        }
        //} else {
        //JOptionPane.showMessageDialog(this, "Nenhum Carro em edição!");
        //}
        /*DAO dao = new DAO();
        Carro carro = new Carro(null, txtMarca.getText(), txtModelo.getText(), txtAno.getText(), txtCor.getText(), txtEstado.getText(), txtCaracteristicas.getText(), txtAcessorios.getText(), txtValor.getText());

        try {
            dao.cadastrarCarro(carro);
            jTabelaDeCarros.atualizarCarro(carroEmEdicao);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(JCarros.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();*/
    }//GEN-LAST:event_btnIncluirCadastroActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (carroEmEdicao != null) {
            carroEmEdicao.setId(txtId2.getText());
            carroEmEdicao.setMarca(txtMarca.getText());
            carroEmEdicao.setModelo(txtModelo.getText());
            carroEmEdicao.setAno(txtAno.getText());
            carroEmEdicao.setCor(txtCor.getText());
            carroEmEdicao.setEstado(txtEstado.getText());
            carroEmEdicao.setCaracteristicas(txtCaracteristicas.getText());
            carroEmEdicao.setAcessorios(txtAcessorios.getText());
            carroEmEdicao.setValor(txtValor.getText());
           
            DAO dao = new DAO();
            try {
                dao.alterarCarro(carroEmEdicao);
                //modeloTabela.atualizarCarro(carroEmEdicao);
               jTabelaDeCarros.atualizarCarro(index, carroEmEdicao);
            //    jTabelaDeCarros.adicionaCarro(carroEmEdicao);
                this.dispose();
            } catch (SQLException ex) {
                //Coloca uma pagina de erro aqui pro usuario saber que deu merda
                Logger.getLogger(JCarros.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum Carro em edição!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //ArrayList<Carro> listaCarros = new ArrayList<>();
        //ModeloTabela modeloTabela = new ModeloTabela(listaCarros);
        //new JCarros(modeloTabela).setVisible(true);
    }

    private void preencherCampos(Carro carro) {
        txtId2.setVisible(false);
        txtId2.setText(carro.getId());
        txtMarca.setText(carro.getMarca());
        txtModelo.setText(carro.getModelo());
        txtAno.setText(carro.getAno());
        txtCor.setText(carro.getCor());
        txtEstado.setText(carro.getEstado());
        txtCaracteristicas.setText(carro.getCaracteristicas());
        txtAcessorios.setText(carro.getAcessorios());
        txtValor.setText(carro.getValor());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluirCadastro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAcessorios;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCaracteristicas;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
