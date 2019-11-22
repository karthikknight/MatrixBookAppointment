package com.hospital.appointment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hospital.appointment.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addUserAppt(User userAppt) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(userAppt);
	}

	@Override
	public User getUserAppt(String confNum) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		User user = (User) session.load(User.class, new String(confNum));
		return user;
	}
}
