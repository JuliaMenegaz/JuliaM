package Pets;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultarPets2 {

    public void consultar() {
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();

        if (conexao != null) {
            //String sql = "SELECT nome FROM pets GROUP BY nome ORDER BY nome ASC;";
            String sql = "SELECT id, nome, especie, raca, vacinas FROM pets ORDER BY nome ASC;";
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ResultSet resultado = ps.executeQuery();

                System.out.println("Lista de Usuários:");
                while (resultado.next()) {
                    int id = resultado.getInt("id");
                    String nome = resultado.getString("nome");
                    String especie = resultado.getString("especie");
                    String raca = resultado.getString("raca");
                    String vacinas = resultado.getString("vacinas");
                    System.out.println("ID: " + id + "\nNome: " + nome + "\nEspecie: " + especie + "\nraça: " + raca + "\nVacinas: " + vacinas);
                    
                    if ("sim".equals(vacinas)) {
                        System.out.println("Está tudo certo com o seu pet!");
                    } else {
                        System.out.println("Seu pet precisa ser vacinado!");
                    }
                }
            

        }catch(SQLException e){
                System.out.println("Erro ao consultar usuarios");
                e.printStackTrace();
            }finally{
                try{conexao.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
            }
    }
}
}

