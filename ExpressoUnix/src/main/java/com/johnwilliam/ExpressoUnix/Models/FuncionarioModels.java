package com.johnwilliam.ExpressoUnix.Models;

import com.johnwilliam.ExpressoUnix.Enums.Cargo;
import com.johnwilliam.ExpressoUnix.Enums.StatusFuncionario;
import jakarta.persistence.*;

@Entity
@Table(name = "funcionario")
public class FuncionarioModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Long id_funcionario;

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
}
