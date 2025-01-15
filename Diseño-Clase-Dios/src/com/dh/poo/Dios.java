package com.dh.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Dios {

    private String nombre;
    private Collection<String> pedidos;


    private static Dios dios;

    //Evitar que se puedan crear por fuera de la clase objetos del tipo Dios
    private Dios(){
        pedidos = new ArrayList();
    }

    //Solo este método creará un dios y de esta manera controlamos el nro de instancias
    public static Dios getDios()
    {
        //lazy inicialization (inicializacion tardía)
        if(dios == null)
            dios = new Dios();

        return dios;
    }

    public void pedir(String oracion){
        pedidos.add(oracion);
        System.out.println("Tu pedido ha sido escuchado hijo. " + oracion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrameTodosLosPedidos(){
        int i = 1;
        for(String oracion:pedidos){
            System.out.println("pedido " + i + " " + oracion);
            i++;
        }
    }
}
