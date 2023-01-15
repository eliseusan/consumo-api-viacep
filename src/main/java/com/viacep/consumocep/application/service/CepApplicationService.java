package com.viacep.consumocep.application.service;

import com.viacep.consumocep.application.api.EnderecoDetalhadoResponse;
import com.viacep.consumocep.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class CepApplicationService implements ViaCepService{
    private final ViaCEPClient viaCEPClient ;
    @Override
    public EnderecoDetalhadoResponse buscaCep(String cep) {
        log.info("[start] CepApplicationService - buscaCep ");
        Endereco endereco = viaCEPClient.
        log.info("[finish] CepApplicationService - buscaCep ");
        return new EnderecoDetalhadoResponse(endereco);
    }
}
