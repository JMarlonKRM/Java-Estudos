package Execao;
// vamos ver tratamentos de erro....


public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;
        try {
            ImprimirNomeDoAluno(a1);
        } catch(Exception execao){
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário ");
        }
        try{
            System.out.println(7 / 0);
        } catch(ArithmeticException e){
            System.out.println("Ocorreu um erro em: "+ e.getMessage());
        }

        System.out.println("fim...");
    }

    public static void ImprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
