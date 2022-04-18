package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.MoviesService;
import com.model.Movies;

@RestController
public class MoviesRestController {
	
	@Autowired
	MoviesService service;

	@GetMapping("/getmovies")
	public List<Movies> getAllMovies(){
		return service.findAll();
	}
	
	@PostMapping("/addmovies")
	public String addItem(@RequestBody Movies movies) {
		service.add(movies);
		return "Movie added successfully";
	}
}
