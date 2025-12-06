package com.johnwilliam.ExpressoUnix.Entities.Mappers;

import com.johnwilliam.ExpressoUnix.Entities.Passagem;
import com.johnwilliam.ExpressoUnix.Models.PassagemModels;

public class PassagemMapper {

    public static Passagem toEntity(PassagemModels model) {
        return new Passagem(
                model.getId_passagem(),
                model.getId_viagem(),
                model.getId_compra(),
                model.getId_passageiro(),
                model.getCodigo_bilhete(),
                model.getStatus_pagamento(),
                model.getPresenca(),
                model.getQr_code(),
                model.isEmbarque_realizado(),
                model.isDesembarque_realizado()
        );
    }

    public static PassagemModels toModel(Passagem entity) {
        return new PassagemModels(
                entity.getId_viagem(),
                entity.getId_compra(),
                entity.getId_passageiro(),
                entity.getCodigo_bilhete().getValue(),
                entity.getStatus_pagamento(),
                entity.getPresenca(),
                entity.getQr_code().getValue(),
                entity.isEmbarque_realizado(),
                entity.isDesembarque_realizado()
        );
    }
}
