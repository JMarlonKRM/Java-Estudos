package br.com.check.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;
    private boolean adicionarVizinho;

    private boolean aberto = false;
    private boolean minado = false;
    private boolean marcado = false;

    private List<Campo> vizinhos = new ArrayList<>();
    private List<CampoObservador> observadores = new ArrayList<>();

     Campo(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    public void RegistrarObservador(CampoObservador  observador){
         observadores.add(observador);
    }
    private void NotificarObservadores(CampoEvendo evento){

         observadores.stream()
                 .forEach(o-> o.EventoOcorreu(this, evento));
    }

     boolean adicionarVizinho(Campo vizinho){
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDierente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDierente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaLinha + deltaColuna;

        if(deltaGeral == 1 && !diagonal){
            vizinhos.add(vizinho);
            return true;
        }else if(deltaGeral == 2 && diagonal){
            vizinhos.add(vizinho);
            return true;
        }else{
            return false;
        }
    }

     public void alterarMarcacao(){
        if(!aberto){
            marcado = !marcado;

            if(marcado){
                NotificarObservadores(CampoEvendo.Marcar);
            }else{
                NotificarObservadores(CampoEvendo.Desmarcar);
            }
        }
    }

     public boolean abrir(){
        if(!aberto && !marcado){
            if(minado){
                NotificarObservadores(CampoEvendo.Explodir);
                return true;
            }
            setAberto(true);
            if(vizinhancaSegura()){
                vizinhos.forEach(v -> v.abrir());
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean vizinhancaSegura(){
        return vizinhos.stream().noneMatch(v -> v.minado);
    }

    void minar(){
        minado = true;
    }

    public boolean isMinado(){
         return minado;
    }

    public boolean isMarcado(){
        return marcado;
    }

    void setAberto(boolean aberto) {
         this.aberto = aberto;

         if(aberto){
             NotificarObservadores(CampoEvendo.Abrir);
         }
    }

    public boolean isAberto(){
        return aberto;
    }

    public boolean isFechado(){
        return !isAberto();
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }
    boolean objetivoAlcancado(){
         boolean devendado = !minado && aberto;
         boolean protegido = minado && marcado;

         return devendado || protegido;
    }

    public int minasNaVizinhanca(){
        return (int) vizinhos.stream().filter(v -> v.minado).count();
    }

    void reiniciar(){
         aberto = false;
         minado = false;
         marcado = false;
         NotificarObservadores(CampoEvendo.Reiniciar);
    }
    
}
