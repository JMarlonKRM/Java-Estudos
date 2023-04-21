import java.time.LocalDate;

public class Vendedor {
    public int Id;
    public String Nome;
    public int CPF;
    public char sexo;
    public LocalDate DataNascimento;
    public boolean Ativo;


    public Vendedor (){}

    public Vendedor(int Id, String Nome, int CPF, boolean Ativo){
        this.Id = Id;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Ativo = Ativo;
    }

    public String toString(){
        return String.format("(%d) %s", Id, Nome);
    }


    public int getId() {
        return Id;
    }

    public int getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }

    public char getSexo() {
        return sexo;
    }
    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public boolean isAtivo() {
        return Ativo;
    }
}
