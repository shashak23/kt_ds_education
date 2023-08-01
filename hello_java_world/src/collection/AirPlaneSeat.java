package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import array.Main;

public class AirPlaneSeat {
	/**
	 * 좌석을 선택하세요 좌석번호: A1 A1좌석이 예매되었습니다. 위의 내용이 나오는 콘솔앱 만들기 27일 목요일 오전에 이어서 하기
	 */
	public void mapReserve() {

		Scanner keyboard = new Scanner(System.in);
		Map<String, Boolean> seats = new HashMap<>();
		String seatNumber = null;

		while (true) {
			System.out.println("Choice the Seat");
			seatNumber = keyboard.nextLine();
			// 모든 영문자들을 대문자로 변경. 반대는 toLowerCase();
			seatNumber = seatNumber.toUpperCase();

			// 좌석 번호를 다 잘 입력했는지 확인하기
			if (seatNumber.matches("^[A-Z][0-9]$")) {
				// 아니라면
				System.out.println("Wrong Seat! Try again");
			} else {
				// 존재하지 않는 키에는
				if (!seats.containsKey(seatNumber)) {
					// 키 및 값을 추가함
					seats.put(seatNumber, false);
				}

				if (seats.get(seatNumber)) {
					System.out.println(seatNumber + ", is already full.");
					System.out.println("Try other seat plz");
				} else {
					seats.put(seatNumber, true);
					System.out.println(", succesfully Reservation!");

				switch(num) {
				
				case 1 : 
					   System.out.print("Seat Number:");
					   String seat = sc.nextLine(); 
//					   if (seat != null && !seat) {
//                           airplaneSeat.put(seatName, true);
//                           System.out.println(seatName + " seat has been reserved.");
//                       } else {
//                           System.out.println("Seat " + seatName + " is already booked. Choose another seat.");
//                       }
		               
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
	}

	public void listReserve() {

		Scanner keyboard = new Scanner(System.in);
		List<Boolean> seats = new ArrayList<>();

		int seatNumber = 0; // 좌석 카운트 할 코드 받기

		while (true) {
			System.out.println("Insert Seat Number");
			seatNumber = keyboard.nextInt();

			// 예약된 좌석 제외하고 나가기
			// 시작할 때 해야지 ????
			if (seatNumber == -1) {
				break;
			}

			// 존재하지 않는 인덱스를 입력했을 때 나오는 부분
			if (seats.size() <= seatNumber) {
				for (int i = seats.size(); i <= seatNumber; i++) {
					// 예약되지 않은 좌석을 생성
					seats.add(false);
				}
			}

			// 이미 예약이 되어 있는 부분
			if (seats.get(seatNumber)) {
				System.out.println(", This seat is already full.");
				System.out.println("Please check other seat");
			} else {
				// 아니면 예약 완료 부분
				seats.set(seatNumber, true);
				System.out.println(seatNumber + ", Resevation OK!!!!");
			}
			// 종료
			System.out.println("Your resevation is done!");
			System.out.println("This game is The End!!");

		}


//	public static void main(String[] args) {
//		AirPlaneSeat sr = new AirPlaneSeat();
////			sr.listReserve();
//		    sr.mapReserve();
//	}
//}

// -------------- 위 강사님, 아래 나 (실패)

//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		// 생성
//		Map<String, Boolean> airplaneSeat = new HashMap<>();
//		
//		// 추가
//		airplaneSeat.put("A1", false); 
//		airplaneSeat.put("A2", false); // 없음
//		airplaneSeat.put("A3", true);  // 있음
//		airplaneSeat.put("B1", false); 
//		airplaneSeat.put("B2", false); 
//		
//		// 출력
//		System.out.println(airplaneSeat);
//		System.out.println(airplaneSeat.size());
//		
//		// 시작 
//		while(true) {
//			System.out.println("Start App ===================== !! ");
//			System.out.println("1. choice Seat");
//			System.out.println("2. check Seat");
//
//			String seatName;
//			int num;
//			// boolean seat = false; // 입력받는 게 아니니까 놉
//				try {
//					//seat = sc.nextBoolean(); // 예매하는 순간 true가 되어야하니까 
//					num = sc.nextInt();
//					
//				} catch {
//					 System.out.println("Wrong Number, Press the Number plz");
//		             sc.nextLine(); 
//		             continue;
//				}
//				switch(num) {
//				
//				case 1 : 
//					   System.out.print("Seat Number:");
//					   seatName = sc.nextLine(); 
//					   if( !airplaneSeat.get(seatName) ) {
//						   // 이미 불리언이라서 == 안해도 되고
//						   airplaneSeat.get(seatName);
//					   }
//		               
//		               break;
//		              
//			    case 2:
//		               System.out.println("Check Seat : " + airplaneSeat.get(airplaneSeat));
//		               sc.close();
//		               System.exit(0);
//		               
//		               break;
//		
//	            default:
//	                System.out.println("Wrong Number. Try again!!!!!!");
//				}
//		
//		}
//
//	}

	}
	}
