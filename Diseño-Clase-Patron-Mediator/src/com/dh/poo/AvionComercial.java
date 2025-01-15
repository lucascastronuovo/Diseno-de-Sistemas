package com.dh.poo;

public class AvionComercial extends Colaborator{

    public void enviar(String texto)
    {
        getMediador().enviarMensaje(texto, this);

    }

    public void recibir(String texto)
    {
        System.out.println("Recibiendo mensaje: " + texto);
    }

}
