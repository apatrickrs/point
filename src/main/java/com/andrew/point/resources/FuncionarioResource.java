package com.andrew.point.resources;

import java.util.List;

import com.andrew.point.entity.Funcionario;
import com.andrew.point.services.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioResource {
    
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll() {
        List<Funcionario> funcionarios = service.findAll();
        return ResponseEntity.ok().body(funcionarios);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Long id) {
        Funcionario funcionario = service.findById(id);
        return ResponseEntity.ok().body(funcionario);
    }
}