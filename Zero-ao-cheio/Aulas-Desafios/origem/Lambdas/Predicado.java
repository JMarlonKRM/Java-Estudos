package Lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Produto> IsExpensive = prod -> (prod.preco * (1 - prod.desconto)) >= 780;

        Produto produto = new Produto("Notbook", 3893.89, 0.15);
        System.out.println(IsExpensive.test(produto));

        Produto produto2 = new Produto("Notbook", 3893.89, 0.80);
        System.out.println(IsExpensive.test(produto2));


    }

}
