package com.ktds.genre.vo;

import java.util.ArrayList;
import java.util.List;

import com.ktds.movie.vo.MovieVO;

public class GenreVO {
	
	private int genreId;
	private String genreName;
	
	private List<MovieVO> movieList;
	
	public GenreVO() {
		this.movieList = new ArrayList<>();
	}
	
	
//	public GenreVO(int genreId, String genreName) {
//		super();
//		this.genreId = genreId;
//		this.genreName = genreName;
//	}
	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	public List<MovieVO> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<MovieVO> movieList) {
		this.movieList = movieList;
	}
	
	public void addMovie(MovieVO movieVO) {
		this.movieList.add(movieVO);
	}
	
	public void showMovieGenre() {
		for(int i=0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i).getMovieId());
			System.out.println(movieList.get(i).getKorTitle());
			System.out.println(movieList.get(i).getInfo());
		}
	}

}
