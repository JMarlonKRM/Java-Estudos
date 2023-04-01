package Execao.PersonalizadaB;

public class StringVaziaException extends Exception{

    private String NomeDoAtributo;

    public StringVaziaException(String NomeDoAtributo){
        this.NomeDoAtributo = NomeDoAtributo;
    }

    public String getMassage(){
        return String.format("O atributo '%s' está Vazio", NomeDoAtributo);
    }

}
