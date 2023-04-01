package Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {

        Predicate <Integer> IsPar = num -> num % 2 ==0;
        Predicate <Integer> IsTresDigitos = num -> num >= 100 && num <= 999;

        System.out.println(IsPar.and(IsTresDigitos).negate().test(32));
        System.out.println(IsPar.or(IsTresDigitos).test(132));
    }
}
