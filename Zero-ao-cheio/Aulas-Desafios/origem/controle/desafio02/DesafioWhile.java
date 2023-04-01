package controle.desafio02;
import java.util.Scanner;
public class DesafioWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int quantidadedenotas = 0;
        double nota = 0;
        double total = 0;
         while (nota != -1){
             System.out.print("Informe a nota: ");
             nota = input.nextDouble();
             System.out.println( "[Para calcular e encerrar a aplicação digite (-1)]");
            if(nota <= 10 && nota >= 0) {
                total += nota;
                quantidadedenotas++;
            }
            else if (nota != -1){
                System.out.println("Nota invalida");
            }

         }
         double media = total / quantidadedenotas;
        System.out.printf("media = %s  ", media);

        input.close();
    }

}
