package classe;

public class profutoConstrutorTeste {
    public static void main(String[] args) {

        produtoConstrutor p1 = new produtoConstrutor("NotBook", 4200.23, 0.25);

        var p2 = new produtoConstrutor();
        p2.nome = "mouse";
        p2.preco = 20.00;
        p2.desconto = 0.10;


        System.out.println(p1.nome);
        System.out.println(p2.nome);


        double precoFinal1 = p1.precoComDesconto();
        double precoFianal2 = p2.precoComDesconto(0.1);
        double mediaDoCarrinho = (precoFinal1 + precoFianal2) / 2;

        System.out.printf("Média do carrinho = R$ %.2f", mediaDoCarrinho);
    }
}
