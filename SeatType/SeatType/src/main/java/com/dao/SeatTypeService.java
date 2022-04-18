package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.SeatType;

@Service
public class SeatTypeService {

	@Autowired
	SeatTypeDAO seatTypeDAOImpl;
	
	public void add(SeatType st) {
		seatTypeDAOImpl.addSeatType(st);
	}
	
	public SeatType find(int SeatTypeId) {
		return seatTypeDAOImpl.findSeatType(SeatTypeId);
	}
	
	public List<SeatType> findAll(){
		return seatTypeDAOImpl.findAllSeatType();
	}
	
	public boolean update(SeatType st) {
		return seatTypeDAOImpl.updateSeatType(st);
	}
	
	public boolean delete(int SeatTypeId) {
		return seatTypeDAOImpl.deleteSeatType(SeatTypeId);
	}
}
