package com.ingsoft.testing;

import com.ingsoft.entities.Articulo;
import com.ingsoft.entities.Proveedor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProveedorImagenArticuloTest {

    @Test
    public void imagenArticulo(){
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

    @Test
    public void proveedorArticulo(){
        //Revisamos que el articulo tenga un proveedor

        Articulo articulo = new Articulo();
        Proveedor proveedor = new Proveedor();
        articulo.setProveedor(proveedor);

        boolean flag;

        if (articulo.getProveedor() != null){
            flag = true;
        }else{
            flag = false;
        }
        Assertions.assertTrue(flag);
    }
}
