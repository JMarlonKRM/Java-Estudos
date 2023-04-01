package Execao;

import java.util.Objects;

public class Aluno {

    public final String nome;
    public final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString (){
        return nome + " tem nota: " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.nota, nota) == 0 && nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}
