package com.ingsoft.entities;

import com.ingsoft.entities.Articulo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleCarrito {

    private Articulo articulo;

    private int cantArticulo;
}
