package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //offer e add -->> os dois adicionam elementos a fila
        //Diferença é o comportamento quando a fila esta cheia

        fila.add("Ana");//retorna falso
        fila.offer("Bia");//lança uma exceção
        fila.add("Carlos");
        fila.offer("Danieel");
        fila.add("rafaela");
        fila.offer("Gui");

        // peek e element -->> obter o proximo elemento da fila (sem remover)
        // a diferença do comportamento ocorre quando a fila esta vazia
        System.out.println(fila.peek());
        System.out.println(fila.peek());//retorna null
        System.out.println(fila.element());//lança uma exceção
        System.out.println(fila.element());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();

        // poll e remove -->> obter o proximo elemento da fila e remove
        // diferença é o comportamento quando a fila esta vazia
        System.out.println(fila.poll());// retorna null
        System.out.println(fila.remove());// lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains(...);


    }
}
