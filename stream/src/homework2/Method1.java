package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Method1 {
	
	// 1.
	public void getPlus() {
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
	}
	
	// 2.
	public void getAdd() {
		int a = 100;
		int b = 10;
		int c = 50;
		int d = 90;
		
		int result = a+ b+ c+ d;
		
		System.out.println(result);
	}
	
	// 3.
	public void getMultiple() {
		 int a = 1;
		 int b = 50;
		 
		 int result = a * b;
		 System.out.println(result);
	}
	
	// 4.
	public void getDevide1() {
		int a = 50;
		int b = 15;
		
		int result = a / b;
		System.out.println(result);
	}
	
	// 5. 
	public void getDevide2() {
		int a = 90;
		int b = 900;
		
		int result = a % b;
		System.out.println(result);
	}
	
	// 6.
	public void getCast1() {
		int a = 100;
		int b = 20;
		
		double result = 10 / 20;
		System.out.println(result);
	}
	
	// 7. 
	public void getDevide3() {
		int a = 17;
		int b = 3;
		
		// int형인 a를 double인 1.0을 곱해서 
		// 한번 더 b로 나눈다
		double c = a * 1.0 / b;
		// System.out.println(c); // 5.66666667
		
		double d = c * 10; 
		// System.out.println(d); // 56.666667 
		
		double e = Math.round(d);
		System.out.println(e); // 57.0
		
	}
	
	// 8.
	public void getDouble() {
		double a = 10.3;
		double b = 1.5;

		System.out.println(Math.max(a, b));
	}
	
	// 9. 
	public void getTriple() {
		// 랜덤사용
		Random rand = new Random();
		
		double a = rand.nextDouble() * 100;
		double b = rand.nextDouble() * 100;
		double c = rand.nextDouble() * 100;
		
		double min = Math.min(Math.min(a, b), c);
		System.out.println(min);
		
		// 스캐너 사용
//		Scanner sc = new Scanner(System.in);
//		
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double c = sc.nextDouble();
//		
//		double min = a < b ? a : b ;
//		System.out.println(min < c ? min :c);
		// 이게 왜 안되는지 모르겠습니다....
	}
	
	// 10.
	public void getMultiple1() {
		Random rand = new Random();
		double a = rand.nextDouble() * 100;
		double b = rand.nextDouble() * 100;
		double c = rand.nextDouble() * 100;
		double d = rand.nextDouble() * 100;
		double e = rand.nextDouble() * 100;
		//평균
		double ave = (a + b + c + d + e) / 5 ;
		//비교
		if (a > ave) {
			System.out.println(a + "는 큰 수 입니다.");
		}
		if (b > ave) {
			System.out.println(b + "는 큰 수 입니다.");
		}
		if (c > ave) {
			System.out.println(c + "는 큰 수 입니다.");
		}
		if (d > ave) {
			System.out.println(d + "는 큰 수 입니다.");
		}
		if (e > ave) {
			System.out.println(e + "는 큰 수 입니다.");
		}
	}
	
	// 11.
	public void getMultiple2() {
		Random rand = new Random();
		int a = rand.nextInt() + 1;
		int b = rand.nextInt() + 1;
		int c = rand.nextInt() + 1;
		int d = rand.nextInt() + 1;
		int e = rand.nextInt() + 1;
		
		if(a % 2 == 0 || a % 5 == 0 || a % 8 == 0) {
			System.out.println(a + "는 2, 5, 8의 배수입니다.");
		}
		if(b % 2 == 0 || b % 5 == 0 || b % 8 == 0) {
			System.out.println(b + "는 2, 5, 8의 배수입니다.");
		}
		if(c % 2 == 0 || c % 5 == 0 || c % 8 == 0) {
			System.out.println(c + "는 2, 5, 8의 배수입니다.");
		}
		if(d % 2 == 0 || d % 5 == 0 || d % 8 == 0) {
			System.out.println(d + "는 2, 5, 8의 배수입니다.");
		}
		if(e % 2 == 0 || e % 5 == 0 || e % 8 == 0) {
			System.out.println(e + "는 2, 5, 8의 배수입니다.");
		}
	}
	
	// 12.
	public void getMultiple3() {
		Random rand = new Random();
		int a = rand.nextInt() + 1;
		int b = rand.nextInt() + 1;
		int c = rand.nextInt() + 1;
		int d = rand.nextInt() + 1;
		int e = rand.nextInt() + 1;
		
		if(a % 2 == 0 || a % 5 == 0 || a % 6 == 0) {
			System.out.println(a + "는 2, 5, 6의 배수입니다.");
		}
		if(b % 2 == 0 || b % 5 == 0 || b % 6 == 0) {
			System.out.println(b + "는 2, 5, 6의 배수입니다.");
		}
		if(c % 2 == 0 || c % 5 == 0 || c % 6 == 0) {
			System.out.println(c + "는 2, 5, 6의 배수입니다.");
		}
		if(d % 2 == 0 || d % 5 == 0 || d % 6 == 0) {
			System.out.println(d + "는 2, 5, 6의 배수입니다.");
		}
		if(e % 2 == 0 || e % 5 == 0 || e % 6 == 0) {
			System.out.println(e + "는 2, 5, 6의 배수입니다.");
		}
	}
	
	// 13. 
	public void getHello() {
		int count = 0;
		// while 쓰기 
		while(count < 5) {
			System.out.println("안녕하시렵니까?");
			count++;
		}
	}
	
	// 14.
	public void getTwice() {
		Scanner sc = new Scanner(System.in);
		// while 써 보기
		while(true) {
			System.out.println("정수를 입력하시오 : ");
			int a = sc.nextInt();
			if(a % 2 ==0 || a <= 0) {
				System.out.println("게임을 마칩니다!!!!!!");
			break;
			}
			System.out.println("입력한 숫자는 2의 배수입니다 :) ");
		} 
		 sc.close();
	}
	
	// 15.
	public void getFight() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("적의 체력을 입력하세요 : ");
		int enemyHealthPoint = sc.nextInt();
		
		while(true) {
			// 난수를 생성....
			int a = rand.nextInt(100) + 1;
			System.out.println("적에게 " + a + "만큼 피해를 입혔습니다 ㅜㅜㅜㅜ");
			// enemyHealthPoint가 적어지고
			enemyHealthPoint -= a;
			// enemyHealthPoint가 0보다 작거나 0이 되면 
			if(enemyHealthPoint <= 0) {
				System.out.println("Victory!!!!!!");
				break;
			}
		}
		sc.close();
		// 질문1. 입력만하면 그냥 모든 것이 출력되버려요..
		// 나중에 학원에서 봐 주세요 ㅜㅜ 
	}
	
	// 16. 
	public void getNumber1() {
		for(int i=0; i < 11; i++) {
			System.out.println(i);
		}
	}

	// 17. 
	public void getNumber2() {
		for(int i=30; i < 39; i++) {
			System.out.println(i);
		}
	}
	
	// 18. 
	public void getNumber3() {
		
		for(int i=2; i < 4; i++) {
			System.out.println(i + "단");
			for(int j=1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i *j));
			}
		}
	}
	
	// 19.
	public void getNumber4() {
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단");
			for(int j=1; j <=9; j++) {
				System.out.println(i + "*" + j + "=" + (i *j));
			}
		}
	}
	
	// 20.
	public void getNumber5() {
		// isPrime : 소수인지 판별
		boolean isPrime = true;
		// 1차 확인
		for(int i = 2; i <= 1000; i++) {
			isPrime = true;
			// 2차 확인
			for(int j = 2; j <= Math.sqrt(i); j++) {
				// 비교 
				if(i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		// 질문2. 계속 소수입니다 나오는 게 맞나요?
		System.out.printf(isPrime ? "소수입니다." : "소수가 아닙니다.");
	}


	public static void main(String[] args) {
		Method1 method1 = new Method1();
		// 1.
		//method1.getPlus();
		// 2.
		//method1.getAdd();
		// 3.
		//method1.getMultiple();
		// 4.
		//method1.getDevide1();
		// 5.
		//method1.getDevide2();
		// 6.
		//method1.getCast1();
		// 7.
		//method1.getDevide3();
		// 8.
		//method1.getDouble();
		// 9.
		//method1.getTriple();
		// 10.
		//method1.getMultiple1();
		// 11.
		//method1.getMultiple2();
		// 12.
		//method1.getMultiple3();
		// 13.
		//method1.getHello();
		// 14.
		//method1.getTwice();
		// 15.
		//method1.getFight();
		// 16.
		method1.getNumber1();
		// 17.
		method1.getNumber2();
		// 18.
		method1.getNumber3();
		// 19.
		method1.getNumber4();
		// 20.
		method1.getNumber5();
	}
}
