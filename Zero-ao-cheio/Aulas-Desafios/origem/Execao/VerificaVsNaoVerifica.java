package Execao;

public class VerificaVsNaoVerifica {
    public static void main(String[] args) {

        try{
            gerrarErro1();
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            gerrarErro2();
        } catch(Throwable e){
            System.out.println(e.getMessage());
        }


        System.out.println("Fim...");
    }
//  EXCEÇÃO NÃO CHECADA OU NÃO VERIFICADA
    static void gerrarErro1 (){
        throw new RuntimeException("Ocorreu um erro aqui #01");
    }
// EXCEÇÃO CHECADA OU VERIFICADA
    static void gerrarErro2 () throws Exception {
        throw new Exception("Ocorreu um erro aqui #02");
    }

}
