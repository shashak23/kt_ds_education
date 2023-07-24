package inheritance.Car;

public class Vehicle {

	private String name;
	
	public Vehicle(String name) {
		this.name = name;
	}

	public void startEngine() {
		System.out.println(name + "start Engine!");
	}
	public void stopEngine() {
		System.out.println(name + "stop Engine!");
	}
	
	@Override
	public String toString() {
		return "이 차량은" + this.name + "차량입니다.";
		// super.toString()
	}
}
