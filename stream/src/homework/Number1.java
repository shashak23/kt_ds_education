package homework;

import java.util.Scanner;

public class Number1 {
	
	public static int calculate(int number) {
		
		return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int inputNumber = scanner.nextInt();

        int result = calculate(inputNumber);
        System.out.println(inputNumber + "의 제곱값은 " + result + "입니다.");

        scanner.close();
    }
	
}
