package com.melvinkimathi.microservices.hotelcatalogservice.dao;

import com.melvinkimathi.microservices.hotelcatalogservice.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
    //That's it no need to write any code ... LOL!!
}
