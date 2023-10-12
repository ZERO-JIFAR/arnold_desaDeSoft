package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "libro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro extends Base{
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;
    @ManyToOne (cascade = CascadeType.REFRESH)
    private Autor autor;
}
