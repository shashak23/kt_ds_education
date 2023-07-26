package array;

import java.util.ArrayList;
import java.util.List;

import classninstance.ScoreVO;
import classninstance.Student;

public class Main {
	
	public static void main(String[] args) {
		// List로 생성해서 -> 아래 추가할 내용들을 객체화 한 것 
		// 제너릭에서 추가하기 
		List<Student> students = new ArrayList<>();
		students.add( new Student(new ScoreVO(100,90,70,50)));
		students.add( new Student(new ScoreVO(90,90,70,50)));
		students.add( new Student(new ScoreVO(90,90,70,50)));
		students.add( new Student(new ScoreVO(100,90,70,50)));
		students.add( new Student(new ScoreVO(70,90,70,50)));
		students.add( new Student(new ScoreVO(70,90,70,50)));
		students.add( new Student(new ScoreVO(60,90,70,50)));
		ClassRoom cr = new ClassRoom(students);
		
		int sum = cr.getSumAllScores();
		double average = cr.getAverage();
//		double courseCredit = cr.getCourseCredit();
//		String abcde = cr.getABCDE();
		
		System.out.println("반 총합: " + sum);
		System.out.println("반 평균: " + average);
//		System.out.println("반 학점: " + courseCredit);
//		System.out.println("반 등급: " + abcde);

	}

}
