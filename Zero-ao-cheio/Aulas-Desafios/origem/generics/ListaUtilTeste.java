package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {

        System.out.println("Teste tendo que declarar duas vezes:");
        List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        String UltimaLingaguem1 = (String) ListaUtil.getListaUtil1(langs);
        System.out.println(UltimaLingaguem1);

        Integer UltimoNumero1 = (Integer) ListaUtil.getListaUtil1(nums);
        System.out.println(UltimoNumero1);

        System.out.println("Teste tendo que declarar uma vez: ");

        String UltimaLinguagem2 = ListaUtil.getListaUtil2(langs);
        System.out.println(UltimaLinguagem2);

        Integer UltimoNumero2 = ListaUtil.getListaUtil2(nums);
//      Integer UltimoNumero2 = ListaUtil.<Integer>getListaUtil2(nums);  // esse funciona sendo mais especifico ainda, criando um laço
        System.out.println(UltimoNumero2);

        //mesmo resultado, perfeito...
    }
}
