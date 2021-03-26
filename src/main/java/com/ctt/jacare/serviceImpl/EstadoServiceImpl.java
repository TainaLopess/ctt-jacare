package com.ctt.jacare.serviceImpl;

import com.ctt.jacare.model.Estado;
import com.ctt.jacare.repository.EstadoRepository;
import com.ctt.jacare.service.EstadoService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EstadoServiceImpl implements EstadoService {

    private final EstadoRepository estadoRepository;

    public EstadoServiceImpl(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }


    @Override
    public Estado findById(Long id) {
        String message = String.format("Resource id %s not found", id);
        return this.estadoRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(message));
    }

    @Override
    public Estado create(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Override
    public Estado update(Estado estado) {
        return estadoRepository.save(estado);
    }


    @Override
    public void deleteById(Long id) {
        Estado estado = this.findById(id);
        this.estadoRepository.delete(estado);
    }
}
