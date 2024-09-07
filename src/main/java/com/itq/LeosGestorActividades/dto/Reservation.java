/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itq.LeosGestorActividades.dto;

/**
 *
 * @author Papi Chulo Leito :D
 */

// CLASE PARA REPRESENTAR UNA RESERVACIÓN HECHA POR UN CLIENTE
public class Reservation {

    // IDENTIFICADOR ÚNICO DEL CLIENTE
    private String idClient;

    // ESTADO DE LA RESERVACIÓN (ACTIVA, CANCELADA, COMPLETADA)
    private String status;

    // NOMBRE DEL SALÓN DONDE OCURRE LA ACTIVIDAD
    private String room;

    // OBJETO QUE REPRESENTA LA ACTIVIDAD RESERVADA
    private Activity activity;

    // GETTERS Y SETTERS PARA LOS ATRIBUTOS
    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
