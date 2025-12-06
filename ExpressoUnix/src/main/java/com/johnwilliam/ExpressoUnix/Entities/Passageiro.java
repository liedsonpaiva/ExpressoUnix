package com.johnwilliam.ExpressoUnix.Entities;

import java.time.LocalDate;

import com.johnwilliam.ExpressoUnix.Entities.Objects.CPF;
import com.johnwilliam.ExpressoUnix.Entities.Objects.DataNascimento;
import com.johnwilliam.ExpressoUnix.Entities.Objects.Email;
import com.johnwilliam.ExpressoUnix.Entities.Objects.Telefone;
import com.johnwilliam.ExpressoUnix.Entities.Objects.Text;

public class Passageiro {

    private Long id;
    private Text nome;
    private CPF cpf;
    private Email email;
    private Telefone telefone;
    private DataNascimento dataNascimento;

    public Passageiro(String nome, String cpf, String email, String telefone, LocalDate dataNascimento) {
        this.nome = new Text(nome);
        this.cpf = new CPF(cpf);
        this.email = new Email(email);
        this.telefone = new Telefone(telefone);
        this.dataNascimento = new DataNascimento(dataNascimento);
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Text getNome() { return nome; }
    public void setNome(String nome) { this.nome.setText(nome); }

    public CPF getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf.setCpf(cpf); }

    public Email getEmail() { return email; }
    public void setEmail(String email) { this.email.setEmail(email); }

    public Telefone getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone.setTelefone(telefone); }

    public DataNascimento getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento.setDataNascimento(dataNascimento); }
}
