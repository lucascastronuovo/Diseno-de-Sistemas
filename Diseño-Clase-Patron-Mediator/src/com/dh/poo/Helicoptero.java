package com.dh.poo;

public class Helicoptero extends Colaborator{

    public boolean send(String texto){

        try {

            getMediador().enviarMensaje(texto, this);

        }catch(Exception ex) {
            return false;
        }

        return true;
    }

    public boolean receive(String texto)
    {
        System.out.println("Recibiendo mensaje: " + texto);
        return true;
    }
}
