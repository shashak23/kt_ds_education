package inf;

public class AClass implements SomeInterface{

	// 추가로 만들어진 메소드의 경우에는 어떻게 하는가? 
	public void printAll() {
		System.out.println("all print!!!");
	}
	
	
	@Override
	public void doSomething1() {
		System.out.println("Make weapon");
		
	}

	@Override
	public void doSomething2() {
		System.out.println("Make Health potion");
		
	}

	@Override
	public void doSomething3() {
		System.out.println("Make Mana potion");
		
	}

	@Override
	public int getSomething1() {
		// TODO Auto-generated method stub
		return 99;
	}

	@Override
	public String getSomething2() {
		// TODO Auto-generated method stub
		return "Item";
	}

}
