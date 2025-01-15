package com.dh.poo;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class InstitucionEducativaAbstractDAO {


    public void levantarDriver()
    {
        System.out.println("Yendo a buscar datos a la base de datos...");
        try {

            Class.forName("org.h2.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Archivo archivo = new Archivo();
            archivo.escribir(e.getMessage());
        }
    }

    public Connection conectarBaseDatos()
    {
        //2 Conectarnos a la base de datos
        try {

            return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

        } catch (SQLException e) {
            e.printStackTrace();
            Archivo archivo = new Archivo();
            archivo.escribir(e.getMessage());
        }

        return null;
    }

    public Statement crearSentencia(Connection connection)
    {
        //3 Crearmos una sentencia a la basa de datos
        try {
            return connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            Archivo archivo = new Archivo();
            archivo.escribir(e.getMessage());
        }

        return null;
    }

    public void cerrarConexion(Connection conn) {
        //6 Cerrar conexion a la base de datos
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            Archivo archivo = new Archivo();
            archivo.escribir(e.getMessage());
        }
    }

    public void loguearOK() {

        //7 Guardar en un archivo que fue exitosa la consulta
        Archivo archivo = new Archivo();
        archivo.escribir("Se obtuvieron correctamente los datos");
    }


    public abstract ResultSet  ejecutarSentenciaCarreras(Statement statement);

    public abstract ResultSet  ejecutarSentenciaDocentes(Statement statement);

    public abstract ArrayList<Carrera>  evaluacionResultadoCarreras(ResultSet rs);

    public abstract  ArrayList<Docente>  evaluacionResultadoDocentes(ResultSet rs);


    public ArrayList<Carrera> getCarreras()
    {
        levantarDriver();
        Connection con = conectarBaseDatos();
        Statement statement = crearSentencia(con);
        //diferente
        ResultSet resultado = ejecutarSentenciaCarreras(statement);
        //diferente
        ArrayList<Carrera> carreras = evaluacionResultadoCarreras(resultado);
        cerrarConexion(con);
        loguearOK();

        return carreras;

    }

    public ArrayList<Docente> getDocentes()
    {
        levantarDriver();
        Connection con = conectarBaseDatos();
        Statement statement = crearSentencia(con);
        //diferente
        ResultSet resultado =  ejecutarSentenciaDocentes(statement);
        //diferente
        ArrayList<Docente> docentes = evaluacionResultadoDocentes(resultado);
        cerrarConexion(con);
        loguearOK();

        return docentes;
    }
}
