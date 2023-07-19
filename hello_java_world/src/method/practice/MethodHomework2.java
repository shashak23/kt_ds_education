package method.practice;


public class MethodHomework2 {
	
	// 1번
	public static int getMax(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if( c > max) {
			max = c;
		}
		return max;
	}
	
	// 2번
	public static String getNameScore(String name, String score) {
		//System.out.println(name + "님" + "점수는" + score + "점 입니다");
		String result = name + "님" + "점수는" + score + "점 입니다";
		return result;
	}
	
	// 3번
	public static void getCel(double fah) {
		double cel = 5 / 9 * (fah - 32);
		System.out.println("화씨," + fah + "도는 섭씨" + cel + "도 입니다.");
	}
	
	public static void main(String[] args) {
		// 1번
		int a = 40;
		int b = 90;
		int c = 50;
		
		int max = getMax(a,b,c);
		System.out.println(max);
		
		// 2번
		String result = getNameScore("김시하", "99");
		System.out.println(result);
		
		// 3번
		getCel(99.0);
	}
}
