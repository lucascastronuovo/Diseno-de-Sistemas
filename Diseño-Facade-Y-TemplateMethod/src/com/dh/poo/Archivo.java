package com.dh.poo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Archivo {

    public void escribir(String texto)
    {
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("archivo.txt");
            fileOutputStream.write(texto.getBytes());


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
