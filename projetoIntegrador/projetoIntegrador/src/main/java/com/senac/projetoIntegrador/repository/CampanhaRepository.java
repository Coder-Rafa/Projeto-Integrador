package com.senac.projetoIntegrador.repository;

import com.senac.projetoIntegrador.model.Campanha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampanhaRepository extends JpaRepository<Campanha, Integer> {
    
}
