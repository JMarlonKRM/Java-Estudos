package generics;

public class ParesTeste{
    public static void main(String[] args) {

        Pares<Integer, String> ResultadoConcurso = new Pares<>();
        ResultadoConcurso.Adicionar(1, "Marlon");
        ResultadoConcurso.Adicionar(2, "Maria");
        ResultadoConcurso.Adicionar(3, "Ana");
        ResultadoConcurso.Adicionar(4, "Juliane");
        ResultadoConcurso.Adicionar(2, "João");


        System.out.println(ResultadoConcurso.getValor(1));
        System.out.println(ResultadoConcurso.getValor(2));// mudou!!!



        // Deu um erro : Exception in thread "main" java.lang.ClassCastException: class generics.Par cannot be cast to class java.lang.Comparable (generics.Par is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        //	at java.base/java.util.TreeMap.getEntry(TreeMap.java:347)
        //	at java.base/java.util.TreeMap.containsKey(TreeMap.java:233)
        //	at java.base/java.util.TreeSet.contains(TreeSet.java:234)
        //	at generics.Pares.Adicionar(Pares.java:15)
        //	at generics.ParesTeste.main(ParesTeste.java:7)

        // Deve ser por eu ter usado o TreeSet.... mudando

    }
}
