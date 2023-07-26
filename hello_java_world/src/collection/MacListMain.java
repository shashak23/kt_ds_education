package collection;

import java.util.ArrayList;
import java.util.List;

// Generic
// Mac의 정보를 생성, 추가, 출력하는 클래스 만들기 
public class MacListMain {
	
	public static void main(String[] args) {
		
		// 생성
		List<MacVO> macList = new ArrayList<>();
		
		// 추가 
		macList.add(new MacVO("MacBook Pro 13", "M2 cheap", 10000000));
		macList.add(new MacVO("MacBook Pro 14", "M2 Pro cheap", 13000000));
		macList.add(new MacVO("MacBook Pro 16", "M3 cheap", 15000000));
		
		// 가격정보 가져오기
		for(MacVO number : macList) {
			System.out.println(number.getName());
			System.out.println(number.getCheap());
			System.out.println(number.getPrice());
		}
		
	}
	
}
