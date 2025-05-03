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
