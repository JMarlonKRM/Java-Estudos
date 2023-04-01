package controle.desafio02;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE O DIA DA SEMANA:");
        String dia = input.next();

        if ("Domingo".equalsIgnoreCase(dia)){
            System.out.println(1);
        }
        else if ("Segunda".equalsIgnoreCase(dia)){
            System.out.println(2);
        }
        else if ("Terça".equalsIgnoreCase(dia)){
            System.out.println(3);
        }
        else if ("Quarta".equalsIgnoreCase(dia)){
            System.out.println(4);
        }
        else if ("Quinta".equalsIgnoreCase(dia)){
            System.out.println(5);
        }
        else if ("Sexta".equalsIgnoreCase(dia)){
            System.out.println(6);
        }
        else if ("sabado".equalsIgnoreCase(dia)){
            System.out.println(7);
        }
        else{
            System.out.println("Dia invalido");
        }

    }
}
