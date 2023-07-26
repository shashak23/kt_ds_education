package generic;

import contact.ContactVO;

public class GenericMain {
	
	public static void main(String[] args) {
		// 2. 이런것도 할 수 있어요~! 
		ScoreList<ContactVO> contactlist = new ScoreList<>();
		contactlist.add(0); // 원하는 대로 추가
		
		
		// 1. 배운대로 써 보기 
		ScoreList<Integer> scoreList = new ScoreList<>();
		// 여기에다가 우리가 알고자 하는 타입을 적기!
		// 그냥 소트리스트에서는 오브젝트로 바꿨지만
		// 여기서 바꾸는 거다!
		
		// ScoreList<Integer> scoreList = new ScoreList<Integer>();
		// 위와 같인 쓰던 방식이 1.5까지 쓰던 방식인데
		// 그 이상부터는 뒤에 인티저가 생략이 가능함
		
		// 위에서 ScoreList를 Integer로 하니까 결국 ScoreList 클래스에서 정의했던
		// T는 Integer로 바뀐다.
		scoreList.add(10);  // .add를 통해 원하는 만큼 추가할 수 있다.
		
		System.out.println(scoreList.size()); // 몇 개 들어가있나 확인해볼게요
		
		System.out.println(scoreList.get(0)); // 출력도 해 볼게요
		
		System.out.println(scoreList); // 리스트로 출력 해 볼게요 
	}

}
