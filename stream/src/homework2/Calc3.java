package homework2;

public class Calc3 {

	//3.
	public int getMinDivideZeroNumber(int number) {
		
		int remainNumber = 0;
		for(int i = 2; i < number; i++ ) {
			remainNumber = number % i;
			if(remainNumber == 0) {
				return i;
			} // return이 되면서 반복문이 종료가 되고 i를 반환 
		}
		return number;
	}
	
	public static void main(String[] args) {
		Calc3 calc3 = new Calc3();
		int minimumZeroNumber = calc3.getMinDivideZeroNumber(49);
		System.out.println(minimumZeroNumber);  // 여기는 i 반환

		minimumZeroNumber = calc3.getMinDivideZeroNumber(53);
		System.out.println(minimumZeroNumber); // 여기는 number 반환
	}
}
