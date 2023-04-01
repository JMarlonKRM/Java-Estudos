package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

        Supplier<List<String>> UmaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui"); // nao recebe um valor e retorna um valor
        System.out.println(UmaLista.get());
    }
}
