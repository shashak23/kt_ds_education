package method.practice;

import java.util.Scanner;

// p. 167~168 
public class MethodPractice03 {
	
	public static int getSecond01(int minutes, int seconds) {
		// 5분의 초를 먼저 구하고 
		int result = 0;
		result = minutes * 60;
		// 그 초에 seconds를 더하면 되고
		result += seconds;
		// 그 값을 반환하기 
		return result;
	}
	
	// p. 168 문제 - 분 구하기
	public static int getMinute(int sec) {
		// 선언하고
		int min = 0;
		// 로직
		min = sec * 60;
		// 반환하기
		return min;
		
	}
	// p. 168 문제 - 초 구하기
	public static int getSecond02(int min) {
		// 선언하기
		int sec = 0;
		// 로직
		sec = min % 60;
		// 반환하기 
		return sec;
	}
	
	public static void main(String[] args) {
//		// scanner 사용해 보기
//		Scanner sc = new Scanner(System.in);
//		int second = sc.nextInt();
//		int minute = second / 60;
//		int hour = minute / 60;
//		System.out.println(second + "초" + minute + "분" + hour + "시간");
		
		// 분,초를 파라미터로 하고 초를 반환하는 공식
		int result = getSecond01(5, 50);
		System.out.println(result);
		
		int min = getMinute(6);
		System.out.println(min);
		
		int sec = getSecond02(60);
		System.out.println(sec);
	}
}
