package Orientadoobjeto.Heranca.Desafio;

public interface Luxo {

    void LigarAr();
    void DesligarAr();

    default int VelocidadeDoAr (){
        return 1;
    }
}
