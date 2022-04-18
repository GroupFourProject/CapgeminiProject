package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.SeatTypeService;
import com.model.SeatType;

@RestController
public class SeatTypeController {

	@Autowired
	SeatTypeService service;
	
	@GetMapping("/getseattype")
	public List<SeatType> getAllSeatType(){
		return service.findAll();
	}
	
	@PostMapping("/addseattype")
	public ResponseEntity<?> addSeatType(@RequestBody SeatType st){
		service.add(st);
		return ResponseEntity.status(HttpStatus.OK).body("Entity seattype added successfully");
	}
	
/*	@DeleteMapping("/delete/{seatTypeId}")
		public ResponseEntity<?> deleteItem(@PathVariable int seatTypeId) throws DeleteSeatTypeException{
			SeatType st=service.find(seatTypeId);
			if(st==null) {
				throw new DeleteSeatTypeException(seatTypeId);
			}
			service.delete(seatTypeId);
			return ResponseEntity.ok("Element added successfully");
		}   */
}