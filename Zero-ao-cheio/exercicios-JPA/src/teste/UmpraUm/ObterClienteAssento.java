package teste.UmpraUm;

import infra.DAO;
import modelo.UmpraUm.Assento;
import modelo.UmpraUm.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {

        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.ObterPOrID(1L);

        System.out.println(cliente.getAssento().getNome());
        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.ObterPOrID(4L);

        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();


    }
}
