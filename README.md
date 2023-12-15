# API Java Spring Boot para consulta de CEP de qualquer cidade do Brasil

## Descrição
Esta API Rest Full foi desenvolvida em Java 11 utilizando o framework Spring Boot. Ela permite que você consulte o CEP de qualquer cidade do Brasil, consumindo o serviço de API externa ViaCEP.
## Build da Api
1- Inicie o Docker
### Utilize esse comando no bash dentro do diretorio da aplicação
  "docker build -t api_consumo_viacep ." (criar a imagem)
  "docker images" (para ver o id da imagem)
  "docker run -p 8080:8080 647c71ff72cf" (executar)
  
A API disponibiliza os seguintes endpoints:

### context-path: /consumo-cep/api

### Endpoint: /v1/cep/{cep} (GET)
Este endpoint é utilizado para consultar as informações de um determinado CEP.

#### Parâmetros:

- {cep}: O CEP que deseja consultar, sem traços ou pontos.

#### Exemplo de uso: 
```
http://localhost:8080/consumo-cep/api/v1/cep/40301110
```

Para utilizar a API, basta realizar uma requisição GET para o endpoint /consultaCep/{cep}, informando o CEP desejado no lugar de {cep}. A API retornará as informações correspondentes ao CEP consultado.

# Dependencies

- [Spring Boot]

- [Lombok]
  
- [Spring Cloud Starter OpenFeign]

- [Spring Boot Starter Data JPA]

- [H2 Database]


## Configuração
1. Certifique-se de ter o Java 11 ou superior instalado em sua máquina.
2. Faça o clone deste repositório.
3. Abra o projeto em sua IDE de preferência.
4. Realize as configurações necessárias para executar o projeto.
5. Execute a classe `Application.java` para iniciar o servidor.

## Uso
Após configurar e executar o projeto, você pode começar a fazer requisições para a API utilizando um cliente HTTP, como o Postman.

## Contribuição
Contribuições são sempre bem-vindas! Se você quiser contribuir com este projeto, siga as orientações abaixo:

1. Faça um fork deste repositório.
2. Crie uma branch com a feature ou correção que você deseja implementar.
3. Envie suas alterações.
4. Abra uma pull request para revisão.

## Autor
- Eliseu Divino

