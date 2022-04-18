package com.example.SeatType;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.SeatTypeService;
import com.model.SeatType;

import junit.framework.Assert;
@SpringBootTest
class SeatTypeTest {

	
	@Autowired
	SeatTypeService service;
	
	@Test
	void testAdd() {
		SeatType st=new SeatType();
		st.setSeatTypeDesc("Executive");
		st.setSeatFare(250.0f);
		service.add(st);
		
		
		SeatType st1=service.find(st.getSeatTypeId());
		Assert.assertEquals(1, st.getSeatTypeId());
		Assert.assertEquals("Executive", st1.getSeatTypeDesc());
		Assert.assertEquals(250.0f, st.getSeatFare());;
	}

	@Test
	void testFind() {
		
		SeatType st=new SeatType();
		SeatType st1=service.find(2);
		st.setSeatTypeDesc("Premium");
		Assert.assertNotNull(st1);
	}

	@Test
	void testFindAll() {
		
		SeatType st=new SeatType();
		st.setSeatTypeId(11);
		st.setSeatTypeDesc("Normal");
		st.setSeatFare(200.0f);
		service.add(st);
		
		SeatType st2=new SeatType();
		st2.setSeatTypeId(12);
		st2.setSeatTypeDesc("Premium");
		st2.setSeatFare(250.0f);
		service.add(st2);
		
		SeatType st3=new SeatType();
		st3.setSeatTypeId(13);
		st3.setSeatTypeDesc("Executive");
		st3.setSeatFare(300.0f);
		service.add(st3);
		
		List<SeatType> stlist=service.findAll();
		
		Assert.assertEquals(stlist.get(1).getSeatTypeDesc(),("Normal"));
		Assert.assertEquals(stlist.get(2).getSeatTypeDesc(),("Premium"));
		Assert.assertEquals(stlist.get(3).getSeatTypeDesc(),("Executive"));
	}

	@Test
	void testUpdate() {
		
		SeatType st=service.find(2);
		st.setSeatTypeDesc("Premium");
		st.setSeatFare(200.f);
		
		service.update(st);
		SeatType st1=service.find(2);
		
		Assert.assertEquals("Premium", st1.getSeatTypeDesc());
		
		
	}

	@Test
	void testDelete() {
		
		SeatType st=new SeatType();
		service.delete(1);
		SeatType st1=service.find(1);
		Assert.assertNull(st1);
	}

}
