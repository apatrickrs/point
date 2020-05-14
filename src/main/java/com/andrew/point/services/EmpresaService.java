package com.andrew.point.services;

import java.util.List;
import java.util.Optional;

import com.andrew.point.entity.Empresa;
import com.andrew.point.repositories.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    public List<Empresa> findAll() {
        return repository.findAll();
    }

    public Empresa findById(Long id) {
        Optional<Empresa> empresa = repository.findById(id);
        return empresa.get();
    }
}