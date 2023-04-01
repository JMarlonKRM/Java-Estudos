package Orientadoobjeto.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijão ingrediente2 = new Feijão(0.1);
        //Sorvete ingrediente3 = new Sorvete(0.25);

        System.out.println(convidado.getPeso());

        convidado.Comer(ingrediente1);
        convidado.Comer(ingrediente2);

        System.out.println("Peso depois de comer " + convidado.getPeso());

        Sorvete sobremessa = new Sorvete(0.4);


        convidado.Comer(sobremessa);
        System.out.println("Peso depois de comer " + convidado.getPeso());


    }
}
