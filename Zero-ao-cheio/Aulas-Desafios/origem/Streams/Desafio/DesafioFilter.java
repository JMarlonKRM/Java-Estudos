package Streams.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
/*
        Desafio: Tirarmos da nossa criatividade um desafio novo apenas usando duas regras solicitadas pelo professor
        1. Deve ter Dois Filtros
        2. Esses filtros não podem ser em conjunto tem que ficar separados
 */
    public static void main(String[] args) {

        ChampFilter LOL1 = new ChampFilter("Jax", 2009, true);
        ChampFilter LOL2 = new ChampFilter("Fiora", 2012, true);
        ChampFilter LOL3 = new ChampFilter("Amumu", 2009, false);
        ChampFilter LOL4 = new ChampFilter("Kindred", 2015, false);
        ChampFilter LOL5 = new ChampFilter("Zed", 2012, true);
        ChampFilter LOL6 = new ChampFilter("Bardo", 2015, false);


        List<ChampFilter> Champs = Arrays.asList(LOL1,LOL2,LOL3,LOL4,LOL5,LOL6);

        Predicate<ChampFilter> Skills = S -> S.AnoLançamento >= 2010;
        Predicate<ChampFilter> Roubado = S -> S.Broken;
        Function<ChampFilter, String> Resultado =
                a -> "Parabéns Desenvolvedores do " + a.nomeCamp + " Ele é um Campeão desbalanceado ";

        Champs.stream()
                .filter(Skills)
                .filter(Roubado)
                .map(Resultado)
                .forEach(System.out::println);

    }
}
