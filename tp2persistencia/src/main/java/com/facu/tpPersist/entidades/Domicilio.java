package com.facu.tpPersist.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Domicilio extends BaseEntidad {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String calle;
    private int numero;
    private String localidad;

    @ManyToOne
    @JoinColumn(name="Cliente_ID")
    private Cliente cliente;
}
