package homework;

import java.util.Scanner;

public class Number3 {
	// 나누어 나머지가 0이 되는 가장 작은 숫자를 찾아 반환하는 메소드
    public static int minNumber(int number) {
        for (int div = 2; div <= number; div++) { // 반복
            if (number % div == 0) {
                return div;
            }
        }
        return number; // 1과 자기 자신을 제외하고 나누어 떨어지는 숫자가 없는 경우....
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 스캐너

        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt(); // 형변환

        int minDivisor = minNumber(number); // 숫자 넣고 
        System.out.println(number + "의 가장 작은 나누어 떨어지는 숫자는 " + minDivisor + "입니다.");

        scanner.close();
    }
}
