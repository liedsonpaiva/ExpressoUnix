package com.johnwilliam.ExpressoUnix.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.johnwilliam.ExpressoUnix.Facade.EmpresaFacade;
import com.johnwilliam.ExpressoUnix.Models.EmpresaModels;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    private final EmpresaFacade empresaFacade;

    @Autowired
    public EmpresaController(EmpresaFacade empresaFacade) {
        this.empresaFacade = empresaFacade;
    }

    @PostMapping
    public void createEmpresa(@RequestBody EmpresaModels empresa) {
        empresaFacade.createEmpresa(empresa);
    }

    @GetMapping("/{id}")
    public EmpresaModels getEmpresaById(@PathVariable long id) {
        return empresaFacade.getEmpresaById(id);
    }

    @GetMapping
    public List<EmpresaModels> getAllEmpresas() {
        return empresaFacade.getAllEmpresa();
    }

    @PutMapping("/{id}")
    public void updateEmpresa(@RequestBody EmpresaModels empresa) {
        empresaFacade.updateEmpresa(empresa);
    }

    @DeleteMapping("/{id}")
    public void deleteEmpresa(@PathVariable long id) {
        empresaFacade.deleteEmpresa(id);
    }
}