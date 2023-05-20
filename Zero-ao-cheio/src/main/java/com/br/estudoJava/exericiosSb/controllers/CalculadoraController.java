package com.br.estudoJava.exericiosSb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {


//desafio que foi passado pelo professor era criar dois metodo que com base nos valores passados na URL ele faria
    // uma operação matematafica (Concluido) 
    
    
    
    //calculadora/somar/10/20
    //calculadora/sub?n1=20&n2=10


    @GetMapping("/{n1}/{n2}")
    public int Somar(@PathVariable int n1, @PathVariable int n2){
        int soma = n1 + n2;
        return soma;
    }

    @GetMapping
    public int Subtrair(@RequestParam (name = "n1") int n1,@RequestParam (name = "n2") int n2){
        int sub = n1 - n2;
        return sub;
    }

    // resposta do professor (abaixo)

    //calculadora/sooamr/10/20
    @GetMapping("/somar/{a}/{b}")
    public int somarp (@PathVariable int a,@PathVariable int b){
        return a + b;
    }

    //calculadora/subtrair?a=20&b=10
    @GetMapping("/subtrair")
    public int subtrairp (@RequestParam(name = "a") int a,@RequestParam(name = "b") int b){
        return a -b;
    }

}
