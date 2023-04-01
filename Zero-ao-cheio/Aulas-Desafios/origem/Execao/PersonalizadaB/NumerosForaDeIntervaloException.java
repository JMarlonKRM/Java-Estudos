package Execao.PersonalizadaB;

public class NumerosForaDeIntervaloException extends Exception{

    private String NomeDoAtributo;

    public NumerosForaDeIntervaloException (String NomeDoAtributo){
        this.NomeDoAtributo = NomeDoAtributo;
    }

    public String getMassage(){
        return String.format("O atributo '%s' está fora de intervalo", NomeDoAtributo);
    }

}
