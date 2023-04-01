package Orientadoobjeto.Heranca;

public class Jogador {
    public int vida = 100;
    public int x;
    public int y;

    /*Jogador (){
        this(0,0);
    }*/
    protected Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente){
        int DeltaX = Math.abs(x - oponente.x);
        int DeltaY = Math.abs(y - oponente.y);

        if(DeltaX == 0 && DeltaY == 1){
            oponente.vida -= 10;
            return true;
        }
        else if(DeltaX == 1 && DeltaY == 0){
            oponente.vida -= 10;
            return true;
        }
        else {
            return false;
        }
    }



    public boolean andar(Direcao direcao){
        switch (direcao){
            case Norte:
                y--;
                break;
            case Leste:
                x++;
                break;
            case Sul:
                y++;
                break;
            case Oeste:
                x--;
                break;

        }
        // se precisar de um nivel de teste mais avancçado melhor usar o if/else
        return true;
    }
}
