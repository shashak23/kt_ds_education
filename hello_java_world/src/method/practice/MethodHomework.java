package method.practice;

// 0717 과제. txt
public class MethodHomework {
	
	// 문제1. 숫자 3개를 파라미터로 받아, 가장 큰 수를 반환하여 출력하는 코드
	public static int getMaxNumber(int a, int b, int c) {
		// 생성
		int max = a;
		// 로직
		if(max < b) {
			max = b;
		} if(max < c ) {
			max = c;
		}
		// 반환
		return max;
	}
	
	// 문제2. 이름과 점수를 파라미터로 받아, "이름님, 점수는 점수점입니다." 를 반환하여 출력하는 코드를 작성
	public static String getNameScore(String name, double score) {
		// 생성 및 로직
		String message = name + "" + score + "점 입니다.";
		// 반환하기 
		return message;
	}
	
	// 문제3. 화씨를 파라미터로 받아, 섭씨로 변환하여 "화씨, 00도는 섭씨이다."를 반환하려 출력하는 코드를 작성
	public static void printTemp(double fahrenheit){
		double celsius = 5.0 / 9 * (fahrenheit - 32); // 이거는 공식이 있으니까 구글링을 나중에 해 보세요
		System.out.println("화씨" + fahrenheit + "도는 섭씨" + celsius + "도 입니다.");
	}
	
	
	public static void main(String[] args) {
		// 최대값 구하기
		int max = getMaxNumber(15,30,50);
		System.out.println(max);
		// 메세지 반환하기
		String message = getNameScore("김시하",99);
		System.out.println(message);
		// 화씨 반환하기
		// 얘는 위에 다 작성햇으니까 호출만 하기
		printTemp(86.0);
	}
}
