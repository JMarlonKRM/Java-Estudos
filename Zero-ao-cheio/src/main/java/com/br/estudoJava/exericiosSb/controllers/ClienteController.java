package com.br.estudoJava.exericiosSb.controllers;


import com.br.estudoJava.exericiosSb.model.Entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente ObterCliente (){
        return new Cliente(28,"Pedro"," 123.456.789-01");
    }

    @GetMapping("/{id}")
    public Cliente ObterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Maria", "111.111.111-01");
    }

    @GetMapping
    public Cliente ObterClientePOrId2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id,"José Victor", "222.222.222-02");
    }

}
