package homework;

import java.util.Scanner;

public class Number4 {
	public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}

