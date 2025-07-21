/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.DAO;
import Model.Carro;
import Model.ModeloTabela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrador
 */
public class JTabelaDeCarros extends javax.swing.JFrame {

    private ArrayList<Carro> carro;
    private ModeloTabela modeloTabela;
    private String[] columns = new String[]{"ID", "Marca", "Modelo", "Ano", "Cor", "Estado", "Caracteristicas", "Acessorios", "Valor"};
    private DefaultTableModel dtm;

    /**
     * Creates new form JTabelaDeCarros
     */
    public JTabelaDeCarros() {
        initComponents();
        DAO dao = new DAO();

        try {
            carro = dao.listarCarro();
        } catch (Exception e) {
            e.printStackTrace();
            carro = new ArrayList<>();
        }
        dtm = new DefaultTableModel(columns, 0);
        carro.forEach(c -> dtm.addRow(new String[]{c.getId(), c.getMarca(), c.getModelo(), c.getAno(), c.getCor(), c.getEstado(), c.getCaracteristicas(), c.getAcessorios(), c.getValor()}));

        tabelaCadastrar.setModel(dtm);
        //modeloTabela = new ModeloTabela(carro);
        //AbstractTableModel atm = (AbstractTableModel) tabelaCadastrar.getModel();
        /*
        Esta aqui a funcao que te falei que era pra achar
         */
        btnCadastrarCarro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JCarros
                abrirTelaCadastro();
            }

        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void abrirTelaCadastro() {
        //Aqui tu tem que mudar o construtor da JCarros e colocar o "this"
        //JCarros carros = new JCarros(modeloTabela);
        JCarros carros = new JCarros(this);
        carros.setLocationRelativeTo(this);
        carros.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrarCarro = new javax.swing.JButton();
        btnExcluirCarro = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        JScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastrar = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Carros Disponiveis");

        btnCadastrarCarro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrarCarro.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrarCarro.setText("Cadastrar Novo Carro");
        btnCadastrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCarroActionPerformed(evt);
            }
        });

        btnExcluirCarro.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluirCarro.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirCarro.setText("Excluir Carro");
        btnExcluirCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCarroActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btnAlterar.setText("Alterar Informaçoes");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tabelaCadastrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Modelo", "Ano", "Cor", "Estado", "Caracteristica", "Acessorios", "Valor"
            }
        ));
        JScrollPane1.setViewportView(tabelaCadastrar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrarCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirCarro)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(JScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluirCarro)
                    .addComponent(btnCadastrarCarro))
                .addGap(51, 51, 51))
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

    private void btnExcluirCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCarroActionPerformed
        int linhaSelecionada = tabelaCadastrar.getSelectedRow();
        System.out.println("Linha selecionada:" + linhaSelecionada);

        if (linhaSelecionada != -1) {
            String id = tabelaCadastrar.getValueAt(linhaSelecionada, 0).toString();
            System.out.println("ID selecionado:" + id);

            int confirmacao = JOptionPane.showConfirmDialog(null, "Você realmente quer excluir o cadastro selecionado?", "Confirmação", JOptionPane.YES_NO_OPTION);
            System.out.println("Confirmado?" + (confirmacao == JOptionPane.YES_OPTION));

            if (confirmacao == JOptionPane.YES_OPTION) {
                try {
                    DAO dao = new DAO();
                    dao.excluirCarro(id);
                    System.out.println("Carro excluído do banco de dados com sucesso!");
                    dtm.removeRow(linhaSelecionada);
                    //ModeloTabela modelo = (ModeloTabela) tabelaCadastrar.getModel();
                    //modelo.removerCarroPorId();
                    System.out.println("Carro removido da tabela! :)");
                    JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!");
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao excluir" + e.getMessage());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para excluir");
        }

    }//GEN-LAST:event_btnExcluirCarroActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linhaSelecionada = tabelaCadastrar.getSelectedRow();
        

        if (linhaSelecionada != -1) {
            int confirmacao = JOptionPane.showConfirmDialog(null, "Você realmente quer alterar o cadastro selecionado?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                String id = tabelaCadastrar.getValueAt(linhaSelecionada, 0).toString();
                
                DAO dao = new DAO();

                try {
                    Carro carroSelecionado = dao.consultarCarro(id);
                    JCarros telaEdicao = new JCarros(linhaSelecionada, carroSelecionado, this);
                    telaEdicao.setLocationRelativeTo(this);
                    telaEdicao.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao buscar carro" + e.getMessage());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para alterar");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCarroActionPerformed
    }//GEN-LAST:event_btnCadastrarCarroActionPerformed

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
            java.util.logging.Logger.getLogger(JTabelaDeCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTabelaDeCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTabelaDeCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTabelaDeCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {

                JInicio frame = new JInicio();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrarCarro;
    private javax.swing.JButton btnExcluirCarro;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable tabelaCadastrar;
    // End of variables declaration//GEN-END:variables

    void adicionaCarro(Carro c) {
        dtm.addRow(new String[]{"", c.getMarca(), c.getModelo(), c.getAno(), c.getCor(), c.getEstado(), c.getCaracteristicas(), c.getAcessorios(), c.getValor()});
        System.out.println("Hahaha");
    }
    
    void atualizarCarro(int index, Carro c) {
        dtm.setValueAt(c.getMarca(), index, 1);//Faz pras outras linha depois ai
       //dtm.addRow(new String[]{"", c.getMarca(), c.getModelo(), c.getAno(), c.getCor(), c.getEstado(), c.getCaracteristicas(), c.getAcessorios(), c.getValor()});

        //ModeloTabela modelo = (ModeloTabela) tabelaCadastrar.getModel();;
        //modelo.atualizarCarro(c);
    }
    
}
