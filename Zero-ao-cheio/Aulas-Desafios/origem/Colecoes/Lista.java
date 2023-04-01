package Colecoes;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Jão"));
        lista.add(new Usuario("Fernada"));
        lista.add(new Usuario("Luana"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Trindade"));
        lista.add(new Usuario("Felipe"));
        lista.add(new Usuario("Jacqson"));
        lista.add(new Usuario("Fernada"));

        System.out.println(lista.get(3)); // acessar pelo indice

        System.out.println(">>>>>>" + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Fernada") ));

        System.out.println("Tem? " + lista.contains(new Usuario("Trindade")));

        for(Usuario u : lista){
            System.out.println(u.nome); // se eu nao chamazr o nome ele sozinho vai adicionar o toString la
        }
    }
}
