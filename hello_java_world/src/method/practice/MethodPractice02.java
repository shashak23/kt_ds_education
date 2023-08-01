package method.practice;

import java.util.Scanner;

public class MethodPractice02 {

	public static int getMath(int num, int time) {
		return num * time;
	}
	
	
	public static void main(String[] args) {
		// getMath 메소드 관련
		//int result = getMath(10, 4);
		//System.out.println(result); // 값을 console에 출력하기

		// 섭씨를 파라미터로 반환해서 화씨를 구함
		// 방법1. scanner 사용
		Scanner sc = new Scanner(System.in);
		int hawsee = sc.nextInt();
		float subsee  = (hawsee * 9 / 5) + 32;
		
		System.out.println(subsee);
		sc.close();
		
	}
	
	
}
