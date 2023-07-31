package com.ktdsuiversity.edu.fileread;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReadTextFile {
	
	public void testFile() {
		File file = new File("C:\\Java Exam", "Java Exam.txt");
		// file 로 쓸 수 잇는 것은 총 4가지
		// 1. string 경로 붙이기
		// 2. url 원격지원을 호출할 수 있음
		// 3. file parent 파일을 불러오기
		// 4. file string parent 부모파일, 읽어보고 싶은 파일 부르기
		// ""안에 "\"를 쓰면 하나의 문자로 인식함
		
		// C:\\Java Exam 에 Java Exam.txt 이 존재하면 true, 아니면 false를 반환함
		System.out.println(file.exists());
		// C:\\Java Exam 에 Java Exam.txt 이 경로의 객체가 파일이면 true, 아니면 false
		System.out.println(file.isFile());
		// C:\\Java Exam 에 Java Exam.txt 이 경로의 객체가 폴더면 true, 아니면 false
		System.out.println(file.isDirectory());
		// C:\\Java Exam 에 Java Exam.txt 이 객체의 절대 경로!
		System.out.println(file.getAbsolutePath());
		
		// C:\\Java Exam 에 Java Exam.txt 의 파일명 또는 폴더명
		System.out.println(file.getName());
		// 파일 길이 
		System.out.println(file.length());
		// 마지막 수정 시간
		System.out.println(file.lastModified());
		// 현재 경로의 부모(상위) 경로
		System.out.println(file.getParent());
		// 현재 경로가 폴더일 경우, 하위의 모든 마일과 폴더목록을 배열로 반환
		System.out.println(file.listFiles());

	}
	
	
	public void readFile() {
		File file = new File("C:\\Java Exam", "Java Exam.txt");
		
		if(existFile(file)) {
			List<String> fileLine = readFile(file);
			for (String string : fileLine) {
				System.out.println(string);
			}
			
		}
		
//		// 파일이 위의 객체 경로에 존재하는지 확인하는 코드 
//		if(file.exists() && file.isFile()) {
//			
//			// 파일의 내용을 할당받기 위해서 리스트 인스턴스 생성
//			List<String> fileLine = new ArrayList<>();
//			
//			try {
//				fileLine.addAll(Files.readAllLines(file.toPath(), Charset.forName("UTF-8")));
//				// 파일의 모든 내용을 읽어서 list로 변환해주는 코드
//				// Files.readAllLines(file.toPath(), Charset.forName("UTF-8"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			for (String line : fileLine) {
//				System.out.println(line);
//			}
//		}
	}
	
	/**
	 * 파일이 존재하는지 확인하는 코드
	 * @param file 읽으려고 하는 파일 인스턴스
	 * @return file의 존재 여부(true: 존재함. false:존재하지 않거나 폴더임)
	 */
	public boolean existFile(File file) {
		return file.exists() && file.isFile();
	}
	
	/**
	 * 파일을 읽어서 list로 전환하는 코드
	 * @param file 읽으려고 하는 파일 인스턴스
	 * @return 파일을 예외없이 읽었을 경우 List<string>으로 반환
	 * 			예외가 발생했을 경우 null을 반환
	 */
	public List<String> readFile(File file){
		try {
			return Files.readAllLines(file.toPath(), Charset.forName("UTF-8"));
		} catch (IOException e) {
			// return하는 두 가지 경우를 작성해야함
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		
		ReadTextFile rtf = new ReadTextFile();
//		rtf.testFile();
		rtf.readFile();
		
	}

}
