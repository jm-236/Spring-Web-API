# My First Web API Application

Este é um projeto de API web desenvolvido com Java, Spring Boot e Maven, como parte do bootcamp Backend com Java da DIO, feito para estudar e entender o funcionamento de uma API REST.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Maven**

## Estrutura do Projeto

- **MyFirstWebApiApplication.java**: Classe principal que inicia a aplicação Spring Boot.
- **Usuario.java**: Modelo que representa um usuário no sistema.
- **UserRepository.java**: Repositório que contém métodos para manipulação de dados dos usuários.
- **ResponseError.java**: Classe que representa a estrutura de erro para respostas de exceções.
- **GlobalExceptionHandler.java**: Classe para tratamento global de exceções.
- **BusinessException.java**: Classe para exceções de negócio.
- **WelcomeController.java**: Controlador que fornece uma mensagem de boas-vindas.
- **UsuarioController.java**: Controlador que fornece endpoints para operações relacionadas aos usuários.

## Endpoints

### WelcomeController

- **GET /**: Retorna uma mensagem de boas-vindas.

### UsuarioController

- **GET /users**: Retorna todos os usuários.
- **GET /users/{id}**: Retorna um usuário pelo ID.
- **DELETE /users/{id}**: Deleta um usuário pelo ID.
- **POST /users**: Cria um novo usuário.
- **PUT /users**: Atualiza um usuário existente.

## Dependências

As principais dependências utilizadas no projeto são:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.6.0</version>
    </dependency>
</dependencies>
```

## Como Executar

1. **Clone o repositório**:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```
2. **Navegue até o diretório do projeto**:
   ```bash
   cd my_first_web_api
   ```
3. **Execute o projeto usando Maven**:
   ```bash
   mvn spring-boot:run
   ```

## Documentação da API

A documentação da API pode ser acessada através do Swagger UI, disponível em:
```
http://localhost:8080/swagger-ui.html
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

---

Desenvolvido como parte do bootcamp **Backend com Java** da **DIO**.
