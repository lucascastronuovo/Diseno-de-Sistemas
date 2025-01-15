package com.dh.poo;

public class Piedra extends Elemento{

    public void contra(Elemento elemento){
        elemento.contraPiedra(this);
    }

    @Override
    public void contraPapel(Papel papel) {
        System.out.println("Gana Papel");
    }

    @Override
    public void contraPiedra(Piedra piedra) {
        System.out.println("Empate");
    }

    @Override
    public void contraTijera(Tijera tijera) {
        System.out.println("Gana Piedra");
    }
}
