package com.dh.poo;

public class PDF implements TipoDocumento{

    public void exportar(Documento documento)
    {
        System.out.println("Exportando a PDF el contenido: " + documento.getTexto());
    }
}
