package absclass;

public class SumCalculator extends PerformanceClass {
	// 1. super class인 PerformanceClass 의 메소드인 start를 사용할 때
	// Override로 사용해서 한다.
	@Override
	public void start() {
		super.startMillis = System.currentTimeMillis();
	}
	// 2. 수퍼클래스인 퍼포먼스 클래스에 있는 모든 메소드를 가져와서 에러를 없앤다.
	@Override
	public void end() {
		long endMillis = System.currentTimeMillis();
		long processTime = endMillis - super.startMillis;
		
		System.out.println(processTime / 1000.0 + "millis seconds");
	}
}
