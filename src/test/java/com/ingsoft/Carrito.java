package com.ingsoft;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Carrito {

    private float montoTotal;

    private List<DetalleCarrito> detalles;
}
