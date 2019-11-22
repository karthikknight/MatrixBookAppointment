package com.hospital.appointment.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.appointment.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
//	private SessionFactory sessionFactory;
	
	@Autowired
	UserRepository userRepo;

	
	
//	public void setSessionFactory(SessionFactory sf) {
//		this.sessionFactory = sf;
//	}

	@Override
	public void addUserAppt(User userAppt) {
		// TODO Auto-generated method stub
//		Session session = this.sessionFactory.getCurrentSession();
//		session.persist(userAppt);
		userRepo.save(userAppt);
		//entityManager.persist(userAppt);
	}

	@Override
	public User getUserAppt(String confNum) {
		// TODO Auto-generated method stub
//		Session session = this.sessionFactory.getCurrentSession();		
//		User user = (User) session.load(User.class, new String(confNum));
//		return user;
		return userRepo.findById(confNum).get();
		//return entityManager.find(User.class, confNum);
	}
	
}
