package com.ingsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TotalCarrito {



    @Test
    void montoTotalCarritoTest(){
        //Se revisa que el monto total del carrito sea igual a la suma de los precios de los articulos
        //multiplicados por la cantidad de cada articulo

        Carrito carrito = new Carrito();

        double resultadoEsperado = 43.9;

        Articulo art1 = new Articulo("art1", 4.5);
        Articulo art2 = new Articulo("art2",  10.9);
        Articulo art3 = new Articulo("art3", 1.95);

        DetalleCarrito detalle1 =  new DetalleCarrito(3, art1);
        DetalleCarrito detalle2 =  new DetalleCarrito(1, art2);
        DetalleCarrito detalle3 =  new DetalleCarrito(10, art3);


        carrito.getDetalles().add(detalle1);
        carrito.getDetalles().add(detalle2);
        carrito.getDetalles().add(detalle3);

        double resultado = carrito.montoCarrito(carrito.getDetalles());

        Assertions.assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void montoCarritoVacioTest(){
        //Revisamos que el monto del carrito vacio sea 0

        Carrito carrito = new Carrito();

        double resultadoEsperado= 0.0;
        double resultado;

        if (carrito.getDetalles().isEmpty()){
            resultado = 0.0;
        }else{
            resultado = carrito.montoCarrito(carrito.getDetalles());
        }
        Assertions.assertEquals(resultadoEsperado,resultado);
    }

}
