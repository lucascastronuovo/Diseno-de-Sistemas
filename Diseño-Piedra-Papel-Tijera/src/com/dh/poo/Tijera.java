package com.dh.poo;

public class Tijera extends Elemento{

    public void contra(Elemento elemento){
        elemento.contraTijera(this);
    }

    @Override
    public void contraPapel(Papel papel) {
        System.out.println("Gana Tijera");
    }

    @Override
    public void contraPiedra(Piedra piedra) {
        System.out.println("Gana Piedra");
    }

    @Override
    public void contraTijera(Tijera tijera) {
        System.out.println("Empate");
    }
}
