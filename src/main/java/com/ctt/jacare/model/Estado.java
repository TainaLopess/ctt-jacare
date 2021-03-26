package com.ctt.jacare.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Estado {

    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private String sigla;


}
