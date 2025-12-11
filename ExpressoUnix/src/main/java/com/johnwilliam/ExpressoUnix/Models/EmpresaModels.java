package com.johnwilliam.ExpressoUnix.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "empresa")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EmpresaModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String razaoSocial;

    @Column(nullable = false, length = 14)
    private String cnpj;

    @Column(nullable = false, length = 150)
    private String emailContato;

    @Column(nullable = false, length = 15)
    private String telefoneContato;

    // Relacionamento 1-1 com Endereco
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id")
    private EnderecoModels endereco;

    @Column(nullable = false, length = 150)
    private String representanteNome;

    @Column(nullable = false, length = 11)
    private String representanteCpf;

    @Column(nullable = false, length = 150)
    private String representanteEmail;

    @Column(nullable = false, length = 15)
    private String representanteTelefone;

    @Column(nullable = true, length = 255)
    private String linkCatalogoPublico;

    @Column(nullable = true, length = 255)
    private String urlFotoPerfil;

    @Column(nullable = true, length = 255)
    private String urlFotoCapa;

    // Relacionamento 1-N com Funcionario
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<FuncionarioModels> funcionarios;

    // Relacionamento 1-N com Viagem
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<ViagemModels> viagens;

    public EmpresaModels() {}

    public EmpresaModels(String razaoSocial,
                         String cnpj,
                         String emailContato,
                         String telefoneContato,
                         EnderecoModels endereco,
                         String representanteNome,
                         String representanteCpf,
                         String representanteEmail,
                         String representanteTelefone,
                         String linkCatalogoPublico,
                         String urlFotoPerfil,
                         String urlFotoCapa) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.emailContato = emailContato;
        this.telefoneContato = telefoneContato;
        this.endereco = endereco;
        this.representanteNome = representanteNome;
        this.representanteCpf = representanteCpf;
        this.representanteEmail = representanteEmail;
        this.representanteTelefone = representanteTelefone;
        this.linkCatalogoPublico = linkCatalogoPublico;
        this.urlFotoPerfil = urlFotoPerfil;
        this.urlFotoCapa = urlFotoCapa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public EnderecoModels getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModels endereco) {
        this.endereco = endereco;
    }

    public String getRepresentanteNome() {
        return representanteNome;
    }

    public void setRepresentanteNome(String representanteNome) {
        this.representanteNome = representanteNome;
    }

    public String getRepresentanteCpf() {
        return representanteCpf;
    }

    public void setRepresentanteCpf(String representanteCpf) {
        this.representanteCpf = representanteCpf;
    }

    public String getRepresentanteEmail() {
        return representanteEmail;
    }

    public void setRepresentanteEmail(String representanteEmail) {
        this.representanteEmail = representanteEmail;
    }

    public String getRepresentanteTelefone() {
        return representanteTelefone;
    }

    public void setRepresentanteTelefone(String representanteTelefone) {
        this.representanteTelefone = representanteTelefone;
    }

    public String getLinkCatalogoPublico() {
        return linkCatalogoPublico;
    }

    public void setLinkCatalogoPublico(String linkCatalogoPublico) {
        this.linkCatalogoPublico = linkCatalogoPublico;
    }

    public String getUrlFotoPerfil() {
        return urlFotoPerfil;
    }

    public void setUrlFotoPerfil(String urlFotoPerfil) {
        this.urlFotoPerfil = urlFotoPerfil;
    }

    public String getUrlFotoCapa() {
        return urlFotoCapa;
    }

    public void setUrlFotoCapa(String urlFotoCapa) {
        this.urlFotoCapa = urlFotoCapa;
    }

    public List<FuncionarioModels> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<FuncionarioModels> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<ViagemModels> getViagens() {
        return viagens;
    }

    public void setViagens(List<ViagemModels> viagens) {
        this.viagens = viagens;
    }
}