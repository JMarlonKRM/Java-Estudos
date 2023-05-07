package jdbc;

public class Pessoa {

    private int Codigo;
     private String nome;

    public Pessoa(int id, String nome) {
        this.Codigo = id;
        this.nome = nome;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
