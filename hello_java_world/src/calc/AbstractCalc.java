package calc;

// 가장 많이 쓰는 유형
public abstract class AbstractCalc {

	protected long startMillis;
	
	private void start() {
		this.startMillis = System.currentTimeMillis();
	}
	
	private void end() {
		long endMillis = System.nanoTime();
		long processTime = endMillis - startMillis;
		
		System.out.println(processTime / 1000.0 + "conds");
	}
	
	public void calc() {
		start(); // 이 클래스 내부에서만 쓰는 메소드
		sumAllNumbers(); // 4. 여기서 만듦 그러면 이동이 AbstractCalc-> SumCalc -> AbstractCalc 이렇게 됨
		end();   // 1. oveeride 되어 나가지 않도록 public -> private 변경
	}
	
	
	// 모든 숫자를 더하기 - 추상 메소드
	// 2. 여기서는 무얼할지 정해지지 않음 
	protected abstract void sumAllNumbers();
}
