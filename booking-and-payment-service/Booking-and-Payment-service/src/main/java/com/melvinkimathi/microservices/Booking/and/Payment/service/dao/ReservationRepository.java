package com.melvinkimathi.microservices.Booking.and.Payment.service.dao;

import com.melvinkimathi.microservices.Booking.and.Payment.service.dto.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
