package com.johnwilliam.ExpressoUnix.Applications;

import java.util.List;
import org.springframework.stereotype.Service;
import com.johnwilliam.ExpressoUnix.Models.EmpresaModels;
import com.johnwilliam.ExpressoUnix.Repositories.EmpresaRepository;

@Service
public class EmpresaApplication {
    private EmpresaRepository empresaRepository;

    public EmpresaApplication(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public void createEmpresa(EmpresaModels empresa){
        empresaRepository.createEmpresa(empresa);
    }

    public EmpresaModels getEmpresaById(long id) {
        return empresaRepository.getEmpresaById(id);
    }

    public List<EmpresaModels> getAllEmpresa() {
        return empresaRepository.getAllEmpresa();
    }

    public void updateEmpresa( EmpresaModels empresa) {
        empresaRepository.updateEmpresa( empresa);
    }

    public void deleteEmpresa(long id) {
        empresaRepository.deleteEmpresa(id);
    }
}