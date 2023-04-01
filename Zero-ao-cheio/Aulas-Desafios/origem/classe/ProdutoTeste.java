package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Gabinete";
        p1.preco = 1220.20;
        p1.Desconto = 0.20;

        var p2 = new Produto();
        p2.nome = "Placa e viddeo";
        p2.preco = 4100.00;
        p2.Desconto = 0.10;
        // Tanto faz vc colocar direto o nome da classe que usou ou colocar "var" depende bastante de como vc quer usar
        // ou de como vai ser usado mas nesse caso noa tem nem um problema tlgd meu chegado

        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }
}
