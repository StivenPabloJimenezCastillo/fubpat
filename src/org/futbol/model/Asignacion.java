package org.futbol.model;

import java.util.LinkedList;
import java.util.List;

public class Asignacion {
    //atributos
    private boolean isIdaYVuelta = true;
  //relaciones
    private List<Fecha>fechaList;
    private Modalidad modalidad;
    private Temporada temporada;
    //constructor
    public Asignacion(Modalidad modalidad, Temporada temporada){
        this.modalidad = modalidad;
        this.temporada = temporada;
        this.fechaList = new LinkedList<>();
    }
    //setters y getters
    public Modalidad getModalidad(){
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }
    public Temporada getTemporada(){
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public void setIdaYVuelta(boolean idaYVuelta) {
        isIdaYVuelta = idaYVuelta;
    }

    public boolean isIdaYVuelta() {
        return isIdaYVuelta;
    }

    public List<Fecha> getFechaList() {
        return fechaList;
    }

    public void setFechaList(List<Fecha> fechaList) {
        this.fechaList = fechaList;
    }

    //metodos
    public void generarFechas(){
        int numeroEquipos =  temporada.getEquipoInscritoList().size();
        numeroEquipos--;
        int numeroFechas = isIdaYVuelta?numeroEquipos*=2:numeroEquipos;
        for (int i = 0; i < numeroFechas; i++) {
            fechaList.add(new Fecha(i+1,this));
        }
    }

//toString
    @Override
    public String toString() {
        return "Asignacion{" + ", modalidad=" + modalidad + '}';
    }
}
