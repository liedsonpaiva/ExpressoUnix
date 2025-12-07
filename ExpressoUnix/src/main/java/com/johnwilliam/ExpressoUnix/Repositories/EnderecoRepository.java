package com.johnwilliam.ExpressoUnix.Repositories;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.johnwilliam.ExpressoUnix.Models.EnderecoModels;
import com.johnwilliam.ExpressoUnix.Repositories.JPA.EnderecoJPA;

@Repository
public class EnderecoRepository {
    private final EnderecoJPA enderecoJPA;

    public EnderecoRepository(EnderecoJPA enderecoJPA) {
        this.enderecoJPA = enderecoJPA;
    }

    public void createEndereco(EnderecoModels endereco) {
        enderecoJPA.save(endereco);
    }

    public EnderecoModels getEnderecoById(long id) {
        return enderecoJPA.findById(id).get();
    }

    public List<EnderecoModels> getAllEndereco() {
        return enderecoJPA.findAll();
    }

    public void updateEndereco(EnderecoModels endereco) {
        this.enderecoJPA.save(endereco);
    }

    public void deleteEndereco(long id) {
        enderecoJPA.deleteById(id);
    }
}