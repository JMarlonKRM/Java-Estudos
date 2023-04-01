package fundamentos.Desafios;

import java.util.Scanner;

public class calculadora  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Digite o primeiro valor: ");
        double var1 = input.nextDouble();
        System.out.print("digite o segundo valor: ");
        double var2 = input.nextDouble();
        System.out.print("informe a operação: ");
        String var3 = input.next();
        //logica
        double resultado = "+".equals(var3) ? var1 + var2 : 0 ;
        resultado = "-".equals(var3) ? var1 - var2: resultado ;
        resultado = "*".equals(var3) ? var1 * var2: resultado ;
        resultado = "/".equals(var3) ? var1 / var2: resultado ;
        resultado = "%".equals(var3) ? var1 % var2: resultado ;


        System.out.printf("%.2f %s %.2f = %.2f",var1,var3,var2, resultado);



        input.close();


    }
}
