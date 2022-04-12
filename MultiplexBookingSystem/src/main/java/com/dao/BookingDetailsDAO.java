package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.BookingDetails;

@Repository
public interface BookingDetailsDAO {
	public void addBookingDetails(BookingDetails bookingDetails);
	public BookingDetails findBookingDetails(int id);
	public List<BookingDetails> findAllBookingDetails();
	public boolean updateBookingDetails(BookingDetails bookingDetails);
	public boolean deleteBookingDetails(BookingDetails bookingDetails);
}
