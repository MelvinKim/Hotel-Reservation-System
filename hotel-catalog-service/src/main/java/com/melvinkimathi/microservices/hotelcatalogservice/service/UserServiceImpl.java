package com.melvinkimathi.microservices.hotelcatalogservice.service;

import com.melvinkimathi.microservices.hotelcatalogservice.dao.UserRepository;
import com.melvinkimathi.microservices.hotelcatalogservice.entity.Room;
import com.melvinkimathi.microservices.hotelcatalogservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository theUserRepository) {
        this.userRepository = theUserRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long theId) {
        Optional<User> result = userRepository.findById(theId);

        User theUser = null;

        if(result.isPresent()) {
            theUser = result.get();
        } else {
            throw new RuntimeException("Did not find room id - " + theId);
        }

        return theUser;
    }

    @Override
    public User save(User theUser) {
        return userRepository.save(theUser);
    }

    @Override
    public void deleteById(Long theId) {
        userRepository.deleteById(theId);
    }
}
