package com.ingsoft.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Articulo {

    private String nombre;

    private int stock;

    private double precio;

    private String imagen;

    private Proveedor proveedor;
}

