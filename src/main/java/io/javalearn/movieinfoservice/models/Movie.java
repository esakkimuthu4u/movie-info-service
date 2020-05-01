package io.javalearn.movieinfoservice.models;

public class Movie {
	private String movieId;
	private String name;
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public String getName() {
		return name;
	}
}
