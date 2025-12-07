package com.johnwilliam.ExpressoUnix.Facade;

import java.util.List;
import org.springframework.stereotype.Component;
import com.johnwilliam.ExpressoUnix.Applications.EmpresaApplication;
import com.johnwilliam.ExpressoUnix.Models.EmpresaModels;

@Component
public class EmpresaFacade {
    private final EmpresaApplication empresaApplication;

    public EmpresaFacade(EmpresaApplication empresaApplication) {
        this.empresaApplication = empresaApplication;
    }

    public void createEmpresa(EmpresaModels empresa) {
        empresaApplication.createEmpresa(empresa);
    }

    public EmpresaModels getEmpresaById(long id) {
        return empresaApplication.getEmpresaById(id);
    }

    public List<EmpresaModels> getAllEmpresa() {
        return empresaApplication.getAllEmpresa();
    }

    public void updateEmpresa(EmpresaModels empresa) {
        empresaApplication.updateEmpresa(empresa);
    }

    public void deleteEmpresa(long id) {
        empresaApplication.deleteEmpresa(id);
    }
}
