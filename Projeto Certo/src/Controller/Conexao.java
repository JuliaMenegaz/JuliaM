package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/projetointegrador";
    private static final String user = "root";
    private static final String passaword = "root";
    private static Connection connection = null;
    private static Conexao conn;

    public Conexao() {
        if (connection == null) {
            connection = abrirConexao();
        }
    }

    //private Conexao(){}
    public static Conexao getConn() {
        if (conn == null) {
            conn = new Conexao();
        }
        return conn;
    }

    public Connection abrirConexao() {
        try {
            System.out.println("Conectando ao banco de dados...");
            connection = DriverManager.getConnection(url, user, passaword);
            System.out.println("Conexão estabelecida com sucesso!");
            return connection;

        } catch (SQLException e) {// ClasNotFoundException e
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }
    //Public void fecharConexao()

//    public static Object getConn() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}
