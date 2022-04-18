package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.*;

@Service
public class MoviesService {

	@Autowired
	MoviesDAO moviesDAOImpl;
	
	public void add(Movies movies) {
		moviesDAOImpl.addMovies(movies);
	}
	public Movies find(int moviesID) {
		return moviesDAOImpl.findMovies(moviesID);
	}
	public List<Movies> findAll(){
		return moviesDAOImpl.findAllMovies();
	}
	public boolean update(Movies movies) {
		return moviesDAOImpl.updateMovies(movies);
	}
	public boolean delete(int MovieId) {
		return moviesDAOImpl.deleteMovies(MovieId);
	}
}
