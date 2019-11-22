package com.hospital.appointment.dao;

import org.springframework.data.repository.CrudRepository;

import com.hospital.appointment.model.User;

public interface UserRepository extends CrudRepository<User, String>{

}
