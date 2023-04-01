package classe.Desafio;

public class construtorPrint {
    public static void main(String[] args) {

        Construtor a1 = new Construtor();

        var a2 = new Construtor(22,07,2002);


        System.out.println(a1.ConstrutorFormatado());
        System.out.println(a2.ConstrutorFormatado());
    }
}
