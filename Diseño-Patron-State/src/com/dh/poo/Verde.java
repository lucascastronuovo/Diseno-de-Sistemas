package com.dh.poo;

public class Verde implements Color{

    public void cambiar(Semaforo semaforo) {
        semaforo.setColor(new Amarillo());
        System.out.println("Pasa a Color Amarillo");
    }
}
