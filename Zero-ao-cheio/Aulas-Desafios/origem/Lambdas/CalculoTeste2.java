package Lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        //interface - calculo
        //nome da variavel - calc
        //representação de a,b = x,y
        //indicador de ação/função - ->
        //retornando uma função - return x + y

        //desse modo eu posso acrescentar mais funções dentro de soma
        Calculo calc = (x,y) -> {return x + y; }; //Calculo calc = (x,y) -> {double a =  x + y;  return a;};
        System.out.println(calc.executar(2,3));


        calc = (x, y) -> x * y; // dessa forma eu so consigo solicitar de forma direta a resposta, sem acrescentar mais funções
        System.out.println(calc.executar(2,3));


        System.out.println(calc.legal());
        System.out.println(Calculo.MuitoLegal());
    }
}
