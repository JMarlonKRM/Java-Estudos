package br.com.check.cm.visao;

import br.com.check.cm.modelo.Campo;
import br.com.check.cm.modelo.CampoEvendo;
import br.com.check.cm.modelo.CampoObservador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener {

    private final Color BG_PADRAO = new Color(184,184,184);
    private final Color BG_MARCAR = new Color(8,179,247);
    private final Color BG_EXPLODIR = new Color(189,66,68);
    private final Color TEXTO_VERDE = new Color(0,100,0);


    private Campo campo;

    public BotaoCampo(Campo campo){
        this.campo = campo;
        setBackground(BG_PADRAO);
        setOpaque(true);
        setBorder(BorderFactory.createBevelBorder(0));

        addMouseListener(this);
        campo.RegistrarObservador(this);
    }

    @Override
    public void EventoOcorreu(Campo campo, CampoEvendo evento) {
        switch(evento){
            case Abrir:
                aplicarEstiloAbrir();
                break;
            case Marcar:
                aplicarEstiloMarcar();
                break;
            case Explodir:
                aplicarEstiloExplodir();
                break;
            default:
                aplicarEstiloPadrao();
        }
        SwingUtilities.invokeLater(() ->{
            repaint();
            validate();
        }); // esse Swing garante com que os valores sejam repassados após a vitoria ou derrota...
        // revalida o componente e repinta ele na tela
    }

    private void aplicarEstiloPadrao() {
        setBackground(BG_PADRAO);
        setBorder(BorderFactory.createBevelBorder(0));
        setText("");
    }

    private void aplicarEstiloExplodir() {
        setBackground(BG_EXPLODIR);
        setForeground(Color.WHITE);
        setText("X");
    }

    private void aplicarEstiloMarcar() {
        setBackground(BG_MARCAR);
        setForeground(Color.BLACK);
        setText("M");
    }

    private void aplicarEstiloAbrir() {
        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        if(campo.isMinado()){
            setBackground(BG_EXPLODIR);
            setText("*");
            return;
        }
        setBackground(BG_PADRAO);
        switch (campo.minasNaVizinhanca()){ //ele nao aceita em tipo long, entao eu posso transformar aqui ou la na classe campo. Como o professor mudou o tipo la eu vou mudar la tbm
            case 1:
                setForeground(TEXTO_VERDE);
                break;
            case 2:
                setForeground(Color.BLUE);
                break;
            case 3:
                setForeground(Color.RED);
                break;
            case 4:
            case 5:
            case 6:
                setForeground(Color.BLACK);
                break;
            default:
                setForeground(Color.YELLOW);
        }
        String valor = !campo.vizinhancaSegura() ? campo.minasNaVizinhanca() + "": "";
        setText(valor);
    }

    // interface dos eventos do mouse


    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == 1){
            campo.abrir();
        }else{
            campo.alterarMarcacao();
        }
    }
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e) {}
}
