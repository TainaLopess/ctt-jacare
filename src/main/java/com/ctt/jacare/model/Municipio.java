package com.ctt.jacare.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Municipio {

    @Id
    //criando uma sequence
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Long id;

    @Column
    private String nome;

}
