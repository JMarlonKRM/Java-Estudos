package classe;

import classe.Desafio.dataDois;

public class valorVsReferencia {
    public static void main(String[] args) {


        double a = 2;
        double b = a; // atribuição por valor (Tipo Primitivo)

        a++;
        b--;

        System.out.printf("A = %2f   B = %2f", a, b);
        // vou usar uma classe que ja foi passada pra nao ter que criar dois dnv

        dataDois d1 = new dataDois();
        dataDois d2 = d1; // atribuição por referencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
    }
}
