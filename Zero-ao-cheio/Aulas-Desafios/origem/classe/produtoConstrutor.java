package classe;

public class produtoConstrutor {

    String nome;
    double preco;
    double desconto;

    produtoConstrutor(){

    }
    produtoConstrutor (String nomeInical, double precoInicial, double descontoInicial){
        nome = nomeInical;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto () {
        return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoGerente){
        return preco * (1 - desconto + descontoGerente);
    }
}
