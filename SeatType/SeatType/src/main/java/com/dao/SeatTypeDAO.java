package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.SeatType;

@Repository
public interface SeatTypeDAO {

	public void addSeatType(SeatType st);
	public SeatType findSeatType(int SeatTypeId);
	public List<SeatType> findAllSeatType();
	public boolean updateSeatType(SeatType st);
	public boolean deleteSeatType(int SeatTypeId);
}
