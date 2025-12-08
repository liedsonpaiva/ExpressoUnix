package com.johnwilliam.ExpressoUnix.Repositories;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.johnwilliam.ExpressoUnix.Models.EmpresaModels;
import com.johnwilliam.ExpressoUnix.Repositories.JPA.EmpresaJPA;

@Repository
public class EmpresaRepository {
    private final EmpresaJPA empresaJPA;

    public EmpresaRepository(EmpresaJPA empresaJPA) {
        this.empresaJPA = empresaJPA;
    }

    public void createEmpresa(EmpresaModels empresa) {
        empresaJPA.save(empresa);
    }

    public EmpresaModels getEmpresaById(long id) {
        return empresaJPA.findById(id).get();
    }

    public List<EmpresaModels> getAllEmpresa() {
        return empresaJPA.findAll();
    }

    public void updateEmpresa(EmpresaModels empresa) {
        this.empresaJPA.save(empresa);
    }

    public void deleteEmpresa(long id) {
        empresaJPA.deleteById(id);
    }
}