package Orientadoobjeto.Composicao;

import java.util.ArrayList;

public class Compra {
    String cliente;

    ArrayList<Item> itens = new ArrayList<Item>();


    double ObterValorTotal(){
        double total = 0;
        for (Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }

}
