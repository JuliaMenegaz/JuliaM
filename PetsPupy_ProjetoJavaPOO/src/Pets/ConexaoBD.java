package Pets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String URL = "jdbc:mysql://localhost:3306/pets_pupy";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    
    public Connection conectar(){
        try{
            return DriverManager.getConnection(URL,USUARIO,SENHA);
            
        }catch(SQLException e){
            System.out.println("Erro ao conactar ao banco de dados");
            e.printStackTrace();
            return null;
        }
    }
}
