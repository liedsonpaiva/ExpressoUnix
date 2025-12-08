package com.johnwilliam.ExpressoUnix.Applications;

import java.util.List;
import org.springframework.stereotype.Service;

import com.johnwilliam.ExpressoUnix.Entities.Viagem;

import com.johnwilliam.ExpressoUnix.Models.ViagemModels;
import com.johnwilliam.ExpressoUnix.Repositories.ViagemRepository;

@Service
public class ViagemApplication {
    private final ViagemRepository viagemRepository;

    public ViagemApplication(ViagemRepository viagemRepository) {
        this.viagemRepository = viagemRepository;
    }

    public void createViagem(ViagemModels viagemModel) {
        // Validações de negócio podem ser adicionadas aqui
        if (viagemModel.getAssentosOcupados() == null) {
            viagemModel.setAssentosOcupados(0);
        }
        viagemRepository.createViagem(viagemModel);
    }

    public ViagemModels getViagemById(long id) {
        return viagemRepository.getViagemById(id);
    }

    public List<ViagemModels> getAllViagem() {
        return viagemRepository.getAllViagem();
    }

    public void updateViagem(ViagemModels viagem) {
        viagemRepository.updateViagem(viagem);
    }

    public void deleteViagem(long id) {
        viagemRepository.deleteViagem(id);
    }

    public Viagem transformModelToEntity(ViagemModels viagemModels) {
        Viagem viagem = new Viagem();
        viagem.setId(viagemModels.getId());
        viagem.setIdEmpresa(viagemModels.getIdEmpresa());
        viagem.setOrigem(viagemModels.getOrigem());
        viagem.setDestino(viagemModels.getDestino());
        viagem.setLocalEmbarque(viagemModels.getLocalEmbarque());
        viagem.setLocalDesembarque(viagemModels.getLocalDesembarque());
        viagem.setDataSaida(viagemModels.getDataSaida());
        viagem.setDataChegada(viagemModels.getDataChegada());
        viagem.setHorarioSaida(viagemModels.getHorarioSaida());
        viagem.setHorarioChegada(viagemModels.getHorarioChegada());
        viagem.setDuracaoViagem(viagemModels.getDuracaoViagem());
        viagem.setMotoristaResponsavel(viagemModels.getMotoristaResponsavel());
        viagem.setPrecoPassagem(viagemModels.getPrecoPassagem());
        viagem.setTotalAssentos(viagemModels.getTotalAssentos());
        viagem.setAssentosOcupados(viagemModels.getAssentosOcupados());
        viagem.setStatus(viagemModels.getStatus());
        viagem.setTipoViagem(viagemModels.getTipoViagem());
        return viagem;
    }

    public void transformEntityToModel(ViagemModels viagemModels, Viagem viagem) {
        viagemModels.setIdEmpresa(viagem.getIdEmpresa());
        viagemModels.setOrigem(viagem.getOrigem().toString());
        viagemModels.setDestino(viagem.getDestino().toString());
        viagemModels.setLocalEmbarque(viagem.getLocalEmbarque().toString());
        viagemModels.setLocalDesembarque(viagem.getLocalDesembarque().toString());
        viagemModels.setDataSaida(viagem.getDataSaida());
        viagemModels.setDataChegada(viagem.getDataChegada());
        viagemModels.setHorarioSaida(viagem.getHorarioSaida());
        viagemModels.setHorarioChegada(viagem.getHorarioChegada());
        viagemModels.setDuracaoViagem(viagem.getDuracaoViagem());
        viagemModels.setMotoristaResponsavel(viagem.getMotoristaResponsavel());
        viagemModels.setPrecoPassagem(viagem.getPrecoPassagem());
        viagemModels.setTotalAssentos(viagem.getTotalAssentos());
        viagemModels.setAssentosOcupados(viagem.getAssentosOcupados());
        viagemModels.setStatus(viagem.getStatus());
        viagemModels.setTipoViagem(viagem.getTipoViagem());
    }
}