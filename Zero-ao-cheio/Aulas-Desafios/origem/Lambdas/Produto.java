package Lambdas;

import javax.sql.rowset.spi.SyncResolver;

public class Produto {

    final String nome;
    public final double preco;
    public final double desconto;

    //pode se criar um construtor direto usando o botao direito do mouse e indo em gerar e dps escolhendo a opção construtor
    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString(){
        double PrecoFinal = preco * (1 - desconto);
        return nome + " tem preço final de R$" + PrecoFinal;
    }
}
