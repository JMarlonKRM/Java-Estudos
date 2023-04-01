package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionario


        //Tipos numericos  inteiros
        byte AnosDeEmpresa = 23;
        short NumeroDeVoos = 542;
        int id = 56789;
        long PontosAcumulados = 3_134_845_223L; // para que possa ser inserido em um long e necessario o "L" pq se nao ele tenta colocar em um inteiro e passa da capacidade dele

        //Tipos numeros reais
        float salario = 11_455.44F; // precisa do "F" pq o java usa por padrao em double e nao em float
        double VendasAcumuladas = 2_99_797_103.01;

        //tipo booleano
        boolean EstaDeFerias = false; //true

        // tipo caractere
        char status ='A'; // suporta apenas uma letra ou qualquer coisa

        // Dias de empresa
        System.out.println(AnosDeEmpresa *265);

        //numero de viagens
        System.out.println(NumeroDeVoos /2);

        //pontos por real
        System.out.println(PontosAcumulados / VendasAcumuladas);

        //ativo ou nao ?
        System.out.println("Status : "+status);


    }
}
