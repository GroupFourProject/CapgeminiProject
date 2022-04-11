package com.dao;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Userr;

@Component
public class UserrDAOImpl implements UserrDAO {
	
	@Autowired//(required = false)
	SessionFactory sessionFactory;
	
	

	@Override
	public void addUserr(Userr userr) {
		
		Session session= sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(userr);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public Userr findUserr(int id) {
		
		
		Session session=sessionFactory.openSession();
	    Userr user=session.find(Userr.class, id);
		return user;
	}

	@Override
	public List<Userr> findAllUserr() {
		
		Session session=sessionFactory.openSession();
		List<Userr> userrlist=session.createQuery("select u from Userr u").list();
		
		return userrlist;
	}

	@Override
	public boolean updateUserr(Userr userr) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(userr);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteUserr(Userr userr) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(userr);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return false;
	}

}
