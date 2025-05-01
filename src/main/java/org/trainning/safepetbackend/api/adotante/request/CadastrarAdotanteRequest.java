package org.trainning.safepetbackend.api.adotante.request;

import jakarta.validation.constraints.NotBlank;

public class CadastrarAdotanteRequest {

    @NotBlank
    private String nome;
    private Integer idade;
    private String enderecoCompleto;
    private String documentoCpf;

    public CadastrarAdotanteRequest(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getDocumentoCpf() {
        return documentoCpf;
    }

    public void setDocumentoCpf(String documentoCpf) {
        this.documentoCpf = documentoCpf;
    }
}
