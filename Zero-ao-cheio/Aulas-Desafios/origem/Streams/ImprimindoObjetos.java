package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> Aprovados = Arrays.asList("Lu", "Gui", "Ana", "Lia");

        System.out.println("Usando For...");
        for (int i = 0; i < Aprovados.size(); i++){   System.out.println(Aprovados.get(i));    }


        System.out.println("\nUsando Foreach...");
        for (String nome: Aprovados) {      System.out.println(nome);     }


        System.out.println("\nUsando Iterador...");
        Iterator<String> iterart = Aprovados.iterator();
        while(iterart.hasNext()){     System.out.println(iterart.next());       }


        System.out.println("\nUsando Stream...");
        Stream<String> stream = Aprovados.stream();
        stream.forEach(System.out::println); // Laço interno!! evita que voce trabalhe mais, criando e desenvolvendo os laços
    }
}
