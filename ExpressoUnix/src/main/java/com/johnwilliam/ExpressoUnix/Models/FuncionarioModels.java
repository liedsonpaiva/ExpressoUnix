package com.johnwilliam.ExpressoUnix.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.johnwilliam.ExpressoUnix.Enums.Cargo;
import com.johnwilliam.ExpressoUnix.Enums.StatusFuncionario;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "funcionario")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_funcionario")
public class FuncionarioModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Long id_funcionario;

    // Relacionamento N-1 com Empresa
    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id", insertable = false, updatable = false)
    private EmpresaModels empresa;

    @Column(name = "id_empresa", nullable = false)
    private Long id_empresa;

    @Column(name = "nome_funcionario", nullable = false)
    private String nome_funcionario;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Cargo cargo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusFuncionario status;

    @Column(nullable = false)
    private String cnh;

    // Relacionamento 1-N com Viagem (quando Funcionario é Motorista)
    @OneToMany(mappedBy = "motorista", cascade = CascadeType.ALL)
    private List<ViagemModels> viagens;

    public FuncionarioModels() {}

    public FuncionarioModels(Long id_empresa,
                             String nome_funcionario,
                             String email,
                             String senha,
                             Cargo cargo,
                             StatusFuncionario status,
                             String cnh) {
        this.id_empresa = id_empresa;
        this.nome_funcionario = nome_funcionario;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
        this.status = status;
        this.cnh = cnh;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public EmpresaModels getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModels empresa) {
        this.empresa = empresa;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public StatusFuncionario getStatus() {
        return status;
    }

    public void setStatus(StatusFuncionario status) {
        this.status = status;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public List<ViagemModels> getViagens() {
        return viagens;
    }

    public void setViagens(List<ViagemModels> viagens) {
        this.viagens = viagens;
    }
}