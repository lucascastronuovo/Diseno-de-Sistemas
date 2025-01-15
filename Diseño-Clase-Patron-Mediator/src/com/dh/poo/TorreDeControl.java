package com.dh.poo;

public class TorreDeControl implements Mediator{

    private AvionComercial avionComercial1;
    private AvionComercial avionComercial2;
    private AvionComercial avionComercial3;
    private AvionPrivado avionPrivado1;
    private Helicoptero helicoptero1;

    public TorreDeControl(AvionComercial ac1, AvionComercial ac2, AvionComercial ac3, AvionPrivado ap1, Helicoptero h1)
    {
        super();

        avionComercial1 = ac1;
        avionComercial2 = ac2;
        avionComercial3 = ac3;
        avionPrivado1 = ap1;
        helicoptero1 = h1;

        avionComercial1.setMediador(this);
        avionComercial2.setMediador(this);
        avionComercial3.setMediador(this);
        avionPrivado1.setMediador(this);
        helicoptero1.setMediador(this);
    }

    public void enviarMensaje(String texto, Colaborator emisor)
    {
            if(emisor == avionComercial1)
            {
                avionComercial2.recibir(texto);
                avionComercial3.recibir(texto);
                avionPrivado1.recibirMsgTexto(texto);

                if(!helicoptero1.receive(texto))
                    helicoptero1.receive(texto);
            }else if(emisor == avionComercial2){

                avionComercial1.recibir(texto);
                avionComercial3.recibir(texto);
                avionPrivado1.recibirMsgTexto(texto);

                if(!helicoptero1.receive(texto))
                    helicoptero1.receive(texto);

            }else if(emisor == avionComercial3){
                avionComercial1.recibir(texto);
                avionComercial2.recibir(texto);
                avionPrivado1.recibirMsgTexto(texto);

                if(!helicoptero1.receive(texto))
                    helicoptero1.receive(texto);
            }else if(emisor == avionPrivado1){
                avionComercial1.recibir(texto);
                avionComercial2.recibir(texto);
                avionComercial3.recibir(texto);


                if(!helicoptero1.receive(texto))
                    helicoptero1.receive(texto);

            }else if(emisor == helicoptero1){
                avionComercial1.recibir(texto);
                avionComercial2.recibir(texto);
                avionComercial3.recibir(texto);
                avionPrivado1.recibirMsgTexto(texto);
            }
    }

}
