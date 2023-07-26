package array;

import java.util.ArrayList;
import java.util.List;

import classninstance.Student;

public class ClassRoom {
	
	private List<Student> students;
	
	// 사실 이건 보안상에 심각한 문제가 되는 코드인데
	// 그대로 쓰지 않고 아래와 같이 써야한다
	public ClassRoom(List<Student> students) {
		// 파라미터 ㅣ스트를 복제하기 위해서 새로운 리스트를 생성한다.
		List<Student> temp = new ArrayList<>(); //지역변수 하나 만들어 주고
		// 파라미터로 전당받은 리스트의 요소를 모두 temp에 할당한다
		temp.addAll(students);  // addAll을 이용해서 하기, students를 쓰면 복사되어 넘어감
		// this.students = students; // 그냥 쓰면 보안상에 문제가 돼요
		// 파라미터로 전달받은 리스트와 멤버 변수 student는 다른 메모리로 관리된다.
		this.students = temp; // 분리를 시켜서 다른 메모리에 할당을 받고 그럼 보안상에 문제가 사라짐
	}

	public int getSumAllScores() {
		int sum = 0;
		// for를 사용해서 해 봅시다 - for each
		for(Student student : this.students) {
			sum += student.getSumAllScores();
		}
		
		return sum;
	}
	
	public double getAverage() {
		double avg = this.getSumAllScores() / this.students.size();
		double dnum = Math.floor(avg * 100);
		avg = dnum / 100;
		
		return avg;
	}
	
	
	
}
