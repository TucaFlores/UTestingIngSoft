package com.ingsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class No_Superar_Stock_Disponible {


    private Articulo  articulo= new Articulo("Helado",5,4.5);

    @Test
    public void controlarStockDiponible(){
        int cantArticuloSeleccionado = 5;
        boolean flag=false;
        if(cantArticuloSeleccionado<=articulo.getStock()){
            flag = true;
        }
        Assertions.assertTrue(flag);
    }
    
}
