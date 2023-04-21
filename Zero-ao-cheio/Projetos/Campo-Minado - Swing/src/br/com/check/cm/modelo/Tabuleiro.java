package br.com.check.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador{

    private final int linhas;
    private final int colunas;
    private final int minas;

    private final List<Campo> campos = new ArrayList<>();
    private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();


    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarVizinhos();
        sortearMinas();
    }

    public void paraCadaCampo(Consumer<Campo> funcao){
        campos.forEach(funcao);

    }

        public void registrarObservador (Consumer<ResultadoEvento> observador){
        observadores.add(observador);
    }
    private void NotificarObservadores(boolean resultado ){
        observadores.stream()
                .forEach(o-> o.accept(new ResultadoEvento(resultado)));
    }

    public void abrir(int linha, int coluna){
            campos.parallelStream()
                    .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                    .findFirst()
                    .ifPresent(c-> c.abrir());
    }
    
    public void alterarMarcacao(int linha, int coluna){
        campos.parallelStream()
                .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                .findFirst()
                .ifPresent(c-> c.alterarMarcacao());
    }
    private void gerarCampos() {
        for (int linha=0; linha<linhas; linha++){
            for (int coluna =0; coluna<colunas; coluna++){
                Campo campo = new Campo(linha,coluna);
                campo.RegistrarObservador(this);
                campos.add(campo);
            }
        }
    }

    private void associarVizinhos() {
        for (Campo c1 : campos){
            for (Campo c2: campos){
                c1.adicionarVizinho(c2);
            }
        }
    }

    private void sortearMinas() {
        long minasArmadas = 0;
        Predicate<Campo> minado = c -> c.isMinado();

        do{
            int aleatoria = (int) (Math.random() * campos.size());
            campos.get(aleatoria).minar();
            minasArmadas = campos.stream().filter(minado).count();
        }while(minasArmadas<minas);
    }

    public boolean objetivoAlcancado(){
        return campos.stream().allMatch(c-> c.objetivoAlcancado());
    }
    public void reiniciar(){
        campos.stream().forEach(c-> c.reiniciar());
        sortearMinas();
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    @Override
    public void EventoOcorreu(Campo campo, CampoEvendo evento) {
        if(evento == CampoEvendo.Explodir){
            MostarMinas();
            NotificarObservadores(false);
        }else if (objetivoAlcancado()){
            NotificarObservadores(true);
        }
    }

    private void MostarMinas(){
        campos.stream()
                .filter(c->c.isMinado())
//                .filter(c-> !c.isMinado())    esse filtro é para quando eu marcar um local no qual tem bomba e eu clicar em outra bomba o local marcado nao ficar vermelho
                .forEach(c-> c.setAberto(true));
    }
}