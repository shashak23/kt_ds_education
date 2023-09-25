package vacancehomework;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	
	public void bark() {
		System.out.println("동물이 소리를 냅니다...!");
	}
	private String name;
	private String type;
	private String bark;
	
	public Animal() {
		this.name = name;
		this.type = type;
		this.bark = bark;
	}
	
	public Animal(String name, String type, String bark) {
		super();
		this.name = name;
		this.type = type;
		this.bark = bark;
	}
	
	public void introduce() {
        System.out.println("안녕하세요, 저는 " + type + " " + name + "입니다.");
    }

    public void cry() {
        System.out.println(bark);
    }
	
//	public void cat1() {
//		System.out.println("나는 " + name + "!" + type + "입니다 "+ bark);
//	}
//	
//	public void dog1() {
//		System.out.println("나는 마곡동 "+ name + type + "인데, 너는 누구인가? " + bark);
//	}
	
	public static void main(String[] args) {
//		Animal cat = new Animal("김베리", "먼치킨 고양이", "냥눙냥");
//		cat.cat1();
//		
//		Animal dog = new Animal("바둑이", "점박이 강아지", "왈왈");
//		dog.dog1();
		
		// 생성
        Animal dog = new Animal("뽀삐", "강아지", "왈왈");
        Animal cat = new Animal("야옹이", "고양이", "야옹");
        AnimalHotel hotel = new AnimalHotel();
        // 메소드
        hotel.checkin(dog);
        hotel.checkin(cat);
        hotel.printAnimals();
        // 입력
        Dog bulldog = new Dog("불독", "왈왈");
        Dog poodle = new Dog("푸들", "왈왈");
        
        Cat shortHair = new Cat("코리안 숏헤어","소형", "야옹");
        Cat maineCoon = new Cat("메인쿤", "대형", "야옹");
        
//        Barrack barrack = new Barrack();
//        
//        barrack.createMarine();
//        barrack.createMedic();
//        barrack.printMarineUnits();
//        barrack.printMedicUnits();
//	
//        List<Product> productList = new ArrayList<>();
//        
//        Product product1 = new Product("물건1", 10000, "브랜드1");
//
//        productList.add(product1);
//        
//        // 화씨, 섭씨
//        Temperature temp1 = new Temperature("2023-07-15", 25.5, 77.9);
//        Temperature temp2 = new Temperature("2023-07-16", 26.2, 79.2);
//
//        List<Temperature> temperatureList = new ArrayList<>();
//        temperatureList.add(temp1);
//        temperatureList.add(temp2);
//        
//        // employees
//        Employees emp1 = new Employees(101, "John", "Doe", " ", 0, 0, " ", 0, 0, " ", "마케팅부");
//        Employees emp2 = new Employees(102, "Jane", "Smith", " ", 0, 0, " ", 0, 0, " ", "인사부");
//
//        List<Employees> employeesList = new ArrayList<>();
//        employeesList.add(emp1);
//        employeesList.add(emp2);
//        
//        // shop 호출
//        Shop shop = new Shop();
//        shop.sellProduct("물건1");
//        shop.printAllProducts();
//        System.out.println("매출금액: " + shop.getTotalPrice());
        
        
	}
	
	

}
