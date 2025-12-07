package com.johnwilliam.ExpressoUnix.Entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.johnwilliam.ExpressoUnix.Entities.Objects.Text;
import com.johnwilliam.ExpressoUnix.Enums.StatusViagem;
import com.johnwilliam.ExpressoUnix.Enums.TipoViagem;

public class Viagem {
    
    private Long id;
    
    private Long idEmpresa;

    private Text origem;

    private Text destino;
    
    private Text localEmbarque;
    
    private Text localDesembarque;

    private LocalDate dataSaida;
    
    private LocalDate dataChegada;
    
    private LocalTime horarioSaida;
    
    private LocalTime horarioChegada;
    
    private String duracaoViagem;
    
    private Long motoristaResponsavel;
    
    private BigDecimal precoPassagem;
    
    private Integer totalAssentos;
    
    private Integer assentosOcupados;
    
    private StatusViagem status;
    
    private TipoViagem tipoViagem;

    public Viagem() {
        this.assentosOcupados = 0;
        this.status = StatusViagem.ATIVO;
    }

    public Viagem(Long idEmpresa, String origem, String destino, String localEmbarque, 
                  String localDesembarque, LocalDate dataSaida, LocalDate dataChegada,
                  LocalTime horarioSaida, LocalTime horarioChegada, String duracaoViagem,
                  Long motoristaResponsavel, BigDecimal precoPassagem, Integer totalAssentos,
                  TipoViagem tipoViagem) {
        this.idEmpresa = idEmpresa;
        this.origem = new Text(origem);
        this.destino = new Text(destino);
        this.localEmbarque = new Text(localEmbarque);
        this.localDesembarque = new Text(localDesembarque);
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.horarioSaida = horarioSaida;
        this.horarioChegada = horarioChegada;
        this.duracaoViagem = duracaoViagem;
        this.motoristaResponsavel = motoristaResponsavel;
        this.precoPassagem = precoPassagem;
        this.totalAssentos = totalAssentos;
        this.assentosOcupados = 0;
        this.status = StatusViagem.ATIVO;
        this.tipoViagem = tipoViagem;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Text getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        if (this.origem == null) {
            this.origem = new Text(origem);
        } else {
            this.origem.setText(origem);
        }
    }

    public Text getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (this.destino == null) {
            this.destino = new Text(destino);
        } else {
            this.destino.setText(destino);
        }
    }

    public Text getLocalEmbarque() {
        return localEmbarque;
    }

    public void setLocalEmbarque(String localEmbarque) {
        if (this.localEmbarque == null) {
            this.localEmbarque = new Text(localEmbarque);
        } else {
            this.localEmbarque.setText(localEmbarque);
        }
    }

    public Text getLocalDesembarque() {
        return localDesembarque;
    }

    public void setLocalDesembarque(String localDesembarque) {
        if (this.localDesembarque == null) {
            this.localDesembarque = new Text(localDesembarque);
        } else {
            this.localDesembarque.setText(localDesembarque);
        }
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public LocalTime getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(LocalTime horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public LocalTime getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(LocalTime horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public String getDuracaoViagem() {
        return duracaoViagem;
    }

    public void setDuracaoViagem(String duracaoViagem) {
        this.duracaoViagem = duracaoViagem;
    }

    public Long getMotoristaResponsavel() {
        return motoristaResponsavel;
    }

    public void setMotoristaResponsavel(Long motoristaResponsavel) {
        this.motoristaResponsavel = motoristaResponsavel;
    }

    public BigDecimal getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(BigDecimal precoPassagem) {
        this.precoPassagem = precoPassagem;
    }

    public Integer getTotalAssentos() {
        return totalAssentos;
    }

    public void setTotalAssentos(Integer totalAssentos) {
        this.totalAssentos = totalAssentos;
    }

    public Integer getAssentosOcupados() {
        return assentosOcupados;
    }

    public void setAssentosOcupados(Integer assentosOcupados) {
        this.assentosOcupados = assentosOcupados;
    }

    public StatusViagem getStatus() {
        return status;
    }

    public void setStatus(StatusViagem status) {
        this.status = status;
    }

    public TipoViagem getTipoViagem() {
        return tipoViagem;
    }

    public void setTipoViagem(TipoViagem tipoViagem) {
        this.tipoViagem = tipoViagem;
    }

    // Métodos de negócio
    public boolean temAssentosDisponiveis() {
        return assentosOcupados < totalAssentos;
    }

    public void ocuparAssento() {
        if (temAssentosDisponiveis()) {
            this.assentosOcupados++;
        } else {
            throw new IllegalStateException("Não há assentos disponíveis");
        }
    }

    public void liberarAssento() {
        if (assentosOcupados > 0) {
            this.assentosOcupados--;
        }
    }

    public Integer getAssentosDisponiveis() {
        return totalAssentos - assentosOcupados;
    }
}