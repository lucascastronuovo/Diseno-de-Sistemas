package com.dh.poo;

import java.util.Observable;

public class Main {

    public static void main(String[] args) {

        MusicoDeCuerda juan = new MusicoDeCuerda();
        MusicoDeCuerda pedro = new MusicoDeCuerda();
        MusicoViento martin = new MusicoViento();
        MusicoViento jorge = new MusicoViento();
        MusicoViento carlos = new MusicoViento();
        MusicoDePercusion rodrigo = new MusicoDePercusion();

        Director director = new Director();
        director.agregarObservador(juan);
        director.agregarObservador(pedro);
        director.agregarObservador(martin);
        director.agregarObservador(jorge);
        director.agregarObservador(carlos);
        director.agregarObservador(rodrigo);

        director.setManoIzqLevantada(false);
        director.setManoDerLevantada(true);
        director.notificar();
        //viento

        director.setManoIzqLevantada(true);
        director.setManoDerLevantada(false);
        director.notificar();
        //cuerda

        director.setManoIzqLevantada(true);
        director.setManoDerLevantada(true);
        director.notificar();
        //percusión
    }
}
