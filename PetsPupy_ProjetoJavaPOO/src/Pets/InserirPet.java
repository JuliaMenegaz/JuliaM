package Pets;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InserirPet {
        public void inserir(String nome, String especie, String raca, String vacinas){
            ConexaoBD conexaoBD = new ConexaoBD();
            Connection conexao = conexaoBD.conectar();
            
            if(conexao != null){
                String sql = "INSERT INTO pets (nome, especie, raca, vacinas) VALUES (?,?,?,?);";
                
                try(PreparedStatement ps = conexao.prepareStatement(sql)){
                    ps.setString(1, nome);
                    ps.setString(2, especie);
                    ps.setString(3, raca);
                    ps.setString(4, vacinas);
                    ps.executeUpdate();
                    System.out.println("Pet inserido com sucesso!");
                }catch(SQLException e){
                    System.out.println("Erro ao inserir pet");
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
