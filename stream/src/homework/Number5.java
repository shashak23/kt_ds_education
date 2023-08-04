package homework;

public class Number5 {
	// 더블로...해 보기... 필요한 파라미터 3개 
	public static double performOperation(double num1, double num2, String operator) {
        double result = 0;

        // switch - case - break - default
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다."); // 예외처리...
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
        }

        return result;
    }
}
