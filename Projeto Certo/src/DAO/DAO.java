package DAO;

import Controller.Conexao;
import Model.Carro;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

    Carro carro;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    private static String CADASTRAR_CARRO = "INSERT INTO CARROS (MARCA,MODELO,ANO,COR,ESTADO,CARACTERISTICAS,ACESSORIOS,VALOR) VALUES (?,?,?,?,?,?,?,?);";
    private static String CONSULTAR_CARRO = "SELECT * FROM CARROS WHERE ID = ?;";
    private static String ALTERAR_CARRO = "UPDATE CARROS SET MARCA = ?, MODELO = ?,ANO = ?,COR = ?,ESTADO = ?,CARACTERISTICAS = ?,ACESSORIOS = ?,VALOR = ?  WHERE ID = ?;";
    private static String EXCLUIR_CARRO = "DELETE FROM CARROS WHERE ID = ?;";
    private static String LISTAR_CARRO = "SELECT * FROM CARROS;";//"SELECT * FROM CARRO WHERE 1 = 1;";
    private static String CONSULTAR_USUARIO = "SELECTE USUARIO, SENHA FROM USUARIO WHERE USUARIO = ? AND SENHA = ?;";

    public DAO() {
        carro = new Carro("Id", "Marca", "Modelo", "Ano", "Cor", "Estado", "Caracteristicas", "Acessorios", "Valor");
    }

    public void cadastrarCarro(Carro carro) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(CADASTRAR_CARRO);
            int i = 1;
            ps.setString(i++, carro.getMarca());
            ps.setString(i++, carro.getModelo());
            ps.setString(i++, carro.getAno());
            ps.setString(i++, carro.getCor());
            ps.setString(i++, carro.getEstado());
            ps.setString(i++, carro.getCaracteristicas());
            ps.setString(i++, carro.getAcessorios());
            ps.setString(i++, carro.getValor());

            ps.execute();
            connection.commit();

            JOptionPane.showMessageDialog(null, "Carro incluido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterarCarro(Carro carroEmEdicao) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(ALTERAR_CARRO);//"UPDATE CARROS SET MARCA = ?, MODELO = ?,ANO = ?,COR = ?,ESTADO = ?,CARACTERISTICAS = ?,ACESSORIOS = ?,VALOR = ?  WHERE ID = ?;";
            int i = 1;
            ps.setString(i++, carroEmEdicao.getMarca());
            ps.setString(i++, carroEmEdicao.getModelo());
            ps.setString(i++, carroEmEdicao.getAno());
            ps.setString(i++, carroEmEdicao.getCor());
            ps.setString(i++, carroEmEdicao.getEstado());
            ps.setString(i++, carroEmEdicao.getCaracteristicas());
            ps.setString(i++, carroEmEdicao.getAcessorios());
            ps.setString(i++, carroEmEdicao.getValor());
            ps.setString(i++, carroEmEdicao.getId());
           
            System.out.println(carro.getAno() + carro.getCaracteristicas() + carro.getId());

            ps.executeUpdate();
            connection.commit();

            JOptionPane.showMessageDialog(null, "Carro alterado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }/*finally{
            fecharConexao();
        }*/
        
    }

    public void excluirCarro(String id) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(EXCLUIR_CARRO);
            ps.setString(1, id);

            ps.execute();
            connection.commit();

            JOptionPane.showMessageDialog(null, "Carro excluido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Carro consultarCarro(String id) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        Carro carroData = null;
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(CONSULTAR_CARRO);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                carroData = new Carro(rs.getString("ID"), rs.getString("MARCA"), rs.getString("MODELO"), rs.getString("ANO"), rs.getString("COR"), rs.getString("ESTADO"), rs.getString("CARACTERISTICAS"), rs.getString("ACESSORIOS"), rs.getString("VALOR"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carroData;
    }

    public ArrayList<Carro> listarCarro() throws SQLException {
        
        //Connection connection = Conexao.getConn().abrirConexao();
        Connection connection = new Conexao().abrirConexao();
        ArrayList<Carro> arrayListCarros = new ArrayList<>();
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(LISTAR_CARRO);//"SELECT * FROM CARRO;";
            rs = ps.executeQuery();
            Carro carroData;
            while (rs.next()) {
                carroData = new Carro(rs.getString("ID"), rs.getString("MARCA"), rs.getString("MODELO"), rs.getString("ANO"), rs.getString("COR"), rs.getString("ESTADO"), rs.getString("CARACTERISTICAS"), rs.getString("ACESSORIOS"), rs.getString("VALOR"));
                arrayListCarros.add(carroData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (carro == null) {
            JOptionPane.showMessageDialog(null, "Não foi possivel licalizar o carro selecionado", "", JOptionPane.WARNING_MESSAGE);
            //
        }
        return arrayListCarros;
    }

    private void fecharConexao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
