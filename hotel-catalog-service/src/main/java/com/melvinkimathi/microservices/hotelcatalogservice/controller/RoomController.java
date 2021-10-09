package com.melvinkimathi.microservices.hotelcatalogservice.controller;

import com.melvinkimathi.microservices.hotelcatalogservice.entity.Room;
import com.melvinkimathi.microservices.hotelcatalogservice.entity.User;
import com.melvinkimathi.microservices.hotelcatalogservice.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService theRoomService) {
        roomService = theRoomService;
    }

    //get all the rooms
    @GetMapping("/rooms")
    public List<Room> listRooms() {
        //get rooms from the db
        List<Room> rooms = roomService.findAll();
        return rooms;
    }

    //save /update a room
    @PostMapping("/rooms")
    public Room createRoom(@RequestBody Room theRoom) {
        return roomService.save(theRoom);
    }

    //get a specific room
    @GetMapping("/rooms/{roomId}")
    public Room getRoom(@PathVariable("roomId") Long roomId) {
        return  roomService.findById(roomId);
    }


    //delete a specific room
    @DeleteMapping("/rooms/{roomId}")
    public void deleteRoom(@PathVariable("roomId") Long roomId) {
        roomService.deleteById(roomId);
    }




}
