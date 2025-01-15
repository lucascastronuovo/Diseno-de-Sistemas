package com.dh.poo;

import java.util.ArrayList;

public interface IInstitucionEducativa {

    public ArrayList<Carrera> getCarreras();
    public int getNro();
    public void setNro(int nro);
    public String getNombre();
    public void setNombre(String nombre);
    public String getDireccion();
    public void setDireccion(String direccion);

}
