package teste.UmpraMuitos;

import infra.DAO;
import modelo.UmpraMuitos.ItemPedido;
import modelo.UmpraMuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);
        Pedido pedido = dao.ObterPOrID(1L);

        for (ItemPedido item: pedido.getItens()){
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }
        dao.fechar();
    }
}
