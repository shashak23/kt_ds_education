package com.ktdsuniversity.edu.stream.dish.basic;

public class DishVO {

	// 이름
	private String name;
	// 칼로리
	private int calories;
	// 종류
	private String category;

	
	public DishVO (String name, int calories, String category) {
		this.name = name;
		this.calories=calories;
		this.category = category;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	// 프렌티 프라이가 오면 트루라고 할게요 
	public boolean isVegeterian() {
		return this.name.equals("French Fries");
	}
	
}
