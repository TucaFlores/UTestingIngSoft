package com.ingsoft.testing;

import com.ingsoft.entities.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrdenDeCompraFuncionesTest {

    @Test
    public void tienePrecio(){
        Usuario cli1 = new Usuario("Sebastian","Pepi","teasdawe@gmial.com",123456);

        MetodoPago metodoPago= new MetodoPago("Galicia","Credito");

        Proveedor prov1 = new Proveedor();

        Articulo articulo1= new Articulo("Helado",5,4.5,"Imagen1",prov1);
        Articulo  articulo2= new Articulo("Cafe",5,10,"Imagen2",prov1);

        DetalleCarrito detalleCarrito1 = new DetalleCarrito(articulo1,3);
        DetalleCarrito detalleCarrito2 = new DetalleCarrito(articulo2,2);

        Carrito carrito = new Carrito();
        carrito.getDetalles().add(detalleCarrito1);
        carrito.getDetalles().add(detalleCarrito2);

        OrdenDeCompra ordenDeCompra = new OrdenDeCompra(carrito,metodoPago,cli1);

        double monto = carrito.getMontoTotal();
        double ordenMonto = ordenDeCompra.getCarritoAsociado().getMontoTotal();
        Assertions.assertEquals(monto,ordenMonto);
    }

    @Test
    public void tienePago(){
        Usuario cli1 = new Usuario("Sebastian","Pepi","teasdawe@gmial.com",123456);

        MetodoPago metodoPago= new MetodoPago("Galicia","Credito");

        Proveedor prov1 = new Proveedor();

        Articulo  articulo1= new Articulo("Helado",5,4.5,"Imagen1",prov1);
        Articulo  articulo2= new Articulo("Cafe",5,10,"Imagen2",prov1);

        DetalleCarrito detalleCarrito1 = new DetalleCarrito(articulo1,3);
        DetalleCarrito detalleCarrito2 = new DetalleCarrito(articulo2,2);

        Carrito carrito = new Carrito();
        carrito.getDetalles().add(detalleCarrito1);
        carrito.getDetalles().add(detalleCarrito2);

        OrdenDeCompra ordenDeCompra = new OrdenDeCompra(carrito,metodoPago,cli1);

        boolean flag= false;
        if(ordenDeCompra.getFormaPago()==null){
            flag = true;
        }

        Assertions.assertFalse(flag);
    }

    @Test
    public void tieneCliente(){
        Usuario cli1 = new Usuario("Sebastian","Pepi","teasdawe@gmial.com",123456);

        MetodoPago metodoPago= new MetodoPago("Galicia","Credito");

        Proveedor prov1 = new Proveedor();

        Articulo  articulo1= new Articulo("Helado",5,4.5,"Imagen1",prov1);
        Articulo  articulo2= new Articulo("Cafe",5,10,"Imagen2",prov1);

        DetalleCarrito detalleCarrito1 = new DetalleCarrito(articulo1,3);
        DetalleCarrito detalleCarrito2 = new DetalleCarrito(articulo2,2);

        Carrito carrito = new Carrito();
        carrito.getDetalles().add(detalleCarrito1);
        carrito.getDetalles().add(detalleCarrito2);

        OrdenDeCompra ordenDeCompra = new OrdenDeCompra(carrito,metodoPago,cli1);

        boolean flag= false;
        if(ordenDeCompra.getCliente()==null){
            flag = true;
        }

        Assertions.assertFalse(flag);
    }
}
