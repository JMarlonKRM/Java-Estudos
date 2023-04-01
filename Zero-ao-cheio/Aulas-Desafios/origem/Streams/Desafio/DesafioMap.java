package Streams.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
        1. Número para String dinária... 6 = "110"
        2. Inverter a String... "110" => "011"
        3. Converter de volta para inteiro => "011" => 3
         */


        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> BIparaInt =
                s-> Integer.parseInt(s,2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(BIparaInt)
                .forEach(System.out::println);

    }
}
