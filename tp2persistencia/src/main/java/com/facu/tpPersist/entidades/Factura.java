package com.facu.tpPersist.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura extends BaseEntidad{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private Date fecha;
    private double descuento;
    private String formaPago;
    private int total;

    @OneToOne
    @JoinColumn(name="Pedido_ID")
    private Pedido pedido;

}
