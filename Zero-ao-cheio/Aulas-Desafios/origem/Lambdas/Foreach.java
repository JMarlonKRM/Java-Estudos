package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach{
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia","Gui");

        System.out.println("Forma Tradicional...");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda...");
        aprovados.forEach(nome -> System.out.println(nome + "!!")); // melhor forma rapida e mais curta

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println); // rapido mas mais complexo o entendimento

        // forma facil de acrescentar algo a repetição

        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> MeuImprimir(nome)); // melhor forma rapida e mais curta

        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(Foreach :: MeuImprimir); // rapido mas mais complexo o entendimento


    }
    static void MeuImprimir(String nome){
        System.out.println("Oi, meu nome é " + nome);
    }
}
