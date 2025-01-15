package com.dh.poo;

public class Papel extends Elemento{

    public void contra(Elemento elemento){
        elemento.contraPapel(this);
    }

    @Override
    public void contraPapel(Papel papel) {
        System.out.println("Empate");
    }

    @Override
    public void contraPiedra(Piedra piedra) {
        System.out.println("Gana Papel");
    }

    @Override
    public void contraTijera(Tijera tijera) {
        System.out.println("Gana Tijera");
    }
}
