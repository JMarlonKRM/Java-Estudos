package Lambdas;

@FunctionalInterface // cria uma validação de que so pode um metodo
//tem que ser uma interface funcional
public interface Calculo {

    //publica abstract ja vem por padrão

    double executar(double a, double b);

    // posso criar metodos do tipo default ou estatic pq eles são diferentes e podem ser divididos quando os metodos forem chamados

    default String legal(){
        return "Legal";
    }
    static String MuitoLegal(){
        return "Muito Legal";
    }
}
