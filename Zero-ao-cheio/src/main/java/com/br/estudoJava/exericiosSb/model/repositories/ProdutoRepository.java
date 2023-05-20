package com.br.estudoJava.exericiosSb.model.repositories;

import com.br.estudoJava.exericiosSb.model.Entities.Produto;
import org.springframework.data.repository.CrudRepository;    //PagingAndSortingRepository

// anotação pessoal: CRUD (C)reat, (R)ead, (U)pdate, (D)elete

public interface ProdutoRepository extends CrudRepository<Produto, Integer> { //

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
    
}
//Então, isso é incompatibilidade de versões. Acontece que,
// a partir do Spring 3.0.* o PagingAndSortingRepository não extends mais o CrudRepository
// e por isso está gerando esse erro. Sugiro que você use alguma versão anterior para resolver esse problema,
// por exemplo a 2.7.9. Ou então você manualmente extends as duas interfaces.
// Ambas soluções solucionará o seu erro,
// se for dar downgrade você precisará trocar o import do @Valid também.