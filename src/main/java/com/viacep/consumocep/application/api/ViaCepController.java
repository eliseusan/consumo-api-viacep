package com.viacep.consumocep.application.api;

import com.viacep.consumocep.application.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Log4j2
@RequiredArgsConstructor
public class ViaCepController implements ViaCepAPI {

        private final ViaCepService viaCepService;

        @Override
        public EnderecoDetalhadoResponse buscaCep(String cep) {
            log.info("[start] ViaCepController - buscaCep ");
            EnderecoDetalhadoResponse cepDetalhado = viaCepService.buscaCep(cep);
            log.info("[finish] ViaCepController - buscaCep ");
            return cepDetalhado;
        }
    }