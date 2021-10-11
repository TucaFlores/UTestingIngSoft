package com.ingsoft;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carrito {

    private double montoTotal;

    private List<DetalleCarrito> detalles = new ArrayList<>();

    public double montoCarrito(List<DetalleCarrito> detalles){
        for (DetalleCarrito detalleCarrito : detalles) {
            this.montoTotal = this.montoTotal + (detalleCarrito.getArticulo().getPrecio())*(detalleCarrito.getCantArticulo());
        }
        return montoTotal;
    }

    public void addDetalles(DetalleCarrito detalleCarrito) {
        this.detalles.add(detalleCarrito);
    }
}
