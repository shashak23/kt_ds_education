package com.ktdsuniversity.edu.scoremanegementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * 2. 필드 생성 > 기능 추가 
 */
public class Class {
	/**
	 * 과목 목록 
	 */
	private List<String> lectureList;
	
	/**
	 * 학생 목록
	 * 추가하는 거라서 굳이 데이터를 써주지 않아도 돼요
	 */
	private List<Student> studentList;
	
	/**
	 * 클래스(반) 이름
	 * 파라미터로 클래스 명만 받아오면 돼요
	 */
	private String className;
	
	
	/**
	 * 학급(클래스) 생성자
	 * @param className
	 */
	public Class(String className) {
		this.className = className;
		this.lectureList = new ArrayList<>();
		this.studentList = new ArrayList<>();
	}
	/**
	 * 클래스 반의 이름을 반환한다
	 * @return 클래스 반 명 
	 */
	public String getClassName() {
		return className;
	}
	
	// 학생 정보를 가져갈 수 있도록 만들기 
	public List<Student> getStudentList() {
		return studentList;
	}

	// (기능) 학생 추가
	/** 
	 * 클래스에 학생을 추가한다.
	 * @param student 새롭게 등록할 학생의 정보
	 * @see com.ktdsuniversity.edu.scoremanagementsyste.Student
	 */
	public void addStudent(Student student) {
		this.studentList.add(student);
		
	}
	
	public List<String> getLectureList() {
		return lectureList;
	}
	
	// (기능) 학생의 순위 구하기
	/**
	 * 학생들의 순위를 구한다
	 * 클래스에 포함된 모든 학생들의 과목 평균을 구해, 순위를 구한다
	 * @return 순위로 정렬된 학생 목록
	 * @see com.ktdsuniversity.edu.scoremanagementsyste.Student
	 */
	public List<Student> getRankStudent(){
		// 입력받은 학생의 모든 과목의 평균을 구해
		// 다른 학생과 순위를 비교해 반환한다.
		// 순위로 정렬된 학생 목록을 반환한다.
		return this.studentList
					.stream()
					.sorted((s1, s2) -> {
						double s1Average = s1.getAverage();
						double s2Average = s2.getAverage();
						return (int)(s2Average*100) - (int)(s1Average*100); 
						
					})
					.collect(Collectors.toList());
		// 0번째에 있는 학생이 평균 점수가 제일 높은 학생이 되게끔 하기
	}
	
	// (기능) 과목 추가
	/**
	 * 클래스에 새로운 과목을 추가한다
	 * @param lectureName 새롭게 등록될 과목명
	 */
	public void addLecture(String lectureName) {
		// 과목을 입력받아서 클래스에 추가해야한다.
		this.lectureList.add(lectureName);
		// 추가된 과목에는 학생들의 점수정보는 비어있어야 한다.
		this.studentList
			.forEach(student -> {
				student.addScore(lectureName, 0);
			});
	}
	
	// (기능) 과목 삭제
	/** 
	 * 클래스에 등록된 과목을 제거한다
	 * 과목이 제거될 경우, 학생들의 과목 점수도 제거된다,
	 * @param lectureName 제거할 과목의 이름
	 */
	public void removeLecture(String lectureName) {
		// 삭제할 과목을 입력받아서 클래스에서 제거해야 한다
		this.lectureList.remove(lectureName);
		// 이미 점수가 등록되어 있는 과목이라도 제거가 되어야 한다
		this.studentList
			.forEach(student -> {
				student.removeScore(lectureName);
			});
	}
	
	// (기능) 클래스의 과목별 최고점수 구하기
	// 지금은 클래스가 이미 생성되어 있기 때문에 별도 입력받을 필요가 없이
	// 아래와 같이 그냥 int 로 받는다
	/** 
	 * 클래스의 과목별 최고점수를 구해서 반환한다
	 * @return 과목별 최고 점수
	 */
	public Map<String, Integer> getHighScore() {
		// 입력받은 클래스의 과목별 최고 점수를 구해서 반환한다
		
		
		// 과목별 최고 점수를 할당할 맵 객체 생성
		Map<String, Integer> scoreMap = new HashMap<>();
		
		// 과목 목록을 반복
		this.lectureList
			.forEach(lecture -> {
				// 학생들의 점수를 과목별로 관리하기 위한 리스트 객체 생성
				List<Integer> scoreList = new ArrayList<>();
				// 학생 목록을 반복
				this.studentList
					.forEach(student-> {
						int score = student.getScore(lecture);
						scoreList.add(score); // 위에서 만든 점수 넣어주기 
					});
				// scoreList에서 가장 큰 값을 찾아, scoreMap에 할당한다.
				int maxScore = scoreList.stream()
										 .mapToInt(score -> score)
										 .max()  // scorelist에서 가장 큰 값이 나옴
										 .orElse(0)
										 ;
		scoreMap.put(lecture, maxScore);
				
			});
		return scoreMap;
	}
	
	// (기능) 클래스의 과목별 최저점수 구하기
	/**
	 * 클래스의 과목별 최저점수를 구해 반환한다
	 * @return 과목별 최저 점수
	 */
	public Map<String, Integer> getLowScore() {
		// 입력받은 클래스의 과목별 최저 점수를 구해서 반환한다
		Map<String, Integer> scoreMap = new HashMap<>();

		this.lectureList
		.forEach(lecture -> {
			// 학생들의 점수를 과목별로 관리하기 위한 리스트 객체 생성
			List<Integer> scoreList = new ArrayList<>();
			// 학생 목록을 반복
			this.studentList
				.forEach(student-> {
					int score = student.getScore(lecture);
					scoreList.add(score); // 위에서 만든 점수 넣어주기 
				});
			// scoreList에서 가장 큰 값을 찾아, scoreMap에 할당한다.
			int minScore = scoreList.stream()
									 .mapToInt(score -> score)
									 .min()  // scorelist에서 가장 적은 값이 나옴
									 .orElse(0)
									 ;
	scoreMap.put(lecture, minScore);
			
		});
	return scoreMap;
	}
	
	// (기능) 클래스의 과목별 평균점수 구하기
	/** 
	 * 클래스의 과목별 평균점수를 구해 반환한다.
	 * @return 과목별 평균 점수
	 */
	public Map<String, Double> getAverageScore() {
		// 입력받은 클래스의 과목별 평균점수를 구해 반환한다
		Map<String, Double> scoreMap = new HashMap<>();

		this.lectureList
		.forEach(lecture -> {
			// 학생들의 점수를 과목별로 관리하기 위한 리스트 객체 생성
			List<Integer> scoreList = new ArrayList<>();
			// 학생 목록을 반복
			this.studentList
				.forEach(student-> {
					int score = student.getScore(lecture);
					scoreList.add(score); // 위에서 만든 점수 넣어주기 
				});
			// scoreList에서 가장 큰 값을 찾아, scoreMap에 할당한다.
			double aveScore = scoreList.stream()
									 .mapToInt(score -> score)
									 .average()  
									 .orElse(0)
									 ;
	scoreMap.put(lecture, aveScore);
			
		});
	return scoreMap;
	}
}
