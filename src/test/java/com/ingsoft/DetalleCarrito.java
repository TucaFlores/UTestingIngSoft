package com.ingsoft;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DetalleCarrito {

    private Articulo articulo;

    private int cantArticulo;
}
