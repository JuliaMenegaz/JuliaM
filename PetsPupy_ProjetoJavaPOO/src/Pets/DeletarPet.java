package Pets;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class DeletarPet {
    public void deletar(String nome){
            ConexaoBD conexaoBD = new ConexaoBD();
            Connection conexao = conexaoBD.conectar();
            
            if(conexao != null){
                String sql = "DELETE FROM pets WHERE nome = ?;";
                
                try(PreparedStatement ps = conexao.prepareStatement(sql)){
                    ps.setString(1, nome);
                    ps.executeUpdate();
                    System.out.println("Pet deletado com sucesso!");
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
