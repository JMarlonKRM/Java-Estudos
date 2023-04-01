package Execao.PersonalizadaA;

import Execao.Aluno;

public class TesteValidar {
    public static void main(String[] args) {

        try{
            Aluno aluno = new Aluno("Ana",7);
            Validar.aluno(aluno);

            Validar.aluno(null);
        } catch(StringVaziaException e) {
            System.out.println(e.getMassage());
        } catch(NumerosForaDeIntervaloException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim...");
    }
}
