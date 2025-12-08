package com.johnwilliam.ExpressoUnix.Entities;

import com.johnwilliam.ExpressoUnix.Entities.Objects.CPF;
import com.johnwilliam.ExpressoUnix.Entities.Objects.Email;
import com.johnwilliam.ExpressoUnix.Entities.Objects.Telefone;
import com.johnwilliam.ExpressoUnix.Entities.Objects.Text;

public class Empresa {

    private Long id;
    private Text razaoSocial;
    private Text cnpj;
    private Email emailContato;
    private Telefone telefoneContato;
    private Endereco endereco; // Instância de Endereco
    private Text representanteNome;
    private CPF representanteCpf;
    private Email representanteEmail;
    private Telefone representanteTelefone;
    private Text linkCatalogoPublico;
    private Text urlFotoPerfil;
    private Text urlFotoCapa;

    public Empresa(String razaoSocial,
                   String cnpj,
                   String emailContato,
                   String telefoneContato,
                   Endereco endereco,
                   String representanteNome,
                   String representanteCpf,
                   String representanteEmail,
                   String representanteTelefone,
                   String linkCatalogoPublico,
                   String urlFotoPerfil,
                   String urlFotoCapa) {
        this.razaoSocial = new Text(razaoSocial);
        this.cnpj = new Text(cnpj);
        this.emailContato = new Email(emailContato);
        this.telefoneContato = new Telefone(telefoneContato);
        this.endereco = endereco;
        this.representanteNome = new Text(representanteNome);
        this.representanteCpf = new CPF(representanteCpf);
        this.representanteEmail = new Email(representanteEmail);
        this.representanteTelefone = new Telefone(representanteTelefone);
        this.linkCatalogoPublico = new Text(linkCatalogoPublico);
        this.urlFotoPerfil = new Text(urlFotoPerfil);
        this.urlFotoCapa = new Text(urlFotoCapa);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial.toString();
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial.setText(razaoSocial);
    }

    public String getCnpj() {
        return cnpj.toString();
    }
    public void setCnpj(String cnpj) {
        this.cnpj.setText(cnpj);
    }

    public String getEmailContato() {
        return emailContato.toString();
    }
    public void setEmailContato(String emailContato) {
        this.emailContato.setEmail(emailContato);
    }

    public String getTelefoneContato() {
        return telefoneContato.toString();
    }
    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato.setTelefone(telefoneContato);
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getRepresentanteNome() {
        return representanteNome.toString();
    }
    public void setRepresentanteNome(String representanteNome) {
        this.representanteNome.setText(representanteNome);
    }

    public String getRepresentanteCpf() {
        return representanteCpf.toString();
    }
    public void setRepresentanteCpf(String representanteCpf) {
        this.representanteCpf.setCpf(representanteCpf);
    }

    public String getRepresentanteEmail() {
        return representanteEmail.toString();
    }
    public void setRepresentanteEmail(String representanteEmail) {
        this.representanteEmail.setEmail(representanteEmail);
    }

    public String getRepresentanteTelefone() {
        return representanteTelefone.toString();
    }
    public void setRepresentanteTelefone(String representanteTelefone) {
        this.representanteTelefone.setTelefone(representanteTelefone);
    }

    public String getLinkCatalogoPublico() {
        return linkCatalogoPublico.toString();
    }
    public void setLinkCatalogoPublico(String linkCatalogoPublico) {
        this.linkCatalogoPublico.setText(linkCatalogoPublico);
    }

    public String getUrlFotoPerfil() {
        return urlFotoPerfil.toString();
    }
    public void setUrlFotoPerfil(String urlFotoPerfil) {
        this.urlFotoPerfil.setText(urlFotoPerfil);
    }

    public String getUrlFotoCapa() {
        return urlFotoCapa.toString();
    }
    public void setUrlFotoCapa(String urlFotoCapa) {
        this.urlFotoCapa.setText(urlFotoCapa);
    }
}