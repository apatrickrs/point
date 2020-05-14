package com.andrew.point.services;

import java.util.List;
import java.util.Optional;

import com.andrew.point.entity.Funcionario;
import com.andrew.point.repositories.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> findAll() {
        return repository.findAll();
    }

    public Funcionario findById(Long id) {
        Optional<Funcionario> funcionario = repository.findById(id);
        return funcionario.get();
    }
}