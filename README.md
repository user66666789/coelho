# Backend Java + Spring Boot

Backend desenvolvido em **Java com Spring Boot**, seguindo o padrão arquitetural **MVC (Model-View-Controller)**. A camada de interface visual utiliza **Thymeleaf**, permitindo a renderização das páginas no próprio servidor.

## 🚀 Tecnologias utilizadas

* **Java**
* **Spring Boot**
* **Spring MVC**
* **Thymeleaf**
* **Maven**
* **HTML / CSS / JavaScript**
* **Git / GitHub**

## 🏗️ Arquitetura

O projeto segue o padrão **MVC**, separando as responsabilidades da aplicação em três principais camadas:

```text
┌─────────────────────┐
│       Usuário       │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│      Controller     │
│   Spring MVC        │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│        Model        │
│ Regras e dados      │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│       View          │
│     Thymeleaf       │
└─────────────────────┘
```

### Model

Responsável pela representação dos dados e pelas regras relacionadas ao domínio da aplicação.

### View

A camada visual é construída utilizando **Thymeleaf**, permitindo criar páginas HTML dinâmicas integradas ao Spring Boot.

### Controller

Responsável por receber as requisições HTTP, processar as solicitações através das regras da aplicação e direcionar o usuário para a view correspondente.

## 📁 Estrutura do projeto

Uma estrutura típica do projeto é organizada da seguinte forma:

```text
src/
├── main/
│   ├── java/
│   │   └── .../
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       └── Application.java
│   │
│   └── resources/
│       ├── static/
│       │   ├── css/
│       │   ├── js/
│       │   └── images/
│       │
│       ├── templates/
│       │   └── *.html
│       │
│       └── application.properties
│
└── test/
    └── java/
```

> A estrutura pode variar de acordo com a organização final do projeto.

## ⚙️ Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

* **JDK**
* **Maven**
* **Git**

Para verificar as instalações:

```bash
java -version
mvn -version
git --version
```

## 📥 Instalação

Clone o repositório:

```bash
git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
```

Entre no diretório do projeto:

```bash
cd SEU-REPOSITORIO
```

Instale as dependências:

```bash
mvn clean install
```

## ▶️ Executando o projeto

Para iniciar a aplicação utilizando o Maven:

```bash
mvn spring-boot:run
```

Ou, após gerar o projeto:

```bash
java -jar target/nome-do-projeto.jar
```

Após iniciar a aplicação, acesse no navegador:

```text
http://localhost:8080
```

## 🌐 Interface com Thymeleaf

O projeto utiliza **Thymeleaf** como mecanismo de templates para geração das páginas HTML.

As páginas ficam localizadas em:

```text
src/main/resources/templates/
```

Exemplo de integração com dados enviados pelo Controller:

```html
<h1 th:text="${titulo}"></h1>
```

O Controller pode disponibilizar os dados para a página através do `Model`:

```java
@GetMapping("/")
public String home(Model model) {
    model.addAttribute("titulo", "Página Inicial");

    return "index";
}
```

## 🔄 Fluxo da aplicação

O fluxo básico de uma requisição é:

```text
Cliente
   │
   │ HTTP Request
   ▼
Controller
   │
   ▼
Service / Regras de negócio
   │
   ▼
Repository / Dados
   │
   ▼
Controller
   │
   │ Model
   ▼
Thymeleaf
   │
   │ HTML
   ▼
Cliente
```

Essa separação permite manter o código mais organizado e facilita a manutenção e evolução da aplicação.

## 🧪 Testes

Os testes podem ser executados através do Maven:

```bash
mvn test
```

## 📦 Build

Para gerar o arquivo `.jar` da aplicação:

```bash
mvn clean package
```

O artefato será gerado no diretório:

```text
target/
```

## 🔐 Configurações

As configurações da aplicação ficam no arquivo:

```text
src/main/resources/application.properties
```

Informações sensíveis, como senhas, tokens e credenciais de banco de dados, **não devem ser armazenadas diretamente no repositório**.

Recomenda-se utilizar variáveis de ambiente para essas informações.

## 📌 Objetivo do projeto

O projeto tem como objetivo aplicar conceitos de desenvolvimento backend utilizando o ecossistema **Java + Spring Boot**, explorando a arquitetura **MVC**, criação de aplicações web e integração entre backend e interface através do **Thymeleaf**.

## 👨‍💻 Autor

Desenvolvido por **SEU NOME**.

---

⭐ Se este projeto foi útil para você, considere deixar uma estrela no repositório.
