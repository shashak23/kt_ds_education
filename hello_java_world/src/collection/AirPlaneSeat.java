package collection;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class AirPlaneSeat {
/**
 * 좌석을 선택하세요 
 * 좌석번호: A1
 * A1좌석이 예매되었습니다.
 * 위의 내용이 나오는 콘솔앱 만들기
 * 27일 목요일 오전에 이어서 하기 	
 */
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 생성
		Map<String, Boolean> airplaneSeat = new HashMap<>();
		
		// 추가
		airplaneSeat.put("A1", false); 
		airplaneSeat.put("A2", false); // 없음
		airplaneSeat.put("A3", true);  // 있음
		airplaneSeat.put("B1", false); 
		airplaneSeat.put("B2", false); 
		
		// 출력
		System.out.println(airplaneSeat);
		System.out.println(airplaneSeat.size());
		
		// 시작 
		while(true) {
			System.out.println("Start App ===================== !! ");
			System.out.println("1. choice Airplane Seat");
			System.out.println("2. check Airplane Seat");

			String seatName;
			int num;
			// boolean seat = false; // 입력받는 게 아니니까 놉
				try {
					//seat = sc.nextBoolean(); // 예매하는 순간 true가 되어야하니까 
					num = sc.nextInt();
					
					
				} catch (InputMismatchException e) {
					 System.out.println("Wrong Number, Press the Number plz");
		             sc.nextLine(); 
		             continue;
				}
				switch(num) {
				
				case 1 : 
					   System.out.print("Seat Number:");
					   seatName = sc.nextLine(); 
					   if(airplaneSeat.get(seatName)) {
						   // 이미 불리언이라서 == 안해도 되고
						   System.out.println(airplaneSeat);
						   // at으로 불러와요?
					   }
		               
		               break;
		              
			    case 2:
		               System.out.println("Check Seat : ");
		               sc.close();
		               System.exit(0);
		               
		               break;
		
	            default:
	                System.out.println("Wrong Number. Try again!!!!!!");
				}
		
		}

	}
}
