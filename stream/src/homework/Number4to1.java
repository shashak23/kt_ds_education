package homework;

import java.util.Scanner;

public class Number4to1 {
	
	// 불러와서 메인에 넣어서 사용하기 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        double sum = Number4.add(num1, num2);
        System.out.println("더하기 결과: " + sum);

        double result = Number4.subtract(num1, num2);
        System.out.println("빼기 결과: " + result);

        try {
            double divresult = Number4.divide(num1, num2);
            System.out.println("나누기 결과: " + divresult);
        } catch (IllegalArgumentException e) {
            System.out.println("나누기 오류: " + e.getMessage());
        }

        double result2 = Number4.multiply(num1, num2);
        System.out.println("곱하기 결과: " + result2);

        scanner.close();
    }

}
