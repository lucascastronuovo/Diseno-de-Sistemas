package com.dh.poo;

public class MusicoViento implements Observador
{
    public void accion(Observado observado)
    {
        Director director = (Director) observado;

        if(director.isManoIzqLevantada() == false && director.isManoDerLevantada() == true)
            System.out.println("Tocando instrumentos de viento...");

    }
}
