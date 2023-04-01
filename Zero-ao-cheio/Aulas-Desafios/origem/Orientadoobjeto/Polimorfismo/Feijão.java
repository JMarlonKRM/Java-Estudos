package Orientadoobjeto.Polimorfismo;

public class Feijão {
    private double peso;

    public Feijão(double peso){
        setPeso(peso);
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
