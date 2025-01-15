package com.dh.poo;

public class Main {

    public static void main(String[] args) {

        Dios.getDios().setNombre("Maradona");
        Dios.getDios().pedir("Necesito un viaje");

        Universo universo = new Universo();
        universo.crearEstrella();


        Dios.getDios().mostrameTodosLosPedidos();

    }
}
