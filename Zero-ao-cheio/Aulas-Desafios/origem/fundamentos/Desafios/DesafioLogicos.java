package fundamentos.Desafios;
public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true;
        boolean ComprouTv50 = trabalho1 && trabalho2;
        boolean ComprouTv32 = trabalho1 ^ trabalho2;
        boolean ComprouSorvete = trabalho1 || trabalho2;
        System.out.println("Comprou Tv 50\"? " + ComprouTv50);
        System.out.println("Comprou Tv 32\"? "+ ComprouTv32);
        System.out.println("Comprou Sorvete\"? " + ComprouSorvete);
        System.out.println("mais saudavel ?"+ !ComprouSorvete);


    }
}
