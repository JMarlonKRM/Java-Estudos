package Streams.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter02 {

    /*
            Esse desafio foi passado pelo professor, usar alguns criterios solicitado por ele
            1. Deve haver dois filtros, distintos.
            2. Mostra produtos que estão com disconto maior que 30%
            3. Mostrar produtos que tem Frete Gratis
            4. Lista tem que ter Preço, Nome, Desconto e Frete.
            5. adicionar um map para mostrar um aviso de "Super promoção"
     */
    public static void main(String[] args) {

        ProdutosFilter02 Produto1 = new ProdutosFilter02("NoteBook", 3589.99, 0.35, false);
        ProdutosFilter02 Produto2 = new ProdutosFilter02("Mouse", 150.78, 0.31, true);
        ProdutosFilter02 Produto3 = new ProdutosFilter02("Mesa Gamer", 10689.25, 0.15, true);
        ProdutosFilter02 Produto4 = new ProdutosFilter02("Teclado Mecanico", 268.69, 0.33, true);
        ProdutosFilter02 Produto5 = new ProdutosFilter02("Cadeira Gamer", 3500.60, 0.11, false);
        ProdutosFilter02 Produto6 = new ProdutosFilter02("Monitor", 2020.50, 0.30, false);

        List<ProdutosFilter02> Produtos = Arrays.asList(Produto1, Produto2, Produto3, Produto4, Produto5, Produto6);


        Predicate<ProdutosFilter02> DescontoBom = a -> a.desconto >= 0.30;
        Predicate<ProdutosFilter02> FreeFrete = a -> a.frente;
        Function<ProdutosFilter02, String> SPromoção = a -> "O melhor Valor !! " + a.nome+ " Ta na Super Promoção";

        Produtos.stream()
                .filter(DescontoBom)
                .filter(FreeFrete)
                .map(SPromoção)
                .forEach(System.out::println);

    }
}
