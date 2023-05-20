package infra;

import modelo.base.Produto;

public class ProdutoDAO extends DAO<Produto>{

    public ProdutoDAO() {
        super(Produto.class);
    }
}
