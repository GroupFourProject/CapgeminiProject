package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.SeatType;


@Component
public class SeatTypeDAOImpl implements SeatTypeDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addSeatType(SeatType st) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(st);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public SeatType findSeatType(int SeatTypeId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		SeatType st=session.find(SeatType.class, SeatTypeId);
		return st;
	}

	@Override
	public List<SeatType> findAllSeatType() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<SeatType> stlist=session.createQuery("select s from SeatType s").list();
		
		return stlist;
	}

	@Override
	public boolean updateSeatType(SeatType st) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(st);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteSeatType(SeatType st) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(st);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
