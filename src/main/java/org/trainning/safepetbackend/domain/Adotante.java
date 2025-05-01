package org.trainning.safepetbackend.domain;

import org.springframework.data.annotation.Id;

public class Adotante {

    @Id
    private String id;

    private String nome;
    private Integer idade;
    private String enderecoCompleto;
    private String documentoCpf;

    public Adotante(String nome, Integer idade, String enderecoCompleto, String documentoCpf) {
        this.nome = nome;
        this.idade = idade;
        this.enderecoCompleto = enderecoCompleto;
        this.documentoCpf = documentoCpf;
    }

    public Adotante() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
