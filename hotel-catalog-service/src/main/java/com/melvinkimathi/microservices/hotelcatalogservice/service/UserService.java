package com.melvinkimathi.microservices.hotelcatalogservice.service;

import com.melvinkimathi.microservices.hotelcatalogservice.entity.Room;
import com.melvinkimathi.microservices.hotelcatalogservice.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long theId);

    User save(User theUser);

    void deleteById(Long theId);
}
