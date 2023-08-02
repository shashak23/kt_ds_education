package com.ktdsuniversity.scoresystem.classroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.ktdsuniversity.scoresystem.student.StudentVO;

public class ClassMain {
	
	// 학생 리스트
	private List<StudentVO> student;
	// 스캐너 사용
	static Scanner sc = new Scanner(System.in);
	
	
	// 학생 추가
	public void studentInsert() {
		
	}
	
	// 학생 삭제
	public void studentDelete() {
		
	}
	
	// 과목 추가 
	public void subjectInsert() {
		
	}
	
	// 과목 삭제
	public void subjectDelete() {
		
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> student = new HashMap<>();
		int studentNumber = 0;
		
		student.put("", 30);
		
		// 입력받을 학생의 수 
		int studentNum = 0;
		
		// 학생 정보를 스캐너로 입력 받기 
//		for(int i=0;i<student.length;i++){
//			String name = sc.next();
//			int math = sc.nextInt();
//			int english = sc.nextInt();
//			int korean = sc.nextInt();
//			
//			student[i] = new StudentVO(name,math,english,korean); //student에 값 넘겨주기
		}
	}

