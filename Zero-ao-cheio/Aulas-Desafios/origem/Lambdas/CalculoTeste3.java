package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

/*
        Não: int -> Double
        Sim: double -> Double
*/

        //como ele foi definido como um Double então os digitos de entrada tem que ser double
        BinaryOperator <Double> calc = (x, y) -> {return x + y; };
        System.out.println(calc.apply(2.0,3.0));


        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0,3.0));


        BinaryOperator <Integer> calc2 = (x, y) -> {return x + y; };
        System.out.println(calc2.apply(2,3));


        calc2 = (x, y) -> x * y;
        System.out.println(calc2.apply(2,3));
    }
}
