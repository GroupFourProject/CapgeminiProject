package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.BookingDetailsService;
import com.model.BookingDetails;

@RestController
public class BookingDetailsRestController {
	@Autowired 
	BookingDetailsService service;
	
	@GetMapping("/getbookingdetails")
	public List<BookingDetails> getAllBookingDetails() {
		   return service.findAll();
	}

	@PostMapping("/addbookingdetails")
	public String addBookingDetails(@RequestBody BookingDetails bookingDetails){
		service.add(bookingDetails);
		return "Booking details added successfully";
   }
}
