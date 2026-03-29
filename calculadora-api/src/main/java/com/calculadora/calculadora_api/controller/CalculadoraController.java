package com.calculadora.calculadora_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    @GetMapping("/sumar/{valor1}/{valor2}")
    public String sumar(
            @PathVariable int valor1,
            @PathVariable int valor2
    ){
        int resultado = valor1 + valor2;
        return "" + resultado;
    }

    @GetMapping("/restar/{valor1}/{valor2}")
    public String restar(
            @PathVariable int valor1,
            @PathVariable int valor2
    ){
        int resultado = valor1 - valor2;
        return ""+ resultado;
    }
    @GetMapping("/div/{valor1}/{valor2}")
    public String div(
            @PathVariable int valor1,
            @PathVariable int valor2
    ){
        double resultado = (double) valor1 / valor2;
        if (valor2 == 0){
            return "No se puede dividir";
        }
        return ""+ resultado;
    }
    @GetMapping("/mult/{valor1}/{valor2}")
    public String mult(
            @PathVariable int valor1,
            @PathVariable int valor2
    ) {
        float resultado = valor1 * valor2;
        return "" + resultado;
    }

        @GetMapping("/exp/{valor1}/{valor2}")
    public String exp(
            @PathVariable int valor1,
            @PathVariable int valor2
    ){
        double resultado = Math.pow(valor1, valor2);
        return ""+ resultado;
    }
    @GetMapping("/sqrt/{valor1}")
    public String sqrt(
            @PathVariable int valor1

    ){
        double resultado = Math.sqrt(valor1);
        return ""+ resultado;
    }
/*
    @GetMapping("/fact/{valor1}")
    public String fact(
            @PathVariable int valor1

    ){
        double resultado = 0.0;
        double i;
        for (i=valor1-1; valor1==1 ; valor1--){
            resultado = (double)valor1 * i;
        }
        return ""+resultado;
    }

//resultado = 12 valor1=4 i=3
//resultado = valor1=
*/

}
