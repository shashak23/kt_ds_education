package classninstance;

public class Calc {
	
	int numA;
	int numB;
	
	// this 사용해서 생성자 만들어 보기
	public Calc(int numA, int numB) {
		this.numA = numA;
		this.numB = numB;
	}
	
	public void add() {
		int result = numA + numB;
		System.out.println(numA + "+" + numB + "=" + result);
	}
	
	public void sub() {
		int result = numA - numB;
		System.out.println(numA + "-" + numB + "=" + result);
	}
	
	public void mul() {
		int result = numA * numB;
		System.out.println(numA + "x" + numB + "=" + result);
	}
	
	public void div() {
		int result = numA / numB;
		System.out.println(numA + "/" + numB + "=" + result);
	}
	
	public static void main(String[] args) {
		//         = 생성자
		Calc calcA = new Calc(1, 1);
		
		// calcA의 인스턴스 필드들에게 값을 할당
		calcA.numA = 10;
		calcA.numB = 5;
		
		// calcA의 인스턴스 메소드를 호출
		calcA.add();
		calcA.sub();
		calcA.mul();
		calcA.div();
		
		// main안에서는 다수의 생성자를 만들 수 있어요
		Calc calcB = new Calc(1, 2);
		calcB.numA = 1;
		calcB.numB = 2;
		
		calcB.add();
		calcB.sub();
		calcB.mul();
		calcB.div();
	}
}
