package DesafioFinalDeModulo;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(){}

    Pessoa(String nomePessoa,double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }
    String pessoaFormatada(){
        return String.format("Pessoa = %s\nPeso da Pessoa = %f",this.nomePessoa,this.pesoPessoa);
    }
}
