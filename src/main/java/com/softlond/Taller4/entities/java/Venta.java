package com.softlond.Taller4.entities.java;

import jakarta.persistence.*;

public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double montoTotal;
    private boolean aplicarDescuento;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isAplicarDescuento() {
        return aplicarDescuento;
    }

    public void setAplicarDescuento(boolean aplicarDescuento) {
        this.aplicarDescuento = aplicarDescuento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
