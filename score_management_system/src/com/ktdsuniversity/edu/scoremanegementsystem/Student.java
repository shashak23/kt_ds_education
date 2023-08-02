package com.ktdsuniversity.edu.scoremanegementsystem;

import java.util.HashMap;
import java.util.Map;
/**
 * 3. 학생의 정보 
 */
public class Student {
	/**
	 * 학생의 과목별 점수
	 * key : 과목명
	 * value : 과목의 점수 
	 */
	private String studentName;
	private Map<String, Integer> scoreMap;

	/**
	 * 생성자
	 * @param studentName 학생 이름
	 */
	public Student(String studentName) {
		this.studentName = studentName;
		this.scoreMap = new HashMap<>();
	}
	
	// 학생이름 getter 생성
	public String getStudentName() {
		return studentName;
	}
	
	// (기능) 학생의 평균 구하기
	/**
	 * 모든 과목의 평균 점수를 구해 반환한다.
	 * @return 평균 점수
	 */
	public double getAverage() {
		// 한 학생이 어떤 과목에 어떤 점수를 가진지 모르기때문에 
		// 우리는 여기서 map을 변형시키고
		// stream을 활용할거에요
		// entrySet 을 시작으로 stream을 할 수 있어요!
		// 우리는 지금 value만 필요해요! -> 점수를 가지고 왔다
		// map의 특징 - 유연한 핸들링이 가능하다 
		return this.scoreMap.entrySet()
					.stream()
					.map(entry -> entry.getValue()) // 원래는 map이 아닌 mapToInt를 쓰는게 제일 베스트에요
//					.collect(Collectors.) // 이걸 사용하지 않고 밑에를 사용(이유: 복잡)
					.mapToInt(score -> score)
					.average()
					.orElse(0)  //없으면 0이 나오고 있으면 있는대로 나오고 
					;
	}
	
	
	// (기능) 학생의 과목별 점수추가
	/**
	 * 과목의 점수를 추가한다
	 * 만약, 이미 등록된 과목을 전달할 겨웅, 새로운 점수로 변경된다
	 * @param lectureName 과목명
	 * @param score 과목의 점수
	 */
	public void addScore(String lectureName, Integer score) {
		// 입력받은 학생의 입력받은 과목명의 입력받은 점수를 할당한다.
		this.scoreMap.put(lectureName, score);
	
	}
	
	// (기능) 학생의 과목별 점수 반환하기
	/**
	 * 과목의 점수를 반환한다
	 * 만약, 등록하지 않은 과목의 점수를 요구할 경우, 0점이 반환된다
	 * @param lectureName 과목명
	 * @return 과목에 등록된 점수 
	 */
	public int getScore(String lectureName) {
		// 입력받은 학생의 입력받은 과목의 점수를 반환한다.
		return this.scoreMap.getOrDefault(lectureName, 0);
	}
	
	// (기능) 학생의 과목 제거하기
	/**
	 * 과목의 점수를 제거한다.
	 * @param lectureName 제거할 과목명
	 */
	public void removeScore(String lectureName) {
		// 입력받은 학생의 입력받은 과목으리 값을 제거한다.
		this.scoreMap.remove(lectureName);
	}
}
