package com.ingsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CantidadDetalleCarrito {

    @Test
    public void cantidadDetalleCarritoTest(){
        //Revisamos que el detalle del carrito tenga una cantidad

        DetalleCarrito detalleCarrito = new DetalleCarrito();
        detalleCarrito.setCantidad(5);

        boolean flag;

        if (detalleCarrito.getCantidad() > 0){
            flag = true;
        }else {
            flag = false;
        }
        Assertions.assertTrue(flag);
    }
}
