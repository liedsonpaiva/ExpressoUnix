package com.johnwilliam.ExpressoUnix.Applications;

import java.util.List;

import com.johnwilliam.ExpressoUnix.Infra.QrCodeService;
import org.springframework.stereotype.Service;

import com.johnwilliam.ExpressoUnix.Models.PassagemModels;
import com.johnwilliam.ExpressoUnix.Repositories.PassagemRepository;

@Service
public class PassagemApplication {
    private PassagemRepository passagemRepository;
    
    public PassagemApplication(PassagemRepository passagemRepository){
        this.passagemRepository = passagemRepository;
    }
    
    public void createPassagem(PassagemModels passagem){
        byte[] QrCodeAsPngFile = QrCodeService.generateQRCode(passagem.getCodigo_bilhete());
        passagem.setQr_code(QrCodeAsPngFile);
        passagemRepository.createPassagem(passagem);
    }
    
    public PassagemModels getPassagemById(long id) {
        return passagemRepository.getPassagemById(id);
    }
    
    public List<PassagemModels> getAllPassagem() {
        return passagemRepository.getAllPassagem();
    }
    
    public void updatePassagem( PassagemModels passagem) {
        passagemRepository.updatePassagem( passagem);
    }
    
    public void deletePassagem(long id) {
        passagemRepository.deletePassagem(id);
    }
}
