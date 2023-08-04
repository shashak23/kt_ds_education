package homework;

import java.util.Scanner;

public class Number2 {

	// 숫자의 제곱값을 계산하여 반환하며, 예외 처리도 수행
    public static int calculateSquare(int number) throws Exception {
        if (number <= 0) {
            throw new Exception("0보다 큰 숫자를 입력하세요!");
        }
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int inputNumber = scanner.nextInt();

        try {
            int result = calculateSquare(inputNumber);
            System.out.println(inputNumber + "의 제곱값은 " + result + "입니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

}
