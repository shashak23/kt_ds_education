package inheritance.Car;

public class EV extends Vehicle {
	
	private int battery;

	public EV(String name){
		super(name);
	}
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		// super.startEngine();
		System.out.println("electronic!");
	}
	
	public void checkBattery() {
		//System.out.println(super.name + "자동차의 배터리는" + battery + "만큼 남았습니다");
	} // name? 
	
}
