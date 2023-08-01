package absclass;

import calc.AbstractCalc;
import calc.MulCalc;

public class AbstractMain {

	public static void main(String[] args) {
		// 1. 
		PerformanceClass pc1 = new SumCalculator();
		pc1.sumAllNumbers();
		PerformanceClass pc2 = new SumCalculator2();
		pc2.sumAllNumbers();
		
		// 2. 다른 패키지꺼 가져와서 해 보기 
//		AbstractCalc ac = new AbstractCalc();
//		ac.calc();
		
		// 3. 
		MulCalc mc = new MulCalc();
		mc.calc();
	}
	
}
