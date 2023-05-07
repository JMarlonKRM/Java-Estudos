package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Digite o ID: ");
        int codigo = input.nextInt();


        String sql = "DELETE FROM pessoas WHERE codigo = ?";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        pstmt.setInt(1,codigo);

        if(pstmt.executeUpdate() > 0){
            System.out.println("Pessoa Excluida com sucesso");
        }else{
            System.out.println("Total de 0 excluidos");
        }

    }
}
