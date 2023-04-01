package controle;

import java.util.Locale;

public class SwithSemBreak {
    public static void main(String[] args) {

        String faixa = "laranja";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o basssai-dai");
            case "marrom":
                System.out.println("Sei o Tekkei shoudan");
            case "roxa":
                System.out.println("Sei o heian Godan");
            case "verde":
                System.out.println("Sei o heian Yodan");
            case "laranja":
                System.out.println("Sei o heian Sandan");
            case "Vermelha":
                System.out.println("Sei o heian Nidan");
            case "amarelo":
                System.out.println("Sei o heian Shodan");
            //default:
                //System.out.println("Nao sei de nada");








        }
    }
}
