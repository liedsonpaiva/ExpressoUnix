package com.johnwilliam.ExpressoUnix.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.johnwilliam.ExpressoUnix.Enums.StatusViagem;
import com.johnwilliam.ExpressoUnix.Enums.TipoViagem;

@Entity
@Table(name = "viagem")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ViagemModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viagem")
    private Long id;

    // Relacionamento N-1 com Empresa
    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id", insertable = false, updatable = false)
    private EmpresaModels empresa;

    @Column(name = "id_empresa", nullable = false)
    private Long idEmpresa;

    @Column(nullable = false, length = 100)
    private String origem;

    @Column(nullable = false, length = 100)
    private String destino;

    @Column(name = "local_embarque", nullable = false, length = 200)
    private String localEmbarque;

    @Column(name = "local_desembarque", nullable = false, length = 200)
    private String localDesembarque;

    @Column(name = "data_saida", nullable = false)
    private LocalDate dataSaida;

    @Column(name = "data_chegada", nullable = false)
    private LocalDate dataChegada;

    @Column(name = "horario_saida", nullable = false)
    private LocalTime horarioSaida;

    @Column(name = "horario_chegada", nullable = false)
    private LocalTime horarioChegada;

    @Column(name = "duracao_viagem", length = 50)
    private String duracaoViagem;

    // Relacionamento N-1 com Funcionario (Motorista)
    @ManyToOne
    @JoinColumn(name = "motorista_responsavel", referencedColumnName = "id_funcionario", insertable = false, updatable = false)
    private FuncionarioModels motorista;

    @Column(name = "motorista_responsavel", nullable = false)
    private Long motoristaResponsavel;

    @Column(name = "preco_passagem", nullable = false, precision = 10, scale = 2)
    private BigDecimal precoPassagem;

    @Column(name = "total_assentos", nullable = false)
    private Integer totalAssentos;

    @Column(name = "assentos_ocupados", nullable = false)
    private Integer assentosOcupados;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatusViagem status;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_viagem", nullable = false, length = 20)
    private TipoViagem tipoViagem;

    // Relacionamento 1-N com Passagem
    @OneToMany(mappedBy = "viagem", cascade = CascadeType.ALL)
    private List<PassagemModels> passagens;

    public ViagemModels() {
        this.assentosOcupados = 0;
        this.status = StatusViagem.ATIVO;
    }

    public ViagemModels(Long idEmpresa, String origem, String destino, String localEmbarque,
                        String localDesembarque, LocalDate dataSaida, LocalDate dataChegada,
                        LocalTime horarioSaida, LocalTime horarioChegada, String duracaoViagem,
                        Long motoristaResponsavel, BigDecimal precoPassagem, Integer totalAssentos,
                        TipoViagem tipoViagem) {
        this.idEmpresa = idEmpresa;
        this.origem = origem;
        this.destino = destino;
        this.localEmbarque = localEmbarque;
        this.localDesembarque = localDesembarque;
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

    public EmpresaModels getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModels empresa) {
        this.empresa = empresa;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getLocalEmbarque() {
        return localEmbarque;
    }

    public void setLocalEmbarque(String localEmbarque) {
        this.localEmbarque = localEmbarque;
    }

    public String getLocalDesembarque() {
        return localDesembarque;
    }

    public void setLocalDesembarque(String localDesembarque) {
        this.localDesembarque = localDesembarque;
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

    public FuncionarioModels getMotorista() {
        return motorista;
    }

    public void setMotorista(FuncionarioModels motorista) {
        this.motorista = motorista;
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

    public List<PassagemModels> getPassagens() {
        return passagens;
    }

    public void setPassagens(List<PassagemModels> passagens) {
        this.passagens = passagens;
    }
}