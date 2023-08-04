package homework;

import java.util.Scanner;

public class Number5to1 {
	
	// 메인요기
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        String operator = scanner.next();

        // try catch 로...performOperation 쓰고...
        try {
            double result = Number5.performOperation(num1, num2, operator); // 파라미터 다 넣고
            System.out.println("결과: " + result);
        } catch (IllegalArgumentException e) { // 예외처리...
            System.out.println("오류: " + e.getMessage());
        }

        scanner.close(); // 닫기
    }

}
