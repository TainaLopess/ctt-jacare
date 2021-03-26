package com.ctt.jacare.controller;

import com.ctt.jacare.model.Municipio;
import com.ctt.jacare.model.Vacina;
import com.ctt.jacare.service.VacinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jacare/vacinas")
public class VacinaController {

    private final VacinaService vacinaService;

    public VacinaController(VacinaService vacinaService) {
        this.vacinaService = vacinaService;
    }

    @GetMapping
    public ResponseEntity<List<Vacina>> findAll (){
        return new ResponseEntity<>(this.vacinaService.findAll(), HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Vacina> findById (@PathVariable Long Id) {
        return new ResponseEntity<>(this.vacinaService.findById(Id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Vacina> create (@RequestBody Vacina vacina) {
        return new ResponseEntity<>(this.vacinaService.create(vacina), HttpStatus.CREATED);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Vacina> update (@PathVariable Long id, @RequestBody Vacina vacina){
        vacina = this.vacinaService.findById(id);
        return new ResponseEntity<>(this.vacinaService.update(vacina), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        this.vacinaService.deleteById(id);
        return new ResponseEntity<>("Resource removed", HttpStatus.OK);
    }
}
