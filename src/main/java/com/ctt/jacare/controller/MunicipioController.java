package com.ctt.jacare.controller;

import com.ctt.jacare.model.Estado;
import com.ctt.jacare.model.Municipio;
import com.ctt.jacare.service.EstadoService;
import com.ctt.jacare.service.MunicipioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jacare/municipios")
public class MunicipioController {

    private final MunicipioService municipioService;

    public MunicipioController(MunicipioService municipioService) {
        this.municipioService = municipioService;
    }

    @GetMapping
    public ResponseEntity<List<Municipio>> findAll (){
        return new ResponseEntity<>(this.municipioService.findAll(), HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Municipio> findById (@PathVariable Long Id) {
        return new ResponseEntity<>(this.municipioService.findById(Id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Municipio> create (@RequestBody Municipio municipio) {
        return new ResponseEntity<>(this.municipioService.create(municipio), HttpStatus.CREATED);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Municipio> update (@PathVariable Long id, @RequestBody Municipio municipio){
        municipio = this.municipioService.findById(id);
        return new ResponseEntity<>(this.municipioService.update(municipio), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        this.municipioService.deleteById(id);
        return new ResponseEntity<>("Resource removed", HttpStatus.OK);
    }
}
