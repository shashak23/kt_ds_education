package inheritance.Car;

public class CarMain {
	
	public void startEngine(Vehicle car) {
		// 파라미터 타입이 super class 여야 한다.
		// super class는 sub class다 (X)
		car.startEngine();
	}
	
	public void startTurbo(SportsCar car) {
		// 파라미터에 SportsCar를 쓰는 이유는
		// Vehicle에 startTurbo 메소드가 없기 때문
		car.startTurbo();
	}
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("");

		
		SportsCar sc = new SportsCar("");
		if ( sc instanceof SportsCar ) { 
			// sc 인스턴스가 SportsCar의 인스턴스 인가?
			// instanceof는 사용을 하지 않는 것이 좋다
			SportsCar car = (SportsCar) sc; // 형변환
			car.startTurbo();
		} 	// startTurbo를 쓰려면 위 과정을 거쳐야함 
			// (sc.StartTurbo(); 라고 못씀)
			// 상속의 최대 장점이자 단점 = 굳이 상속을 써야할까?
		
		Vehicle ev = new EV("");
		if ( ev instanceof EV ) { 
			EV car = (EV) ev; 
			car.checkBattery();
		}
		
		SportsCar bm = new BatMobile("");
		if ( bm instanceof BatMobile ) { 
			BatMobile car = (BatMobile) bm;
			car.extractBatPort();
		}

		SportsCar bm2 = new BatMobile("");
		if ( bm2 instanceof BatMobile ) { 
			BatMobile car = (BatMobile) bm2;
			car.startTurbo();
		}
		
		CarMain cm = new CarMain();
//		cm.startEngine(v); // v = Vehicle 타입
//		cm.startEngine(ev);
//		cm.startEngine(sc);
//		cm.startEngine(bm);
//		cm.startEngine(bm2); // SportsCar is a Vehicle
//							// sub class는 super class다 (O)
		
//		cm.startTurbo(v);  // 애초에 못쓰는 v, ev는 삭제
//		cm.startTurbo(ev);
//		cm.startTurbo(sc); // Vehicle은 SportsCar이다 (X)
//		cm.startTurbo(bm); // type을 SportsCar로 교체하면 사용가능
//		cm.startTurbo(bm2);
	}

}
