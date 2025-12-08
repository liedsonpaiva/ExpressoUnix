package com.johnwilliam.ExpressoUnix.Repositories.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.johnwilliam.ExpressoUnix.Models.CompraModels;

import java.util.List;

@Repository
public interface CompraJPA extends JpaRepository<CompraModels, Long> {
    
    // Métodos de consulta personalizados
    List<CompraModels> findByIdPassageiro(Long idPassageiro);
    
    List<CompraModels> findByStatusPagamento(com.johnwilliam.ExpressoUnix.Enums.StatusPagamento statusPagamento);
    
    List<CompraModels> findByMetodoPagamento(com.johnwilliam.ExpressoUnix.Enums.MetodoPagamento metodoPagamento);
}