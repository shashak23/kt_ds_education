package com.ktdsuiversity.edu.fileread;

public class LanguageVO {

	private String title;
	private String subTitle;
	private int level;
	
	 public LanguageVO(String[] itemArray) {
		this.title = itemArray[0];
		this.subTitle = itemArray[1];
		this.level = Integer.parseInt(itemArray[2]);
	 }
	
	public LanguageVO(String title, String subTitle, int level) {
		super();
		this.title = title;
		this.subTitle = subTitle;
		this.level = level;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
