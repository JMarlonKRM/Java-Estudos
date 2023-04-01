package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String > usuarios = new HashMap<>();

        // aqui nao é o adicionar add e nem os convencionais aqui é só o put pra adicionar ou alterar/ substituir
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo");
        usuarios.put(1, "Ricardo");

        System.out.println(usuarios.size()); // por conta de nao ser permitido repetições fica como 1 apenas
        usuarios.clear();

        usuarios.put(1, "Roberto");
        usuarios.put(3, "Ricardo");
        usuarios.put(20, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size()); // mostra quantidade de elementos
        System.out.println(usuarios.isEmpty()); // diz se esta vazio ou nao (vazio = true) (tem elemento = false)

        System.out.println(usuarios.keySet()); // retorna o conjunto de chaves e nao mantem a ordenado
        System.out.println(usuarios.values()); // retorna apenas os valores
        System.out.println(usuarios.entrySet()); // retorna chave e valor junto

        System.out.println(usuarios.containsKey(20)); // verifica se contem a chave
        System.out.println(usuarios.containsValue("Rebeca")); // verifica se contem o valor

        System.out.println(usuarios.get(20)); // obtem a chava atraves da chave
        System.out.println(usuarios.remove(1)); // remove atraves da chave
        System.out.println(usuarios.remove(4, "Gui")); // remove atraves da chave e do valor se um dos dois nao estiver correto ele apenas retorna o valor e o elemento original

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for (String Valor: usuarios.values()){
            System.out.println(Valor);
        }
        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey()+ " ==> ");
            System.out.println(registro.getValue());
        }
    }
}
