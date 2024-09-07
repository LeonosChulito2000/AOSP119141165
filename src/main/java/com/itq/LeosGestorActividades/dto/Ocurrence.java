package com.itq.LeosGestorActividades.dto;

/**
 *
 * @author Papi Chulo Leito :D
 */

// CLASE QUE REPRESENTA UNA OCURRENCIA DE UNA ACTIVIDAD EN UN DÍA ESPECÍFICO Y A UNA HORA DADA
public class Ocurrence {

    // DÍA DE LA SEMANA EN QUE OCURRE LA ACTIVIDAD
    private String dayOfWeek;

    // HORA EN QUE OCURRE LA ACTIVIDAD
    private String time;

    // GETTERS Y SETTERS PARA LOS ATRIBUTOS
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
