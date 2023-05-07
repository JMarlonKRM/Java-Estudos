package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(700,500); //primeiro e horizontal e o segundo valor é vertical
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // declarando null ele centraliza com e tela original

        JButton botao = new JButton("Clicar");
        janela.add(botao);

        //metodo antigo:
        /*
        botao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento ocorreu !!!");
            }
        });*/

        //usando lambda:
        botao.addActionListener(e ->
        {
            System.out.println("Evento ocorreu !!");
        });


        janela.setVisible(true);
    }
}
