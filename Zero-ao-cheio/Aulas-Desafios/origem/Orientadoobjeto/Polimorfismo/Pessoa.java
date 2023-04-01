package Orientadoobjeto.Polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso){
        setPeso(peso);
    }

    public void Comer(Arroz arroz){
        this.peso += arroz.getPeso();
    }
    public void Comer(Feijão feijão){
        this.peso += feijão.getPeso();
    }
    public void Comer(Sorvete sorvete){
        this.peso += sorvete.getPeso();
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
