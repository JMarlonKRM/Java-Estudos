package controle;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("informe a media: ");
        double media = input.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }
        if (media < 7 && media >= 4.5){
            System.out.println("Voce esta de recuperação");
        }
        if (media < 4.5 && media >= 0){
            System.out.println("Voce esta reprovado");
        }
    }
}
