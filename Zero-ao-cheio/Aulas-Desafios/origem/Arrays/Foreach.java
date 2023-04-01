package Arrays;

import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {

        double [] notas = {9.9, 8.7, 7.2, 9.4};

        // for normal
        double totalA = 0;
        for (int i = 0; i < notas.length; i++) {
            totalA += notas[i];
        }
        System.out.println(Arrays.toString(notas));
        System.out.println(totalA / notas.length);
        System.out.println();
        // usando o foreach

        for(double nota : notas){
            System.out.print(nota+", " );
        }
    }
}
