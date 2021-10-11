package com.ingsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrecioNombreArticulo {

    @Test
    public void nombreArticuloTest(){
        //Revisamos que un articulo tenga nombre

        Articulo articulo = new Articulo();
        articulo.setNombre("art1");

        boolean flag;

        if (articulo.getNombre() != null){
            flag = true;
        }else {
            flag = false;
        }
        Assertions.assertTrue(flag);
    }

    @Test
    public void precioArticuloTest(){
        //Revisamos que un articulo tenga precio mayor a 0

        Articulo articulo = new Articulo();
        articulo.setPrecio(5.0);

        boolean flag;

        if (articulo.getPrecio() > 0.0){
            flag = true;
        }else {
            flag = false;
        }
        Assertions.assertTrue(flag);
    }

    @Test
    public void imagenArticuloTest(){
        //Revisamos que un articulo tenga imagen

        Articulo articulo = new Articulo();
        articulo.setImagen("Imagen1");

        boolean flag;

        if (articulo.getImagen() != null){
            flag = true;
        }else {
            flag = false;
        }
        Assertions.assertTrue(flag);
    }
}
