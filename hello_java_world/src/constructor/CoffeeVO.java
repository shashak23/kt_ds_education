package constructor;

public class CoffeeVO {
	String name;
	int price;
	
	// alt + shift + s -> constructor and field 클릭
	public CoffeeVO(String name, int price) {
	//	super();
		this.name = name;
		this.price = price;
	}
	
	// 이렇게 작성하면 coffeeshop의 iceamericano와 hotamericano는 
	// int 타입이 아닌 CoffeeVO 타입이 된다.
}
