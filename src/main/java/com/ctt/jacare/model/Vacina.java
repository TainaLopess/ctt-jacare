package com.ctt.jacare.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String origem;

}

