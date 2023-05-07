package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarRegistro {

    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Infome o novo nome: ");
        String N = input.nextLine();

        System.out.print("Informe o Codigo da pessoa: ");
        int C = input.nextInt();

        String  sql = ("UPDATE pessoas SET nome = ? WHERE codigo = ?");

        PreparedStatement pstmt = conexao.prepareStatement(sql);
        pstmt.setString(1,N);
        pstmt.setInt(2, C);
        int resultado = pstmt.executeUpdate();


        if (resultado > 0) {
            System.out.println("Registro atualizado com sucesso.");
            System.out.println(C + " == " + N);
        } else {
            System.out.println("Nenhum registro foi atualizado.");
        }

        input.close();
        pstmt.close();
        conexao.close();

    }
}
