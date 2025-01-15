package com.dh.poo;

//Null object
public class Apagado implements Color{

    public void cambiar(Semaforo semaforo) {
        semaforo.setColor(new Rojo());
        System.out.println("Pasa a Color Rojo");
    }
}
