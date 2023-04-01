package classe;

public class Usuario {
    // essa classe so ta sendo usada para o equals hashecode

    String nome;
    String Email;
    //usando o construtor padrao mesmo

    // agora eu vou definir um criterio pro equals
    // dps que eu definir esse criterio la no EqualsHashcode vai da true

    public boolean equals(Object objeto){
        if(objeto instanceof Usuario){

            Usuario outro = (Usuario) objeto;
            boolean NomeIgual = outro.nome.equals(this.nome);
            boolean EmailIgual = outro.Email.equals(this.Email);

            return NomeIgual && EmailIgual;

        }else{
            return false;
        }
    }

    // o hashcode vai ser implantado dps ainda
}
