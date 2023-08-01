package classninstance;

import java.util.Random;

public class Game {
	boolean isInsertCoin;
	int dolls;
	
	// this 사용해서 생성자 만들기
	public Game(boolean isInsertCoin, int dolls) {
		this.isInsertCoin = isInsertCoin;
		this.dolls = dolls;
	}
	
	public void isInsertCoin() {
		// 아래의 내용을 isInsertCoin = dolls > 0; 이렇게 줄일 수 있다.		
		if(dolls > 0) {
			isInsertCoin = true;
		} else {
			isInsertCoin = false;
		}
	}
	
	public int doGame() {
		// true 일 때만 진행하기
		if(isInsertCoin) {
			Random rand = new Random();
			int randomNumber = rand.nextInt(2); // 0과 1만 나오도록 2를 설정함
			
			// 3. 그래서 이렇게 만들어요
			dolls -= randomNumber;
			// 1. randomNumber의 값은 항상 0 아니면 1 이다.
			//if(randomNumber == 1) {
			//	dolls -= 1; // 2. dolls에서 0을 빼나 1을 빼나 똑같아!
			//}
			
			isInsertCoin = false;
			return randomNumber;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// 객체 생성
		Game cgm = new Game(false, 1);
		// 변수에 필드 연동 및 값 부여
		cgm.isInsertCoin = false;
		cgm.dolls = 10;
		// 내 방법
//		// 결과를 위란 메소드 호출
//		cgm.isInsertCoin();
//		// 결과 별도 생성 및 doGame에 insertCoin 내용이 다 있으니까 하나만 호출
//		int result = cgm.doGame();
		
		// 강사님 방법 - 반복문에 
		while(cgm.dolls > 0) {
			cgm.isInsertCoin();
			int result = cgm.doGame();
			
			System.out.println("결과 : "+ result);
			System.out.println("남은 코인 갯스" + cgm.isInsertCoin);
			System.out.println("남은 인형 갯수" + cgm.dolls);
		}
		// 결과 도출
		// System.out.println(result);
		
	}
}
