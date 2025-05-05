# ⏰ Backend - Relógio de Atividades

Este é o backend da aplicação **Relógio de Atividades**, desenvolvido com **Kotlin + Spring Boot**, banco de dados **PostgreSQL** e infraestrutura containerizada com **Docker**.

## 💠 Tecnologias Utilizadas

* Kotlin
* Spring Boot
* PostgreSQL
* Docker e Docker Compose
* Gradle

## 📁 Estrutura do Projeto

```
demo/
├── demo/                 # Código-fonte do backend
│   ├── src/              # Código Kotlin
│   └── build.gradle.kts
├── Dockerfile            # Container da aplicação
├── docker-compose.yml    # Orquestração de containers
└── README.md             # Este arquivo
```

## 🚀 Como executar

### Pré-requisitos

* Docker e Docker Compose instalados
* Java 21 (caso queira rodar fora do container)

### 1. Build da aplicação

Gere o `.jar` com o Gradle:

```bash
cd demo/demo
./gradlew clean build
```

> Isso criará o arquivo `.jar` em `build/libs/`.

### 2. Subir com Docker

A partir da raiz do projeto:

```bash
docker-compose up --build
```

A aplicação ficará disponível em:
📍 [`http://localhost:8080`](http://localhost:8080)

O PostgreSQL estará acessível em:
📍 `localhost:5432`
🧑‍💻 Usuário: `relogio_user`
🔑 Senha: `relogio_pass`
📄 Banco: `relogio_db`

### 3. Encerrar

Para parar e remover os containers:

```bash
docker-compose down
```

## ⚙️ Variáveis de Ambiente

O container backend lê as seguintes variáveis:

| Variável                     | Descrição                            |
| ---------------------------- | ------------------------------------ |
| `SPRING_DATASOURCE_URL`      | URL JDBC de conexão com o PostgreSQL |
| `SPRING_DATASOURCE_USERNAME` | Usuário do banco                     |
| `SPRING_DATASOURCE_PASSWORD` | Senha do banco                       |

Essas variáveis são definidas no `docker-compose.yml`.

## 📌 Observações

* O banco de dados é persistido com volume `postgres_data`.
* O Hibernate está configurado com `ddl-auto=update` para atualização automática do schema.
* Para logs SQL, `spring.jpa.show-sql=true`.

---

Feito com ❤️ usando Kotlin + Spring Boot.
