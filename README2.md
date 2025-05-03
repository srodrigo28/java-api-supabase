### Criando API com Java + Supabase

#### Passo a passo

> ##### 1 Baixando dependências.
> * Spring Initialize
    > * web 
    > * devtools
    > * jpa
    > * lombook
    > * postgres
    > * thymeleaf

> ##### 2 Configurando a conexão
> * Conexão no arquivo application.properties

```
spring.application.name=treina-dev
spring.datasource.url=jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres

spring.datasource.username=postgres.ghzwevfciietjsuupili
spring.datasource.password=nKfrnvLlQfKhtTYk

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

> ##### 3 Criando nosso Model
> * Criar pasta Model/Categoria.java
```
package com.treina.dev.treina_dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="categoria")
public class Categoria {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;
}
```

> ##### 4 Testando a conexão.
> * Visualizando a tabela no supabase.

> ##### 5 Crindo nosso Repository
> *  Criar pasta Repository/CategoriaRepository.java
```
package com.treina.dev.treina_dev.repository;

import org.springframework.data.repository.CrudRepository;
import com.treina.dev.treina_dev.model.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {}

```

> ##### 6 Crindo nosso Controller / cadastrar
```
package com.treina.dev.treina_dev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treina.dev.treina_dev.model.Categoria;
import com.treina.dev.treina_dev.repository.CategoriaRepository;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    // Cadastro categoria
    @PostMapping("/cadastrar")
    public Categoria cadastrar(@RequestBody Categoria obj){
        return categoriaRepository.save(obj);
    }   
}
```

> ##### 7 Usando Insominia para testar

> * Rota criada
```
http://localhost:8080/api/categoria/cadastrar
```