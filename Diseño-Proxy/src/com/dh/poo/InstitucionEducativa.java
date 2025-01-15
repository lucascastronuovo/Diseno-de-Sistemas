package com.dh.poo;

import java.sql.*;
import java.util.ArrayList;

public class InstitucionEducativa implements IInstitucionEducativa{

    private int nro;
    private String nombre;
    private String direccion;

    public ArrayList<Carrera> getCarreras()
    {

        Connection conn = null;
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();
        try {
            System.out.println("Llendo a buscar datos a la base de datos...");
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT C.ID, C.NOMBRE, C.TITULO FROM CARRERAS C INNER JOIN CARRERAS_INSTITUCION CI INNER JOIN INSTITUCIONES I WHERE C.ID = CI.ID_CARRERA AND CI.ID_INSTITUCION = I.ID AND I.NRO = " + nro);
            while(rs.next()){
                Carrera carrera = new Carrera();
                carrera.setNombre( rs.getString("NOMBRE") );
                carrera.setTitulo( rs.getString("TITULO") );
                carreras.add(carrera);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return carreras;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
