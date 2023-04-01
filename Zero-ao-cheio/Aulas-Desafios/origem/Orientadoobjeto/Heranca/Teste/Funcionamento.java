package Orientadoobjeto.Heranca.Teste;

import Orientadoobjeto.Heranca.Desafio.Carro;
import Orientadoobjeto.Heranca.Desafio.Fiat147;
import Orientadoobjeto.Heranca.Desafio.Subaru;

import java.sql.SQLOutput;

public class Funcionamento {
    public static void main(String[] args) {

        Carro C1 = new Fiat147();
// Posso fazer tambem um Fiat147 C1 = new Fiat147();
        System.out.println("Velocidade do Fiat 147 spazio");
        C1.Acelerar();
        System.out.println(C1);

        C1.Acelerar();
        System.out.println(C1);

        C1.Acelerar();
        C1.Acelerar();
        C1.Acelerar();
        C1.Acelerar();
        C1.Acelerar();
        C1.Acelerar();
        C1.Acelerar();
        C1.Acelerar();
        System.out.println(C1);
// ----------------------------------------------------------------------------------------------
        System.out.println("Velocidade do Subaru");
        Subaru C2 = new Subaru();

        C2.Acelerar();
        System.out.println(C2);

        C2.Acelerar();
        C2.Frear();
        System.out.println(C2);
        C2.LigarTurbo();
        System.out.println(C2);
        C2.LigarAr();

        System.out.println(C2.VelocidadeDoAr());
        System.out.println(C2);

        C2.Acelerar();
        C2.DesligarAr();
        C2.DesligarTurbo();
        System.out.println(C2);




    }
}
