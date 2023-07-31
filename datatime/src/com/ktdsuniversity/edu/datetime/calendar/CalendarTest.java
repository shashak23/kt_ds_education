package com.ktdsuniversity.edu.datetime.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalendarTest {
	
	public void printData() {

		// calendar intance 불러오기
		// 시스템이 관리하는 캘린더 인스턴스의 복제본을 할당 받는다.
		// new 를 사용하면 안돼요!
		Calendar nowCal = Calendar.getInstance();
		
		System.out.println(nowCal);
		int year = nowCal.get(Calendar.YEAR);
		int month = nowCal.get(Calendar.MONTH);
		int dayOfMonth = nowCal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayOfMonth);
		
		int hour = nowCal.get(Calendar.HOUR);
		int minute = nowCal.get(Calendar.MINUTE);
		int second = nowCal.get(Calendar.SECOND);
		int milliseconds = nowCal.get(Calendar.MILLISECOND);
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println(milliseconds);
		
		// 1 = 일요일 ~ 7 = 토요일
		int dayOfWeek = nowCal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfMonth);
		
		// 이렇게 안하면 if로 일일히 찾아내야해요 
		//                                   0  , 1   , 2    , 3     , 4    , 5   ,  6   , 7 
		List<String> dayOfWeekName = List.of("", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"); // List.of()는 불변 리스트
		System.out.println(dayOfWeekName.get(dayOfWeek));
		
		// 그냥 이어붙이기를 해 볼 거에요
		// %s 는 문자를 넣는 것, 자릿수를 ()와 같이 설정한 것
		// 삼항연산자 적용하여 작성해 보기 
		String dateFormat = String.format("%s-%s-%s %s:%s:%s:.%s (%s)", 
																		year + "",
																		month < 10 ? "0" + month : month + "",
																		dayOfMonth < 10 ? "0" + dayOfMonth : dayOfMonth + "",
																		hour < 10 ? "0" + hour : hour + "",
																		minute < 10 ? "0" + minute : minute + "",
																		second < 10 ? "0" + second : second + "",
																		StringUtil.leftPadding(milliseconds + "", 3, "0"),
																		dayOfWeekName.get(dayOfWeek));
		
		System.out.println(dateFormat);
		
//		int m = 9;
//		String strM = m + "";
//		
//		if(m<10) {
//			strM = "0" + strM;
//		}
//		System.out.println(strM);
		
		System.out.println("===== 삼항연산자 =====");
		// 위의 내용을 한 줄로 줄이기 -> 삼항연산자 하기 
		// 위의 45~51번째 줄과 아래 54~55번 줄은 같은 뜻이다.
		// false면 :뒤가 실행됨. true면 :앞이 실행됨.
		int d = 3;
		String strD = d < 10 ? "0" + d : d + "";
		System.out.println(strD);
		
		System.out.println("===== Normal Canlendar =====");
		// %d 는 숫자를 넣는 것, 자릿수 설정은 ()와 같이 함
		String dateFormat2 = String.format("%d-%d-%d %d:%d:%d:.%d (%s)", 
																		year,
																		month,
																		dayOfMonth,
																		hour,
																		minute,
																		second,
																		milliseconds,
																		dayOfWeek);
		
		System.out.println(dateFormat2);
		
		// 날짜 포멧팅 방법으로 표현하기 
		Calendar nowCal2 = Calendar.getInstance();
		
		// date로 변환
		Date nowDate = nowCal2.getTime();
		System.out.println(nowDate);

		// 날짜 표현식 지정
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss (EEE요일)");
		// 이 데이터는 심플데이터포멧에 있는 데이터 객체
		// 그 객체를 전달하면 위에서 출력됐던 Fri Jul 28 11:15:17 KST 2023가
		// ()안에 지정해둔 값으로 출력이 됨
		String formatDate = format.format(nowDate);
		System.out.println(formatDate);
		
	
	}

	public static void main(String[] args) {
		
		Calendar nowCal = Calendar.getInstance();
		nowCal.add(Calendar.DAY_OF_MONTH, -7); // 7일 전의 날짜가 나옴
		
		// 인스턴스 생성
		Date nowDate = nowCal.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd EEE");
		
		// 일주일 전 일자 출력해 보기
		String dateString = format.format(nowDate);
		System.out.println(dateString);
		
		// 시작 날짜 출력하기
		Calendar startCal = Calendar.getInstance();
		startCal.set(2023, 6, 12);
		
		Date startDate = startCal.getTime();
		String startDateString = format.format(startDate);
		System.out.println(startDateString);
		
		// 종료 날짜 눌력하기
		startCal.add(Calendar.DAY_OF_MONTH, 16);
		Date endDate = startCal.getTime();
		String endDateString = format.format(endDate);
		System.out.println(endDateString);
		
		// 캘린더에서 요일을 출력하기
		// 기업체는 구매일로부터 3 영업일 이내에 배송이 완료됩니다.
		// 오늘로부터 1 영업일 뒤가 언제인지 구해보는 로직 -- 정말 많이 사용되요.
		
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
		Date workingDate = cal.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy=mm-dd EEE");
		String workingDateString = dateFormat.format(workingDate);
		System.out.println(workingDateString);
	}
}
