package fundamentos.Desafios;

import java.util.Scanner;

public class Desafioconversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu primeiro salario: ");
        String salario1 = input.nextLine().replace(",",".");
        System.out.println("Digite o seu segundo salario: ");
        String salario2 = input.nextLine().replace(",",".");
        System.out.println("Digite seu terceiro salario: ");
        String salario3 = input.nextLine().replace(",",".");
        //Solicitando os salarios

        // retirando todos os simbolos
        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);
        //convertendo para Numero
        double media = (s1 + s2 + s3) / 3;
        //somando e dando a media
        System.out.println("A MEDIA ENTRE OS SALARIOS É DE: " + media);

        input.close();
    }
}
