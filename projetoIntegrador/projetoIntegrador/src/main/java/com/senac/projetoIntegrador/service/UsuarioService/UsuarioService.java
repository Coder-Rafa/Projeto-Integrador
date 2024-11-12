package com.senac.projetoIntegrador.service.UsuarioService;

import com.senac.projetoIntegrador.model.Usuario;
import com.senac.projetoIntegrador.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public Usuario criarUsuario(Usuario user) {
        user.setId(0);
        usuarioRepository.save(user);
        return user;
    }
    
    public Usuario getUsuarioid(int userId) {
        return usuarioRepository.findById(userId).orElse(null);
    }
    
    public List<Usuario> listarTodosUsuarios() {
        return usuarioRepository.findAll();
    }
}
