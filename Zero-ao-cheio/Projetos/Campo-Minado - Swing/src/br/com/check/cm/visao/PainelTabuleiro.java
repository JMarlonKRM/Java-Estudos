package br.com.check.cm.visao;

import br.com.check.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {
// JPanel agrupa em um elemento outros elementis

    public PainelTabuleiro(Tabuleiro tabuleiro){

        setLayout( new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCadaCampo(c-> add(new BotaoCampo(c)));
        tabuleiro.registrarObservador(e->{
            SwingUtilities.invokeLater(() -> {
                if (e.isGanhou()){
                    JOptionPane.showMessageDialog(this, "Ganhou!!!");
                }else{
                    JOptionPane.showMessageDialog(this, "Perdeu!!!");
                }
                tabuleiro.reiniciar();
            });
        });
    }
}
