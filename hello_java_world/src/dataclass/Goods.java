package dataclass;

public class Goods {
	
	int price;
	int product;
	
	// 기본 금액과 기본 수량을 주어서 
	// 자동으로 계산이 되도록 하기 위함
	public Goods() {
		super();
		this.price = 50000;
		this.product = 100;
	}
	
	
}
