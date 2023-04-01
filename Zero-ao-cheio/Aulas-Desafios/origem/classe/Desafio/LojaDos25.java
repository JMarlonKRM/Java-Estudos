package classe.Desafio;

public class LojaDos25 {
    String nome;
    double valor;
    static double desconto = 0.25;


    LojaDos25 (){
    }
    LojaDos25 (String nomeInicial, double ValorInicial){
        nome = nomeInicial;
        valor = ValorInicial;
    }
    double precoComDesconto (){
        return valor *(1 - desconto );
    }
}
