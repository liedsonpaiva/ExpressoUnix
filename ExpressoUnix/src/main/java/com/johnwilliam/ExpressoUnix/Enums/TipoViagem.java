package com.johnwilliam.ExpressoUnix.Enums;

public enum TipoViagem {
    IDA("Ida"),
    VOLTA("Volta");

    private final String descricao;

    TipoViagem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}