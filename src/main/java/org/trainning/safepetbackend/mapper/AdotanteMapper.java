package org.trainning.safepetbackend.mapper;

import org.springframework.stereotype.Component;
import org.trainning.safepetbackend.api.adotante.request.AtualizarAdotanteRequest;
import org.trainning.safepetbackend.api.adotante.request.CadastrarAdotanteRequest;
import org.trainning.safepetbackend.domain.Adotante;

@Component
public class AdotanteMapper {

    public static Adotante cadastrarAdotante(CadastrarAdotanteRequest cadastrarAdotanteRequest){

        return new Adotante(
                cadastrarAdotanteRequest.getNome(),
                cadastrarAdotanteRequest.getIdade(),
                cadastrarAdotanteRequest.getEnderecoCompleto(),
                cadastrarAdotanteRequest.getDocumentoCpf()
                );

    }

    public static Adotante atualizarAdotanteEspecifico(AtualizarAdotanteRequest atualizarAdotanteRequest){
        Adotante adotante = new Adotante();

        adotante.setId(atualizarAdotanteRequest.getId());
        adotante.setNome(atualizarAdotanteRequest.getNome());
        adotante.setIdade(atualizarAdotanteRequest.getIdade());
        adotante.setEnderecoCompleto(atualizarAdotanteRequest.getEnderecoCompleto());
        adotante.setDocumentoCpf(adotante.getDocumentoCpf());

        return adotante;
    }

}
