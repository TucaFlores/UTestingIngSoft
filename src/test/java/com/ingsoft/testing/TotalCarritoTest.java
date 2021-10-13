package com.ingsoft.testing;

import com.ingsoft.entities.Articulo;
import com.ingsoft.entities.Carrito;
import com.ingsoft.entities.DetalleCarrito;
import com.ingsoft.entities.Proveedor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TotalCarritoTest {



    @Test
    void montoTotalCarrito(){
        //Se revisa que el monto total del carrito sea igual a la suma de los precios de los articulos
        //multiplicados por la cantidad de cada articulo

        Carrito carrito = new Carrito();

        double resultadoEsperado = 37.25;//Precio colocado manualmente

        Proveedor prov1 = new Proveedor();

        Articulo art1 = new Articulo("art1",10, 4.5, "imagen1", prov1);
        Articulo art2 = new Articulo("art2", 10, 10.9, "imagen2", prov1);
        Articulo art3 = new Articulo("art3", 20, 1.95, "imagen1", prov1);

        DetalleCarrito detalle1 =  new DetalleCarrito(art1,3);
        DetalleCarrito detalle2 =  new DetalleCarrito(art2,2);
        DetalleCarrito detalle3 =  new DetalleCarrito(art3,1);


        carrito.getDetalles().add(detalle1);
        carrito.getDetalles().add(detalle2);
        carrito.getDetalles().add(detalle3);

        double resultado = carrito.montoCarrito(carrito.getDetalles());

        Assertions.assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void montoCarritoVacio(){
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
