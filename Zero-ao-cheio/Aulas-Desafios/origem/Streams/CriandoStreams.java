package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out :: print;
        Consumer<Integer> println = System.out :: println;

        Stream<String> Langs = Stream.of("Java ","Lua " ,"Js\n");
        Langs.forEach(print);

        String[] MaisLangs = {"Python ", "Lisp ", "Perl ", "Go\n "};

        Stream.of(MaisLangs).forEach(print);
        Arrays.stream(MaisLangs).forEach(print);
        Arrays.stream(MaisLangs, 1,3).forEach(print);

        List<String> OutrasLangs = Arrays.asList("\n C ", "PHP " , "Kotlin\n");
        OutrasLangs.stream().forEach(print);
        OutrasLangs.parallelStream().forEach(print);

//        Stream.generate(() -> "a").forEach(print);
//        Stream.iterate(0, n -> n + 1 ).forEach(println);

    }
}
