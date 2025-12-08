package com.johnwilliam.ExpressoUnix.Entities;

import com.johnwilliam.ExpressoUnix.Entities.Objects.*;
import com.johnwilliam.ExpressoUnix.Enums.Cargo;
import com.johnwilliam.ExpressoUnix.Enums.StatusFuncionario;

public class Funcionario {

    private Long id_funcionario;
    private Long id_empresa;

    private Text nome_funcionario;
    private Email email;
    private Text senha;

    private Cargo cargo;
    private StatusFuncionario status;

    private Text cnh;

    public Funcionario(Long id_empresa,
                       String nome_funcionario,
                       String email,
                       String senha,
                       Cargo cargo,
                       StatusFuncionario status,
                       String cnh) {

        this.id_empresa = id_empresa;
        this.nome_funcionario = new Text(nome_funcionario);
        this.email = new Email(email);
        this.senha = new Text(senha);
        this.cargo = cargo;
        this.status = status;
        this.cnh = new Text(cnh);
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

    public Text getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(Text nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Text getSenha() {
        return senha;
    }

    public void setSenha(Text senha) {
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

    public Text getCnh() {
        return cnh;
    }

    public void setCnh(Text cnh) {
        this.cnh = cnh;
    }
}
