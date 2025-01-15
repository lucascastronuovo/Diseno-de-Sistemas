package com.dh.poo;

public class MusicoDePercusion implements Observador{

    public void accion(Observado observado) {
        Director director = (Director) observado;

        if(director.isManoIzqLevantada() == true && director.isManoDerLevantada() == true)
            System.out.println("Tocando instrumentos de percusión...");

    }
}
