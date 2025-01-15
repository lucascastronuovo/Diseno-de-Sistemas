package com.dh.poo;

public class Rojo implements Color{

    public void cambiar(Semaforo semaforo) {
        semaforo.setColor(new Verde());
        System.out.println("Pasa a Color Verde");
    }
}
