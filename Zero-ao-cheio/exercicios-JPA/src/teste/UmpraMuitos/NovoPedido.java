package teste.UmpraMuitos;

import infra.DAO;
import modelo.UmpraMuitos.ItemPedido;
import modelo.UmpraMuitos.Pedido;
import modelo.base.Produto;

public class NovoPedido {
    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();
        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira", 2789.99);
        ItemPedido item = new ItemPedido(pedido,produto,10);

        dao.abrirTST().incluir(produto).incluir(pedido).incluir(item).fecharTST().fechar();
    }
}
