package homework2;
// 0803 과제 
public class Calc1 {

	// 1.
	public int getPower(int number) {
		int power = number * number ;
		return power;
	}
	
	public static void main(String[] args) {
		Calc1 calc1 = new Calc1();
		int result = calc1.getPower(5);
		System.out.println(result);
	}
		
}
