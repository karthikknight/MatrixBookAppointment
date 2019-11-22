package com.hospital.appointment.dao;

import com.hospital.appointment.model.User;

public interface UserDAO {

	public void addUserAppt(User userAppt);
	public User getUserAppt(String confNum);
}
