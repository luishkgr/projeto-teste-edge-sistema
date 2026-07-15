# Product API

API REST desenvolvida em **Java** utilizando **Spring Boot** como parte de um teste técnico para implementação de um CRUD de produtos.

## 📋 Sobre o projeto

A aplicação permite realizar operações de cadastro, consulta, atualização e exclusão de produtos utilizando uma API REST.

Os dados são armazenados em um banco de dados **H2 em memória**, dispensando a necessidade de instalar ou configurar um banco de dados externo.

---

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Eclipse IDE
- Postman
- Git e GitHub

---

## 📁 Estrutura do projeto

```
src/main/java
└── com.luishkruger.productapi
    ├── controller
    ├── model
    ├── repository
    ├── service
    └── ProductApiApplication.java
```

---

## ▶️ Como executar o projeto

### Clone o repositório

```bash
git clone https://github.com/luishkgr/projeto-teste-edge-sistema.git
```

### Entre na pasta do projeto

```bash
cd product_api
```

### Execute a aplicação

Pelo Eclipse:

- Clique com o botão direito em `ProductApiApplication`
- **Run As → Java Application**

Ou utilizando Maven:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em:

```
http://localhost:8080
```

---

## 🗄 Banco de dados H2

O projeto utiliza banco de dados H2 em memória.

Console do H2:

```
http://localhost:8080/h2
```

Configuração:

| Campo | Valor |
|-------|-------|
| JDBC URL | `jdbc:h2:mem:testdb` |
| User Name | `sa` |
| Password | *(em branco)* |

---

## 📌 Endpoints

### Cadastrar produto

**POST**

```
/produtos
```

Exemplo:

```json
{
    "codigo": 1,
    "nome": "Notebook",
    "preco": 3500.00,
    "marca": "Dell"
}
```

Retornos:

- 201 Created
- 400 Bad Request

---

### Listar produtos

**GET**

```
/produtos
```

Retorno:

- 200 OK

---

### Buscar produto por código

**GET**

```
/produtos/{codigo}
```

Retornos:

- 200 OK
- 404 Not Found

---

### Atualizar produto

**PUT**

```
/produtos/{codigo}
```

Exemplo:

```json
{
    "codigo": 1,
    "nome": "Notebook Gamer",
    "preco": 5200.00,
    "marca": "Dell"
}
```

Retornos:

- 200 OK
- 400 Bad Request

---

### Excluir produto

**DELETE**

```
/produtos/{codigo}
```

Retornos:

- 200 OK
- 400 Bad Request

---

## 📂 Modelo da entidade

```java
Produto
```

| Campo | Tipo |
|--------|------|
| codigo | Integer |
| nome | String |
| preco | BigDecimal |
| marca | String |

---

## 🧪 Testes

A API pode ser testada utilizando o **Postman**.

Fluxo sugerido:

1. Cadastrar um produto.
2. Listar todos os produtos.
3. Buscar um produto pelo código.
4. Atualizar um produto existente.
5. Excluir um produto.
6. Validar os retornos HTTP para operações inválidas.

---

## 👨‍💻 Autor

**Luís Henrique Kruger**

GitHub:

https://github.com/luishkgr
