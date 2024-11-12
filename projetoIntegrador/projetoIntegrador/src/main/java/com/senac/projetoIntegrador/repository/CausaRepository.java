package com.senac.projetoIntegrador.repository;

import com.senac.projetoIntegrador.model.Causa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CausaRepository extends JpaRepository<Causa, Integer> {
    
}
