package com.andrew.point.resources;

import java.util.List;

import com.andrew.point.entity.Empresa;
import com.andrew.point.services.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/empresas")
public class EmpresaResource {
    
    @Autowired
    private EmpresaService service;

    @GetMapping
    public ResponseEntity<List<Empresa>> findAll() {
        List<Empresa> empresas = service.findAll();
        return ResponseEntity.ok().body(empresas);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Empresa> findById(@PathVariable Long id) {
        Empresa empresa = service.findById(id);
        return ResponseEntity.ok().body(empresa);
    }
    
}