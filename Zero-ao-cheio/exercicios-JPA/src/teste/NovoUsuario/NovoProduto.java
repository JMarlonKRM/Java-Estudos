package teste.NovoUsuario;

import infra.DAO;
import modelo.base.Produto;

public class NovoProduto {
    public static void main(String[] args) {

        DAO< Produto> dao = new DAO<>(Produto.class);

//        Produto produto = new Produto("Caneta", 7.45);
//        dao.abrirTST().incluir(produto).fecharTST().fechar();

//        Produto produto = new Produto("Notebook", 2987.78);
//        dao.incluirAtomico(produto).fechar();

        Produto produto = new Produto("Monitor 23", 789.98);
        dao.incluirAtomico(produto).fechar();

        System.out.println("Id do produto: "+ produto.getId());
    }
}
