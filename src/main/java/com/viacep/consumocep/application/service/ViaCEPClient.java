package com.viacep.consumocep.application.service;

import com.viacep.consumocep.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCEPClient {
    @GetMapping("{cep}/json")
    Endereco buscaEnderecoPorCep(@PathVariable("cep") String cep);
}

