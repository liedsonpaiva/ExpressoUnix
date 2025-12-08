package com.johnwilliam.ExpressoUnix.Entities;

import com.johnwilliam.ExpressoUnix.Entities.Objects.Text;

public class Endereco {

    private Long id;
    private Text cep;
    private Text estado;
    private Text cidade;
    private Text bairro;
    private Text numero;
    private Text logradouro;

    public Endereco(String cep,
                    String estado,
                    String cidade,
                    String bairro,
                    String numero,
                    String logradouro) {
        this.cep = new Text(cep);
        this.estado = new Text(estado);
        this.cidade = new Text(cidade);
        this.bairro = new Text(bairro);
        this.numero = new Text(numero);
        this.logradouro = new Text(logradouro);
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep.toString();
    }
    public void setCep(String cep) {
        this.cep.setText(cep);
    }

    public String getEstado() {
        return estado.toString();
    }

    public void setEstado(String estado) {
        this.estado.setText(estado);
    }

    public String getCidade() {
        return cidade.toString();
    }
    public void setCidade(String cidade) {
        this.cidade.setText(cidade);
    }

    public String getBairro() {
        return bairro.toString();
    }

    public void setBairro(String bairro) {
        this.bairro.setText(bairro);
    }

    public String getNumero() {
        return numero.toString();
    }

    public void setNumero(String numero) {
        this.numero.setText(numero);
    }

    public String getLogradouro() {
        return logradouro.toString();
    }

    public void setLogradouro(String logradouro) {
        this.logradouro.setText(logradouro);
    }
}