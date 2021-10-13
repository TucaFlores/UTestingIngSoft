package com.ingsoft.testing;

import com.ingsoft.entities.DetalleCarrito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CantidadDetalleCarritoTest {

    @Test
    public void cantidadDetalleCarrito(){
        //Revisamos que el detalle del carrito tenga una cantidad

        DetalleCarrito detalleCarrito = new DetalleCarrito();
        detalleCarrito.setCantArticulo(5);

        boolean flag;

        if (detalleCarrito.getCantArticulo() > 0){
            flag = true;
        }else {
            flag = false;
        }
        Assertions.assertTrue(flag);
    }
}
