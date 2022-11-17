# :open_book: Desafio Bootcamp Spring - Capítulo 01: CRUD

---

### :man_student: Conhecimento adquirido:

- Criar projeto Spring Boot
- Criar monorepo Git

* Organizar o projeto em camadas
  - Controlador REST
  - Serviço
  - Acesso a dados (Repository)
* Criar entidades
* Configurar perfil de teste do projeto
* Seeding da base de dados
* Criar web services REST
  - Parâmetros de rota `@PathVariable`
  * Parâmetros de requisição `@RequestParam`
  * Corpo de requisição `@RequestBody`
  * Resposta da requisição `ResponseEntity<T>`
* Padrão DTO
* CRUD completo
* Tratamento de exceções
* Postman (coleções, ambientes)
* Dados de auditoria
* Paginação de dados
* Associações entre entidades (N-N)

---

### :construction_worker_man: Desafio Final:

#### Enunciado

- Você deverá entregar um projeto Spring Boot 2.4.x ou superior contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:
  - Busca paginada de recursos
  - Busca de recurso por id
  - Inserir novo recurso
  - Atualizar recurso
  - Deletar recurso

* O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar Maven como gerenciador de dependência, e Java 11 ou 17 como linguagem.

* Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no diagrama):

  | Client              |
  | ------------------- |
  | -id: Long           |
  | -name: String       |
  | -cpf: String        |
  | -income: Double     |
  | -birthDate: Instant |
  | -children: Long     |

#### Testes manuais no Postman

- Busca paginada de clientes

  - `GET/clients?page=0&linesPerPage=6&direction=ASC&orderBy=name`

- Busca de cliente por id

  - `GET/clients/1`

- Inserção de novo cliente
  - `POST/clients`

```json
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```

- Atualização de cliente
  - `PUT/clients/1`

```json
{
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```

- Deleção de cliente
  - `DELETE/clients/1`
