package classe.Desafio;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data(22,7,2002);
        data1.Dia = 22;
        data1.Mes = 7;
        data1.MesExtenso = "Julho";
        data1.Ano = 2002;

        var data2 = new Data(21, 5,2022);
        data2.Dia = 21;
        data2.Mes = 5;
        data2.MesExtenso = "Maio";
        data2.Ano = 2022;


        System.out.printf("Você nasceu Dia %d, Mes %d (%s) e no Ano de %d"
                ,data1.Dia, data1.Mes, data1.MesExtenso,data1.Ano);
        System.out.println();

        System.out.printf("Dia de hoje(no qual eu fiz essa atividade)" +
                "dia %d, Mes %d (%s), Ano %d", data2.Dia, data2.Mes, data2.MesExtenso, data2.Ano);
    }
}
