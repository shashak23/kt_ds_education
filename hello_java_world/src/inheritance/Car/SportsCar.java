package inheritance.Car;

public class SportsCar extends Vehicle {


	public SportsCar(String name){
		super(name);
	}

	public void startTurbo() {
		System.out.println("start Engine!");
	}
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		// super.startEngine(); // 부모클래스 해야하는 일을 변경함으로써 5원칙에 위배됨
		System.out.println("brrrr!");
	}
}
