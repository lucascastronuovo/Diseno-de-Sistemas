package com.dh.poo;

import java.util.ArrayList;

public class Director implements Observado{

    private String nombre;
    private String apellido;
    private boolean manoIzqLevantada;
    private boolean manoDerLevantada;
    private ArrayList<Observador> observadores;

    public Director()
    {
        observadores = new ArrayList<Observador>();
    }

    public String accion(boolean mano)
    {
        if(mano)
            return "levantada";

        return "no esta levantada";
    }

    public void notificar()
    {
        System.out.println("Mano Izquierda del Director: " + accion(isManoIzqLevantada()) + " Mano Derecha del Director: " + accion(isManoDerLevantada()));
        for(Observador observador:observadores)
            observador.accion(this);
    }

    public void agregarObservador(Observador observador)
    {
        observadores.add(observador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isManoIzqLevantada() {
        return manoIzqLevantada;
    }

    public void setManoIzqLevantada(boolean manoIzqLevantada) {
        this.manoIzqLevantada = manoIzqLevantada;
    }

    public boolean isManoDerLevantada() {
        return manoDerLevantada;
    }

    public void setManoDerLevantada(boolean manoDerLevantada) {
        this.manoDerLevantada = manoDerLevantada;
    }
}
