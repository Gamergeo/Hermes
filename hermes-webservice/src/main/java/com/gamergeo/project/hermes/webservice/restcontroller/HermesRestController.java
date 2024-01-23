package com.gamergeo.project.hermes.webservice.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hermes")
public class HermesRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    // Ajoutez d'autres méthodes pour gérer d'autres endpoints
}
