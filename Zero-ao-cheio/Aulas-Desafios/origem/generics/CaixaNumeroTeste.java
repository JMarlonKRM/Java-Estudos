package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {

        CaixaNumero <Double> CaixaA = new CaixaNumero<>();
        CaixaA.guardar(1.367);
        System.out.println(CaixaA.abrir());

        CaixaNumero <Integer> CaixaB = new CaixaNumero<>();
        CaixaB.guardar(123);
        System.out.println(CaixaB.abrir());

    }
}
