package anonymous;

public class GreetingMain {

	// 익명 클래스 하기 
	public static void main(String[] args) {
		// 인터페이스를 익명 클래스로 인스턴스화 하기
		Greeting gt = new Greeting() {

			@Override
			public void hello() {
				System.out.println("Hello?");
				
			}

			@Override
			public void hello(String name) {
				System.out.println(name);
				System.out.println("Hello!");
				
			}

			@Override
			public String getHelloMessage(String name) {
				return name + ", Hello?!!";
			}
			
		};
		
		gt.hello();
		gt.hello("siha");
		String helloMessage = gt.getHelloMessage("sia");
		System.out.println(helloMessage);
	}
}
