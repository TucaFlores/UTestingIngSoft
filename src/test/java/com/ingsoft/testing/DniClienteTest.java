package com.ingsoft.testing;

import com.ingsoft.entities.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DniClienteTest {

    @Test
    public void dniCliente(){
        //Revisamos que el cliente tenga dni

        Usuario cliente = new Usuario();
        cliente.setDni(42010292);

        boolean flag;

        if (cliente.getDni() > 0){
            flag = true;
        }else {
            flag = false;
        }
        Assertions.assertTrue(flag);
    }
}
