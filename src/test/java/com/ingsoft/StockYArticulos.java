package com.ingsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class StockYArticulos {

    @Test
    public void controlarStockDiponible(){//Que la cantidad de artículos seleccionado esten disponibles por dicho articulo
        Articulo  articulo1= new Articulo("Helado",5,4.5);
        Articulo  articulo2= new Articulo("Cafe",5,10);

        DetalleCarrito detalleCarrito1 = new DetalleCarrito(articulo1,3);
        DetalleCarrito detalleCarrito2 = new DetalleCarrito(articulo2,2);

        Carrito carrito = new Carrito();
        carrito.getDetalles().add(detalleCarrito1);
        carrito.getDetalles().add(detalleCarrito2);

        boolean flag=false;
        for(int i = 0; i<carrito.getDetalles().size();i++){
            flag = false;
            if (carrito.getDetalles().get(i).getCantArticulo()<=carrito.getDetalles().get(i).getArticulo().getStock()){
                flag = true;
            }
        }
        Assertions.assertTrue(flag);
    }

    @Test
    public void controlarSeleccionArticulos(){//La cantidad de articulos seleccionados no puede ser <1
        Articulo  articulo1= new Articulo("Helado",5,4.5);
        Articulo  articulo2= new Articulo("Cafe",5,10);

        DetalleCarrito detalleCarrito1 = new DetalleCarrito(articulo1,3);
        DetalleCarrito detalleCarrito2 = new DetalleCarrito(articulo2,2);

        Carrito carrito = new Carrito();
        carrito.getDetalles().add(detalleCarrito1);
        carrito.getDetalles().add(detalleCarrito2);


        boolean flag=false;
        for(int i = 0; i<carrito.getDetalles().size();i++){
            flag = false;
            if(carrito.getDetalles().get(i).getCantArticulo()>1){
                flag = true;
            }
        }

        Assertions.assertTrue(flag);
    }
}
