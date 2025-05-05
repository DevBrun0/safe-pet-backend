package org.trainning.safepetbackend.mapper;

import org.springframework.stereotype.Component;
import org.trainning.safepetbackend.api.adotante.request.AtualizarAdotanteRequest;
import org.trainning.safepetbackend.api.adotante.request.CadastrarAdotanteRequest;
import org.trainning.safepetbackend.domain.Adotante;

@Component
public class AdotanteMapper {

    public static Adotante cadastrarAdotante(CadastrarAdotanteRequest cadastrarAdotanteRequest){
        Adotante adotante = new Adotante();

        adotante.setNome(cadastrarAdotanteRequest.getNome());
        adotante.setIdade(cadastrarAdotanteRequest.getIdade());
        adotante.setEnderecoCompleto(cadastrarAdotanteRequest.getEnderecoCompleto());
        adotante.setDocumentoCpf(cadastrarAdotanteRequest.getDocumentoCpf());

        return adotante;

    }

    public static Adotante atualizarAdotanteEspecifico(AtualizarAdotanteRequest atualizarAdotanteRequest){
        Adotante adotante = new Adotante();

        adotante.setId(atualizarAdotanteRequest.getId());
        adotante.setNome(atualizarAdotanteRequest.getNome());
        adotante.setIdade(atualizarAdotanteRequest.getIdade());
        adotante.setEnderecoCompleto(atualizarAdotanteRequest.getEnderecoCompleto());
        adotante.setDocumentoCpf(atualizarAdotanteRequest.getDocumentoCpf());

        return adotante;
    }

}
