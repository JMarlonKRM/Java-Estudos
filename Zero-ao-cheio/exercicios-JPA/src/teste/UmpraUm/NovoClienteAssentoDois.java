package teste.UmpraUm;

import infra.DAO;
import modelo.UmpraUm.Assento;
import modelo.UmpraUm.Cliente;

public class NovoClienteAssentoDois {
    public static void main(String[] args) {


        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Rodigo", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);

        dao.incluirAtomico(cliente);
    }
}
