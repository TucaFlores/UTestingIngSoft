package com.ingsoft;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrdenDeCompra {

    private Carrito carritoAsociado;
    private MetodoPago formaPago;
    private Usuario cliente;
}
