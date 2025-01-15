package com.dh.poo;

public class WORD implements TipoDocumento{

    public void exportar(Documento documento) {
        System.out.println("Exportando a Word el contenido: " + documento.getTexto());
    }
}
