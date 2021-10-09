package com.melvinkimathi.microservices.hotelcatalogservice.service;

import com.melvinkimathi.microservices.hotelcatalogservice.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> findAll();

    Room findById(Long theId);

    Room save(Room theRoom);

    void deleteById(Long theId);
}
