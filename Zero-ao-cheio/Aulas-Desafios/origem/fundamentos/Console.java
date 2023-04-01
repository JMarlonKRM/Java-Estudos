package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.printf("%d  %d  %d  %d  %d", 1,2,3,4,5);

        String nome = "José";
        String sobrenome = "Marlon vieira";
        int idade = 19;
        double salario = 150.00;
        System.out.printf("Nome:%s  %nSobrenome:%s %nIdade:%d %nSalario:%s \n",
                nome, sobrenome, idade, salario);


        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome1 = input.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome1 = input.nextLine();

        System.out.print("Sua idade: ");
        int idade1 = input.nextInt();
        System.out.printf("Nome:%s %nSobrenome:%s %nIdade:%d",nome1,sobrenome1,idade1);
    }
}
