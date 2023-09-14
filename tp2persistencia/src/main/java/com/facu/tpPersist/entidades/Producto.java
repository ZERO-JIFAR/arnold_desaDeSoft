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
public class Producto extends BaseEntidad{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private int tiempoEstimadoCocina;
    private String denoinacion;
    private double precioVenta;
    private double precioCompra;
    private int stockActual;
    private int stockMinimo;
    private String unidadMedida;
    private String receta;

    @ManyToOne
    @JoinColumn(name="DetallePedido_ID")
    private DetallePedido detallePedido;
    @ManyToOne
    @JoinColumn(name="Rubro_ID")
    private Rubro rubro;




}
