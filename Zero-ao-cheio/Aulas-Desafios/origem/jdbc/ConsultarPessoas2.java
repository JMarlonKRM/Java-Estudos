package jdbc;
//DESAFIO (não criei uma nova pasta para nao da mais trabalho)

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {

         Scanner input = new Scanner (System.in);

        Connection conexao = FabricaConexao.getConexao();
        List<Pessoa> pessoas =  new ArrayList<>();

        System.out.println("Informe o valor de pesquisa: ");
        String valor = input.nextLine();
        String sql  = "SELECT * FROM pessoas WHERE nome LIKE ?";

        PreparedStatement pstmt  = conexao.prepareStatement(sql);
        pstmt.setString(1,"%"+valor+"%");
        ResultSet resultado = pstmt.executeQuery();


        while(resultado.next()){
            int codigo = resultado.getInt("Codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo,nome));
        }
        for (Pessoa p: pessoas){
            System.out.println(p.getCodigo()+" == "+  p.getNome());
        }
        pstmt.close();
        conexao.close();
        input.close();
    }
}
