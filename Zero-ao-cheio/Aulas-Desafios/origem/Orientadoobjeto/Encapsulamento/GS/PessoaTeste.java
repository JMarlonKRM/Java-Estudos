package Orientadoobjeto.Encapsulamento.GS;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro",-45);
        p1.setIdade(125); // Alterar

        System.out.println(p1.getIdade()); //Ler
        System.out.println(p1);
    }
}
