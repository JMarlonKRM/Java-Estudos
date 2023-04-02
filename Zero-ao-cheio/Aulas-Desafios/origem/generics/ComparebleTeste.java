package generics;

import java.util.TreeSet;

//esclarecendo uma questão apenas. Uma questão que foi passada em aula sobre metodo de uso TreeSet e ai foi.
public class ComparebleTeste {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(123);
        nums.add(-13);

        for(Integer n : nums){
            System.out.println(n);
        }
        // serve para mostrar primeiro o menor valor, pensar e fazer exemplos dps 

    }
}
