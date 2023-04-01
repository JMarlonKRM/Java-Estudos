package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;
        System.out.println(condicao1 && condicao2); // tabela verdade E
        System.out.println(condicao1 || condicao2); // tabela verdade OU
        System.out.println(condicao1 ^ condicao2); // tabela verdade XOR
        System.out.println(!condicao1); // tabela verdade NOT


    }

}
