package com.ctt.jacare.service;

import com.ctt.jacare.model.Estado;

import java.util.List;


public interface EstadoService {

    List<Estado> findAll();

    Estado findById(Long id);

    Estado create(Estado estado);

    Estado update(Estado estado);

    void deleteById(Long id);
}
