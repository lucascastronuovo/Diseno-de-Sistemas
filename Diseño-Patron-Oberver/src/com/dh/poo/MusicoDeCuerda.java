package com.dh.poo;

public class MusicoDeCuerda implements Observador{

    public void accion(Observado observado) {
        Director director = (Director) observado;

        if(director.isManoIzqLevantada() == true && director.isManoDerLevantada() == false)
            System.out.println("Tocando instrumentos de cuerda...");
    }
}
