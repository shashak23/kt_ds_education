package classninstance;

// 실행가능한 클래스보단 사물을 표현하는 클래스 위주로 생성할거에요
// 연습문제는 화요일에 하기!
public class Car {
	
	// 1. 멤버 변수 - 사물속성
	boolean isEngineStart;
	int speed;
	
	// 2. 메소드 - 사물 기능
	public void pressEngineStartButton() {
		if(isEngineStart) {
			// 시동이 걸린다면
			System.out.println("시동을 끕니다");
			isEngineStart = false;
			speed = 0;
		} else {
			//시동이 꺼져있다면
			System.out.println("시동을 켭니다");
			isEngineStart = true;
			speed = 20;
		}
	}
	// 시동페달
	public void pressGasolinPedal(int press) {
		if(!isEngineStart) {
			System.out.println("먼저 시동을 걸어주세요");
			// 여기서 return의 의미는 1) 반환  2) 메소드를 즉시 종료
			return;
		}
		
		speed += press;
		if(speed > 240) {
			speed = 240;
		} // 240이상 나오면 240로 고정이 되도록 함
		System.out.println("속도는" + speed);
	}
	// 브레이크페달
	public void pressBrakePedal(int press) {
		if(!isEngineStart) {
			System.out.println("먼저 시동을 걸어주세요");
			// 여기서 return의 의미는 1) 반환  2) 메소드를 즉시 종료
			return;
		}
		
		speed += press;
		if(speed > 240) {
			speed = 240;
		}
		System.out.println("속도는" + speed);
	}
	
	// 암묵적인 룰로 main을 제일 밑에 만든다
	public static void main(String[] args) {
		// 클래스를 만들었다는 것은 자료형을 만든 것과 같은 것입니다.
		int number =10;
		// reference type으로 만든 것을 instance나 object 객체 라고 한다.
		Car car = new Car();
		// . 연산자를 사용할 수 있음 - 레퍼런스 타입
		// 점 연산자를 통해 멤버변수(인스턴스 필드)혹은 인스턴스 메소드에 접근해
		// 값을 참고하거나 실행시킬 수 있습니다.
		// . 연산자를 사용하는 방법은 인스턴스.변수 혹은 인스턴스.메소드() 이렇게 사용을 합니다.
		// . 연산자 뒤에는 접근 제한자에 의해서 들어오는 것이 다르다~!
		
		// 인스턴스 필드를 출력을 해 볼 거에요
		System.out.println(car.isEngineStart);  // false
		System.out.println(car.speed);  // 0
		// 시동 걸기, 바꾸기 
		car.pressEngineStartButton();
		System.out.println(car.isEngineStart);  // false
		System.out.println(car.speed);  // 0
		// 가속페달 밟기
		car.pressGasolinPedal(100);
		System.out.println(car.isEngineStart);  // false
		System.out.println(car.speed);  // 0
		// 브레이크 밟기
		car.pressBrakePedal(200);
		System.out.println(car.isEngineStart);  // false
		System.out.println(car.speed);  // 0
		
	}

}
