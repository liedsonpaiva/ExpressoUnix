package com.johnwilliam.ExpressoUnix.Entities;

import com.johnwilliam.ExpressoUnix.Entities.Objects.Text;
import com.johnwilliam.ExpressoUnix.Enums.PresencaPassageiro;
import com.johnwilliam.ExpressoUnix.Enums.StatusPagamento;

public class Passagem {

    private Long id_passagem;
    private long id_viagem;
    private long id_compra;
    private long id_passageiro;

    private Text codigo_bilhete;

    private StatusPagamento status_pagamento;
    private PresencaPassageiro presenca;

    private Text qr_code;

    private boolean embarque_realizado;
    private boolean desembarque_realizado;

    public Passagem(Long id_passagem, long id_viagem, long id_compra, long id_passageiro,
                    String codigo_bilhete, StatusPagamento status_pagamento,
                    PresencaPassageiro presenca, String qr_code,
                    boolean embarque_realizado, boolean desembarque_realizado) {

        this.id_passagem = id_passagem;
        this.id_viagem = id_viagem;
        this.id_compra = id_compra;
        this.id_passageiro = id_passageiro;

        this.codigo_bilhete = new Text(codigo_bilhete);
        this.status_pagamento = status_pagamento;
        this.presenca = presenca;

        this.qr_code = new Text(qr_code);

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

    public Text getCodigo_bilhete() { return codigo_bilhete; }
    public void setCodigo_bilhete(String codigo_bilhete) { this.codigo_bilhete.setText(codigo_bilhete); }

    public StatusPagamento getStatus_pagamento() { return status_pagamento; }
    public void setStatus_pagamento(StatusPagamento status_pagamento) { this.status_pagamento = status_pagamento; }

    public PresencaPassageiro getPresenca() { return presenca; }
    public void setPresenca(PresencaPassageiro presenca) { this.presenca = presenca; }

    public Text getQr_code() { return qr_code; }
    public void setQr_code(String qr_code) { this.qr_code.setText(qr_code); }

    public boolean isEmbarque_realizado() { return embarque_realizado; }
    public void setEmbarque_realizado(boolean embarque_realizado) { this.embarque_realizado = embarque_realizado; }

    public boolean isDesembarque_realizado() { return desembarque_realizado; }
    public void setDesembarque_realizado(boolean desembarque_realizado) { this.desembarque_realizado = desembarque_realizado; }
}
