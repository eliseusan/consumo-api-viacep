package com.viacep.consumocep.application.service;

import com.viacep.consumocep.application.api.EnderecoDetalhadoResponse;

public interface ViaCepService {
    EnderecoDetalhadoResponse buscaCep(String cep);
}
