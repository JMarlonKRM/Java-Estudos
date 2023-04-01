package Orientadoobjeto.Abstrato;

public class MainAbstrata {
    public static void main(String[] args) {

        Mamifero VLata = new Cachorro();

        System.out.println(VLata.Mover());
        System.out.println(VLata.Respirar());
        System.out.println(VLata.Mamar());
    }
}
