package homework2;

public class Calc4 {

	//4. 
	public int getAddResult(int num1, int num2) {
		return num1 + num2;
	}
	
	public int getMinusResult(int num1, int num2) {
		return num1 - num2;
	}
	
	public int getMultipleResult(int num1, int num2) {
		return num1 * num2;
	}
	
	public int getDevideResult(int num1, int num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		Calc4 calc4 = new Calc4();
		int addResult = calc4.getAddResult(20,50);
		System.out.println(addResult);
		
		int minusResult = calc4.getAddResult(20,50);
		System.out.println(minusResult);
		
		int multipleResult = calc4.getAddResult(20,50);
		System.out.println(multipleResult);
		
		int devideResult = calc4.getAddResult(20,50);
		System.out.println(devideResult);
	}
}
