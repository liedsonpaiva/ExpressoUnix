package com.johnwilliam.ExpressoUnix.Entities.Mappers;

import com.johnwilliam.ExpressoUnix.Entities.Funcionario;
import com.johnwilliam.ExpressoUnix.Models.FuncionarioModels;

public class FuncionarioMapper {

    public Funcionario toEntitie(FuncionarioModels model){

        Funcionario funcionario = new Funcionario(
                model.getId_empresa(),
                model.getNome_funcionario(),
                model.getEmail(),
                model.getSenha(),
                model.getCargo(),
                model.getStatus(),
                model.getCnh()
        );

        funcionario.setId_funcionario(model.getId_funcionario());

        return funcionario;
    }

    public static FuncionarioModels toModel(Funcionario entity) {

        FuncionarioModels model = new FuncionarioModels(
                entity.getId_empresa(),
                entity.getNome_funcionario().getValue(),
                entity.getEmail().getValue(),
                entity.getSenha().getValue(),
                entity.getCargo(),
                entity.getStatus(),
                entity.getCnh().getValue()
        );

        model.setId_funcionario(entity.getId_funcionario());

        return model;
    }
}
