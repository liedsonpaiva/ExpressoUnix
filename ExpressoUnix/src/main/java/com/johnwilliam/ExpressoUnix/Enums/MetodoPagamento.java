package com.johnwilliam.ExpressoUnix.Enums;

public enum MetodoPagamento {
    PIX("PIX"),
    BOLETO("Boleto"),
    CARTAO("Cartão"),
    MANUAL("Manual"),
    SIMULADO("Simulado");

    private final String descricao;

    MetodoPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}