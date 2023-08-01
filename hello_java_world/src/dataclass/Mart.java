package dataclass;

public class Mart {
	
	Goods product;
	
	// 필드에 관한 기본 생성자는 생성하지만
	public Mart(Goods product) {
		super();
		this.product = product;
	}

	// 판매 또는 정산을 위한 필드는 작성하지 않아도 된다.
	// VO에 입력되어 있어서 
	// 판매하기
	public void sellProduct() {
		product.product -= 1;
		product.price += 10000;
	}
	
	// 정산하기
	public void calculateMoney(){
		System.out.println("재고는 " + product.product + "개 입니다.");
		System.out.println("가격은 " + product.price + "은 입니다.");		
	}
	
	public static void main(String[] args) {
		Goods product = new Goods();
		
		Mart mart = new Mart(product);
		
		mart.sellProduct();
		mart.calculateMoney();
		
	}
}
