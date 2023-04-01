package classe;

public class Equals{
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.Email = "Pedro.Silva@ezemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.Email = "Pedro.Silva@ezemail.com.br";

        System.out.println(u1 == u2); // resultado vai da falso pq eles vao se orientar pelo endereço de onde
        //esta localizado o obj não pelo conteudo do obj

        System.out.println(u1.equals(u2));// tambem vai da falso pq ele vai fazer a mesma coisa que o "=="
        // isso so vai mudar se definirmos oq o equals vai fazer avaliar

        System.out.println(u2.equals(u1)); // vai da a mesma coisa

        //agora dps que eu criei um equals e defini ele funciona certim

    }
}
