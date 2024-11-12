package com.senac.projetoIntegrador.controller;

import com.senac.projetoIntegrador.model.Usuario;
import com.senac.projetoIntegrador.service.UsuarioService.UsuarioService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {
    UsuarioService usuarioService;
    
    @GetMapping("/login")
    public String exibirLogin() {
        return "login";
    }
    
    @GetMapping("/cadastro")
    public String exibirCadastro() {
        return "cadastro";
    }
    
    @PostMapping("/cadastro")
    public ModelAndView cadastrar(@ModelAttribute Usuario usuario) {
        usuarioService.criarUsuario(usuario);
        return new ModelAndView("redirect:/login");
    }
    
    @PostMapping("/login")
    public String logar(@ModelAttribute Usuario usuario) {
        List<Usuario> usuarios = usuarioService.listarTodosUsuarios();
        for (Usuario user : usuarios) {
            if (usuario.getEmail().equals(user.getEmail()) && usuario.getSenha().equals(user.getSenha())) {
                return "info";
            }
        }
        return "login";
    }
}
