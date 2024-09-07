package com.itq.LeosGestorActividades.dto;

import java.util.List;

/**
 *
 * @author Papi Chulo Leito :D
 */

// CLASE QUE CONTIENE UNA LISTA DE OCURRENCIAS DE ACTIVIDADES
public class Schedule {

    // LISTA DE OCURRENCIAS DE LA ACTIVIDAD (DÍAS Y HORAS)
    private List<Ocurrence> ocurrences;

    // GETTERS Y SETTERS PARA LOS ATRIBUTOS
    public List<Ocurrence> getOcurrences() {
        return ocurrences;
    }

    public void setOcurrences(List<Ocurrence> ocurrences) {
        this.ocurrences = ocurrences;
    }
}
