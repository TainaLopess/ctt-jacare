package com.ctt.jacare.serviceImpl;

import com.ctt.jacare.model.Vacina;
import com.ctt.jacare.repository.VacinaRepository;
import com.ctt.jacare.service.VacinaService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class VacinaServiceImpl implements VacinaService {

    private final VacinaRepository vacinaRepository;

    public VacinaServiceImpl(VacinaRepository vacinaRepository) {
        this.vacinaRepository = vacinaRepository;
    }

    @Override
    public List<Vacina> findAll() {
        return vacinaRepository.findAll();
    }

    @Override
    public Vacina findById(Long id) {
        String message = String.format("Resource id %s not found", id);
        return this.vacinaRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(message));
    }

    @Override
    public Vacina create(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    @Override
    public Vacina update(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    @Override
    public void deleteById(Long id) {
        Vacina vacina = this.findById(id);
        this.vacinaRepository.delete(vacina);
    }
}
