package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Quanto alunos: ");
        int Qtalunos = input.nextInt();

        System.out.print("Quantas Notas: ");
        int QtNotas = input.nextInt();

        double [][] notasTurma = new double [Qtalunos][QtNotas];

        double total =0;

        for (int a = 0; a < notasTurma.length; a++) {
            for (int n = 0; n < notasTurma[a].length; n++) {
                System.out.printf("Aluno %d, nota %d : ",a + 1 , n + 1 );
                notasTurma[a][n] = input.nextDouble();
                total += notasTurma[a][n];

            }
        }

        double media = total / (Qtalunos * QtNotas);
        System.out.println("Media da turma: "+ media );

        for (double[] NOTASDOALUNO:notasTurma) {
            System.out.println(Arrays.toString(NOTASDOALUNO));
        }


        input.close();
    }
}
