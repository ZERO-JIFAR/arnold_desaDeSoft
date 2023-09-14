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
public class Rubro extends BaseEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denoinacion;

    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true, mappedBy = "rubro")
    private List<Producto> productos = new ArrayList<>();

    public void addProducto (Producto producto){productos.add(producto);}
}
