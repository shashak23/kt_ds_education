package ktds.ksh.cartoon;

// P.272 과제 
public class CartoonCafe {

	CartoonVO cartoon1;
	CartoonVO cartoon2;
	CartoonVO cartoon3;
	CartoonVO cartoon4;

	public CartoonCafe(CartoonVO cartoon1, CartoonVO cartoon2, CartoonVO cartoon3, CartoonVO cartoon4) {
		super();
		this.cartoon1 = cartoon1;
		this.cartoon2 = cartoon2;
		this.cartoon3 = cartoon3;
		this.cartoon4 = cartoon4;
	}

	// 대여하기
	public void loanCartoon() {
		cartoon1.getTitle();
	}
	
	// 소지금 확인하기
	public void checkMoney() {
		
	}
	
	
	public static void main(String[] args) {
		// 객체 생성하기
		CartoonVO cartoon1 = new CartoonVO("슬램덩크1", 1000, 1);		
		CartoonVO cartoon2 = new CartoonVO("슬램덩크2", 1000, 1);		
		CartoonVO cartoon3 = new CartoonVO("슬램덩크3", 1000, 1);		
		CartoonVO cartoon4 = new CartoonVO("슬램덩크4", 1000, 1);		

		// 하나로 담기
		CartoonCafe cafe = new CartoonCafe(cartoon1, cartoon2, cartoon3, cartoon4);
		
		// 대여하기
		cafe.loanCartoon();
		
		// 입고하기
		cafe.loanCartoon();
		
		// 소지금 확인하기
		cafe.checkMoney();
		
		// 이름 출력하기
		System.out.println(cartoon1);
	}
}
