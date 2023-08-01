package method.practice;

// for 반복문 연습문제 p. 163
public class MethodPractice01 {
	
	public static void main(String[] args) {
		// 1~100 의 합을 구하시오
		// 1번 문제 : 1부터 100까지 합계
//		int sum = 0;
//		for(int i=0; i<101; i++) {
//			sum += i;
//		}
		
		// 2번 문제 : 3의 배수
		int count = 0;
		for(int i=0; i<101; i++) {
			if(i % 3 == 0) {
				System.out.println("3의 배수" + count + i);
				count += i ; // counst에 i만큼 더해라
			}
		}
		
		// 3번문제 : 3,5,6 배수
//		int count = 0;
//		for(int i=0; i<101; i++) {
//			if(i % 3 ==0) {
//				System.out.println("3의 배수 :" + count + i);
//			}
//			if(i % 5 ==0) {
//				System.out.println("5의 배수 :" + count + i);
//			}
//			if(i % 6 ==0) {
//				System.out.println("6의 배수 :" + count + i);
//			}
//		}

		 // System.out.println("1부터 100까지 총함 = " + sum);

	}
}
