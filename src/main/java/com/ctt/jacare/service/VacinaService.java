package com.ctt.jacare.service;

import com.ctt.jacare.model.Estado;
import com.ctt.jacare.model.Vacina;

import java.util.List;

public interface VacinaService {
    List<Vacina> findAll();

    Vacina findById(Long id);

    Vacina create(Vacina vacina);

    Vacina update(Vacina vacina);

    void deleteById(Long id);
}
