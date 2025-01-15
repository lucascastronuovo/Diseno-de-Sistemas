package com.dh.poo;

public class Amarillo implements Color{

    public void cambiar(Semaforo semaforo) {
        semaforo.setColor(new Rojo());
        System.out.println("Pasa a Color Rojo");
    }
}
