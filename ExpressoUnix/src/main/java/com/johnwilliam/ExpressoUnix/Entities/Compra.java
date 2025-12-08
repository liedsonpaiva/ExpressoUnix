package com.johnwilliam.ExpressoUnix.Entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.johnwilliam.ExpressoUnix.Entities.Objects.Text;
import com.johnwilliam.ExpressoUnix.Enums.MetodoPagamento;
import com.johnwilliam.ExpressoUnix.Enums.StatusPagamento;

public class Compra {
    
    private Long id;
    
    private Long idPassageiro;
    
    private LocalDateTime dataCompra;
    
    private MetodoPagamento metodoPagamento;
    
    private StatusPagamento statusPagamento;
    
    private BigDecimal valorTotal;
    
    private Text comprovantePagamentoUrl;

    public Compra() {
        this.dataCompra = LocalDateTime.now();
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    public Compra(Long idPassageiro, MetodoPagamento metodoPagamento, BigDecimal valorTotal, 
                  String comprovantePagamentoUrl) {
        this.idPassageiro = idPassageiro;
        this.dataCompra = LocalDateTime.now();
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = StatusPagamento.PENDENTE;
        this.valorTotal = valorTotal;
        this.comprovantePagamentoUrl = new Text(comprovantePagamentoUrl);
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(Long idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Text getComprovantePagamentoUrl() {
        return comprovantePagamentoUrl;
    }

    public void setComprovantePagamentoUrl(String comprovantePagamentoUrl) {
        if (this.comprovantePagamentoUrl == null) {
            this.comprovantePagamentoUrl = new Text(comprovantePagamentoUrl);
        } else {
            this.comprovantePagamentoUrl.setText(comprovantePagamentoUrl);
        }
    }

    // Métodos de negócio
    public void confirmarPagamento() {
        if (this.statusPagamento == StatusPagamento.PENDENTE) {
            this.statusPagamento = StatusPagamento.CONFIRMADO;
        } else {
            throw new IllegalStateException("Pagamento não está pendente");
        }
    }

    public void cancelarPagamento() {
        if (this.statusPagamento != StatusPagamento.CANCELADO) {
            this.statusPagamento = StatusPagamento.CANCELADO;
        }
    }

    public boolean isPagamentoConfirmado() {
        return this.statusPagamento == StatusPagamento.CONFIRMADO;
    }

    public boolean isPagamentoPendente() {
        return this.statusPagamento == StatusPagamento.PENDENTE;
    }
}