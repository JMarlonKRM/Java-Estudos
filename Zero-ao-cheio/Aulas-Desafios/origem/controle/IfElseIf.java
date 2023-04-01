package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = input.nextDouble();

        if (nota > 10 || nota <= 0){
            System.out.println("Nota invalida");
        }
        else if (nota >= 8){
            System.out.println("Conceito de nota A");
        }
        else if (nota >= 6){
            System.out.println("Conceito de nota B");
        }
        else if (nota >= 4){
            System.out.println("Conceito de nota C");
        }
        else if(nota >= 2 ){
            System.out.println("Conceito de nota D");
        }
        else {
            System.out.println("Conceito de nota E");
        }
    }
}
