package FruitStoreMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mart {

	// scanner를 필드에 생성
	private Scanner sc;
	// vo연결
	private List<FruittVO> fruitList;
	// 머니 생성
	private int money;
	// 사면 여기에 추가
	private List<CustomerVO> customerList;
	
	public Mart() {
		this.sc = new Scanner(System.in);
		// list 생성해 주고 
		this.fruitList = new ArrayList<>();
		// 과일들을 입력하여 넣어주고 
		// name만 할 떄에는 아래와 같이 하지만 
		// price와 stock이 추가되면서 아래에 에러가 떠요 
//		this.fruitList.add(new FruittVO("수박"));
//		this.fruitList.add(new FruittVO("멜론"));
//		this.fruitList.add(new FruittVO("딸기"));
//		this.fruitList.add(new FruittVO("참외"));
		// 그래서 가격과 재고를 정수형으로 함께 넣어줘야해요 
		this.fruitList.add(new FruittVO("수박", 10000, 10));
		this.fruitList.add(new FruittVO("멜론", 15000, 9));
		this.fruitList.add(new FruittVO("딸기", 10000, 9));
		this.fruitList.add(new FruittVO("참외", 5000, 10));
		
	}
	
	public int printAndSelectMenu() {
		System.out.println("아래 메뉴 중 하나를 선택하세요.");
		System.out.println("==== 메뉴 ==================");
		System.out.println("1. 구매");
		System.out.println("2. 반품");
		System.out.println("3. 종료");
		System.out.println("============================");
		
		System.out.println("메뉴를 입력하세요: ");
		int menu = sc.nextInt();
		
		return menu;
		// 1. return으로 menu를 하여 쓸 수 있도록 함
	}
	
	// 구매를 클릭했을 때 진행되는 곳  
	public void sellFruit() {
		System.out.println("\"구매\"를 입력했습니다.");
		System.out.println("구매 프로세스를 진행합니다.");
		
		while(true) {
			
			System.out.println("==== 메뉴 ==================");
			for(int i=0; i< this.fruitList.size(); i++) {
				System.out.println((i+1)+"."+this.fruitList.get(i).getName());
			}
			System.out.println(this.fruitList.size() + ". 뒤로가기");
			System.out.println("============================");
			
			System.out.println("메뉴를 입력하세요: ");
			int menu = sc.nextInt();
			// 가격과 재고를 담은 내용 적기
			menu--;
			
			FruittVO fruit = this.fruitList.get(menu);
			System.out.println("\"" + fruit.getName() + "\"을 입력했습니다.");
			System.out.println("\"" + fruit.getName() + "\"가격은" + 
					fruit.getPrice()+ "입니다.");
			System.out.println("\"재고는"+ fruit.getStock());
			// 여기 중간에 빠짐 :) 
			String yn = sc.nextLine();
			if(yn.toUpperCase().equals("Y")) {
				System.out.println("" + "을 구매합니다.");
				fruit.setPrice(fruit.getStock() -1);
				System.out.println("과일매장의 재고는" + "개가 되었습니다.");
				
				this.money += fruit.getPrice();
				System.out.println("과일매장의 수익금은" + this.money + "원 입니다.");
				
				// 샀다 안샀다를 판단하기 위해서 만든 
				boolean isBuyFruit = false;
				
				for( CustomerVO customerVO : this.customerList) {
					if(customerVO.getName().equals(fruit.getName())) {
						customerVO.addStock(menu); // 여긴 왜 빨간줄이지 
						isBuyFruit = true;
					}
				}
				
				if(isBuyFruit) {
					// 여기 비었 ;)
				}
				
				this.customerList.add(new CustomerVO(fruit.getName(),
													 fruit.getPrice(), 1));
				
				System.out.println("다른 과일을 구매하시겠습니까? Y/N");
				String nextYN = sc.nextLine();
				
				if(nextYN.equalsIgnoreCase("N")) {
					break;
				} else {
//					System.out.println(""" + "\"를 구매하지 않습니다.");
				}
			} else {
				
			}// 여기까지 구매였고 
		}
		

	}
	
	// 반품에 대한 메소드 
	public void refundFruit() {
		
	}
	
	// 뒤로가기 
	public void exit() {
		
	}
	
	public static void main(String[] args) {
		
		Mart mart = new Mart();
		
		while(true) {
			System.out.println("< 과일 매장에 오신 것을 환영합니다. >");			
			// 2. 호출을 할 때 menu를 받도록 함
			int menu = mart.printAndSelectMenu();
			if (menu == 1) {
				mart.sellFruit();
				
			} else if(menu == 2) {
				mart.refundFruit();
			} else if(menu > 2) {
				mart.exit();
				break;
			}
		}

		
	}
}
