package Orientadoobjeto.Polimorfismo.Desafio;

import Orientadoobjeto.Polimorfismo.Arroz;
import Orientadoobjeto.Polimorfismo.Feijão;
import Orientadoobjeto.Polimorfismo.Sorvete;

public class Pessoa {
    private double peso;

    public Pessoa(double peso){
        setPeso(peso);
    }

    public void Comer(Comida comida){
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }
}
