package com.melvinkimathi.microservices.hotelcatalogservice.service;

import com.melvinkimathi.microservices.hotelcatalogservice.dao.RoomRepository;
import com.melvinkimathi.microservices.hotelcatalogservice.entity.Room;
import com.melvinkimathi.microservices.hotelcatalogservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    //perform dependency injection
    public RoomServiceImpl(RoomRepository theRoomRepository) {
        roomRepository = theRoomRepository;
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room findById(Long theId) {
        Optional<Room> result = roomRepository.findById(theId);

        Room theRoom = null;

        if(result.isPresent()) {
            theRoom = result.get();
        } else {
            throw new RuntimeException("Did not find room id - " + theId);
        }

        return theRoom;
    }

    @Override
    public Room save(Room theRoom) {
        return roomRepository.save(theRoom);
    }

    @Override
    public void deleteById(Long theId) {
        roomRepository.deleteById(theId);
    }

}
