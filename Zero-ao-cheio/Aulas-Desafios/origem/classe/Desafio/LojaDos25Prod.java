package classe.Desafio;
public class LojaDos25Prod {
    public static void main(String[] args) {

        LojaDos25 p1 = new LojaDos25("caderno", 30);
        LojaDos25 p2 = new LojaDos25();
        p1.nome = "Bolsa";
        p1.valor = 250.30;

        LojaDos25.desconto = 0.50;
        //o desconto no a qual foi passado na class original foi pode ser alterado, quando vc altera um valor statico
        // ele altera em todos os produtos

        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());


    }
}
