package Orientadoobjeto.Composicao;

public class Carro {

    Motor motor = new Motor();


    void acelerar() {
        if (motor.FatorInjecao < 2.6){
            motor.FatorInjecao += 0.4;
        }
    }
    void frear (){
        if (motor.FatorInjecao > 0.5){
            motor.FatorInjecao -= 0.4;
        }
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligado (){
        motor.ligado = false;
    }
    boolean estaligado (){
        return motor.ligado;
    }
}
