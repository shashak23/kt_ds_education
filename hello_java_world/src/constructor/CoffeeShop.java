package constructor;

public class CoffeeShop {
	
	int iceAmericano;
	int hotAmericano;
	
	// 생성자 초기화 = 클래스 내 값 고정
	// 3. 파라미터로 생성해서 값을 넣어보자
	public CoffeeShop(int iceAmericano, int hotAmericano){
//		iceAmericano = 2500;
//		hotAmericano = 2000;
		iceAmericano = iceAmericano;
		hotAmericano = hotAmericano;
	}
	
	// 1. 생성자가 만들어 둔 this라는 생성자에 각자 파라미터를 넣는 것.
	// 1-1. 아이스에는 아이스를, 핫에는 핫을 넣기
	// 1-2. 여기서 this는 아래의 main의 cs와 항상 같은 객체를 가리킨다.
//	public CoffeeShop(int iceAmericano, int hotAmericano) {
//		this.iceAmericano = iceAmericano; // 8. this의 iceAmericano에 할당을 해라! 라는 뜻!!
//		this.hotAmericano = hotAmericano; // 8-1. 그러면 this를 가진 값들에 고정시킨 2500과 2000이 들어감
//	}
	
	public int orderCoffee(int menu, int quantity) {
		if(menu ==1) {
			return iceAmericano * quantity; //this.iceAmericano, 9. 기본적으로 this가 생략이 되어 있어요.
		}
		return hotAmericano * quantity; //this.hotAmericano 9-1. 자동으로 같은 필드를 찾아간다!
	}
	
	public static void main(String[] args) {
		CoffeeShop cs = new CoffeeShop(2500, 2000); // 4. 여기서 에러가 나느데 이유는 생성자가 원래 있네?여서!
										  // 5. 여기서 생성자를 새로 만든건데 생성자로 되지 않고 Class로 가버린다!!
										  // 6. 그래서 ()에 필드들을 int 로 넣어줘야한다
		int price = cs.orderCoffee(1, 5); // 2. 여기서 cs는 위의 this와 같다.
		System.out.println(price);
	}
	// 7. 여기까지는 본인이 본인에게 할당을 하기때문에 출력값이 price가 0이 된다.
}
