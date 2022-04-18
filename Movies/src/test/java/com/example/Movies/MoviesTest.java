package com.example.Movies;

import static org.junit.jupiter.api.Assertions.*;



import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

import com.dao.MoviesService;
import com.model.Movies;

@SpringBootTest
class MoviesTest {

	@Autowired
	MoviesService service;
	@Test
	void testAdd() {
		Movies m=new Movies();
		m.setMovieId(10);
		m.setMovieName("KGF-2");
		service.add(m);
		
		Movies m1=service.find(m.getMovieId());
		//("KGF-2",m.getMovieName());
		
	}

	@Test
	void testFind() {
		Movies m=new Movies();
		Movies m1=service.find(0);
		m.setMovieName("Beast");
		Assert.assertNotNull(m);
	
	}

	@Test
	void testFindAll() {
		Movies m=new Movies();
		m.setMovieId(12);
		m.setMovieName("Vikrant Rona");
		service.add(m);
		
		Movies m2=new Movies();
		m2.setMovieId(13);
		m2.setMovieName("Kashmir Files");
		service.add(m2);
		
		Movies m3=new Movies();
		m3.setMovieId(14);
		m3.setMovieName("KGF");
		service.add(m3);
		
		
		Movies m4=new Movies();
		m4.setMovieId(15);
		m4.setMovieName("Bachelor");
		service.add(m4);
		
		List<Movies> mlist=service.findAll();
		
		Assert.assertEquals(mlist.get(1).getMovieName(),("Vikrant Rona"));
		Assert.assertEquals(mlist.get(2).getMovieName(),("Kashmir Files"));
		Assert.assertEquals(mlist.get(3).getMovieName(),("KGF"));
		Assert.assertEquals(mlist.get(4).getMovieName(),("Bachelor"));
	}

	@Test
	void testUpdate() {
		Movies m=service.find(4);
		m.setMovieName("K3");
		m.setMovieId(21);
		
		boolean result=service.update(m);
		Movies m2=service.find(4);
		
		Assert.assertEquals(true,result);
		
	}

	@Test
	void testDelete() {
		Movies m=new Movies();
		
		Movies m3=service.find(3);
		service.delete(m3.getMovieId());
		
		Movies m4=service.find(3);
		
		Assert.assertNull(m4);
		
		
	}
}
