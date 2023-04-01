package controle.desafio02;

public class desafioFor {
    public static void main(String[] args) {
        for(String v = "#"; !v.equalsIgnoreCase("######"); v += "#"){
            System.out.println(v);
        }
    }
}
