package com.dh.poo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {

        IInstitucionEducativa institucion = new InstitucionEducativa();
        institucion.setNro(1);
        institucion.setNombre("Universidad de Palermo");
        institucion.setDireccion("Mario Bravo 1050");


        ArrayList<Carrera> carreras = institucion.getCarreras();
        System.out.println("Carreras");
        for(Carrera carrera: carreras){
            System.out.println("    Nombre: " + carrera.getNombre());
            System.out.println("    Titulo: " + carrera.getTitulo());
        }

        carreras = institucion.getCarreras();
        System.out.println("Carreras");
        for(Carrera carrera: carreras){
            System.out.println("    Nombre: " + carrera.getNombre());
            System.out.println("    Titulo: " + carrera.getTitulo());
        }
    }
}
