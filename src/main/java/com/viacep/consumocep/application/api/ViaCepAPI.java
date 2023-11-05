package com.viacep.consumocep.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cep")
public interface ViaCepAPI {

    @GetMapping("/{cep}")
    @ResponseStatus(code = HttpStatus.OK)
    EnderecoDetalhadoResponse buscaCep(@PathVariable String cep);
}