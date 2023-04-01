package Orientadoobjeto.Heranca.Desafio;

public class Subaru extends Carro implements Esportivo, Luxo{

    private boolean LigarTurbo; // =false
    private boolean LigarAr; // =false
    // por padrão o boolean vem false

    public Subaru(){
        this(310);
    }
    Subaru(int VelocidadeMaxima){
        super(VelocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void LigarTurbo() {
        LigarTurbo = true;}

    @Override
    public void DesligarTurbo() {
        LigarTurbo = false;}

    @Override
    public void LigarAr() {
        LigarAr = true;}

    // voce nao pode reduzir a visibilidade de um metodo, entao como ele vem por padrao publico entao nao pode diminuir
    // somente aumentar
    @Override
    public void DesligarAr() {
        LigarAr = false;}


    public int getDelta(){
        if(LigarTurbo && !LigarAr){
            return 35;
        }
        else if(LigarTurbo && LigarAr){
            return 30;
        }
        else if(!LigarTurbo && !LigarAr){
            return 20;
        }
        else{
            return 15;
        }
    }

    /*    @Override
    public void Acelerar() {
        VelocidadeAtual += 100;
    }*/

}
