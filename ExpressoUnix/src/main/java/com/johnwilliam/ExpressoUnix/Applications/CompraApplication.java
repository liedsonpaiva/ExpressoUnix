package com.johnwilliam.ExpressoUnix.Applications;

import java.util.List;
import org.springframework.stereotype.Service;

import com.johnwilliam.ExpressoUnix.Entities.Compra;
import com.johnwilliam.ExpressoUnix.Enums.MetodoPagamento;
import com.johnwilliam.ExpressoUnix.Enums.StatusPagamento;
import com.johnwilliam.ExpressoUnix.Models.CompraModels;
import com.johnwilliam.ExpressoUnix.Repositories.CompraRepository;

@Service
public class CompraApplication {
    
    private final CompraRepository compraRepository;

    public CompraApplication(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    public void createCompra(CompraModels compraModel) {
        // Validações de negócio
        if (compraModel.getStatusPagamento() == null) {
            compraModel.setStatusPagamento(StatusPagamento.PENDENTE);
        }
        if (compraModel.getDataCompra() == null) {
            compraModel.setDataCompra(java.time.LocalDateTime.now());
        }
        compraRepository.createCompra(compraModel);
    }

    public CompraModels getCompraById(long id) {
        return compraRepository.getCompraById(id);
    }

    public List<CompraModels> getAllCompra() {
        return compraRepository.getAllCompra();
    }

    public void updateCompra(CompraModels compra) {
        compraRepository.updateCompra(compra);
    }

    public void deleteCompra(long id) {
        compraRepository.deleteCompra(id);
    }

    // Métodos de consulta personalizados
    public List<CompraModels> getComprasByPassageiro(Long idPassageiro) {
        return compraRepository.getComprasByPassageiro(idPassageiro);
    }

    public List<CompraModels> getComprasByStatus(StatusPagamento statusPagamento) {
        return compraRepository.getComprasByStatus(statusPagamento);
    }

    public List<CompraModels> getComprasByMetodoPagamento(MetodoPagamento metodoPagamento) {
        return compraRepository.getComprasByMetodoPagamento(metodoPagamento);
    }

    // Métodos de transformação
    public Compra transformModelToEntity(CompraModels compraModels) {
        Compra compra = new Compra();
        compra.setId(compraModels.getId());
        compra.setIdPassageiro(compraModels.getIdPassageiro());
        compra.setDataCompra(compraModels.getDataCompra());
        compra.setMetodoPagamento(compraModels.getMetodoPagamento());
        compra.setStatusPagamento(compraModels.getStatusPagamento());
        compra.setValorTotal(compraModels.getValorTotal());
        compra.setComprovantePagamentoUrl(compraModels.getComprovantePagamentoUrl());
        return compra;
    }

    public void transformEntityToModel(CompraModels compraModels, Compra compra) {
        compraModels.setIdPassageiro(compra.getIdPassageiro());
        compraModels.setDataCompra(compra.getDataCompra());
        compraModels.setMetodoPagamento(compra.getMetodoPagamento());
        compraModels.setStatusPagamento(compra.getStatusPagamento());
        compraModels.setValorTotal(compra.getValorTotal());
        compraModels.setComprovantePagamentoUrl(compra.getComprovantePagamentoUrl().toString());
    }

    // Métodos de negócio
    public void confirmarPagamento(long idCompra) {
        CompraModels compra = getCompraById(idCompra);
        if (compra.getStatusPagamento() == StatusPagamento.PENDENTE) {
            compra.setStatusPagamento(StatusPagamento.CONFIRMADO);
            updateCompra(compra);
        } else {
            throw new IllegalStateException("Pagamento não está pendente");
        }
    }

    public void cancelarPagamento(long idCompra) {
        CompraModels compra = getCompraById(idCompra);
        if (compra.getStatusPagamento() != StatusPagamento.CANCELADO) {
            compra.setStatusPagamento(StatusPagamento.CANCELADO);
            updateCompra(compra);
        }
    }
}