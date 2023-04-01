package Lambdas.Desafio;

import Lambdas.Produto;

import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Desafio {

        public static void main(String[] args) {
                /*
               1. A partir do produto calcular o preço real (com desconto)
               2. Imposto municipal, se o valor do produto for >= 2500 cobrar 8,5% se nao for maior o produto é isento
               3. Frete, se o valor do produto for >= 3000 cobrar 100, se nao cobrar so 50
               4. Arredondar o valor quebrado, deixando so duas casas decimais
               5. formatar, exemplo R$ 1234,56
                 */

                Produto p = new Produto("Ipad", 3235.89, 0.13);
                BinaryOperator<Double> PrecoReal = (valor, desconto) -> valor - (valor * desconto);
                System.out.println(PrecoReal.apply(3235.89, 0.13));


                BinaryOperator<Double> PrecoIM = (valor, IM) -> {
                        double ValorImposto = valor * IM;
                        return valor >= 2500 ? valor + ValorImposto : valor;
                };
                System.out.println(PrecoIM.apply(2815.2243,0.085));

                BinaryOperator<Double> PrecoFrete = (valor, frete) -> {
                        double ValorFinal = valor;
                        return ValorFinal >= 3000 ? ValorFinal + frete: (ValorFinal + frete) - 50;
                };
                System.out.println(PrecoFrete.apply(3054.5183655, 100.0));

                DecimalFormat DF = new DecimalFormat("#.00");
//                DF.format(3154.5183655);
                System.out.println( "R$"+ DF.format(PrecoFrete.apply(3054.5183655, 100.0)));
                // ou


                // essa foi a minha resolução do desafio conforme foi passado na aula 187.Desafio Binary Operator
                // KKKKKKKKK pensei que pelo nome do desafio era pra usar somente o BinaryOperator
                // puxei o objeto somente para amostra, segue resposta do professor no DesafioP

        }
}
