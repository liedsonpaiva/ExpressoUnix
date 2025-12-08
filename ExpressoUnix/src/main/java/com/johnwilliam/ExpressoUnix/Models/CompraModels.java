package com.johnwilliam.ExpressoUnix.Models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.johnwilliam.ExpressoUnix.Enums.MetodoPagamento;
import com.johnwilliam.ExpressoUnix.Enums.StatusPagamento;

@Entity
@Table(name = "compra")
public class CompraModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Long id;

    @Column(name = "id_passageiro", nullable = false)
    private Long idPassageiro;

    @Column(name = "data_compra", nullable = false)
    private LocalDateTime dataCompra;

    @Enumerated(EnumType.STRING)
    @Column(name = "metodo_pagamento", nullable = false, length = 20)
    private MetodoPagamento metodoPagamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pagamento", nullable = false, length = 20)
    private StatusPagamento statusPagamento;

    @Column(name = "valor_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotal;

    @Column(name = "comprovante_pagamento_url", length = 500)
    private String comprovantePagamentoUrl;

    public CompraModels() {
        this.dataCompra = LocalDateTime.now();
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    public CompraModels(Long idPassageiro, MetodoPagamento metodoPagamento, BigDecimal valorTotal,
                        String comprovantePagamentoUrl) {
        this.idPassageiro = idPassageiro;
        this.dataCompra = LocalDateTime.now();
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = StatusPagamento.PENDENTE;
        this.valorTotal = valorTotal;
        this.comprovantePagamentoUrl = comprovantePagamentoUrl;
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

    public String getComprovantePagamentoUrl() {
        return comprovantePagamentoUrl;
    }

    public void setComprovantePagamentoUrl(String comprovantePagamentoUrl) {
        this.comprovantePagamentoUrl = comprovantePagamentoUrl;
    }
}