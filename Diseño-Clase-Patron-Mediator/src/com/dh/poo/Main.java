package com.dh.poo;

public class Main {

    public static void main(String[] args) {

        AvionComercial ac1 = new AvionComercial();
        AvionComercial ac2 = new AvionComercial();
        AvionComercial ac3 = new AvionComercial();
        AvionPrivado ap1 = new AvionPrivado();
        Helicoptero h1 = new Helicoptero();

        TorreDeControl torreEzeiza = new TorreDeControl(ac1,ac2,ac3,ap1,h1);

        ac3.enviar("Necesito aterrizar");

    }
}
