package com.dh.poo;

public class Semaforo {

    private Color color;

    public Semaforo()
    {
        color = new Apagado();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void cambiar(){
        color.cambiar(this);
    }


}
