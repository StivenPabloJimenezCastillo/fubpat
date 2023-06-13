package org.futbol.model;

import java.util.Date;

public class Partido {
    //enumerados
 private Estado estado;

 //atributos
    private Date fecha;

    //relaciones

    private EquipoInscrito local;
    private EquipoInscrito visitante;
    private Fecha fechaHora;
    private Marcador marcador;

//constructor
    public Partido(){
        estado = Estado.NO_INICIADO;
        marcador = new Marcador();
    }
    private class Marcador{

    }

}
