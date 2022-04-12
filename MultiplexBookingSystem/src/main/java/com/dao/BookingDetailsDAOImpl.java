package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.BookingDetails;

@Component
public class BookingDetailsDAOImpl implements BookingDetailsDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	
	@Override
	public void addBookingDetails(BookingDetails bookingDetails) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(bookingDetails);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public BookingDetails findBookingDetails(int id) {
		Session session = sessionFactory.openSession();
		BookingDetails bookingDetails = session.find(BookingDetails.class, id);
		return bookingDetails;
	}

	@Override
	public List<BookingDetails> findAllBookingDetails() {
		Session session = sessionFactory.openSession();
		List<BookingDetails> bookingDetailsList = session.createQuery("select b from BookingDetails b").list();
		return bookingDetailsList;
	}

	@Override
	public boolean updateBookingDetails(BookingDetails bookingDetails) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(bookingDetails);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteBookingDetails(BookingDetails bookingDetails) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(bookingDetails);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return false;
	}
	
}
