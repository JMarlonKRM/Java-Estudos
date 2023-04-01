package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> MaisDois = n -> n + 2;
        UnaryOperator<Integer> VezesDois = n -> n * 2;
        UnaryOperator<Integer> AoQuadrado = n -> n * n;

        int Resultado1 = MaisDois
                .andThen(VezesDois)
                .andThen(AoQuadrado)
                .apply(0); // de cima pra baixo
        System.out.println(Resultado1);

        int Resultado2 = AoQuadrado
                .compose(VezesDois)
                .compose(MaisDois)
                .apply(0);// de baixo pra cima
        System.out.println(Resultado2);
    }
}
