package Orientadoobjeto.Encapsulamento.GS;

public class Pessoa {

    private String Nome;
    private int idade;

    public Pessoa(String Nome,int Idade){
        setIdade(Idade);
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    //Getter == Ler
    public int getIdade(){
        return idade;
    }

    //Setter == Alterar
    public void setIdade(int NovaIdade){
        NovaIdade = Math.abs(NovaIdade);
        if(NovaIdade >= 0 && NovaIdade <= 120){
            this.idade = NovaIdade;
        }
    }

    public String toString (){

        return "Olá eu sou o " + getNome() + " e tenho "+ getIdade() +" Anos.";
    }
}
