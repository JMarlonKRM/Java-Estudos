package Lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> ParOuImpar = numero -> numero % 2 == 0? "Par" : "Impar";
        System.out.println(ParOuImpar.apply(32));

        Function<String, String> oResultado = valor -> "O resultado é: " + valor;

        Function <String, String> Empolgado = valor -> valor + "!!";

        String resultadoFInal = ParOuImpar.andThen(oResultado).andThen(Empolgado).apply(32);

        System.out.println(resultadoFInal);

    }
}
