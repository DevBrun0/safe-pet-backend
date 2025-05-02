package org.trainning.safepetbackend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.trainning.safepetbackend.api.adotante.request.AtualizarAdotanteRequest;
import org.trainning.safepetbackend.api.adotante.request.CadastrarAdotanteRequest;
import org.trainning.safepetbackend.domain.Adotante;
import org.trainning.safepetbackend.exception.adotante.IdadeMinimaException;
import org.trainning.safepetbackend.mapper.AdotanteMapper;
import org.trainning.safepetbackend.repository.adotante.AdotanteRepository;

import java.util.List;

@Service
public class AdotanteService {

    private final AdotanteRepository adotanteRepository;
    private final AdotanteMapper adotanteMapper;

    public AdotanteService(AdotanteRepository adotanteRepository, AdotanteMapper adotanteMapper) {
        this.adotanteRepository = adotanteRepository;
        this.adotanteMapper = adotanteMapper;
    }

    public Adotante cadastrarAdotante(CadastrarAdotanteRequest cadastrarAdotanteRequest){
        Adotante salvaCad = adotanteMapper.cadastrarAdotante(cadastrarAdotanteRequest);

        if(salvaCad.getIdade() < 18){
            throw new IdadeMinimaException("Menores de idade não podem executar essa ação");
        }else return adotanteRepository.save(salvaCad);

    }

    public Adotante deletaAdotantePorId(@PathVariable String id){
        Adotante adotante = adotanteRepository.findById(id).orElse(null);
        adotanteRepository.deleteById(id);
        return adotante;
    }

public Adotante buscarAdotantePorId(@PathVariable String id){
        return adotanteRepository.findById(id).orElse(null);
}

public List<Adotante> buscarTodosAdotante(){
        return adotanteRepository.findAll();
}

public void atualizarAdotanteEspecifico(Adotante adotante){
        Adotante atl = this.adotanteRepository.atualizarPorId(adotante);
        if(atl == null) throw new RuntimeException("Deu bo irmao");
}


}
