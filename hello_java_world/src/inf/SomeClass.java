package inf;

public class SomeClass implements SomeInterface {

	@Override
	public void doSomething1() {
		System.out.println("Print1");
		
	}

	@Override
	public void doSomething2() {
		System.out.println("Print2");
		
	}

	@Override
	public void doSomething3() {
		System.out.println("Print3");
		
	}

	@Override
	public int getSomething1() {
		return 1;
	}

	@Override
	public String getSomething2() {
		return "name";
	}

}
