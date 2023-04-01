package Orientadoobjeto.Abstrato;

public class Cachorro extends Mamifero{

    @Override
    public String Mover() {
        return "Usando as patas";
    }

    @Override
    public String Mamar() {
        return "Usando Leite";
    }
    // aqui eu sou obrigado a usar os metodos que foram criados nas super classes abstratas anteriores
}
