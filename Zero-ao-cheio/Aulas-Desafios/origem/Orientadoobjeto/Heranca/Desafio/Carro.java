package Orientadoobjeto.Heranca.Desafio;

public class Carro {
    public int VELOCIDADE_MAXIMA;
    protected int VelocidadeAtual;

    private int Delta = 5;

    protected Carro (int VelocidadeMaxima){
        this.VELOCIDADE_MAXIMA = VelocidadeMaxima;
    }

    public void Acelerar(){
        if (VelocidadeAtual + getDelta()> VELOCIDADE_MAXIMA){
            VelocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else{
            VelocidadeAtual += getDelta();
        }
    }
    public void Frear(){
        if(VelocidadeAtual >= 5){
            VelocidadeAtual -= 5;
        }
        else{
            VelocidadeAtual = 0;
        }

    }
    public int getDelta() {
        return Delta;
    }

    public void setDelta(int delta) {
        Delta = delta;
    }

    public String toString (){
        return "Velocidade Atual é " + VelocidadeAtual + "Km/h";
    }
}
