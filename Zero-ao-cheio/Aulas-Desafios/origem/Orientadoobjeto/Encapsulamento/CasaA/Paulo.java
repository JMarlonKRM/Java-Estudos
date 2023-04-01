package Orientadoobjeto.Encapsulamento.CasaA;

public class Paulo {

    Ana esposa = new Ana();
    // posso colocar tbm dentro do TesteAcesso

    void TesteAcesso(){

        ///System.out.println(esposa.Segredo); Não consigo acessar
        System.out.println(esposa.FacoDentroDeCasa);
        System.out.println(esposa.FormaDeFalar);
        System.out.println(esposa.TodosSabem);
    }
}
