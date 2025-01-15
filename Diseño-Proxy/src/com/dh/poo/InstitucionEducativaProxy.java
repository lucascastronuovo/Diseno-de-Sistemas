package com.dh.poo;

import java.util.ArrayList;

public class InstitucionEducativaProxy implements IInstitucionEducativa{

    private InstitucionEducativa institucion = new InstitucionEducativa();
    private ArrayList<Carrera> carreras;

    public ArrayList<Carrera> getCarreras() {

        if(carreras == null) {
            carreras = new ArrayList<Carrera>();
            carreras = institucion.getCarreras();

        }

        return carreras;
   }


    public int getNro() {
        return institucion.getNro();
    }


    public void setNro(int nro) {
        institucion.setNro(nro);
    }


    public String getNombre() {
        return institucion.getNombre();
    }


    public void setNombre(String nombre) {
        institucion.setNombre(nombre);
    }


    public String getDireccion() {
        return institucion.getDireccion();
    }


    public void setDireccion(String direccion) {
        institucion.setDireccion(direccion);
    }


}
