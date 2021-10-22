package com.melvinkimathi.microservices.Booking.and.Payment.service.service;


import com.melvinkimathi.microservices.Booking.and.Payment.service.dto.Reservation;

import java.util.List;

public interface ReservationService {

    List<Reservation> findAll();

    Reservation findById(Long theId);

    Reservation save(Reservation theReservation);

    void deleteById(Long theId);

}
