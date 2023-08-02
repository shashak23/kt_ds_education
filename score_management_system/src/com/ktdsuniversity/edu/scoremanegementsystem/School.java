package com.ktdsuniversity.edu.scoremanegementsystem;

import java.util.ArrayList;
import java.util.List;
/**
 * 1. 생성 > 학급 추가 메소드 생성 > 학교 생성자 생성 > list 필드 생성
 */
public class School {

	/**
	 * 클래스 (반)
	 */
	private List<Class> classList;
	
	
	/**
	 * 학교 생성자
	 * 클래스 목록을 초기화 한다.
	 * 이로써 널 예외가 발생하지 않는다.
	 */
	public School() {
		this.classList = new ArrayList<>();
	}
	
	/**
	 * 클래스 목록에 클래스 정보를 추가한다,
	 * @param cls 새롭게 만들어진 클래스 정보
	 * @see com.ktdsuniversity.edu.scoremanagementsyste.Class
	 */
	public void addClass(Class cls) {
		// 클래스 명을 입력받아서 클래스가 추가되어야 한다.
		this.classList.add(cls); 
	}

	public List<Class> getClassList() {
		return classList;
	}
}
