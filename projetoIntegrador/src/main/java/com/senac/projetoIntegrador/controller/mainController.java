package com.senac.projetoIntegrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping("/login")
    public String exibirLogin() {
        return "login";
    }
    
    @GetMapping("/cadastro")
    public String exibirCadastro() {
        return "cadastro";
    }
}
