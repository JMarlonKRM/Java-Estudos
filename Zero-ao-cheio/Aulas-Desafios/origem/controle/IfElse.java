package controle;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Infomre Um valor: ");
        int numero = Integer.parseInt(valor);
        if (numero % 2 == 0){
            System.out.println("Esse numero e par!!!");
        }
        else{
            System.out.println("esse numero e impar!!");
        }
    }
}
