package Orientadoobjeto.Encapsulamento.CasaB;

import Orientadoobjeto.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

    void TesteAcesso(){

        // Ana Mae = new Ana(): <--- não tem necessidade pq ele ja puxa por herança


        //System.out.println(esposa.Segredo); Não consigo acessar Privado
        //System.out.println(FacoDentroDeCasa); não consigo acessar por nao ser do mesmo pacote que ana
        System.out.println(FormaDeFalar); //so acesso esse se eu não criar uma Instância da classe Ana
        System.out.println(TodosSabem);
        System.out.println(new Ana().TodosSabem); // tambem pode ser feito assim por ser publico
    }


}
