package inheritance.Car;

public class BatMobile extends SportsCar {
	
	private String name;
	
	public BatMobile(String name){
		super(name);
	}
	public void startTurbo(){
	    // private으로 이전 클래스에서 적용되어 있기때문에
	    System.out.println("start Turbo!");
	}
	
	public void extractBatPort() {
		System.out.println("666");
	}
}
