package Orientadoobjeto.Composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCurso (Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    Curso ObterCursoPorNome(String nome){
        for(Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    public String toString(){
        return nome;
    } // isso foi criado para ele nao retornar o valor do local onde esta armazenado e sim oq esta
    // transforma um objeto em uma String
}
