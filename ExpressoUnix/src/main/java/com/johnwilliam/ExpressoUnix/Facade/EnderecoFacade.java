package com.johnwilliam.ExpressoUnix.Facade;

import java.util.List;
import org.springframework.stereotype.Component;
import com.johnwilliam.ExpressoUnix.Applications.EnderecoApplication;

import com.johnwilliam.ExpressoUnix.Models.EnderecoModels;

@Component
public class EnderecoFacade {
    private final EnderecoApplication enderecoApplication;

    public EnderecoFacade(EnderecoApplication enderecoApplication) {
        this.enderecoApplication = enderecoApplication;
    }

    public void createEndereco(EnderecoModels endereco) {
        enderecoApplication.createEndereco(endereco);
    }

    public EnderecoModels getEnderecoById(long id) {
        return enderecoApplication.getEnderecoById(id);
    }

    public List<EnderecoModels> getAllEndereco() {
        return enderecoApplication.getAllEndereco();
    }

    public void updateEndereco(EnderecoModels endereco) {
        enderecoApplication.updateEndereco(endereco);
    }

    public void deleteEndereco(long id) {
        enderecoApplication.deleteEndereco(id);
    }
}
