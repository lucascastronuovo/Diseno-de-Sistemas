package com.dh.poo;

public class TXT implements TipoDocumento{


    public void exportar(Documento documento) {
        System.out.println("Exportando a TXT el contenido: " + documento.getTexto());
    }
}
