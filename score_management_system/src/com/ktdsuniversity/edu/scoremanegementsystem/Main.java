package com.ktdsuniversity.edu.scoremanegementsystem;

import java.util.List;
import java.util.Scanner;

/**
 * 4. 맨 밑에 있는 // 부터 하기.
 */
public class Main {
	
	// 2. 필요한 필드와 생성자 및 메소드 생성 
	private School school;
	private Scanner keyboard;
	
	public Main() {
		school = new School();
		keyboard = new Scanner(System.in);
	}
	
	// 시작
	public void run() {
		//학교 생성
		School school = new School();
		Scanner keyboard = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			System.out.println("==== 시험성적 관리 애플리케이션 ====");
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 반 추가하기");
			System.out.println("2. 과목 추가하기");
			System.out.println("3. 학생 추가하기");
			System.out.println("4. 학생 점수 추가하기");
			System.out.println("5. 학생의 평균 점수 출력하기");
			System.out.println("6. 반의 과목별 최고 점수 출력하기");
			System.out.println("7. 반의 과목별 최저 점수 출력하기");
			System.out.println("8. 반의 과목별 평균 점수 출력하기");
			System.out.println("9. 종료하기");
			
			// 3. 각자 필요한 기능을 분리해서 해 보자 - create method
			menu = keyboard.nextInt();
			if(menu == 1) {
				addClass();
			} else if (menu == 2) {
				addLecture();
			} else if (menu == 3) {
				addStudent();
			} else if (menu == 4) {
				addScore();
			} else if (menu == 5) {
				printAverage();
			} else if (menu == 6) {
				printMaxScore();
			} else if (menu == 7) {
				printMinScore();
			} else if (menu == 8) {
				printAverageScore();
			} else {
				break;
			}
		}
	}
	
	// 평균점수 출력
	private void printAverageScore() {
		// 반 점수 가져오기 
		System.out.println("어떤 반에 과목별 최고 점수를 추가할까요?");
		List<Class> classList = this.school.getClassList();
		if(classList.size() == 0) {
			System.out.println("반이 없습니다.");
			System.out.println("반부터 생성하세요.");
			return;
		}
		for(int i=0; i < classList.size(); i++) {
			System.out.println(i + "." + classList.get(i).getClassName());
		}
		int classNumber = keyboard.nextInt();
		keyboard.nextLine();
		
		Class cls = classList.get(classNumber);
		// 출력하기
		System.out.println(cls.getAverageScore());
	}

	// 최저 점수 출력
	private void printMinScore() {
		// 반 점수 가져오기 
		System.out.println("어떤 반에 과목별 최고 점수를 추가할까요?");
		List<Class> classList = this.school.getClassList();
		if(classList.size() == 0) {
			System.out.println("반이 없습니다.");
			System.out.println("반부터 생성하세요.");
			return;
		}
		for(int i=0; i < classList.size(); i++) {
			System.out.println(i + "." + classList.get(i).getClassName());
		}
		int classNumber = keyboard.nextInt();
		keyboard.nextLine();
		
		Class cls = classList.get(classNumber);
		// 출력하기
		System.out.println(cls.getLowScore());
	}

	// 최고 점수 출력
	private void printMaxScore() {
		// 반 점수 가져오기 
		System.out.println("어떤 반에 과목별 최고 점수를 추가할까요?");
		List<Class> classList = this.school.getClassList();
		if(classList.size() == 0) {
			System.out.println("반이 없습니다.");
			System.out.println("반부터 생성하세요.");
			return;
		}
		for(int i=0; i < classList.size(); i++) {
			System.out.println(i + "." + classList.get(i).getClassName());
		}
		int classNumber = keyboard.nextInt();
		keyboard.nextLine();
		
		Class cls = classList.get(classNumber);
		// 출력하기
		System.out.println(cls.getHighScore());
		
	}
	
	// 평균 출력
	// 어떤 반에 누구에게 평균을 받을 것인가?
	private void printAverage() {
		// 어떤 반의 누구
		System.out.println("어떤 반에 학생의 점수를 추가할까요?");
		List<Class> classList = this.school.getClassList();
		if(classList.size() == 0) {
			System.out.println("점수을 추가할 반이 없습니다.");
			System.out.println("반부터 생성하세요.");
			return;
		}
		for(int i=0; i < classList.size(); i++) {
			System.out.println(i + "." + classList.get(i).getClassName());
		}
		int classNumber = keyboard.nextInt();
		keyboard.nextLine();
		
		Class cls = classList.get(classNumber);
		
		// 학생의 목록 가져오기 
	    System.out.println(cls.getAverageScore());

		
	}

	// 합계
	// 어떤 반에 누구에게 추가할 것인지 하면 되고
	private void addScore() {
		System.out.println("어떤 반에 학생의 점수를 추가할까요?");
		List<Class> classList = this.school.getClassList();
		if(classList.size() == 0) {
			System.out.println("점수을 추가할 반이 없습니다.");
			System.out.println("반부터 생성하세요.");
			return;
		}
		for(int i=0; i < classList.size(); i++) {
			System.out.println(i + "." + classList.get(i).getClassName());
		}
		int classNumber = keyboard.nextInt();
		keyboard.nextLine();
		
		Class cls = classList.get(classNumber);
		// 이 반에 있는 학생들의 목록을 출력하기
		List<Student> studentList = cls.getStudentList();
		// 숫자로 가져올 거기 때문에 index가 필요해요 
		for(int i=0; i<studentList.size(); i++) {
			// student에서 만들어 둔 studentList로 해요 
			System.out.println(i + "." + studentList.get(i).getStudentName());
		}
		int studentNumber = keyboard.nextInt();
		keyboard.nextLine();
		
		Student student = studentList.get(studentNumber);
		// lecturelist 를 돌려주지 않으면 출력할 수 있는 방법이 없기문에 가져오기
		System.out.println("어떤 과목의 점수를 추가할까요?");
		List<String> lectureList = cls.getLectureList();
		for(int i=0; i<lectureList.size(); i++) {
			System.out.println(i + "." + lectureList.get(i));
		}
		int lectureNumber = keyboard.nextInt();
		keyboard.nextLine();
		
		String lectureName = lectureList.get(lectureNumber);
		
		System.out.println("몇 점인가요?");
		int score = keyboard.nextInt();
		keyboard.nextLine();
		
		student.addScore(lectureName, score);
	}

	// 학생 반 출력
	private void addStudent() {
		System.out.println("어떤 반에 학생을 추가할까요?");
		List<Class> classList = this.school.getClassList();
		if(classList.size() == 0) {
			System.out.println("학생을 추가할 반이 없습니다.");
			System.out.println("반부터 생성하세요.");
			return;
		}
		for(int i=0; i < classList.size(); i++) {
			System.out.println(i + "." + classList.get(i).getClassName());
		}
		int classNumber = keyboard.nextInt();
		keyboard.nextLine();
		
		Class cls = classList.get(classNumber);
		System.out.println(cls.getClassName()+"반에 과목을 추가합니다.");
		System.out.println("추가할 학생을 입력하세요");
		
		// 학생 추가하기 
		String studentName = keyboard.nextLine();
		cls.addStudent(new Student(studentName));
		
	}

	// 과목 출력
	private void addLecture() {
		System.out.println("어떤 반에 과목을 추가할까요?");
		List<Class> classList = this.school.getClassList();
		if(classList.size() == 0) {
			System.out.println("과목을 추가할 반이 없습니다.");
			System.out.println("반부터 생성하세요.");
			return;
		}
		for(int i=0; i < classList.size(); i++) {
			System.out.println(i + "." + classList.get(i).getClassName());
		}
		int classNumber = keyboard.nextInt();
		
		Class cls = classList.get(classNumber);
		System.out.println(cls.getClassName()+"반에 과목을 추가합니다.");
		System.out.println("추가할 과목을 입력하세요");
		
		String lectureName = keyboard.nextLine();
		cls.addLecture(lectureName);
	}

	// 반 출력
	private void addClass() {
		System.out.println("반을 추가합니다");
		System.out.println("추가할 반을 입력하세요");
		String className = keyboard.nextLine(); //학급명을 읽고
		this.school.addClass(new Class(className)); // 할당해서 넣는다
	}

	public static void main(String[] args) {
		new Main().run(); //새로운 메인 인스턴스를 불러서 시작해라!
		
//		첫 번째 방법 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//학교 생성
//				School school = new School();
//				// 클래스 생성
//				Class class1 = new Class("1반");
//				Class class2 = new Class("2반");
//				// 학교에 클래스 추가
//				school.addClass(class1);
//				school.addClass(class2);
//				// 1반에 과목 추가 10과목
//				class1.addLecture("Java");
//				class1.addLecture("DB");
//				class1.addLecture("HTML5");
//				class1.addLecture("CSS3");
//				class1.addLecture("JS");
//				class1.addLecture("React.js");
//				class1.addLecture("ECMAScript");
//				class1.addLecture("Python");
//				class1.addLecture("Django");
//				class1.addLecture("Spring");
//				
//				// 점수를 줄려면 student를 먼저하기
//				Student s1 = new Student("김시하");
//				Student s2 = new Student("김시하");
//				Student s3 = new Student("김시하");
//				Student s4 = new Student("김시하");
//				Student s5 = new Student("김시하");
//				
//				// 1반에 학생 추가
//				class1.addStudent(s1);
//				class1.addStudent(s2);
//				class1.addStudent(s3);
//				class1.addStudent(s4);
//				class1.addStudent(s5);
//				
//				// 1반 학생들에게 과목별 점수 추가
//				s1.addScore("Java", 100);
//				s1.addScore("DB", 100);
//				s1.addScore("Python", 100);
//				s1.addScore("HTML5", 100);
//				
//				s2.addScore("Java", 50);
//				s2.addScore("DB", 50);
//				s2.addScore("Python", 50);
//				s2.addScore("HTML5", 50);
//				
//				s3.addScore("Java", 80);
//				s3.addScore("DB", 80);
//				s3.addScore("Python", 80);
//				s3.addScore("HTML5", 80);
//				
//				s4.addScore("Java", 70);
//				s4.addScore("DB", 80);
//				s4.addScore("Python", 90);
//				s4.addScore("HTML5", 70);
//				
//				s5.addScore("Java", 90);
//				s5.addScore("DB", 60);
//				s5.addScore("Python", 40);
//				s5.addScore("HTML5", 60);
//				
//				// 1반 학생들의 개인별 평균 출력
//				System.out.println(s1.getAverage());
//				System.out.println(s2.getAverage());
//				System.out.println(s3.getAverage());
//				System.out.println(s4.getAverage());
//				System.out.println(s5.getAverage());
//				
//				// 1반 과목별 최고점수 출력
//				Map<String, Integer> maxScorePerLecture = class1.getHighScore();
//				
//				// 1반의 과목별 최저점수 출력
//				Map<String, Integer> minScorePerLecture = class1.getLowScore();
//				
//				// 1반의 과목별 평균점수 출력
//				Map<String, Double> averageScorePerLecture = class1.getAverageScore();
//				System.out.println(averageScorePerLecture);
//	}

  }
}
