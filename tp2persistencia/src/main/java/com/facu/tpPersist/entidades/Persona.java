package com.facu.tpPersist.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table (name = "persona") //se llama igual que la clase

public class Persona extends BaseEntidad{
    @Column(name = "nombre")
    private String nombre;
    private String apellido;
    private int edad;
}
