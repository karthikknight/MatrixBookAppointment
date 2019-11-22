package com.hospital.appointment.service;

import com.hospital.appointment.model.User;

public interface UserService {

	public void addUserAppt(User userAppt);
	public User getUserAppt(String confNum);
}
