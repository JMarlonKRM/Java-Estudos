package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> Marcas = Arrays.asList("BMW ", "Audi ", "Honda");
        Marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        //UnaryOperator<String> Maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> PrimeiraLetra = n -> n.charAt(0) + "";
        //UnaryOperator<String> Grito = n -> n + "!!!";


        System.out.println("\n\n Usando composição");

        Marcas.stream()
                .map(Utilitarios.Maiuscula)
                .map(PrimeiraLetra)
                .map(Utilitarios::Grito)
                .forEach(print);
    }
}
