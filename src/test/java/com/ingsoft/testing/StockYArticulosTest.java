package com.ingsoft.testing;

import com.ingsoft.entities.Articulo;
import com.ingsoft.entities.Carrito;
import com.ingsoft.entities.DetalleCarrito;
import com.ingsoft.entities.Proveedor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class StockYArticulosTest {

    @Test
    public void controlarStockDiponible(){//Que la cantidad de artículos seleccionado esten disponibles por dicho articulo
        Proveedor prov1 = new Proveedor();

        Articulo articulo1= new Articulo("Helado",5,4.5,"Imagen1",prov1);
        Articulo  articulo2= new Articulo("Cafe",5,10,"Imagen2",prov1);

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
        Proveedor prov1 = new Proveedor();

        Articulo  articulo1= new Articulo("Helado",5,4.5,"Imagen1",prov1);
        Articulo  articulo2= new Articulo("Cafe",5,10,"Imagen2",prov1);

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
