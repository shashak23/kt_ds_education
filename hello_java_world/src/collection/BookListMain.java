package collection;

import java.util.ArrayList;
import java.util.List;

public class BookListMain {

	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();
		
		// 1. 책 3권 추가
		bookList.add(new BookVO("스프링 부트 3 백엔드 개발자 되기", "김시하", 30000));
		bookList.add(new BookVO("자바 트러블슈팅", "김시하", 35000));
		bookList.add(new BookVO("모던 자바스크립트 Deep Dive", "김시하", 45000));
		
		
		// 2. 두 번째 책 삭제
		bookList.remove(1); // 두번째꺼 삭제하기 
		
		// 3. 책 목록 출력
		System.out.println(bookList);
		
		// 4. bookList 모두 제거 
		// for each 사용하기
		for( BookVO number : bookList) {
			System.out.println(number.getPrice()); // 넘버 이용해서 가격 가져오기 
		}
		
		// 5. 책 목록 출력
		System.out.println(bookList);
		
	}

}
