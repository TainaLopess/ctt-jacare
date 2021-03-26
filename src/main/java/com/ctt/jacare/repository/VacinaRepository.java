package com.ctt.jacare.repository;

import com.ctt.jacare.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository <Vacina, Long>{
}
