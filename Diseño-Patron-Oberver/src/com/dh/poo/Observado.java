package com.dh.poo;

//Observado == Observable de Java
public interface Observado {
    public void notificar();
    public void agregarObservador(Observador observador);
}
