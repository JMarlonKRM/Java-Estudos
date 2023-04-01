package Arrays.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class RecebeNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Quantas notas: ");
        int qtaNotas = input.nextInt();

        double [] notas = new double[qtaNotas];
        for (int i = 0; i < notas.length; i++){
            System.out.printf("Digite a nota (%d):",i + 1);
            notas[i] = input.nextDouble();

        }
        System.out.println(Arrays.toString(notas));
        System.out.println(qtaNotas);

        double total = 0;
        for (double nota : notas){
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("a media e : "+ media);
        input.close();

    }

}
