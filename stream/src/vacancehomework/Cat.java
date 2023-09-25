package vacancehomework;

public class Cat {

	private String name;
	private String type;
	private String size;
	
	public Cat(String name, String type, String size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	public void introduce() {
        System.out.println("안녕하세요, 저는 " + size + " 크기의 " + type + " 고양이 " + name + " 입니다.");
	}
	
	public void meow() {
        System.out.println(name + "이(가) 울면서 '냐옹냐옹' 소리를 냅니다.");

	}
	
	public static void main(String[] args) {
		Cat cat1 = new Cat("코코", "코리안숏헤어", "소형");
		Cat cat2 = new Cat("웨이", "노르웨이 숲", "중형");
		Cat cat3 = new Cat("쿠쿠", "메인 쿤", "대형");
		Cat cat4 = new Cat("러비", "렉돌", "소형");
		
		cat1.introduce();
		cat1.meow();
		
		cat2.introduce();
		cat2.meow();
		
		cat3.introduce();
		cat3.meow();
		
		cat4.introduce();
		cat4.meow();
	}
}
