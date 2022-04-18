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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.MoviesService;
import com.model.Movies;

@RestController
@RequestMapping("/api/")
public class MoviesController {

	@Autowired
	MoviesService service;
	
	@GetMapping("/getmovies")
	public List<Movies> getAllMovies(){
		return service.findAll();
	}
	
	@PostMapping("/addMovies")
	public ResponseEntity addMovies(@RequestBody Movies movies) {
		service.add(movies);
		return ResponseEntity.status(HttpStatus.OK).body("Entity movies added successfully");
	}
	
	@DeleteMapping("/deletemovies/{moviesId}")
	public ResponseEntity<?> deleteItem(@PathVariable int movieId) throws DeleteMoviesException{
		Movies movies=service.find(movieId);
		if(movies==null) {
			throw new DeleteMoviesException(movieId);
		}
		service.delete(movieId);
		return ResponseEntity.ok("Element added successfully");
	}
}
