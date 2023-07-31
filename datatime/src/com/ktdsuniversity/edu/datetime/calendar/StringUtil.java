package com.ktdsuniversity.edu.datetime.calendar;

public class StringUtil {
	
	// 삼항연산자를 사용하지 않으려면
	// 아래와 같이 하면 된다.
	
	/**
	 * 문자열 src의 길이가 maxLength가 될 때깢 왼쪽에 paddingString을 붙인다
	 * @param src 원본 문자열
	 * @param maxLength 만들어져야하는 문자열의 길이
	 * @param paddingString 왼쪽에 붙일 문자열
	 * @return src의 길이가 maxLength까지 만들어진 문자열
	 */
	
	public static String leftPadding(String src, int maxLength, String paddingString) {
		while(src.length() < maxLength) {
			src = paddingString + src;
		}
		
		return src;
	}

}
