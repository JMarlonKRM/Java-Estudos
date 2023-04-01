package Lambdas;
//essa classe mostra um sistema padrão no qual não se aplica lambda
public class CalculoTeste1 {
    public static void main(String[] args) {

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2,3));

        calculo = new Multiplicas();
        System.out.println(calculo.executar(2,3));
    }
}
