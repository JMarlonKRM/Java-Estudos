package Padroes.observer;

public class AniversarioSurpresa {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        // se eu comentar o registar observador e a criação da namorada eu posso fazer usanoo lambda

        // porteiro.RegistrarObservador(e -> System.out.println("Surpresa"));

        porteiro.RegistarObservador(namorada);
        porteiro.monitorar();
    }
}
