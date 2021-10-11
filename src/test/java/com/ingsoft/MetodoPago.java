package com.ingsoft;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MetodoPago {
    private String banco;
    private String tipo;//Credito o debito
}
