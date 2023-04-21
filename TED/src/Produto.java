import com.google.gson.annotations.SerializedName;

public class Produto {
    private static int NextId = 0;

    @SerializedName("id")
    public int Id ;
    @SerializedName("descricao")
    public String Descriçao;
    @SerializedName("quantidade")
    public int Quantidade ;
    @SerializedName("valor")
    public double Valor ;
    @SerializedName("ativo")
    public boolean Ativo ;

    public Produto(){}

    public Produto( String descricao, double valor){
        Id = ++NextId;
        Descriçao = descricao;
        Quantidade = 0;
        Valor = valor;
        Ativo = true;
    }

    public String toString(){
        return String.format("( %d )  ( %s ): %d unidade à R$%.2f", Id, Descriçao, Quantidade, Valor);
    }

    public static void UpdateNextId (int Id){
        NextId = Id;
    }

    public int getId() {
        return Id;
    }
    public String getDescriçao() {
        return Descriçao;
    }
    public int getQuantidade() {
        return Quantidade;
    }
    public double getValor() {
        return Valor;
    }
    public boolean isAtivo() {
        return Ativo;
    }


    public void setId(int id) {
        Id = id;
    }
    public void setDescriçao(String descricao) {
        Descriçao = descricao;
    }
    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
    public void setValor(double valor) {
        Valor = valor;
    }
    public void setAtivo(boolean ativo) {
        Ativo = ativo;
    }
}
