package Orientadoobjeto.Composicao;

public class Motor {

    double FatorInjecao = 1;
    boolean ligado = false;

    int giros (){
        if(!ligado){
            return 0;
        }
        else{
            return (int) Math.round(FatorInjecao * 3000);
        }

    }
}
