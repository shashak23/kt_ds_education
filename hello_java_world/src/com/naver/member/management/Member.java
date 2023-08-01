package com.naver.member.management;

public class Member {

	public String id;
	public String name;
	public String grade;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		//printHello();
		// private은 동일한 클래스 내부에서만 사용이 가능함
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


//	private void printHello() {
//		System.out.println("Hello");
//	}
	
	
}
