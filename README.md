# API Java Spring Boot para consulta de CEP de qualquer cidade do Brasil

## Descrição
Esta API Rest Full foi desenvolvida em Java 11 utilizando o framework Spring Boot. Ela permite que você consulte o CEP de qualquer cidade do Brasil, consumindo o serviço de API externa ViaCEP.

A API disponibiliza os seguintes endpoints:

### Endpoint: /consultaCep/{cep} (GET)
Este endpoint é utilizado para consultar as informações de um determinado CEP.

#### Parâmetros:

- {cep}: O CEP que deseja consultar, sem traços ou pontos.

#### Exemplo de uso: 
```
/consultaCep/01234000 
```

Para utilizar a API, basta realizar uma requisição GET para o endpoint /consultaCep/{cep}, informando o CEP desejado no lugar de {cep}. A API retornará as informações correspondentes ao CEP consultado.
