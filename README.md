# 🚀 API REST com Java Spring Boot & Supabase

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Supabase](https://img.shields.io/badge/Supabase-3ECF8E?style=for-the-badge&logo=supabase&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

> Um guia prático para criar uma API RESTful utilizando Java Spring Boot integrado ao banco de dados PostgreSQL hospedado no Supabase.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot 3.x** (Web, JPA, DevTools, Thymeleaf)
* **Lombok** (Produtividade)
* **Supabase** (PostgreSQL na nuvem)

---

## 📝 Passo a Passo

### 1. Configuração Inicial (Spring Initializr)

Ao gerar o projeto no [Spring Initializr](https://start.spring.io/), selecione as seguintes dependências:

* ✅ Spring Web
* ✅ Spring Boot DevTools
* ✅ Spring Data JPA
* ✅ Lombok
* ✅ PostgreSQL Driver
* ✅ Thymeleaf

### 2. Configurando a Conexão (`application.properties`)

Configure o acesso ao banco de dados do Supabase.

> **⚠️ Importante:** Nunca compartilhe suas senhas reais em repositórios públicos. Use variáveis de ambiente em produção.

```properties
spring.application.name=treina-dev

# Conexão Supabase (PostgreSQL)
spring.datasource.url=jdbc:postgresql://[aws-0-sa-east-1.pooler.supabase.com:6543/postgres](https://aws-0-sa-east-1.pooler.supabase.com:6543/postgres)
spring.datasource.username=SEU_USUARIO_AQUI
spring.datasource.password=SUA_SENHA_AQUI

# Configurações JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
