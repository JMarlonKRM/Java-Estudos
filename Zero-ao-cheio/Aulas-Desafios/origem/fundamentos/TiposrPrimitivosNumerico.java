package fundamentos;

public class TiposrPrimitivosNumerico {
    public static void main(String[] args) {

        double a = 1;
        System.out.println(a);
        // converte de inteiro pra double 1.0

        float b = (float) 1.0;
        //vc precisa indicar diretamente pro java que vc quer converter de double pra float

        int c = 130;
        byte d = (byte) c;
        System.out.println(d);
        //esse tipo de conversão vc precisa ter noção do alcance que a variavel dale

        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);
        // aqui é embaçado pq ele nao arredonda ele dale de uma lapada


    }
}
