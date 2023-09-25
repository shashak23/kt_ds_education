package scoremanagement;

import scoremanagement.school.vo.SchoolVO;
import scoremanagement.student.vo.StudentVO;

public class SchoolMain {
	public static void main(String[] args) {
		StudentVO siha = new StudentVO();
		siha.setStudentName("김시하");
		siha.setScore(100);
		
		StudentVO berry = new StudentVO();
		berry.setStudentName("김베리");
		berry.setScore(99);
		
		SchoolVO mirea = new SchoolVO();
		mirea.setSchoolName("Mirea");
		mirea.addStudent(siha);
		mirea.addStudent(berry);
		// 모든 학생 부르기 
		mirea.showStudentAll();
		// 모든 학생의 성적의 합 부르기
		mirea.subStudentAll();
		// 학생들의 평균 성적
		mirea.avgStudentAll();
	}

}
