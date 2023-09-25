package homework2;
// HAS A 관계 - 하위
public class Coffee {

	private String name;
	private int price;
	private String type;
	
	// 데이터를 주기 위해 생성자를 만듦
	public Coffee(String name, int price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}

	// getter Name 생성
	public String getName() {
		return this.name;
	}
}
