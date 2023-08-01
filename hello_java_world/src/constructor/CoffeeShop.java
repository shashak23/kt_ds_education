package constructor;

public class CoffeeShop {
	
//	int iceAmericano;
//	int hotAmericano;
	CoffeeVO iceAmericano;
	CoffeeVO hotAmericano; // 1) 이렇게 되면 아래의 int로 된 걸 다 변경해야함!
	
	// 생성자 초기화 = 클래스 내 값 고정
	// 3. 파라미터로 생성해서 값을 넣어보자
//	public CoffeeShop(int iceAmericano, int hotAmericano){
////		iceAmericano = 2500;
////		hotAmericano = 2000;
//		iceAmericano = iceAmericano;
//		hotAmericano = hotAmericano;
//	}
	
	// 1. 생성자가 만들어 둔 this라는 생성자에 각자 파라미터를 넣는 것.
	// 1-1. 아이스에는 아이스를, 핫에는 핫을 넣기
	// 1-2. 여기서 this는 아래의 main의 cs와 항상 같은 객체를 가리킨다.
//	public CoffeeShop(int iceAmericano, int hotAmericano) {
	public CoffeeShop(CoffeeVO iceAmericano, CoffeeVO hotAmericano) { // 2)
		this.iceAmericano = iceAmericano; // 8. this의 iceAmericano에 할당을 해라! 라는 뜻!!
		this.hotAmericano = hotAmericano; // 8-1. 그러면 this를 가진 값들에 고정시킨 2500과 2000이 들어감
	}
	
//	public int orderCoffee(int menu, int quantity) { // 3)
	public int orderCoffee(int menu, int quantity) { 
		if(menu == 1) {
			System.out.println(iceAmericano.name + "을 주문했습니다.");
			return iceAmericano.price * quantity; //this.iceAmericano, 9. 기본적으로 this가 생략이 되어 있어요.
			// 3-1) iceAmericano를 찾는데 그게 name인지 price인지 몰라서!
			// 3-2) 바뀌더라도 에러가 날텐데 그 이유는 : public 다음에 int를 반환해야하는 메소드이기 때문이다.
			// 3-3) 그래서 iceAmericano에 price라는 int 속성을 가진 필드를 붙여야 한다.
		}
		System.out.println(hotAmericano.name + "을 주문했습니다.");
		return hotAmericano.price * quantity; //this.hotAmericano 9-1. 자동으로 같은 필드를 찾아간다!
	}
	
	public static void main(String[] args) {
		CoffeeVO iceAmericano = new CoffeeVO("아이스 아메리카노",2500);
		CoffeeVO hotAmericano = new CoffeeVO("따뜻한 아메리카노", 2000);
		
		CoffeeShop cs = new CoffeeShop(iceAmericano, hotAmericano); // 4)이렇게 최종적으로 바꿔야 한다!
		
//		CoffeeShop cs = new CoffeeShop(2500, 2000); // 4. 여기서 에러가 나느데 이유는 생성자가 원래 있네?여서!
										  // 5. 여기서 생성자를 새로 만든건데 생성자로 되지 않고 Class로 가버린다!!
										  // 6. 그래서 ()에 필드들을 int 로 넣어줘야한다
		int price = cs.orderCoffee(1, 5); // 2. 여기서 cs는 위의 this와 같다.
		System.out.println(price);
	}
	// 7. 여기까지는 본인이 본인에게 할당을 하기때문에 출력값이 price가 0이 된다.
}
