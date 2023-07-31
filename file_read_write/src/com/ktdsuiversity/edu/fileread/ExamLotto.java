package com.ktdsuiversity.edu.fileread;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ExamLotto {

	//파일을 읽을려면 Files.readAllLines();
	//간단하게 경로를 주려면 file을 이용해서 쓰면 편해요 
	public static void main(String[] args) {
		
		File csv = new File("C:\\Java Exam","java_excel.csv");
		
		List<String> csvLine = null; // null로 미리 선언하고
		
		// 파일이 있는지 확인하기
		if(csv.exists() && csv.isFile()) {
			try {
				// 파일 읽기 
				// 파일명이 다르면 파일을 읽다가 에러가 나는거
				// 그래서 try를 하지 않고 catch로 넘어가버리고
				// 할당 받지 않은 코드는 결국 받지 않은 채로 null이 됨
				// 이를 해결하기 우해서 null체크를 반드시 해줘야 합니다.
				csvLine = Files.readAllLines(csv.toPath()); // 할당만 해줌
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			// 출력은 바깥쪽에서 하는게 좋은데 : 실행을 할 때 예외가 발생할 수 있는데 
			// 실제로 try는 별도로 잡아가는 부분이 커질수록 점차 늘어짐
			// 캐치로 날라오는 걸 보안상 안전하지 않은 코드 -> 그래서 널 체크하기
			if(csvLine != null) {
				
				List<LanguageVO> lanlist = new ArrayList<>();
				for (String string : csvLine) {
					lanlist.add(new LanguageVO(string.split(",")));
				}
				// 랜덤 박스 만들기 
//				Random random = new Random();
//				int randomIndex = random.nextInt(csvLine.size());
//				System.out.println(csvLine.get(randomIndex));
				
//				for (String string : csvLine) {
//					System.out.println(string);
//				}
			}
		}
	}
}
