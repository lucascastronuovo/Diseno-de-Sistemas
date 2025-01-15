package com.dh.poo;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Documento documento = new Documento();
        documento.setAutor("Hugo Ligero");
        documento.setFechaCreacion(new Date());
        documento.setNombre("Test");
        documento.setTexto("contenido de prueba");


        //setear una estrategia en este caso PDF
        //documento.setTipoDocumento(new PDF());
        documento.exportar();

        //setear una estrategia en este otro caso TXT
        documento.setTipoDocumento(new TXT());
        documento.exportar();
    }
}
