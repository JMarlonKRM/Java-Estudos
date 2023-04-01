package Orientadoobjeto.Abstrato;

public abstract class Mamifero extends Animal{

    public abstract String Mamar();

    @Override
    public String Respirar() {
        return "Usando Oxigênio";
    }


    //eu posso ou nao implementar os metodos da classe abstrata animal, ou eu posso deixar para a proxima sub concreta
}
