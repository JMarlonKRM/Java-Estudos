package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.print("Informe o nome:");
        String nome =  input.nextLine();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        pstmt.execute();

        input.close();
    }
}
