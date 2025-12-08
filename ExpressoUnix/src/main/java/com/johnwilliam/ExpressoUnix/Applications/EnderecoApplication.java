package com.johnwilliam.ExpressoUnix.Applications;

import java.util.List;
import org.springframework.stereotype.Service;

import com.johnwilliam.ExpressoUnix.Models.EnderecoModels;
import com.johnwilliam.ExpressoUnix.Repositories.EnderecoRepository;

@Service
public class EnderecoApplication {
    private EnderecoRepository enderecoRepository;

    public EnderecoApplication(EnderecoRepository enderecoRepository){
        this.enderecoRepository = enderecoRepository;
    }

    public void createEndereco(EnderecoModels endereco){
        enderecoRepository.createEndereco(endereco);
    }

    public EnderecoModels getEnderecoById(long id) {
        return enderecoRepository.getEnderecoById(id);
    }

    public List<EnderecoModels> getAllEndereco() {
        return enderecoRepository.getAllEndereco();
    }

    public void updateEndereco( EnderecoModels endereco) {
        enderecoRepository.updateEndereco( endereco);
    }

    public void deleteEndereco(long id) {
        enderecoRepository.deleteEndereco(id);
    }
}