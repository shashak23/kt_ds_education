package calc;

public class MulCalc extends AbstractCalc{
	
	@Override
	protected void sumAllNumbers() {
		long mul = 0;
		for(int i=1; i < 1000_000; i++) {
			mul *= 1;
			
		}
		System.out.println(mul);
		
	}
}
