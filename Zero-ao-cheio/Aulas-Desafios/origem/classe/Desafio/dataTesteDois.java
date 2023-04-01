package classe.Desafio;

public class dataTesteDois {
    public static void main(String[] args) {

        dataDois p1 = new dataDois();
        p1.dia = 22;
        p1.mes = 07;
        p1.ano = 2002;

        var p2 = new dataDois();
        p2.dia = 23;
        p2.mes = 05;
        p2.ano = 2022;

        System.out.println(p1.dataFormatada());
        System.out.println(p2.dataFormatada());
    }
}
