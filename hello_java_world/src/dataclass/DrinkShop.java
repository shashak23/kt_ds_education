package dataclass;

public class DrinkShop {
	DrinkVO bakkas;
	DrinkVO monster;
	DrinkVO hotsix;
	DrinkVO milkis;
	
	
	public DrinkShop(DrinkVO bakkas, DrinkVO monster, DrinkVO hotsix, DrinkVO milkis) {
		this.bakkas = bakkas;
		this.monster = monster;
		this.hotsix = hotsix;
		this.milkis = milkis;
	}
	
	// 주문하기
	public DrinkVO getOrder(String name, int orderCount) {
		// 주문과 박카스 이름 일치하는지 보기
		if(name == bakkas.name) {
			// 상품 갯수와 주문 갯수 비교하기
			if(bakkas.goods >= orderCount) {
				// 비교되면 하나씩 차감하기
				bakkas.goods -= orderCount;
				// 차감된 음료정보(name, price, goods)를 새로운 변수에 담음
				DrinkVO product = new DrinkVO(bakkas.name, bakkas.price, bakkas.goods);
				// 변수를 리턴함.
				return product;
			} 
			else { //아니면 품절이라고 반환함
				System.out.println("박카스가 품절되었습니다.");
			}
			
		}
		else if(name == monster.name) {
			if(monster.goods >= orderCount) {
				monster.goods -= orderCount;
				DrinkVO product = new DrinkVO(monster.name, monster.price, monster.goods);
				return product;
			}
			else {
				System.out.println("몬스터가 품절되었습니다.");
			}
		}
		else if(name == hotsix.name) {
			if(hotsix.goods >= orderCount) {
				hotsix.goods -= orderCount;
				DrinkVO product = new DrinkVO(hotsix.name, hotsix.price, hotsix.goods);
				return product;
			}
			else {
				System.out.println("핫식스가 품절되었습니다.");
			}
		}
		else if(name == milkis.name) {
			if(milkis.goods >= orderCount) {
				milkis.goods -= orderCount;
				DrinkVO product = new DrinkVO(milkis.name, milkis.price, milkis.goods);
				return product;
			}
			else {
				System.out.println("밀키스가 품절되었습니다.");
			}
		}
		
		return null; 
	}
	
	// 입고하기
	public void getDrinkReceive(String name, int addCount) {
		if(name == bakkas.name) {
			bakkas.goods += addCount;
		} 
		else if(name == monster.name) {
			monster.goods += addCount;
		} 
		else if(name == hotsix.name) {
			hotsix.goods += addCount;
		}
		else if(name == milkis.name) {
			milkis.goods += addCount;
		}

	}
	
	// 재고 출력하기
	public void printInventory() {
		System.out.println("상품 이름 : " + bakkas.name + ", 가격 :" + bakkas.price + ", 남은 갯수 :" + bakkas.goods);
		System.out.println("상품 이름 : " + monster.name + ", 가격 :" + monster.price + ", 남은 갯수 :" + monster.goods);
		System.out.println("상품 이름 : " + hotsix.name + ", 가격 :" + hotsix.price + ", 남은 갯수 :" + hotsix.goods);
		System.out.println("상품 이름 : " + milkis.name + ", 가격 :" + milkis.price + ", 남은 갯수 :" + milkis.goods);
	}
	
	public static void main(String[] args) {
		DrinkVO bakkas = new DrinkVO("박카스", 900, 15);
		DrinkVO moster = new DrinkVO("몬스터", 1500, 20);
		DrinkVO hotsix = new DrinkVO("핫식스", 1300, 10);
		DrinkVO milkis = new DrinkVO("밀키스", 1400, 5);
		// 다 담기
		DrinkShop shop = new DrinkShop(bakkas, moster, hotsix, milkis);
		
		// 주문하기
		DrinkVO product1 = shop.getOrder("bakkas", 5);
		DrinkVO product2 = shop.getOrder("monster", 30);
		
		// 출력하기
		shop.printInventory();
		
		// 입고하기
		shop.getDrinkReceive("milkis", 50);

		// 출력하기
		shop.printInventory();
	}

}
