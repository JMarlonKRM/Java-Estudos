package Execao.PersonalizadaA;

public class StringVaziaException extends RuntimeException{

    private String NomeDoAtributo;

    public StringVaziaException(String NomeDoAtributo){
        this.NomeDoAtributo = NomeDoAtributo;
    }

    public String getMassage(){
        return String.format("O atributo '%s' está Vazio", NomeDoAtributo);
    }

}
