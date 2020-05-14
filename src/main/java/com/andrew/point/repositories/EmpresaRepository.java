package com.andrew.point.repositories;

import com.andrew.point.entity.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    
    @Transactional(readOnly = true)
    Empresa findByCnpj(String cnpj);
}
