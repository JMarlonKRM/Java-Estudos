package modelo.UmpraUm;

import javax.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @OneToOne(mappedBy = "assento")
    private Cliente cliente;

    public Assento() {}

    public Assento(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
