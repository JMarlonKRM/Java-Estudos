package Orientadoobjeto.Composicao.Desafio;

public class Sistema {
    public static void main(String[] args) {


        Compra compra1 = new Compra();
        compra1.AdicionarItem("Caneta", 9.67, 100);
        compra1.AdicionarItem(new Produto("Notebook", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.AdicionarItem("caderno", 10, 10);
        compra2.AdicionarItem(new Produto("Impressora", 988.90), 1);

        Cliente cliente = new Cliente("Amanda dos Santos Miranda");
        cliente.AdicionarCompra(compra1);
        cliente.compras.add(compra2);


        System.out.println(cliente.obterValorTotal());
    }
}
