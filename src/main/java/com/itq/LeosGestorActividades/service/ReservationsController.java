/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itq.LeosGestorActividades.service;

import com.itq.LeosGestorActividades.dto.Reservation;
import com.itq.LeosGestorActividades.dto.Activity;
import com.itq.LeosGestorActividades.dto.Ocurrence;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * CONTROLLER PARA EL MANEJO DE RESERVACIONES
 *
 * @author Papi Chulo Leito :D
 */
@RestController
@RequestMapping("/reservation")
public class ReservationsController {

    // MÉTODO POST PARA CREAR UNA RESERVACIÓN
    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> createReservation(@RequestBody Reservation reservation) {
        // AQUI SE IMPLEMENTARÁ LA LÓGICA PARA CREAR LA RESERVA
        // Ejemplo de creación de respuesta
        return new ResponseEntity<>("Reservación creada con éxito", HttpStatus.CREATED);
    }

    // MÉTODO GET PARA CONSULTAR UNA O MÁS RESERVACIONES
    @GetMapping
    public List<Reservation> getReservations(@RequestParam(required = false) String idRoom,
                                              @RequestParam(required = false) String idActivity) {
        // AQUI SE IMPLEMENTARÁ LA LÓGICA PARA CONSULTAR LAS RESERVACIONES
        return List.of(); // RETORNA UNA LISTA VACÍA COMO EJEMPLO
    }

    // MÉTODO PUT PARA ACTUALIZAR UNA RESERVA POR ID
    @PutMapping("/{idReservation}")
    public Reservation updateReservation(@PathVariable String idReservation,
                                          @RequestBody Reservation reservation) {
        // AQUI SE IMPLEMENTARÁ LA LÓGICA PARA ACTUALIZAR LA RESERVA
        return reservation; // RETORNA LA RESERVA ACTUALIZADA
    }

    // MÉTODO DELETE PARA ELIMINAR UNA RESERVA POR ID
    @DeleteMapping("/{idReservation}")
    public void deleteReservation(@PathVariable String idReservation) {
        // AQUI SE IMPLEMENTARÁ LA LÓGICA PARA ELIMINAR LA RESERVA
    }

    // MÉTODO GET PARA RECUPERAR LOS DATOS DE UNA RESERVACIÓN ESPECÍFICA
    @GetMapping("/specific")
    public Reservation readReservation(@RequestParam(value = "idClient") String idClient) {
        // AQUI SE CREA UNA INSTANCIA DE RESERVATION
        Reservation reservation = new Reservation();
        
        // SE CONFIGURAN LOS ATRIBUTOS DE LA RESERVA COMO EJEMPLO
        reservation.setIdClient(idClient);
        reservation.setStatus("ACTIVA");
        reservation.setRoom("Salón De Los PAPUS");

        Activity activity = new Activity();
        activity.setName("SABROSURA");

        // SE CONFIGURA EL HORARIO
        Ocurrence occurance = new Ocurrence();
        occurance.setDayOfWeek("Lun");
        occurance.setTime("13:30");

        List<Ocurrence> schedule = new ArrayList<>();
        schedule.add(occurance);
        activity.setSchedule(schedule);
        
        reservation.setActivity(activity);

        // SE DEVUELVE LA RESERVA
        return reservation;
    }
}
