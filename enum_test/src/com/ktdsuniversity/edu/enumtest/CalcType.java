package com.ktdsuniversity.edu.enumtest;

public enum CalcType {

	// 사용하고자 하는 것들을 적어주면 돼요
	// ez하다.
	// 정석사용법
	// ADD, SUB, MUL, DIV;
	
	// 1. 변수가 없기때문에
	// 2. 생성자가 없기때문에
	// -> 아래와 같이 작성하여 사용하려해도 에러가 난다.
	// ADD("더하기");
	
	// 그래서 아래와 같이 적어준 뒤
	ADD("더하기"), SUB("빼기"), MUL("곱하기"), DIV("나누기");
	
	// 변수 
	String name;
	
	// 생성자
	CalcType(String name){
		this.name = name;
	}
	
	// getter 메소드 
	public String getName() {
		return this.name;
	}
	
}
