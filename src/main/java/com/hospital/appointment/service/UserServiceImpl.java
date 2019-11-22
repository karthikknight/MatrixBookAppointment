package com.hospital.appointment.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hospital.appointment.dao.UserDAO;
import com.hospital.appointment.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addUserAppt(User userAppt) {
		// TODO Auto-generated method stub
		this.userDAO.addUserAppt(userAppt);
	}

	@Override
	@Transactional
	public User getUserAppt(String confNum) {
		// TODO Auto-generated method stub
		return this.userDAO.getUserAppt(confNum);
	}

	
}
