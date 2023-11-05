package com.viacep.consumocep.domain;

import com.viacep.consumocep.application.api.EnderecoRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Endereco(EnderecoRequest enderecoRequest) {
        this.cep = enderecoRequest.getCep();
        this.logradouro = enderecoRequest.getLogradouro();
        this.complemento = enderecoRequest.getComplemento();
        this.bairro = enderecoRequest.getBairro();
        this.localidade = enderecoRequest.getLocalidade();
        this.uf = enderecoRequest.getUf();
        this.ibge = enderecoRequest.getIbge();
        this.gia = enderecoRequest.getGia();
        this.ddd = enderecoRequest.getDdd();
        this.siafi = enderecoRequest.getSiafi();
    }
}
