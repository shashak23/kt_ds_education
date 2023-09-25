package vacancehomework;

public class Dog extends Animal {

//	private String name;
//	private int age;
//	private String breed;	
//	
//	public Dog() {
//		this.name = name;
//		this.age = age;
//		this.breed = breed;
//	}
	
	/*
	 * 상속을 받은 클래스에 생성자가 존재할 경우
	 * 자식 클래스에서도 동일한 생성자를 만들어 호출해야 한다
	 */
	public Dog(String name, String breed) {
		super(name, "강아지", breed);
//		this.name = name;
//		this.age = age;
//		this.breed = breed;
	}


	public void shakeTail(String name, int age) {
		System.out.println("개가 꼬리를 흔들어요~~~~");
		System.out.println(name + "라는 개가 " + age +"살이고 꼬리를 흔들어요");
	}
	
	public void bark(String name, int age, String breed) {
		System.out.println("이름이 "+ name +"인 개가 나이가 " + age+ "인데 엄청 " + breed + "해요");
	}
	
	public static void main(String[] args) {
		Animal choco = new Dog("초코", "왕");
		Animal mando = new Dog("만두", "왈왈");
		
		choco.introduce();
		choco.bark();
		
		mando.introduce();
		mando.bark();
	}
}
