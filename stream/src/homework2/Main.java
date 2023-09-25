package homework2;
// HAS A 관계 MAIN
public class Main {

	public static void main(String[] args) {
		Coffee latte = new Coffee("바닐라 라떼", 5000, "아이스");
		// new의 역할: 생성자를 호출
		//()에 보내줄 coffee instance를 만들어야 합니다
		Coffee dopio = new Coffee("도피오", 3500 , "핫");
		
		Cafe starbucks = new Cafe(latte, dopio);
		starbucks.sell();
		starbucks.sell();
		
	}
}
