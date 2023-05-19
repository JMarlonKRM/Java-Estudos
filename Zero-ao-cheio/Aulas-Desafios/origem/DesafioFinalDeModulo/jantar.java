package DesafioFinalDeModulo;

public class jantar {
    public static void main(String[] args) {


        // Pessoas escolhidas
        Pessoa p1 = new Pessoa();
        p1.nomePessoa = "Juliane";
        p1.pesoPessoa = 40;

        Pessoa p2 = new Pessoa("José Marlon",90);

        //Comida escolhida
        Comida c1 = new Comida();
        c1.nomeComida = "Risoto";
        c1.pesoComida = 0.300;

        Comida c2 = new Comida("Lamen",0.250 );

        double SaidaJuliane = p1.pesoPessoa + c1.pesoComida;
        double SaidaJoseMarlon = p2.pesoPessoa + c2.pesoComida;

        System.out.printf("%s\n%sPeso final da ju = %2f\n",p1.pessoaFormatada(),c1.comidaFormatada(),SaidaJuliane);
        System.out.printf("\n%s\n%sPeso finla do nenem = %2f",p2.pessoaFormatada(),c2.comidaFormatada(),SaidaJoseMarlon);
    }
}
