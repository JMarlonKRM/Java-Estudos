package Orientadoobjeto.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;

    final List<Compra> compras = new ArrayList<>();
    Cliente (String nome){
        this.nome = nome;
    }

    void AdicionarCompra(Compra compra){
        this.compras.add(compra);
    }


    double obterValorTotal(){
        int total = 0;

        for(Compra compra: compras){
            total += compra.obterValorTotal();
        }
        return total;
    }

}
