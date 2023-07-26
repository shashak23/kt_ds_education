package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		// list = arraylist
		// map = hashmap
		// 1. 생성
		Map<String, Integer> priceMap = new HashMap<>();
		
		// 2. 추가
		priceMap.put("Apple Pro", 350000000);
		priceMap.put("LG gram", 250000000);
		priceMap.put("Galaxy", 150000000);

		// 3. map 출력
		System.out.println(priceMap);
		
		// 4.map key value pair 수 출력
		System.out.println(priceMap.size());
		
		// 5. 수정
		// map을 동일한 키로 데이터를 추가할 경우, value 값만 변경된다.
		// amp에는 동일한 키 값을 사요할 수 없다 -> key 값은 항상 유일하다.
		priceMap.put("LG gram", 1800000);
		priceMap.put("LG Gram", 1800000);
		
		// 출력 - 대소문자를 구분해서 처리함
		System.out.println(priceMap);
		
		// 6. 잘못추가된 대문사 그램을 지워볼게요
		// map의 데이터 삭제는 key로 쉽지 않다.
		priceMap.remove("LG Gram");
		System.out.println(priceMap);
		
		// 7. map에 value를 주자
		int price = priceMap.get("Galaxy");
		System.out.println(price);
		
		// 8. map에 없는 데이터 조회
		//int msprice = priceMap.get("MS pro 9");
		//System.out.println(msprice);
		// 기본 값으로 null을 반환을 함 
		// 예외처리남 java.lang.NullPointerException
		
		// 8-1. 여기서 ()안에 0을 함께 넣으면 0을 같이 반환함
		int mssprice = priceMap.getOrDefault("MSS pro 9", 0);
		System.out.println(mssprice);
		
		// 9. 삭제 
		// priceMap.clear(); // 모든 데이터 삭제  
		// System.out.println(priceMap); // 결과 = {}
		
		// 10. 키가 존재하는지 확인
		// LG gram이라는 게 없다면, 
		if( !priceMap.containsKey("LG gram")) {
			// 아래를 추가해라 
			priceMap.put("Microsoft 10", 3000000);
		}
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		
		// map에는 아래와 같은 식으로도 생성이 가능하다
		// 1. 생성
		Map<String, List<BookVO>> yes24 = new HashMap<>();
		//Map<String, Map<String, List<BookVO>>> naverShopping = new HashMap<>();
		//Map<String, Map<String, Map<String, List<BookVO>>>> daumShopping = new HashMap<>();
		
		// 2. 데이터 만들어 넣기 - list를 가지고 arraylist를 만드니까 값에도 arraylist가 들어가야해요
		yes24.put("Game Dev", new ArrayList<>());
		yes24.put("Game Pro", new ArrayList<>());
		yes24.put("Game Ama", new ArrayList<>());
		
		System.out.println(yes24); // Game Dev, 옆은 [] 빈 리스트로 나옴
		
		// 우리가 앞으로 할 일은 데이터를 넣는 건데
		// 설정한 형태에 맞게 값만 전달해주면 돼요
		// 3. 데이터 넣기2 - 해당 데이터에 알맞는 객체 구조에 따른 데이터 넣어 주기! 
		yes24.get("Game Dev").add(new BookVO("게임 개발자가 알려주는 유니티 게임 제작 입문", "홍동희", 10000));
		yes24.get("Game Pro").add(new BookVO("파이썬으로 배우는 게임 개발 입문편", "제이펍", 15000));
		yes24.get("Game Ama").add(new BookVO("소셜 네트워크 게임개발", "배재환", 20000));
		// 근데 이렇게 직접 넣는 것에는 단점이 있는데 
		// 바로 띄어쓰기 하나 잘못하는 순간 null로 값이 반환된다는 것!
		
		System.out.println(yes24); // 그냥 출력하면 데이터가 들어간 주소가 나온다.
		
		// 4. 확인하고 추가하기
		if(!yes24.containsKey("Game Pro   ")) {
			List<BookVO> book = new ArrayList<>();
			book.add(new BookVO("Game Bonus", "kimsiha", 40000));
			yes24.put("Game Pro   ", book);
		}
		System.out.println(yes24);
	}

}
