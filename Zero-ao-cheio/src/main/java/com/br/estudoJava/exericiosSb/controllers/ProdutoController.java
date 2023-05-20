package com.br.estudoJava.exericiosSb.controllers;

import com.br.estudoJava.exericiosSb.model.Entities.Produto;
import com.br.estudoJava.exericiosSb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/API/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

//    @PostMapping
//    public @ResponseBody Produto novoProduto(@Valid Produto produto){
//
//        produtoRepository.save(produto);
//        return produto;
//    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto SalvarProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos(){ //não é a melhor forma pq pode derrubar tudo
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome){
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }

//    @GetMapping(path = "/paginas/{numeroPagina}")
//    public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdPaginas){
//        if(qtdPaginas > 5) qtdPagionas = 5;
//        Pageable page = PageRequest.of(numeroPagina,qtdPaginas);
//        return produtoRepository.findAll(page);
//    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorID(@PathVariable int id){
        return produtoRepository.findById(id);
    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto){
//        produtoRepository.save(produto);
//        return produto;
//    }

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}

//Então, isso é incompatibilidade de versões. Acontece que,
// a partir do Spring 3.0.* o PagingAndSortingRepository não extends mais o CrudRepository
// e por isso está gerando esse erro. Sugiro que você use alguma versão anterior para resolver esse problema,
// por exemplo a 2.7.9. Ou então você manualmente extends as duas interfaces.
// Ambas soluções solucionará o seu erro,
// se for dar downgrade você precisará trocar o import do @Valid também.

//POR ISSO DEIXEI O METODO QUE OBTEM POR PAGINA MARCADO COMO COMENTARIO
