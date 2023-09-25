package scoremanagement.school.vo;

import java.util.ArrayList;
import java.util.List;

import scoremanagement.student.vo.StudentVO;

public class SchoolVO {
	
	private String schoolName;
	
	private List<StudentVO> studentList;
	
	public SchoolVO() {
		this.studentList = new ArrayList<>();
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<StudentVO> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentVO> studentList) {
		this.studentList = studentList;
	}
	
	public void addStudent(StudentVO student) {
		this.studentList.add(student);
	}
	
	public void showStudentAll() {
		for(int i=0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getStudentName());
			System.out.println(studentList.get(i).getScore());
		}   
	}
	
	// 모든 학생의 성적 합
	public void subStudentAll() {
		int sum = 0; // int가 해당되는 범위
		// 리스트를 반복시키고
		for(int i=0; i < studentList.size(); i++) {
			sum = sum + studentList.get(i).getScore();
		}
		System.out.println(sum); // 결과를 도출
	}
	
	// 모든 학생의 성적 평균
	public void avgStudentAll() {
		int avg = 0;
		int sum = 0;
		
		for(int i=0; i < studentList.size(); i++) {
			sum = sum + studentList.get(i).getScore();
		}
		avg = sum / studentList.size() ;
		System.out.println(avg);
	}
	
	//평균 점수 이상의 성적을 가진 가진 학생을 출력 
	public void bestStudentAll() {
		
	}
}
