package com.andrew.point.services;

import java.util.List;
import java.util.Optional;

import com.andrew.point.entity.Lancamento;
import com.andrew.point.repositories.LancamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository repository;

    public List<Lancamento> findAll() {
        return repository.findAll();
    }

    public Lancamento findById(Long id) {
        Optional<Lancamento> lancamento = repository.findById(id);
        return lancamento.get();
    }
}