package classe.Desafio;

public class dataDois {
    public int dia;
    public int mes;

    int ano;

    public String dataFormatada(){
        return String.format("%d/%d/%d", dia,mes,ano);
    }
}
