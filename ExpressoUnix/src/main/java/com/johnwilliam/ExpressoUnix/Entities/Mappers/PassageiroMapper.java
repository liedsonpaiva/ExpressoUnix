package com.johnwilliam.ExpressoUnix.Entities.Mappers;

import com.johnwilliam.ExpressoUnix.Entities.Passageiro;
import com.johnwilliam.ExpressoUnix.Models.PassageiroModels;

public class PassageiroMapper {

    public static Passageiro toEntity(PassageiroModels model) {
        Passageiro passageiro = new Passageiro(
                model.getNome(),
                model.getCpf(),
                model.getEmail(),
                model.getTelefone(),
                model.getData_nascimento()
        );

        passageiro.setId(model.getId_passageiro());
        return passageiro;
    }

    public static PassageiroModels toModel(Passageiro entity) {
        PassageiroModels model = new PassageiroModels(
                entity.getNome().getValue(),
                entity.getCpf().getValue(),
                entity.getEmail().getValue(),
                entity.getTelefone().getValue(),
                entity.getDataNascimento().getValue()
        );

        model.setId_passageiro(entity.getId());
        return model;
    }
}
