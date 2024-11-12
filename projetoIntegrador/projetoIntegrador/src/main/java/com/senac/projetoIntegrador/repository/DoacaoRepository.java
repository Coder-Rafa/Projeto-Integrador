package com.senac.projetoIntegrador.repository;

import com.senac.projetoIntegrador.model.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoacaoRepository extends JpaRepository<Doacao, Integer> {
    
}
