package com.johnwilliam.ExpressoUnix.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "passageiro")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_passageiro")
public class PassageiroModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_passageiro")
    private Long id_passageiro;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 11)
    private String cpf;

    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @Column(name = "telefone", nullable = false, length = 15)
    private String telefone;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate data_nascimento;

    // Relacionamento 1-N com Compra
    @OneToMany(mappedBy = "passageiro", cascade = CascadeType.ALL)
    private List<CompraModels> compras;

    // Relacionamento 1-N com Passagem
    @OneToMany(mappedBy = "passageiro", cascade = CascadeType.ALL)
    private List<PassagemModels> passagens;

    public PassageiroModels() {}

    public PassageiroModels(String nome, String cpf, String email, String telefone, LocalDate data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
    }

    public Long getId_passageiro() {
        return id_passageiro;
    }

    public void setId_passageiro(Long id) {
        this.id_passageiro = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public List<CompraModels> getCompras() {
        return compras;
    }

    public void setCompras(List<CompraModels> compras) {
        this.compras = compras;
    }

    public List<PassagemModels> getPassagens() {
        return passagens;
    }

    public void setPassagens(List<PassagemModels> passagens) {
        this.passagens = passagens;
    }
}