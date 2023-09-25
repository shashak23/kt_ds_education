package inheritance_maker;

import java.util.List;

public class MainMaker {
	
	
	public static void main(String[] args) {
		
		// 인스턴스를 새로 만들고 
		Cafe starkbucks = new Cafe();
		Product product = new Product();
		Drink drink = new Drink();
		Coffee espresso = new Coffee();
		NonCoffee bananaDrink = new NonCoffee();
		Tea blackTea = new Tea();
		Desert tiramisu = new Desert();
		Cake strawberryCake = new Cake();
		Cookie whiteCookie = new Cookie();
		drink.setLiter("1L");
		drink.setTemperature("hot");
		drink.setName("음료");
		drink.setPrice(4000);
		
		espresso.setExtractType("espresso");
		espresso.setFlavor("Goso");
		espresso.setName("에스프레소");
		espresso.setLiter("0.5L");
		espresso.setPrice(2500);
		espresso.setTemperature("고옵력");
		
		bananaDrink.setBlend("바나나 + 우유");
		bananaDrink.setName("바나나 우유");
		bananaDrink.setLiter("2L");
		bananaDrink.setPrice(3500);
		bananaDrink.setTemperature("비압축");
		
		blackTea.setHerdType("Black Hurb");
		blackTea.setName("블랙티");
		blackTea.setLiter("1L");
		blackTea.setPrice(3000);
		blackTea.setTemperature("고옵력");
		
		tiramisu.setPacking(true);
		tiramisu.setName("티라미수");
		tiramisu.setPrice(15000);
		
		strawberryCake.setName("딸기케익");
		strawberryCake.setPrice(20000);
		strawberryCake.setPacking(true);
		strawberryCake.setSize("21호");
		strawberryCake.setCalories("10000");
		
		whiteCookie.setColor("white");
		whiteCookie.setName("화이트쿠키");
		whiteCookie.setPrice(3000);
		
		
		// 하나씩 넣어볼게요 
		starkbucks.add(product);
		starkbucks.add(drink);
		starkbucks.add(espresso);
		starkbucks.add(bananaDrink);
		starkbucks.add(blackTea);
		starkbucks.add(tiramisu);
		starkbucks.add(strawberryCake);
		starkbucks.add(whiteCookie);
		
		starkbucks.showAllInstance();
		
//		System.out.println(whiteCookie.getName());
//		System.out.println(drink.getName());
//		System.out.println(espresso.getName());
//		System.out.println(bananaDrink.getName());
//		System.out.println(blackTea.getName());
//		System.out.println(tiramisu.getName());
//		System.out.println(strawberryCake.getName());
//		System.out.println(starkbucks);
		
	}

}
