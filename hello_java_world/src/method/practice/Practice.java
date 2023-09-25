package method.practice;
// 0818 보강
public class Practice {

	// 1. hello를 출력하는 메소드를 생성하라
	public void print1() {
		System.out.println("hello");
	}
	
	// 2. 이름을 전달하면 hello와 이름을 출력하는 메소드를 생성하라
	public void print2(String name) {
		System.out.println("hello, name"); // 이름이 안되는 코드
		System.out.println("hello" + name); // 이렇게 해야 입력된대로 나옴
	}
	
	// 3. 이름, 나이를 전달하면 My name is 이름, I'm 나이를 출력하는 메소드를 생성하라
	public void print3(String name, int age) {
		System.out.println("My name is " + name);
		System.out.println("I'm " + age);
	}
	
	// 4. 점수를 전달하면 점수에 5를 더해서 반환
	public int add1(int score) {
		return score +5 ;
	}
	
	// 5. 숫자를 전달하면 숫자가 홀수면 true를 짝수면 false를 반환하는 메소드를 생성하라
	public boolean add2(int number) {
//		if(number % 2 == 0 ) {
//			return true;
//		} else {
//			return false;
//		}
		return number % 2 == 0;		
		
	}
	
	public static void main(String[] args) {
		// 변수 생성
		Practice practice = new Practice();
		// 메소드 호출
		practice.print1();
		practice.print2("김베리");
		practice.print3("김보리", 3);
		
		int a = practice.add1(50);
		System.out.println(a);
		
		boolean b = practice.add2(50);
		boolean c = practice.add2(55);
		System.out.println(b);
		System.out.println(c);
		
		// List list = new ArrayList();
	}
	
}
