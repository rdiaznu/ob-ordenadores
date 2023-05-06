package com.example.obordenadoresejercicios456.controlador;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${app.message}")
    String message;
    @GetMapping("/holaMundo")
    public String holaMundo(){
        System.out.println(message);
        return "Buenos días queridos humanos!!!!!!";
    }
}
