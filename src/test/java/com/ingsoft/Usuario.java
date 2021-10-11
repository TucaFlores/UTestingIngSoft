package com.ingsoft;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Usuario {

    private String nombre;
    private String apellido;
    private String mail;
    private int dni;

}
