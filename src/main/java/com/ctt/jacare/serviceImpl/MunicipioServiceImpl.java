package com.ctt.jacare.serviceImpl;

import com.ctt.jacare.model.Municipio;
import com.ctt.jacare.repository.MunicipioRepository;
import com.ctt.jacare.service.MunicipioService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MunicipioServiceImpl implements MunicipioService {

    private final MunicipioRepository municipioRepository;

    public MunicipioServiceImpl(MunicipioRepository municipioRepository) {
        this.municipioRepository = municipioRepository;
    }

    @Override
    public List<Municipio> findAll() {
        return municipioRepository.findAll();
    }

    @Override
    public Municipio findById(Long id) {
        String message = String.format("Resource id %s not found", id);
        return this.municipioRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(message));
    }

    @Override
    public Municipio create(Municipio municipio) {
        return municipioRepository.save(municipio);
    }

    @Override
    public Municipio update(Municipio municipio) {
        return municipioRepository.save(municipio);
    }

    @Override
    public void deleteById(Long id) {
        Municipio municipio = this.findById(id);
        this.municipioRepository.delete(municipio);
    }
}
