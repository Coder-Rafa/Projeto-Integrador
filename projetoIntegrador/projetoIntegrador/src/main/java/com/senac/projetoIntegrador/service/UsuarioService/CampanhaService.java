package com.senac.projetoIntegrador.service.UsuarioService;

import com.senac.projetoIntegrador.model.Campanha;
import com.senac.projetoIntegrador.repository.CampanhaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampanhaService {
    @Autowired
    CampanhaRepository campanhaRepository;
    
    public Campanha getCampanhaid(int campanhaId) {
        return campanhaRepository.findById(campanhaId).orElse(null);
    }
    
    public List<Campanha> listarTodasCampanhas() {
        return campanhaRepository.findAll();
    }
}
