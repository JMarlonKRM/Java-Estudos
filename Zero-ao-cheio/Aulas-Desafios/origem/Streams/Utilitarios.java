package Streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    public final static UnaryOperator<String> Maiuscula =
            n -> n.toUpperCase();
    public final static UnaryOperator<String> PrimeiraLetra =
            n -> n.charAt(0) + "";
    public final static  String Grito (String n){
        return  n + "!!!";
    }

}
