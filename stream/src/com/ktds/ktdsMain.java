package com.ktds;

import com.ktds.genre.vo.GenreVO;
import com.ktds.movie.vo.MovieVO;

public class ktdsMain {
	
	public static void main(String[] args) {
		// 영화 만들고 
		MovieVO movie1 = new MovieVO();
		movie1.setKorTitle("태극기 휘날리며");
		movie1.setMovieId(123456789);
		movie1.setInfo("광복절 기념 명화111111111");
		MovieVO movie2 = new MovieVO();
		movie2.setKorTitle("고지전");
		movie2.setMovieId(123456799);
		movie2.setInfo("광복절 기념 명화2222222222");
		
		// 장르 만들고 
		GenreVO genre1 = new GenreVO();
		genre1.setGenreId(111110);
		genre1.setGenreName("시대극");
		
//		GenreVO genre2 = new GenreVO();
//		genre2.setGenreId(111100);
//		genre2.setGenreName("풍자극");
		
		genre1.addMovie(movie1);
		genre1.addMovie(movie2);
		genre1.showMovieGenre();
	}

}
