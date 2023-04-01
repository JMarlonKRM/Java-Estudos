package br.com.check.cm;

import br.com.check.cm.visao.TabuleiroConsole;
import br.com.check.cm.modelo.Tabuleiro;


public class Aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(10,10,3);
        new TabuleiroConsole(tabuleiro);
    }

}
