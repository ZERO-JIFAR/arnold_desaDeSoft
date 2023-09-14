package com.facu.tpPersist.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pedido extends BaseEntidad{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;
    private Date fecha;
    private String tipoEnvio;
    private double total;

    @ManyToOne
    @JoinColumn(name="Cliente_ID")
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL)
    private Factura factura;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "pedido")
    private List<DetallePedido> detallePedido = new ArrayList<>();

    public void addDetallePedido(DetallePedido detalle) {detallePedido.add(detalle);}
}
