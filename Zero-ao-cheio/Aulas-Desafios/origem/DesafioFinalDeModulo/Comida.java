package DesafioFinalDeModulo;


public class Comida {
    String nomeComida;
    double pesoComida;


    Comida (){}


    Comida (String nomeComida,double pesoComida){
        this.nomeComida = nomeComida;
        this.pesoComida = pesoComida;
    }

    String comidaFormatada(){
        return String.format("Comida = %s\nPeso do Prato = %2f\n",this.nomeComida,this.pesoComida);
    }
    // pode ser feito o metodo de "comer" aqui dentro ao inves dentro do main

    //void comer(Comida comida){
     //   if(comida != null){
      //      this.pesoComida += comida.pesoComida;
       // }

    //}
}
