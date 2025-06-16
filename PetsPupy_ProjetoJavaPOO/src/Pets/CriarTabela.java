package Pets;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class CriarTabela {
    public void criar(){
    ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
            String sql = "CREATE TABLE IF NOT EXISTS pets("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(50),"
                    + "especie VARCHAR(50),"
                    + "raca VARCHAR(50),"
                    + "vacinas VARCHAR(50)"
                    + ");";
            
            try(PreparedStatement ps = conexao.prepareStatement(sql)){
                ps.execute();
                System.out.println("Tabela 'pets' criada com sucesso!");
               
            }catch(SQLException e){
                System.out.println("Erro ao cria tabela 'pets'");
                e.printStackTrace();
            }finally{
                try{
                    conexao.close();
                }catch(SQLException e){
                    e.printStackTrace();
                } 
            }
        }
    }
}
