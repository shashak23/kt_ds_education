package absclass;

public class SumCalculator2 extends PerformanceClass{

	// 필요한 메소드 전부 가져오기
	@Override
	public void start() {
		super.startMillis = System.nanoTime();
		
	}
	
	@Override
	public void end() {
		long endMillis = System.nanoTime();
		long processTime = endMillis - super.startMillis;
		
		System.out.println(processTime / 1_000_000.0 + "nano seconds");
	}

}
