package vacancehomework;

import java.util.ArrayList;
import java.util.List;

public class AnimalHotel {

//	List<Animal> animals = new ArrayList<>();
	
	private List<Animal> animals;
    
	// 생성자의 역할은 멤버 변수를 초기화 하는 것 
	public AnimalHotel() {
	     this.animals = new ArrayList<>();
	}
	
	// 입소할 동물
	public void checkin(Animal animal) {
        this.animals.add(animal);
		System.out.println("입소했습니다");
	}
	
	// 퇴실할 동물
	public void checkout(Animal animal) {
        this.animals.remove(animal);
		System.out.println("퇴소했습니다");
	}
	
	// 출력할 동물목록
	public void printAnimals() {
		for (Animal animal : this.animals) {
			animal.introduce();
			System.out.println("동물 목록 : " + animal);
		}
	}

	// 반환을 animal로 하는 메소드
	public Animal printAnimalAnyone(int n) {
//		System.out.println("n번째 동물을 반환합니다.");
//		if (n >= 0 && n < animals.size()) {
//	         return animals.get(n);
		return this.animals.get(n);
//	     }
	 }
	
	public static void main(String[] args) {
		AnimalHotel hotel = new AnimalHotel();
		Animal choco = new Dog("초코", "왕");
		hotel.checkin(choco);
		
		Animal milk = new Animal("우유", "먼치킨", "야옹");
		hotel.checkin(milk);
		
		hotel.printAnimals();
		
		hotel.checkout(milk);
		
		hotel.printAnimalAnyone(0);
	}
	
	
}
