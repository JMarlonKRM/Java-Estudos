package modelo.consulta;

import infra.DAO;


public class ObterMediadosFilmes {
    public static void main(String[] args) {

        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("obtermediaGeraldosFilmes");

        System.out.println(nota.getMedia());

        dao.fechar();
    }
}
