package com.johnwilliam.ExpressoUnix.Facade;

import java.util.List;
import org.springframework.stereotype.Component;

import com.johnwilliam.ExpressoUnix.Applications.CompraApplication;
import com.johnwilliam.ExpressoUnix.Enums.MetodoPagamento;
import com.johnwilliam.ExpressoUnix.Enums.StatusPagamento;
import com.johnwilliam.ExpressoUnix.Models.CompraModels;

@Component
public class CompraFacade {
    
    private final CompraApplication compraApplication;

    public CompraFacade(CompraApplication compraApplication) {
        this.compraApplication = compraApplication;
    }

    public void createCompra(CompraModels compra) {
        compraApplication.createCompra(compra);
    }

    public CompraModels getCompraById(long id) {
        return compraApplication.getCompraById(id);
    }

    public List<CompraModels> getAllCompra() {
        return compraApplication.getAllCompra();
    }

    public void updateCompra(CompraModels compra) {
        compraApplication.updateCompra(compra);
    }

    public void deleteCompra(long id) {
        compraApplication.deleteCompra(id);
    }

    // Métodos de consulta personalizados
    public List<CompraModels> getComprasByPassageiro(Long idPassageiro) {
        return compraApplication.getComprasByPassageiro(idPassageiro);
    }

    public List<CompraModels> getComprasByStatus(StatusPagamento statusPagamento) {
        return compraApplication.getComprasByStatus(statusPagamento);
    }

    public List<CompraModels> getComprasByMetodoPagamento(MetodoPagamento metodoPagamento) {
        return compraApplication.getComprasByMetodoPagamento(metodoPagamento);
    }

    // Métodos de negócio
    public void confirmarPagamento(long idCompra) {
        compraApplication.confirmarPagamento(idCompra);
    }

    public void cancelarPagamento(long idCompra) {
        compraApplication.cancelarPagamento(idCompra);
    }
}