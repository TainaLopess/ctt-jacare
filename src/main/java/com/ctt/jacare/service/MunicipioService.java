package com.ctt.jacare.service;

import com.ctt.jacare.model.Municipio;

import java.util.List;

public interface MunicipioService {
    List<Municipio> findAll();

    Municipio findById(Long id);

    Municipio create(Municipio municipio);

    Municipio update(Municipio municipio);

    void deleteById(Long id);
}
