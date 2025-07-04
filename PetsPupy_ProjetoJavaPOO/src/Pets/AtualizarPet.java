package Pets;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class AtualizarPet {
    public void atualizar(String nome, String vacinas){
            ConexaoBD conexaoBD = new ConexaoBD();
            Connection conexao = conexaoBD.conectar();
            
            if(conexao != null){
                String sql = "UPDATE pets SET  vacinas = ? WHERE nome = ?;";
                
                try(PreparedStatement ps = conexao.prepareStatement(sql)){
                    ps.setString(1, vacinas);
                    ps.setString(2, nome);
                    ps.executeUpdate();
                    System.out.println("Pet atualizado com sucesso!");
                }catch(SQLException e){
                    System.out.println("Erro ao atualizar pet");
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
