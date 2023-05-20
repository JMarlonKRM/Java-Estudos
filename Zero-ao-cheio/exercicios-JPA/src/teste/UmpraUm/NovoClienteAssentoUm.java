package teste.UmpraUm;

import infra.DAO;
import modelo.UmpraUm.Assento;
import modelo.UmpraUm.Cliente;

public class NovoClienteAssentoUm {
    public static void main(String[] args) {

//        Assento assento = new Assento("16C");
//        Cliente cliente = new Cliente("Anna", assento);

//        Assento assento = new Assento("8C");
//        Cliente cliente = new Cliente("Carlos", assento);

        Assento assento = new Assento("23C");
        Cliente cliente = new Cliente("Bia", assento);


        DAO<Object> dao = new DAO<>();
        dao.abrirTST().incluir(assento)
                .incluir(cliente).fecharTST().fechar();
    }
}
