package Orientadoobjeto.Composicao;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.estaligado()); // aqui vai trazer falso pois ainda não puxamos o "Ligar"

        c1.ligar();
        System.out.println(c1.estaligado()); //aqui já ligado

        System.out.println(c1.motor.giros()); // não consigo acessar diretamente os giros pq funciona como o metodo do print mesmo -->>
        // ele precisa acessar uma classe e dps acessar a outra do mesmo jeito que se acessa o system dps o out e dps o print

        c1.acelerar();// aqui eu estou mudando os giros do motor
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());


        c1.frear(); // aqui eu estou mudando para menor os giros do motor
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear(); // como ele acaba ficando negativo mesmo em uma ocasião real nao ser verdade precisamos acrescentar uma condição na classe carro
        // executando dnv ja vemos a alteração

        // Faltou o encapsulamento !!!!!!
        // estando assim ele opode alterar se quiser
        //c1.motor.FatorInjecao = - 40;
        System.out.println(c1.motor.giros());


    }
}
