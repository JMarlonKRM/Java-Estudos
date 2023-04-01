package Streams;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 = new Media().Adicionar(8.3).Adicionar(6.7);
        Media m2 = new Media().Adicionar(7.9).Adicionar(6.6);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.Combinar(m1,m2).getValor());

    }
}
