package com.tis4.matriz_ensino.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter
@NoArgsConstructor @AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Turma {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter
    @NotBlank
    private String nome;
  
    @Setter
    private String supervisor;
  
    @Setter
    private String professor;

    public Turma(String nome, String supervisor, String professor) {
        this.nome = nome;
        this.supervisor = supervisor;
        this.professor = professor;
    }

}