package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {


        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> Aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> ApenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> CalcularMedia = (media, nota) -> media.Adicionar(nota);
        BinaryOperator<Media> CombinarMedia = (m1,m2) -> Media.Combinar(m1,m2);

        Media media = alunos.stream()
                .filter(Aprovado)
                .map(ApenasNota)
                .reduce(new Media (), CalcularMedia, CombinarMedia);

        System.out.println("A media de todos os alunos aprovados é: " + media.getValor());
    }
}
