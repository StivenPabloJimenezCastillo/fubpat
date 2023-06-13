package org.futbol.model;

import java.util.LinkedList;
import java.util.List;

public class Fecha {
    //atributos
    private int numero;

    //relaciones
    private Asignacion asignacion;
    private List<Partido>partidoList;

    //constructor
    public Fecha(int numero, Asignacion asignacion){
        this.numero = numero;
        this.asignacion = asignacion;
        this.partidoList = new LinkedList<>();
    }
    //setters y getters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public List<Partido> getPartidoList() {
        return partidoList;
    }

    public void setPartidoList(List<Partido> partidoList) {
        this.partidoList = partidoList;
    }

    //toString

    @Override
    public String toString() {
        return "Fecha{" + "numero=" + numero + '}';
    }
}
