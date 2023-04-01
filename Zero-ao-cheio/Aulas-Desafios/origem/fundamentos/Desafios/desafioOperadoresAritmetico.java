package fundamentos.Desafios;

public class desafioOperadoresAritmetico {
    // int a = 3;
    //int b = (int)math.pow(a,3) //ao cubo gerando um inteiro apenas
    public static void main(String[] args) {

        int var1 = 6 * (3 + 2);
        int var2 = (int) Math.pow(var1, 2);
        int var3 = 3 * 2;
        int var4 = var2 / var3;

        int a = 1 - 5;
        int b = 2 - 7;
        int c = a * b;
        int d = c / 2;
        int e = (int) Math.pow(d, 2);


        int valor1 = var4 - e;
        int valor2 = (int) Math.pow(valor1, 3);
        int valor3 = 10;
        int valor4 = (int) Math.pow(valor3, 3);
        int resultado = valor2 / valor4;
        System.out.println(resultado);



    }
}
