public class Cliente {
    private static int NextId = 0;
    private int Id;
    private String Nome;
    private int CPF;
    private String Gmail;
    private int Senha;

    public Cliente(){}

    public Cliente(int id, String nome, int cpf, String gmail) {
        Id = id;
        Nome = nome;
        CPF = cpf;
        Gmail = gmail;
    }

    public Cliente(String nome, int senha){
        Id = ++NextId;
        Nome = nome;
        Senha = senha;
    }

    public String toString(){
        return String.format("(%d) %s", Id, Nome);
    }

    public static void UpdateNextID (int Id){
        NextId = Id;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public int getCPF() {
        return CPF;
    }

    public String getGmail() {
        return Gmail;
    }

    public int getSenha() {
        return Senha;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public void setSenha(int senha) {
        Senha = senha;
    }
}
