package generics;

import java.util.*;

public class Pares <C extends Number,V>{
//    private final SortedSet<Par<C,V>> itens = new TreeSet<>();

    private final Set<Par<C,V>> itens = new LinkedHashSet<>();

    public void Adicionar(C chave, V valor){
        if (chave == null) return; // usando o return desse modo ele so vai fechar a operação

        Par<C,V> NovoPar = new Par(chave, valor); // adicionar Par<C,V> se ele pedir para definir o tipo, no exemplo do professor precisou

        if(itens.contains(NovoPar)){
            itens.remove(NovoPar);
        }
        itens.add(NovoPar);
    }
    public V getValor (C chave){
        if (chave == null) return null;
        Optional<Par<C,V>> parOptional = itens.stream()
                .filter(p -> chave.equals(p.getChave()))
                .findFirst();

        return parOptional.isPresent()
                ? parOptional.get().getValor() : null;
    }

}
