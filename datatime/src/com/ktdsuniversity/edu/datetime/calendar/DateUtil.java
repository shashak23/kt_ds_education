package com.ktdsuniversity.edu.datetime.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static String nextWorkingDate(int day) {
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = 0; //뭔지 모르니까 일단 0으로 초기화, 요일
		int workingDateCount = 0;
		while(true) {
			
			cal.add(Calendar.DAY_OF_MONTH, 1);
			dayOfWeek = cal.get((Calendar.DAY_OF_WEEK));
			// 1도 아니고 7도 아닌 경우 = 평일이면
			if(dayOfWeek != 1 && dayOfWeek != 7) {
				workingDateCount++;
			}
			if(workingDateCount == 3) {
				break;
			}
			
		}
		return convertFormat(cal);
	}
	
	// 밖에서는 호출이 안되도록 할거에요 - 기능이 다르니까 다르게 구분하기 
	private static String convertFormat(Calendar cal) {
		Date workingDate2 = cal.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy=mm-dd EEE");
		String workingDateString2 = dateFormat.format(workingDate2);
		System.out.println(workingDateString2);
		
		return workingDateString2;
	}
}
