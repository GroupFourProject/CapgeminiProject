package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.BookingDetails;

@Service
public class BookingDetailsService {
	@Autowired
	BookingDetailsDAO bookingDetailsDAOImpl;
	
	public void add(BookingDetails bookingDetails) {
		bookingDetailsDAOImpl.addBookingDetails(bookingDetails);
	}
	
	public BookingDetails find(int id) {
		return bookingDetailsDAOImpl.findBookingDetails(id);
	}
	
	public List<BookingDetails> findAll(){
		return bookingDetailsDAOImpl.findAllBookingDetails();
	}
	
	public boolean update(BookingDetails bookingDetails) {
		return bookingDetailsDAOImpl.updateBookingDetails(bookingDetails);
	}
	
	public boolean delete(BookingDetails bookingDetails) {
		return bookingDetailsDAOImpl.deleteBookingDetails(bookingDetails);
	}
}
