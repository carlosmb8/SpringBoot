package com.example.ejercicio1;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador1 {

    @GetMapping("{name}")
    public String holaMundo(@PathVariable String name){
        return "Hola Mundo: "+name;
    }

    @GetMapping
    public String holaMundo(){
        return "Hola Mundo";
    }

    @PostMapping
    public Persona holaMundoPost(@RequestBody Persona persona)
    {
        persona.setComentario("Hola mundo simple post: "+persona.getNombre()+" edad: "+(persona.getEdad()+1)+" población: "+ persona.getPoblacion());
        return persona;
    }

}
