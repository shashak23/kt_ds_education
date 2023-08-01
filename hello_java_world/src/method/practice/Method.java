package method.practice;

public class Method {
	
	public static void sayHello() {
		System.out.println("안녕하세요?");
	}

	public static void printHello(String name) {
		System.out.println(name + "씨 안녕하세요.");
	}
	
	public static void printAdd(){
		System.out.println(1+1);
	}

	public static void main(String[] args) {
		sayHello();
		printAdd();
		printHello("스타크");  // 파라미터에 String으로 되어있기 때문에 ""에 문구를 넣어야 한다
	}
}
