package controle;

public class WhileDeterminado {
    public static void main(String[] args) {
        //designa uma variavel para definir como a estrutura vai funcionar e quantas vezes ela vai repetir
        int contador = 1;
        //aqui a cima defini uma variavel chamada contador que recebeu um numero o numero 10
        while(contador <= 10){
            // dentro dos parenteses e informado a contdição pela qual o programa vai funcionar
            // se a condição for verdadeira ele continua ate se tornar falsa se nunca for falsa ele nunca para
            System.out.println("bom dia");
            //aqui e a frase ou o conteudo do que que vai aparecer
            contador ++;
            //essa foi a condição para que quando a estrutura se tornar falsa ele pare e assim nao criando um loop infinito
            // posso tbm fazer com que a estrutura funcione nao contado de um em um mas sim de dois em dois ou outros valores
            // so mudar a condição pra tipo contador += 2; ai ele vai contar de dois me dois


            // 1=variavel 2=estrutura de controle 3=modificação da variavel


        }
    }
}
