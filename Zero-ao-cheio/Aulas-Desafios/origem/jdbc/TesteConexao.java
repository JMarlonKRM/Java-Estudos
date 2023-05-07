package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        //posso colocar dps do localhost o numero da porta que vou acessar
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; //como to acessando a porta padrão nao precisa, mas se caso nao fosse eu poderia fazer assim localhost:3306
        final String usuario = "root";
        final String senha = "shirakiin";

        Connection conexao = DriverManager.getConnection(url,usuario,senha);

        System.out.println("conectado");
 

        conexao.close();

    }
}
