package br.com.check.cm.visao;

import br.com.check.cm.modelo.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal(){
        Tabuleiro tabuleiro = new Tabuleiro(16,30,50);

        add(new PainelTabuleiro(tabuleiro));

        setTitle("CAMPO MINADO");
        setSize(690 , 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
