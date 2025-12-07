package com.johnwilliam.ExpressoUnix.Repositories;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.johnwilliam.ExpressoUnix.Enums.MetodoPagamento;
import com.johnwilliam.ExpressoUnix.Enums.StatusPagamento;
import com.johnwilliam.ExpressoUnix.Models.CompraModels;
import com.johnwilliam.ExpressoUnix.Repositories.JPA.CompraJPA;

@Repository
public class CompraRepository {
    
    private final CompraJPA compraJPA;

    public CompraRepository(CompraJPA compraJPA) {
        this.compraJPA = compraJPA;
    }

    public void createCompra(CompraModels compra) {
        compraJPA.save(compra);
    }

    public CompraModels getCompraById(long id) {
        return compraJPA.findById(id).orElseThrow(
            () -> new RuntimeException("Compra não encontrada com id: " + id)
        );
    }

    public List<CompraModels> getAllCompra() {
        return compraJPA.findAll();
    }

    public void updateCompra(CompraModels compra) {
        compraJPA.save(compra);
    }

    public void deleteCompra(long id) {
        compraJPA.deleteById(id);
    }

    // Métodos de consulta personalizados
    public List<CompraModels> getComprasByPassageiro(Long idPassageiro) {
        return compraJPA.findByIdPassageiro(idPassageiro);
    }

    public List<CompraModels> getComprasByStatus(StatusPagamento statusPagamento) {
        return compraJPA.findByStatusPagamento(statusPagamento);
    }

    public List<CompraModels> getComprasByMetodoPagamento(MetodoPagamento metodoPagamento) {
        return compraJPA.findByMetodoPagamento(metodoPagamento);
    }
}