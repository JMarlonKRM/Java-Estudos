package br.com.check.cm.visao;

import br.com.check.cm.excecao.ExplosaoException;
import br.com.check.cm.excecao.SairException;
import br.com.check.cm.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo() {
        try{
            boolean continuar = true;

            while(continuar){
                cicloDoJogo();

                System.out.println("Outra partida ? \n (S/N) ");
                String resposta = entrada.nextLine();

                if ("n".equalsIgnoreCase(resposta)){
                    continuar = false;
                }else{
                    tabuleiro.reiniciar();
                }
            }

        }catch (SairException e){
            System.out.println("Tchau!!!!");
        }finally {
            entrada.close();
        }
    }

    private void cicloDoJogo() {
        try{

            while (!tabuleiro.objetivoAlcancado()){
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digite (X,Y):");

                Iterator<Integer>xy = Arrays.stream(digitado.split(","))
                        .map(e-> Integer.parseInt(e.trim())).iterator();

                digitado = capturarValorDigitado("1 - para abrir ou 2 - para (Des)marcar");

                if ("1".equals(digitado)){
                    tabuleiro.abrir(xy.next(), xy.next());
                }else if ("2".equals(digitado)) {
                    tabuleiro.alterarMarcacao(xy.next(), xy.next());
                }
            }

            System.out.println(tabuleiro);
            System.out.println("Você ganhou!");
        }catch (ExplosaoException e){
            System.out.println(tabuleiro);
            System.out.println("Você Perdeu!");
        }
    }

    private String capturarValorDigitado(String texto){
        System.out.print(texto);
        String digitado = entrada.nextLine();

        if("Sair".equalsIgnoreCase(digitado)){
            throw new SairException();
        }
        return digitado;
    }
}
