package Orientadoobjeto.Heranca.Teste;

import Orientadoobjeto.Heranca.Direcao;
import Orientadoobjeto.Heranca.Heroi;
import Orientadoobjeto.Heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10,11);

        System.out.println("O Mostro tem => " + monstro.vida);
        System.out.println("O Heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.Norte);
        monstro.atacar(heroi);
        heroi.atacar(monstro);


        System.out.println("O Mostro tem => " + monstro.vida);
        System.out.println("O Heroi tem => " + heroi.vida);

    }
}
