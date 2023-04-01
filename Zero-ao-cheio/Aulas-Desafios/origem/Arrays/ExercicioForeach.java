package Arrays;

import java.util.Arrays;

public class ExercicioForeach {
    public static void main(String[] args) {

        double [] notasAlunoA = new double[4];
        notasAlunoA[0] = 9.0;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 7.0;
        notasAlunoA[3] = 8.0;

        double totalAlunoA = 0;
        double divisor = notasAlunoA.length;
        for(double nota : notasAlunoA){
            totalAlunoA = nota;
        }
        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA.length);
        System.out.println(totalAlunoA / divisor);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n\n\n\n");
        double [] notasAlunoB = {9.0, 8.0, 7.0, 8.0};

        double totalAlunoB = 0;
        for (double notas: notasAlunoB) {
            totalAlunoB = notas;
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
    //pesquisar sobre o pq nao esta dividindo por 4 e sim por 2. O pq o length ta dando 2 e nao 4
}
