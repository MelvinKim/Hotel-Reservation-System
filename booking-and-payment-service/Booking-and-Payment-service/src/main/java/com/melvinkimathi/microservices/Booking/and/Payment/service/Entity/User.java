package com.melvinkimathi.microservices.Booking.and.Payment.service.Entity;

import com.melvinkimathi.microservices.Booking.and.Payment.service.Entity.Room;
import com.melvinkimathi.microservices.Booking.and.Payment.service.dto.Reservation;
import com.paypal.api.payments.Payment;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "loyalty_points")
    private int loyaltyPoints;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "user",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH}
    )
    private List<Room> rooms;

//    @OneToMany(
//            fetch = FetchType.LAZY,
//            mappedBy = "user",
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
//                    CascadeType.DETACH, CascadeType.REFRESH
//            }
//    )
//    private List<Reservation> reservations;

//    @OneToMany(
//            fetch = FetchType.LAZY,
//            mappedBy = "user",
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
//                    CascadeType.DETACH, CascadeType.REFRESH
//            }
//    )
//    private List<Review> reviews;

}

