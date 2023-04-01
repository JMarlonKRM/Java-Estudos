package Orientadoobjeto.Composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAlunos(aluno1);
        curso1.adicionarAlunos(aluno2);

        curso2.adicionarAlunos(aluno1);
        curso2.adicionarAlunos(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        // adição bidimensional adicionando tanto um aluno em um curso quanto um curso em um aluno
        // posso fazer um foreach para circular entre os cursos

        for (Aluno aluno: curso1.alunos){
            System.out.printf("Estou matriculado no %s, e meu nome é %s\n",curso1.nome, aluno.nome);
            // aqui no foreach vc pode ir alterando o curso pra poder ver quais alunos estão em quais cursos
        }

        System.out.println(aluno1.cursos.get(0).alunos); // isso aqui nao entendi muito bem nao
        // aqui eu peguei um aluno o "aluno1" depois eu peguei os cursos desse aluno ".cursos" dps peguei o primeiro curso " get(0)"
        //dps eu peguei todos os outros alunos desse curso o ".alunos"

        Curso cursoEncontrado = aluno1.ObterCursoPorNome("Java Completo");
        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }
}
