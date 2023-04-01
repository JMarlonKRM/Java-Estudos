package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet(); // esse tipo de conjunto nao é ordenado e tudo zoado mesmo

        conjunto.add(1.2); //como ele nao aceita inteiros e nem nada desses primitivos ele converte sozinho
        conjunto.add(true); // de booleans para Booleans
        conjunto.add("Teste");
        conjunto.add(1);// converte de int pra Integer
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());
        conjunto.add("Teste"); // se vc tentar adicionar um mesmo valor ele nao aceita
        conjunto.add('x');
        System.out.println("Tamanho é " + conjunto.size());
        //removendo "itens" do conjunto

        System.out.println(conjunto.remove("teste")); // se tentar remover algo que nao tem no set ele vai devolver como falso
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("Tamanho é " + conjunto.size());// repare que o tamanho mudou

        // ver se contem no conjunto
        System.out.println(conjunto.contains('x')); // vai da falso pq removi o x do conjunto
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet(); // pode se usar nesse caso o Set mas vai ser explicado mais a frente
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        System.out.println(conjunto);
        // adicionar um conjutno dentro do outro
        //união entre dois conjunto
        conjunto.addAll(nums);
        System.out.println(conjunto); // quando um valor de um conjunto há em outro tambem ocorre o caso de existir somente um

        conjunto.retainAll(nums); // mostra o valor em comum
        System.out.println(conjunto);

        conjunto.clear(); // limpou todo o conjunto
        System.out.println(conjunto);
    }
}
