package com.br.estudoJava.exericiosSb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHTTPController {

    @GetMapping
    public String get (){
        return "Requisição GET";
    }

    @PostMapping
    public String post (){
        return "Requisição POST";
    }

    @PutMapping
    public String put (){
        return "Requisição PUT";
    }

    @PatchMapping
    public String patch (){
        return "Requisição PATCH";
    }

    @DeleteMapping
    public String delete (){
        return "Requisição DELETE";
    }
}
