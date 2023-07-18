package classninstance;

public class Student {
	// 필드=속성 생성
	 int java;
	 int python;
	 int cpp;
	 int csharp;
	
	 // this 사용해서 생성자 만들어 보기 -> main의 객체 필드에 맞게 변경하기 
	 public Student(int java, int cpp, int csharp, int python) {
		 this.java = java;
		 this.cpp = cpp;
		 this.csharp = csharp;
		 this.python = python;
	 }
	 
	
	// 필드 4개를 더한 총합
	public int getSumAllScores() {
		int result = java + python + cpp + csharp;
		return result;
	}
	
	public double getAverage() {
		// 1. 메소드는 하나를 만들어두면 클래스안에서 언제든지 호출이 가능하다
		// 1-1. 메소드 <-> 메소드 서로 호출이 가능함
		double result = java + python + cpp + csharp;
		
		// 2번
		double average = result / 4.0 * 100; 
		//average *=100;
		//System.out.println(average);
		
		average =(int)average;      // 같은 것 int intAverage = average;
		
		average = average / 100;    //나눠서 할당해라
		//System.out.println(average);
		
		return average;
	}
	
	public double getCourseCredit() {
		double result = getSumAllScores(); // getSunAllScores 는 java + python + cpp + csharp 와 같다.

		// 3번
		double average = result / 4.0 * 100;
		//System.out.println(average);
				
		average =(int)average;
		// average = intAverage / 100; 별도로 해도 상관없음
		average = ((average / 100)- 55) / 10;
		//System.out.println(average);
				
		return average;
	}
	
	public String getABCDE(){
		// 등급을 지정, string만 "" 이렇게 넣는게 new String()하는 것보다 빠르다 
		String grade = "";
		// 그래서 return "A+"; 대신에 grade = "A+"; 이렇게 사용해도 됨
		
		// 4번
		double courseCredit = getCourseCredit(); // 2.그래서 여기서는 다른 메소드를 호출함
		if(courseCredit >= 4.1) {
			grade = "A+";
		} else if(courseCredit >= 3.6) {
			grade = "A";
		} else if(courseCredit >= 3.1) {
			grade = "B+";
		} else if(courseCredit >= 2.6) {
			grade = "B";
		} else if(courseCredit >= 1.6) {
			grade = "C";
		} else if(courseCredit >= 0.6) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}
	
	public static void main(String[] args) {
		// student = 학생1
		Student student = new Student(100, 83, 98, 97);
		
		// 값을 구할 각 필드별 점수 부여!!
		student.java = 100;  // 변수라서 그냥 = 10 으로 할당함
		student.python = 83;
		student.cpp = 98;
		student.csharp = 97;
		
		// 멤버 변수를 모두 더한 값
		int result = student.getSumAllScores();
		System.out.println(result);
		// 평균
		double average = student.getAverage();
		System.out.println(average);
		// 학점도
		double courescredit = student.getCourseCredit();
		System.out.println(courescredit);
		// 등급
		String getABCDE = student.getABCDE();
		System.out.println(getABCDE);
		
		// siha = 학생2
		Student siha = new Student(10, 20, 30, 50);
		siha.cpp = 10;
		siha.csharp = 20;
		siha.java= 30;
		siha.python = 50;
		
		int sum = siha.getSumAllScores();
		double average2 = siha.getAverage();
		double courseCredit = siha.getCourseCredit();
		String getABCDE2 = siha.getABCDE();
		
		System.out.println(sum);
		System.out.println(average2);
		System.out.println(courseCredit);
		System.out.println(getABCDE2);
		
	}

}
