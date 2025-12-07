package com.johnwilliam.ExpressoUnix.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.johnwilliam.ExpressoUnix.Enums.MetodoPagamento;
import com.johnwilliam.ExpressoUnix.Enums.StatusPagamento;
import com.johnwilliam.ExpressoUnix.Facade.CompraFacade;
import com.johnwilliam.ExpressoUnix.Models.CompraModels;

@RestController
@RequestMapping("/compra")
public class CompraController {

    private final CompraFacade compraFacade;

    @Autowired
    public CompraController(CompraFacade compraFacade) {
        this.compraFacade = compraFacade;
    }

    @PostMapping
    public ResponseEntity<String> createCompra(@RequestBody CompraModels compra) {
        compraFacade.createCompra(compra);
        return ResponseEntity.status(HttpStatus.CREATED).body("Compra criada com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompraModels> getCompraById(@PathVariable long id) {
        CompraModels compra = compraFacade.getCompraById(id);
        return ResponseEntity.ok(compra);
    }

    @GetMapping
    public ResponseEntity<List<CompraModels>> getAllCompras() {
        List<CompraModels> compras = compraFacade.getAllCompra();
        return ResponseEntity.ok(compras);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompra(@PathVariable long id, @RequestBody CompraModels compra) {
        compra.setId(id);
        compraFacade.updateCompra(compra);
        return ResponseEntity.ok("Compra atualizada com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompra(@PathVariable long id) {
        compraFacade.deleteCompra(id);
        return ResponseEntity.ok("Compra deletada com sucesso");
    }

    // Endpoints de consultas personalizadas
    @GetMapping("/passageiro/{idPassageiro}")
    public ResponseEntity<List<CompraModels>> getComprasByPassageiro(@PathVariable Long idPassageiro) {
        List<CompraModels> compras = compraFacade.getComprasByPassageiro(idPassageiro);
        return ResponseEntity.ok(compras);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<CompraModels>> getComprasByStatus(@PathVariable StatusPagamento status) {
        List<CompraModels> compras = compraFacade.getComprasByStatus(status);
        return ResponseEntity.ok(compras);
    }

    @GetMapping("/metodo-pagamento/{metodo}")
    public ResponseEntity<List<CompraModels>> getComprasByMetodoPagamento(@PathVariable MetodoPagamento metodo) {
        List<CompraModels> compras = compraFacade.getComprasByMetodoPagamento(metodo);
        return ResponseEntity.ok(compras);
    }

    // Endpoints de ações de negócio
    @PatchMapping("/{id}/confirmar")
    public ResponseEntity<String> confirmarPagamento(@PathVariable long id) {
        compraFacade.confirmarPagamento(id);
        return ResponseEntity.ok("Pagamento confirmado com sucesso");
    }

    @PatchMapping("/{id}/cancelar")
    public ResponseEntity<String> cancelarPagamento(@PathVariable long id) {
        compraFacade.cancelarPagamento(id);
        return ResponseEntity.ok("Pagamento cancelado com sucesso");
    }
}