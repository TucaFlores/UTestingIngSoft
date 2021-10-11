package com.ingsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacturaFuncionalidad {

    @Test
    public void havePrice(){
        Usuario cli1 = new Usuario("Sebastian","Pepi","teasdawe@gmial.com",123456);

        MetodoPago metodoPago= new MetodoPago("Galicia","Credito");

        Articulo  articulo1= new Articulo("Helado",5,4.5);
        Articulo  articulo2= new Articulo("Cafe",5,10);

        DetalleCarrito detalleCarrito1 = new DetalleCarrito(articulo1,3);
        DetalleCarrito detalleCarrito2 = new DetalleCarrito(articulo2,2);

        Carrito carrito = new Carrito();
        carrito.getDetalles().add(detalleCarrito1);
        carrito.getDetalles().add(detalleCarrito2);

        OrdenDeCompra ordenDeCompra = new OrdenDeCompra(carrito,metodoPago,cli1);

        Factura factura = new Factura(cli1,ordenDeCompra,"12/5/2021");

        boolean flag= false;
        if(factura.getOrdenDeCompra()==null){
            flag = true;
        }
        Assertions.assertFalse(flag);
    }
}
