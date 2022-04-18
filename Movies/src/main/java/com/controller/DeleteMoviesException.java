package com.controller;

public class DeleteMoviesException extends RuntimeException {

	private int movieId;
	public DeleteMoviesException(int movieId) {
		super("Id"+movieId+"not found");
		this.movieId=movieId;
	}
	@Override
	public String toString() {
		return "id"+ movieId +"not available";
	}
	
	
}
