package com.andrew.point.resources;

import java.util.List;

import com.andrew.point.entity.Lancamento;
import com.andrew.point.services.LancamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lancamentos")
public class LancamentoResource {
    
    @Autowired
    private LancamentoService service;

    @GetMapping
    public ResponseEntity<List<Lancamento>> findAll() {
        List<Lancamento> lancamentos = service.findAll();
        return ResponseEntity.ok().body(lancamentos);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Lancamento> findById(@PathVariable Long id) {
        Lancamento lancamento = service.findById(id);
        return ResponseEntity.ok().body(lancamento);
    }
}