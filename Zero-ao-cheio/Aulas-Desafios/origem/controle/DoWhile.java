package controle;


import java.util.Scanner;

public class DoWhile {
   public static void main(String[] args) {
       String  texto = "";
       Scanner input = new Scanner (System.in);
       do{
          System.out.println("Diga a palavrinha magica");
          System.out.print("Quer sair ?");
          texto = input.nextLine();
       }while(!texto.trim().equalsIgnoreCase("por favor"));
       input.close();
   }

}