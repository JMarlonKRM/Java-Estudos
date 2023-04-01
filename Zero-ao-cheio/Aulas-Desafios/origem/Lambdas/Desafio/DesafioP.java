package Lambdas.Desafio;

import Lambdas.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioP {

        public static void main(String[] args) {
                /*
               1. A partir do produto calcular o preço real (com desconto)
               2. Imposto municipal, se o valor do produto for >= 2500 cobrar 8,5% se nao for maior o produto é isento
               3. Frete, se o valor do produto for >= 3000 cobrar 100, se nao cobrar so 50
               4. Arredondar o valor quebrado, deixando so duas casas decimais
               5. formatar, exemplo R$ 1234,56
                 */

                Function<Produto, Double> PrecoFinal = produto -> produto.preco * (1 - produto.desconto);
                UnaryOperator<Double> ImpostoMunicipal = preco -> preco >= 2500 ? preco * 1.085: preco;
                UnaryOperator<Double> Frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
               // UnaryOperator<Double> Arredondamento = preco -> Double.parseDouble(String.format( "%.2f" + preco));
                //Function <Double, String> formatar = preco -> ("R$" + preco).replace(".",",");
                Function<Double, String> formatar = preco -> String.format("R$%.2f", preco).replace(".", ",");



                Produto p = new Produto("Ipad",3235.89,0.13);
                String preco = PrecoFinal
                        .andThen(ImpostoMunicipal)
                        .andThen(Frete)
                       // .andThen(Arredondamento)
                        .andThen(formatar)
                        .apply(p);
                System.out.println("O preço final é: "+ preco);
        }
}
// as duas linhas comentadas não estavam me trazendo resultado desejado e me trazia somente um erro de String, entao pesquisei sobre
// e em grupos e recebi essa ajuda "Function<Double, String> formatar = preco -> String.format("R$ %.2f", preco).replace(".", ",");"
//acabou funcionando. Pelo que eu entendi comparando meu o meu com o dele, não estava funcionando pq eu estava tentando transformar
//um valor Double em um um valor String