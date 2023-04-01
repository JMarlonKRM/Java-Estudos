package classe.Desafio;

public class Construtor {
    int dia;
    int mes;
    int ano;


    Construtor (){
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    Construtor(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }
    String ConstrutorFormatado (){
        return String.format("%d/%d/%d", dia, mes,ano);
    }
}
