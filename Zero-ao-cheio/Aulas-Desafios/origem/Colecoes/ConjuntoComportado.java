package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        SortedSet<String > listaAprovados = new TreeSet<>(); // o treeset deixa de maneira ordenada
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String Candidatos: listaAprovados) {
            System.out.println(Candidatos);
        }
        Set<Integer > nums = new HashSet<>(); // nao deixa ordanado vai tudo baguçado
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(300);

        for (int n:nums) { // aqui aceita inteiro pq ele sozinho ja converte de obj pra primitivo inteiro
            System.out.println(n);
        }
        // eu nao faço ideia do pq ta indo organizado (pesquisar dps )



    }
}
