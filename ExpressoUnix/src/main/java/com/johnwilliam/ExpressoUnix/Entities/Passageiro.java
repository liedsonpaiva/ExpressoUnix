package com.johnwilliam.ExpressoUnix.Entities;

import java.time.LocalDate;

import com.johnwilliam.ExpressoUnix.Entities.Objects.CPF;
import com.johnwilliam.ExpressoUnix.Entities.Objects.DataNascimento;
import com.johnwilliam.ExpressoUnix.Entities.Objects.Email;
import com.johnwilliam.ExpressoUnix.Entities.Objects.Telefone;
import com.johnwilliam.ExpressoUnix.Entities.Objects.Text;

public class Passageiro {

    private Long id_passageiro;
    private Text nome;
    private CPF cpf;
    private Email email;
    private Telefone telefone;
    private DataNascimento data_nascimento;

    public Passageiro(String nome, String cpf, String email, String telefone, LocalDate dataNascimento) {
        this.nome = new Text(nome);
        this.cpf = new CPF(cpf);
        this.email = new Email(email);
        this.telefone = new Telefone(telefone);
        this.data_nascimento = new DataNascimento(dataNascimento);
    }

    public Long getId_passageiro() {
        return id_passageiro;
    }

    public void setId_passageiro(Long id_passageiro) {
        this.id_passageiro = id_passageiro;
    }

    public Text getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.setText(nome);
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf.setCpf(cpf);
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email.setEmail(email);
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone.setTelefone(telefone);
    }

    public DataNascimento getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate dataNascimento) {
        this.data_nascimento.setDataNascimento(dataNascimento);
    }
}
