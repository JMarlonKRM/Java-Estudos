package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer <Produto> ImprimirNome = p -> System.out.println(p.nome + "!!");

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        ImprimirNome.accept(p1);


        Produto p2 = new Produto("NoteBook", 2987.99, 0.25);
        Produto p3 = new Produto("Caderno", 19.90, 0.03);
        Produto p4 = new Produto("Borracha", 7.80, 0.18);
        Produto p5 = new Produto("Lapís", 4.39, 0.19);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        produtos.forEach(ImprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
