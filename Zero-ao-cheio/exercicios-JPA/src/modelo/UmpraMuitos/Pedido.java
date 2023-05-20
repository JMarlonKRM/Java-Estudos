package modelo.UmpraMuitos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date data;
    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY) // esse é o valor default
    private List<ItemPedido> itens;

    public Pedido() {
        this(new Date());
    }

    public Pedido(Date data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
