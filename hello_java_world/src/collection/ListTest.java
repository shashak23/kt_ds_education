package collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		// 1. list 만들기 - list를 쓰는 순간부터 배열은 사용하지 않습니다.
		// list는 .add로 추가를 하거나 복붙해서 변경은 가능하지만
		// list를 한꺼번에 바꾸는 건 안됨
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		// 동일한 값의 경우를 넣기 
		scoreList.add(70);
		scoreList.add(70);
		
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		// 3. List를 반복하는 첫 번째 방법 - 전통 for
		// index값을 알아야 할 때 사용하는 방법
		for(int i=0; i<scoreList.size(); i++) {
			int value = scoreList.get(i);
			System.out.println("index :" + i + " = " + value);
		}
		
		System.out.println("===============================");
		
		// 4. List를 반복하는 두 번째 방법 - for each
		// index 값은 관심이 없고 값만 반복할 때 사용함
		for(int value : scoreList) {
			int index = scoreList.indexOf(value);
			System.out.println("index :" + index + " = " + value);
			
		}
		
		System.out.println("===============================");
		
		// 5. List를 반복하는 세 번째 방법 - 람다식
		// index는 관심이 없고 값만 반복할 때 사용함
		//forEach가 원하는 건 보통 Consumer인데 이게 인터페이스!
		scoreList.forEach((value) -> {
			System.out.println(value); //값만 나옴 
		});  
		
		System.out.println("===============================");
		
		// 6. index 값을 삭제하는 방법
		// 전통 for문을 가져와서 
		for(int i=0; i<scoreList.size(); i++) {
			int value = scoreList.get(i);
			System.out.println("index :" + i + " = " + value);
		}
		
		scoreList.remove(2); // 2번 인덱스를 지우면 index 값이 빠지는데 자동으로 정렬이 됨
		// 그러면 3,4,5 인덱스가 2,3,4 인덱스로 변경이 된담.
		
		// 결과 확인용 for반복문
		for(int i=0; i<scoreList.size(); i++) {
			int value = scoreList.get(i);
			System.out.println("index :" + i + " = " + value);
		} 
		
		// -> 지울 때 조심해야해요! 반복문을 이용한 삭제를 한다면 예외가 나오는데
		// 길이에 비해 인덱스가 다르니까 안된다는 예외! i++은 index가 점차 증가하는데
		// 길이는 점차 줄어드니까 index를 찾지 못하고 예외처리가 뜸!
		
		// 역순으로는 안전하게 제거할 수 있다. 반복하여 전부를~!
		int size = scoreList.size();
		for(int i=size-1; i >=0; i--) {
			scoreList.remove(i);
		}
		
		
		// 2. get으로 읽어오기 해 보기 
		// get을 가지고 참조를 할 때에는
		// size에서 벗어나지는 않는지 주의
		// 그치만 직접 참조할 일이 많지는 않아요~
//		int value = scoreList.get(0);
//		System.out.println(value);
//		
//		value = scoreList.get(1);
//		System.out.println(value);
//		
//		value = scoreList.get(2);
//		System.out.println(value);
	}
}
