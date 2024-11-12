package com.senac.projetoIntegrador.service.UsuarioService;

import com.senac.projetoIntegrador.model.Causa;
import com.senac.projetoIntegrador.repository.CausaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CausaService {
    @Autowired
    CausaRepository causaRepository;
    
    public Causa getCausaid(int causaId) {
        return causaRepository.findById(causaId).orElse(null);
    }
    
    public List<Causa> listarTodasCausas() {
        return causaRepository.findAll();
    }
}
