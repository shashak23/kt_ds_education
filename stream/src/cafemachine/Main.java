package cafemachine;

import cafemachine.cafe.vo.CafeVO;
import cafemachine.coffee.vo.CoffeeVO;

public class Main {
	

	public static void main(String[] args) {
		CoffeeVO latte = new CoffeeVO();
		latte.setName("바닐라 라떼");
		latte.setPrice(6000);
		latte.setSize("m");
		
		CoffeeVO espresso = new CoffeeVO();
		espresso.setName("에스프레소");
		espresso.setPrice(3000);
		espresso.setSize("s");
		
		CafeVO starbucks = new CafeVO();
		CoffeeVO coffee = new CoffeeVO();
		coffee.setName("아메리카도");
		coffee.setPrice(3000);
		
		CoffeeVO coffee1 = new CoffeeVO();
		coffee1.setName("아인슈페너");
		coffee1.setPrice(5500);
		
		starbucks.addCoffee(coffee);
		starbucks.addCoffee(coffee1);
		starbucks.showMenu();
		
//		CafeVO starbucks = new CafeVO();
//		starbucks.setBrand("스타벅스");
//		starbucks.setCoffee(latte);
////		starbucks.setCoffee(espresso); // 여기서 라떼와 에스프레소가 다 나오려면 List여야 한다
//		starbucks.setFranchiseName("스타벅스 방배역점");
//		starbucks.setFranchiseManager("김베리");
//		
//		System.out.println(starbucks.getBrand());
//		System.out.println(starbucks.getCoffee().getName());
//		System.out.println(starbucks.getCoffee().getPrice());
//		System.out.println(starbucks.getCoffee().getSize());
//		System.out.println(starbucks.getFranchiseName());
//		System.out.println(starbucks.getFranchiseManager());
		
		// 모든 데이터 할당은 setter를 통해서 한다.
		// 생성자로 할당하는 건 잘 안한다
		// System.out.println(starbucks);
		// 모든 데이터를 가져오기 하려면 getter를 통해서 한다.
	}
}
