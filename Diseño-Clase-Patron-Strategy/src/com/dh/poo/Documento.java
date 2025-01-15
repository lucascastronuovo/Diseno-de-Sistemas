package com.dh.poo;

import java.util.Date;

public class Documento {

    private String nombre;
    private String titulo;
    private String subTitulo;
    private String texto;
    private String autor;
    private Date fechaCreacion;
    private TipoDocumento tipoDocumento;


    public Documento()
    {
        tipoDocumento = new Nada();
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento)
    {
        this.tipoDocumento = tipoDocumento;
    }

    //Método mas importante del patrón
    //es la acción que queremos que se haga de difente manera
    public void exportar()
    {
        tipoDocumento.exportar(this);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
