package com.melvinkimathi.microservices.Booking.and.Payment.service.service;

import com.melvinkimathi.microservices.Booking.and.Payment.service.Entity.Room;
import com.melvinkimathi.microservices.Booking.and.Payment.service.dao.ReservationRepository;
import com.melvinkimathi.microservices.Booking.and.Payment.service.dto.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository theReservationRepository) {
        reservationRepository = theReservationRepository;
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(Long theId) {
        Optional<Reservation> result = reservationRepository.findById(theId);

        Reservation theReservation = null;

        if(result.isPresent()) {
            theReservation = result.get();
        } else {
            throw new RuntimeException("Did not find reservation id - " + theId);
        }

        return theReservation;
    }

    @Override
    public Reservation save(Reservation theReservation) {
        return reservationRepository.save(theReservation);
    }

    @Override
    public void deleteById(Long theId) {
        reservationRepository.deleteById(theId);
    }
}
