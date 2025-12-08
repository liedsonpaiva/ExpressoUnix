package com.johnwilliam.ExpressoUnix.Models;

import com.johnwilliam.ExpressoUnix.Enums.PresencaPassageiro;
import com.johnwilliam.ExpressoUnix.Enums.StatusPagamento;
import jakarta.persistence.*;

@Entity
@Table(name = "passagem")
public class PassagemModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_passagem;

    @Column(nullable = false)
    private long id_viagem;

    @Column(nullable = false)
    private long id_compra;

    @Column(nullable = false)
    private long id_passageiro;

    @Column(nullable = false, length = 50)
    private String codigo_bilhete;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusPagamento status_pagamento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PresencaPassageiro presenca;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String qr_code;

    @Column(nullable = false)
    private boolean embarque_realizado;

    @Column(nullable = false)
    private boolean desembarque_realizado;

    public PassagemModels() {}

    public PassagemModels(long id_viagem, long id_compra, long id_passageiro,
                          String codigo_bilhete, StatusPagamento status_pagamento,
                          PresencaPassageiro presenca, String qr_code,
                          boolean embarque_realizado, boolean desembarque_realizado) {

        this.id_viagem = id_viagem;
        this.id_compra = id_compra;
        this.id_passageiro = id_passageiro;

        this.codigo_bilhete = codigo_bilhete;
        this.status_pagamento = status_pagamento;
        this.presenca = presenca;

        this.qr_code = qr_code;

        this.embarque_realizado = embarque_realizado;
        this.desembarque_realizado = desembarque_realizado;
    }

    public Long getId_passagem() { return id_passagem; }
    public void setId_passagem(Long id_passagem) { this.id_passagem = id_passagem; }

    public long getId_viagem() { return id_viagem; }
    public void setId_viagem(long id_viagem) { this.id_viagem = id_viagem; }

    public long getId_compra() { return id_compra; }
    public void setId_compra(long id_compra) { this.id_compra = id_compra; }

    public long getId_passageiro() { return id_passageiro; }
    public void setId_passageiro(long id_passageiro) { this.id_passageiro = id_passageiro; }

    public String getCodigo_bilhete() { return codigo_bilhete; }
    public void setCodigo_bilhete(String codigo_bilhete) { this.codigo_bilhete = codigo_bilhete; }

    public StatusPagamento getStatus_pagamento() { return status_pagamento; }
    public void setStatus_pagamento(StatusPagamento status_pagamento) { this.status_pagamento = status_pagamento; }

    public PresencaPassageiro getPresenca() { return presenca; }
    public void setPresenca(PresencaPassageiro presenca) { this.presenca = presenca; }

    public String getQr_code() { return qr_code; }
    public void setQr_code(String qr_code) { this.qr_code = qr_code; }

    public boolean isEmbarque_realizado() { return embarque_realizado; }
    public void setEmbarque_realizado(boolean embarque_realizado) { this.embarque_realizado = embarque_realizado; }

    public boolean isDesembarque_realizado() { return desembarque_realizado; }
    public void setDesembarque_realizado(boolean desembarque_realizado) { this.desembarque_realizado = desembarque_realizado; }
}
