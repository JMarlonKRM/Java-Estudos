package teste.MuitospraMuitos;

import infra.DAO;
import modelo.MuitospraMuitos.Ator;
import modelo.MuitospraMuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filme filmeA = new Filme("Star Wars Ep 4", 8.9);
        Filme filmeB = new Filme("O Fugitivo", 8.1);

        Ator atorA = new Ator("Harrison Ford");
        Ator atrizB = new Ator("Carrie Fisher");

        filmeA.AdicionarAtor(atorA);
        filmeA.AdicionarAtor(atrizB);

        filmeB.AdicionarAtor(atorA);

        DAO<Filme> dao = new DAO<>();
        dao.incluirAtomico(filmeA);
    }
}
