package com.br.estudoJava.exericiosSb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @GetMapping(path = {"/Ola","/saudacao"})
    public String Ola(){
        return "Olá usando Spring";
    }
}
