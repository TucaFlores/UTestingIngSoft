package com.ingsoft;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Factura {

    private Usuario cliente;

    private OrdenDeCompra ordenDeCompra;

    private String date;

}
