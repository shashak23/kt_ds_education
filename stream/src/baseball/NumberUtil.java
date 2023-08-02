package baseball;

public class NumberUtil {

	public static int parseInt(String src, int defaultValue) {
		
		src = src.trim();// 공백 제거
		
		if ( src.length() == 0 ) {
			return defaultValue;
		}
		
		if (src.matches("[0-9]+$")) {
			return Integer.parseInt(src);
		} 
		else {
			return defaultValue;
		}
		
	}
}
