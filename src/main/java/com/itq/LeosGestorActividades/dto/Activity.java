/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itq.LeosGestorActividades.dto;

import java.util.List;

/**
 * DATOS GENERALES DE LA ACTIVIDAD
 *
 * @author Papi Chulo Leito :D
 */
public class Activity {

    private String name;
    private List<Ocurrence> schedule;

    // GETTERS Y SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ocurrence> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Ocurrence> schedule) {
        this.schedule = schedule;
    }
}
