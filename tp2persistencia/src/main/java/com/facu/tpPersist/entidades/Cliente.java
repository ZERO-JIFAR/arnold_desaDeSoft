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

public class Cliente extends BaseEntidad{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private int telefono;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "cliente")
    private List<Domicilio> domicilios = new ArrayList<Domicilio>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<Pedido>();

    public void addDomicilio (Domicilio domi){domicilios.add(domi);}
    public void addPedido (Pedido pedido){pedidos.add(pedido);}

}
