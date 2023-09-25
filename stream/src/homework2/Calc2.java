package homework2;

public class Calc2 {

	//2.
	public int getPower(int number) {
		if(number <= 0) {
			throw new InvalidNumberException("0보다 큰 숫자를 입력하세요");
		}
		
		int power = number * number;
		return power;
	}
	
	public static void main(String[] args) {
		Calc2 calc2 = new Calc2();
		int powerResult = calc2.getPower(30);
		System.out.println(powerResult);
		
		powerResult = calc2.getPower(0);
		System.out.println(powerResult);
	}
	
}
