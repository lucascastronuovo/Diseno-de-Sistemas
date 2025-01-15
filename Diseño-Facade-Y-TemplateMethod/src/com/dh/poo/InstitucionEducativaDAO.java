package com.dh.poo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.sql.*;
import java.util.ArrayList;

public class InstitucionEducativaDAO extends InstitucionEducativaAbstractDAO implements IInstitucionEducativa{

    private int nro;
    private String nombre;
    private String direccion;


    public ResultSet ejecutarSentenciaCarreras(Statement statement){
        //4 (modificar) Ejecutamos una sentencia SQL a la base de datos
        try {
            return statement.executeQuery("SELECT C.ID, C.NOMBRE, C.TITULO FROM CARRERAS C INNER JOIN CARRERAS_INSTITUCION CI INNER JOIN INSTITUCIONES I WHERE C.ID = CI.ID_CARRERA AND CI.ID_INSTITUCION = I.ID AND I.NRO = " + nro);
        } catch (SQLException e) {
            e.printStackTrace();
            Archivo archivo = new Archivo();
            archivo.escribir(e.getMessage());
        }
        return null;

    }

    public ResultSet ejecutarSentenciaDocentes(Statement statement){

        //4 (modificar) Ejecutamos una sentencia SQL a la base de datos
        try {
            ResultSet rs = statement.executeQuery("SELECT D.ID, D.NOMBRE, D.APELLIDO, D.LEGAJO FROM DOCENTES D INNER JOIN DOCENTES_INSTITUCION DI INNER JOIN INSTITUCIONES I WHERE D.ID = DI.ID_DOCENTE AND DI.ID_INSTITUCION = I.ID AND I.NRO = " + nro);
        } catch (SQLException e) {
            e.printStackTrace();
            Archivo archivo = new Archivo();
            archivo.escribir(e.getMessage());
        }

        return null;
    }

    public ArrayList<Carrera> evaluacionResultadoCarreras(ResultSet rs)
    {
        ArrayList<Carrera> carreras = null;
        try{

            //5 (modeificar) Evaluación de los resultados
            while(rs.next()){
                Carrera carrera = new Carrera();
                carrera.setNombre( rs.getString("NOMBRE") );
                carrera.setTitulo( rs.getString("TITULO") );
                carreras.add(carrera);
            }

        }catch(SQLException ex) {
            ex.printStackTrace();
            Archivo archivo = new Archivo();
            archivo.escribir(ex.getMessage());
        }

        return carreras;

    }

    public ArrayList<Docente> evaluacionResultadoDocentes(ResultSet rs)
    {

        ArrayList<Docente> docentes = null;
        try{

            //5 (modeificar) Evaluación de los resultados
            while(rs.next()){
                Docente docente = new Docente();
                docente.setNombre( rs.getString("NOMBRE") );
                docente.setApellido( rs.getString("APELLIDO") );
                docente.setLegajo(rs.getInt("LEGAJO"));
                docentes.add(docente);
            }

        }catch(SQLException ex) {
            ex.printStackTrace();
            Archivo archivo = new Archivo();
            archivo.escribir(ex.getMessage());
        }

        return docentes;
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
