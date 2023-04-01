package Orientadoobjeto.Polimorfismo.Desafio;

import Orientadoobjeto.Polimorfismo.Arroz;
import Orientadoobjeto.Polimorfismo.Feijão;
import Orientadoobjeto.Polimorfismo.Pessoa;
import Orientadoobjeto.Polimorfismo.Sorvete;

public class Jantar {
    public static void main(String[] args) {

        Orientadoobjeto.Polimorfismo.Pessoa convidado = new Pessoa(99.65);

        Orientadoobjeto.Polimorfismo.Arroz ingrediente1 = new Arroz(0.2);
        Orientadoobjeto.Polimorfismo.Feijão ingrediente2 = new Feijão(0.1);
        //Sorvete ingrediente3 = new Sorvete(0.25);

        System.out.println(convidado.getPeso());

        convidado.Comer(ingrediente1);
        convidado.Comer(ingrediente2);

        System.out.println("Peso depois de comer " + convidado.getPeso());

        Orientadoobjeto.Polimorfismo.Sorvete sobremessa = new Sorvete(0.4);


        convidado.Comer(sobremessa);
        System.out.println("Peso depois de comer " + convidado.getPeso());

    }
}
