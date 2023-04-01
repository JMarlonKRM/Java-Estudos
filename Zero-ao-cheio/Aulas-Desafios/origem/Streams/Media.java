package Streams;

public class Media {

    private double total;
    private int quantidade;

    public Media Adicionar(double Valor){
        total += Valor;
        quantidade++;
        return this;
    }
    public double getValor (){
        return total / quantidade;
    }
    public static Media Combinar(Media m1, Media m2){
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.quantidade = m1.quantidade + m2.quantidade;
        return resultante;
    }
}
