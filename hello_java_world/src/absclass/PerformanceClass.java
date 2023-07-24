package absclass;

public abstract class PerformanceClass {

	protected long startMillis; //sub 클래스에서 사용가능하도록 protected로 변경함
	
	// 시작시간 - 메소드를 실행할 때 소요된 시간을 구하고자 한다.
	// 1부터 10만까지의 합을 구하는 코드를 만들기
	
	// 시작 메소드 만들기 - abstract를 넣으면 추상 메소드가 되는데 이는 바디가 없는 추상 메소드의 특징!
	public abstract void start(); 
	// 에러가 나는 이유는 추상이어서. abstract를 class부터 추가하면 가능하다
	//{
//		// 시작하는 시간을 구하고, 1970-01-01 부터 현재까지 시간을 초단위(1/1000)로 세 놓은 숫자;
//		startMillis = System.currentTimeMillis();
//				
//	}
	
	
	public void sumAllNumbers() {
		
//		// 시작하는 시간을 구하고, 1970-01-01 부터 현재까지 시간을 초단위(1/1000)로 세 놓은 숫자;
//		long startMillis = System.currentTimeMillis();
//		
		start();
		int sum = 0;
		for ( int i=0; i < 100000; i++) {
			sum += i;
		}
		System.out.println(sum);
		end(); // 무얼 할지는 상속받은 메소드에게 따로 넘기는 것!
//		// 종료 시간 
//		// 소요 시간 = 종료시간 생성값 - 시작시간 
//		long endMillis = System.currentTimeMillis();
//		long processTime = endMillis - startMillis;
//		System.out.println(processTime + "초가 걸렸습니다");
	}
	
	
	// 종로 메소드 만들기
	public void end() {
		// 종료 시간 
		// 소요 시간 = 종료시간 생성값 - 시작시간 
		long endMillis = System.currentTimeMillis();
		long processTime = endMillis - startMillis;
		System.out.println(processTime + "seconds");
	}
	
	public static void main(String[] args) {
//		PerformanceClass pc = new PerformanceClass(); //abstract가 없어야지 가능함
//		// 추상클래스는 객체(인스턴스)로 만들수가 없기때문!
//		pc.sumAllNumbers();
	}
	
}
