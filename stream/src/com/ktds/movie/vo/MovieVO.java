package com.ktds.movie.vo;

public class MovieVO {

	private int movieId;
	private String gradeId;
	private String posterURL;
	private String korTitle;
	private String engTitle;
	private String openYear;
	private String openDate;
	private int runningTime;
	private String info;
	private String companyId;
	
	
//	public MovieVO(int movieId, String gradeId, String posterURL, String korTitle, String engTitle, String openYear,
//			String openDate, int runningTime, String info, String companyId) {
//		super();
//		this.movieId = movieId;
//		this.gradeId = gradeId;
//		this.posterURL = posterURL;
//		this.korTitle = korTitle;
//		this.engTitle = engTitle;
//		this.openYear = openYear;
//		this.openDate = openDate;
//		this.runningTime = runningTime;
//		this.info = info;
//		this.companyId = companyId;
//	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	public String getPosterURL() {
		return posterURL;
	}
	public void setPosterURL(String posterURL) {
		this.posterURL = posterURL;
	}
	public String getKorTitle() {
		return korTitle;
	}
	public void setKorTitle(String korTitle) {
		this.korTitle = korTitle;
	}
	public String getEngTitle() {
		return engTitle;
	}
	public void setEngTitle(String engTitle) {
		this.engTitle = engTitle;
	}
	public String getOpenYear() {
		return openYear;
	}
	public void setOpenYear(String openYear) {
		this.openYear = openYear;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	
}
