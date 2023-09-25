package homework2;
//HAS A 관계 - 상위
public class Cafe {
	// 멤버변수
	private Coffee coffee;
	private Coffee coffee2;
	
	// 생성자 - 값을 할당하는 애 
	public Cafe(Coffee coffee, Coffee coffee2) {
		// 내가 할당하려는 파라미터를 멤버변수에 넣어야지요?
		// this는 생성자가 만든 인스턴스에요
		this.coffee = coffee;
		this.coffee2 = coffee2;
	}
	
	// sell 메소드 생성
	public void sell() {
		// 라뗴라는 인스턴스가 Cafe -> Coffee 의 private니가
		// 여기서 가져오려면 getter가 필요해요 -> Coffee를 생성하고 
		System.out.println(this.coffee.getName() + "를 판매합니다");
	}
}
