package com.melvinkimathi.microservices.hotelcatalogservice.dao;

import com.melvinkimathi.microservices.hotelcatalogservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
