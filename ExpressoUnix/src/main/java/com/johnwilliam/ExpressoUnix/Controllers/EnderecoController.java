package com.johnwilliam.ExpressoUnix.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.johnwilliam.ExpressoUnix.Facade.EnderecoFacade;
import com.johnwilliam.ExpressoUnix.Models.EnderecoModels;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private final EnderecoFacade enderecoFacade;

    @Autowired
    public EnderecoController(EnderecoFacade enderecoFacade) {
        this.enderecoFacade = enderecoFacade;
    }

    @PostMapping
    public void createEndereco(@RequestBody EnderecoModels endereco) {
        enderecoFacade.createEndereco(endereco);
    }

    @GetMapping("/{id}")
    public EnderecoModels getEnderecoById(@PathVariable long id) {
        return enderecoFacade.getEnderecoById(id);
    }

    @GetMapping
    public List<EnderecoModels> getAllEnderecos() {
        return enderecoFacade.getAllEndereco();
    }

    @PutMapping("/{id}")
    public void updateEndereco(@RequestBody EnderecoModels endereco) {
        enderecoFacade.updateEndereco(endereco);
    }

    @DeleteMapping("/{id}")
    public void deleteEndereco(@PathVariable long id) {
        enderecoFacade.deleteEndereco(id);
    }
}