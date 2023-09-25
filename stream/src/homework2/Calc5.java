package homework2;

import java.util.HashMap;
import java.util.Map;

public class Calc5 {

	// 5. 
	public Map<String, Integer> getComputerResult(int num1, int num2){
		Map<String, Integer> computerResultMap = new HashMap<>();
		int addResult = num1 + num2;
		int minusResult = num1 - num2;
		int multipleResult = num1 * num2;
		int devideResult = num1 / num2;
		
		computerResultMap.put("add", addResult);
		computerResultMap.put("minus", minusResult);
		computerResultMap.put("multiple", multipleResult);
		computerResultMap.put("devide", devideResult);
		
		return computerResultMap;
	}

	
//	public static void main(String[] args) {
//		Calc5 calc5 = new Calc5();
//		calc5.getComputerResult(50, 5);
//	}
}
