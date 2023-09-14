package com.facu.tpPersist.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedido extends BaseEntidad{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;
    private double subtotal;

    @ManyToOne
    @JoinColumn(name="Pedido_ID")
    private Pedido pedido;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "producto_id")
    private Producto producto;

}
