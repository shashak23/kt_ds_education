package com.ktdsuniversity.edu.datetime.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

	public static void main(String[] args) {
		
		LocalDate nowDate = LocalDate.now();
		
		DateTimeFormatter dateFormatter = 
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		
		String strNowDate = dateFormatter.format(nowDate);
		
		System.out.println(nowDate);
		System.out.println(strNowDate);
		
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = 
				DateTimeFormatter.ofPattern("HH시 mm분 ss.SSS초");
		String strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime);
		System.out.println(strNowTime);
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = 
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss.SSS초 (EEE요일)");
		String strNowDateTime = dateTimeFormatter.format(nowDateTime);
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);
		
		// 오늘 날짜로부터 1년 뒤는 언제냐
		LocalDate nowDate1 = LocalDate.now();
		System.out.println(nowDate1);
		nowDate1 = nowDate1.plusYears(1); // 1년 뒤
		System.out.println("After 1Year " + nowDate1);
		
		// 오늘 날짜로부터 3개월 뒤는 언제냐
		LocalDate nowDate2 = LocalDate.now();
		System.out.println(nowDate2);
		nowDate2 = nowDate2.plusMonths(3);
		System.out.println("After 3months" + nowDate2);
		
		// 오늘 날짜로부터 90일 뒤는 언제냐
		LocalDate nowDate3 = LocalDate.now();
		System.out.println(nowDate3);
		nowDate3 = nowDate3.plusDays(90);
		System.out.println("After 90days " + nowDate3);

		
		// 오늘 날짜로부터 13년 뒤는 언제냐
		LocalDate nowDate4 = LocalDate.now();
		System.out.println(nowDate4);
		nowDate4 = nowDate4.plusYears(13);
		System.out.println("After 13Years" + nowDate4);
		
		// 그러면 2023년 7월 12일로부터 16일 뒤는 언제인가
		LocalDate startDate = LocalDate.of(2023, 7, 12);
		System.out.println(startDate);
		startDate = startDate.plusDays(16);
		System.out.println(startDate);
		
		// startDate의 날짜는 무슨 요일인가
		DayOfWeek dayOfWeek = startDate.getDayOfWeek();
		//System.out.println(startDate.getDayOfWeek());
		
		// 오늘로부터 1 영업일 뒤는 언제냐
		DayOfWeek dayOfWeek2 = null;
		LocalDate now = LocalDate.now();
		while(true) {
			
			now = now.plusDays(1);
			dayOfWeek2 = now.getDayOfWeek();
			
			// 평일
			if(dayOfWeek2 != DayOfWeek.SUNDAY && dayOfWeek2 != DayOfWeek.SATURDAY) {
				break;
			}
		}
		
		System.out.println(startDate.getDayOfWeek());

	}
}
