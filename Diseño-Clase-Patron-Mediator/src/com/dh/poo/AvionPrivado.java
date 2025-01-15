package com.dh.poo;

public class AvionPrivado extends Colaborator{

    public void enviarMsgTexto(String texto)
    {
        getMediador().enviarMensaje(texto, this);
    }

    public void recibirMsgTexto(String texto)
    {
        System.out.println("Recibiendo mensaje: " + texto);
    }
}
