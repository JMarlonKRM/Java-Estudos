package classe;

public class Produto {

    public static double desconto;
    String nome;
    double preco;
    double Desconto;

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - Desconto);
    }
}
