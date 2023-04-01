package Orientadoobjeto.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List <Item> itens = new ArrayList<>();

    void AdicionarItem(Produto p, int Quantidade){
        this.itens.add(new Item(p, Quantidade));
    }
    void AdicionarItem(String nome,double preco, int Quantidade){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, Quantidade));
    }
    double obterValorTotal(){
        int total = 0;

        for(Item item: itens){
            total += item.Quantidade * item.produto.Preco;
        }

        return total;
    }
}
