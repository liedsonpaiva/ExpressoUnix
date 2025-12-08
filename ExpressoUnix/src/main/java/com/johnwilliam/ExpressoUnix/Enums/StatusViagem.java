package com.johnwilliam.ExpressoUnix.Enums;

public enum StatusViagem {
    ATIVO("Ativo"),
    FINALIZADO("Finalizado"),
    CANCELADO("Cancelado");

    private final String descricao;

    StatusViagem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}



