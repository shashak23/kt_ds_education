package calc;

public class SumCalc extends AbstractCalc {

	// AbstractCalc 의 sumAllNumbers(); 를 구현해야지 여기서
	// SumCalc에 대한 에러가 사라진다.
	
	// 3. 여기에서 실행을 하도록 함
	@Override
	protected void sumAllNumbers() {
		// 1~1000000까지 더하기
		int sum = 0;
		for (int i=0; i<10000000; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
}
