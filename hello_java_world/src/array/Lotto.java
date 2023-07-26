package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		// 배열 생성
//		int[] lotto = new int[6];
		// 1. generic 생성
		List<Integer> lotto = new ArrayList<>();
		
		// 난수 생성을 위한 랜덤 생성
		Random r = new Random();
		
//		// 배열에 넣은 번호의 개수를 카운팅 하기 위한 변수 생성
//		int count = 0;
		
		// 번호가 총 6개가 될 때까지 반복
		// 2. 조건 넣기 
		while(lotto.size() < 6) {
			
			int num = r.nextInt(45) + 1;
			
			// list의 값이 존재하지 않을 경우,
			// list에 num을 추가한다.
			// contains를 이용해서 우리가 발급받은 난수는 넣고 
			// contains는 중복을 없앤다.
			if ( !lotto.contains(num) ) {
				lotto.add(num);
			}
		}
		
		// 3. 출력하기
		// for each 사용하기 
		// lotto 리스트가 데이터에 number를 넣고 
		for(int number : lotto) {
			System.out.println(number); //출력 -> 중복없이 깔끔
		}
		
//		while (count < lotto.length) {
//			
//			// 1 ~ 45 중 하나를 랜덤하게 할당.
//			int num = r.nextInt(45) + 1;
//			
//			// lotto 번호가 num이 이미 있는지 확인.
//			boolean isExistNumber = false;
//			// lotto 배열의 수 만큼 반복
//			for (int i = 0; i < lotto.length; i++) {
//				// 배열에 있는 값이 num과 같은지 비교
//				if (lotto[i] == num) {
//					// 배열에 이미 들어있는 값.
//					isExistNumber = true;
//					// for 반복문 종료
//					break;
//				}
//			}
			
			// 배열에 없는 값인 경우, 배열에 번호 추가
//			if (!isExistNumber) {
//				lotto[count++] = num;
//			}
		
		// 추가된 번호 출력 - 전통적인 방법
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}
		
	}
	
}