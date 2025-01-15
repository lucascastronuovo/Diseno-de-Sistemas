package com.dh.poo;

public abstract class Colaborator {
    private Mediator mediador;
    private double distanciaPista;

    public void setMediador(Mediator mediador)
    {
        this.mediador = mediador;
    }

    public Mediator getMediador()
    {
        return mediador;
    }

    public double getDistanciaPista() {
        return distanciaPista;
    }

    public void setDistanciaPista(double distanciaPista) {
        this.distanciaPista = distanciaPista;
    }
}
