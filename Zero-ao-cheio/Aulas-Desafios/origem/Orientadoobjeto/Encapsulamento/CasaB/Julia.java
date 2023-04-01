package Orientadoobjeto.Encapsulamento.CasaB;

import Orientadoobjeto.Encapsulamento.CasaA.Ana;

public class Julia {
    Ana sogra = new Ana();

    void TesteAcesso(){

        ///System.out.println(sogra.Segredo); Não consigo acessar
        //System.out.println(sogra.FacoDentroDeCasa);
        //System.out.println(sogra.FormaDeFalar);
        System.out.println(sogra.TodosSabem);
    }
}
