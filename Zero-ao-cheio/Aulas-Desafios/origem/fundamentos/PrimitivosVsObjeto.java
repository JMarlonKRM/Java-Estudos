package fundamentos;

public class PrimitivosVsObjeto {
    public static void main(String[] args) {

        String s = new String("texto");
        s.toUpperCase();

        //Wrappers são vesões objeto dos tipos primitivos!!
        int a = 123;
        System.out.println(a);

    }
}
