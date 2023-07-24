package inf;

public class InfMain {

	public static void main(String[] args) {
//		SomeInterface si = new SomeClass();
//		// 그냥 interface를 쓸 수는 없고 somclass를 전부 완성해야 작동이 가능하다
//		// SomeInterface는 SomeClass 라는 걸로 정의하면 가능하다.
//		si.doSomething1();
//		si.doSomething2();
//		si.doSomething3();
//		int number = si.getSomething1();
//		String name = si.getSomething2();
//		
//		System.out.println(number);
//		System.out.println(name);
	
//		SomeInterface si = new AClass();
//		si.doSomething1();
//		si.doSomething2();
//		si.doSomething3();
//		int number = si.getSomething1();
//		String name = si.getSomething2();	
////		si.printAll(); // 이거는 사실상 안됨.
//		
//		
//		System.out.println(number);
//		System.out.println(name);	
//	}
	
	SomeInterface si = new BClass();
	si.doSomething1();
	si.doSomething2();
	si.doSomething3();
	int number = si.getSomething1();
	String name = si.getSomething2();	
//	si.printAll(); // 이거는 사실상 안됨.
	
	
	System.out.println(number);
	System.out.println(name);	
}
}
