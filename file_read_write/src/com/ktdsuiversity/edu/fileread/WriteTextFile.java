package com.ktdsuiversity.edu.fileread;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteTextFile {

	// 한번 호출하면 한번의 폴더만 생성 됨
	public void makeDirectory(String path) {
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();  // makeDirectory! 
 		}
	}
	
	// 한번 호출해도 여러줄의 폴더가 생성이 됨
	public void makeDirectories(String path) {
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();  // makeDirectories! 
 		}
	}
	
	public void makeAndWriteFile(String directoryPath, 
								String fileName, 
								List<String> fileDescription) {
		File file = new File(directoryPath, fileName);
		
		// 파일을 생성할 위치가 없다면 폴더를 생성해준다.
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		// 동일한 파일명이 없을 때까지 순번을 증가시켜주는 기능
		// 파일이 존재하지 않을 때까지 반복
		int index = 1;
		String newFileName = null;
		while(file.exists()) {
			// writeText.txt -> writeText
			newFileName = fileName.substring(0, fileName.lastIndexOf("."));
			// writeText -> writeText(1)
			newFileName += "("+(index++)+")";
			// writeText(1) -> writeText(2) // 계속 증가 
			newFileName += fileName.substring(fileName.lastIndexOf("."));
			
			file = new File(directoryPath, newFileName); //이게 있어야지 제대로 생성이 됨
		}
		
		try {
			Files.write(file.toPath(), fileDescription);
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WriteTextFile wtf = new WriteTextFile();
		wtf.makeDirectory("C:\\java\\file\\dir");  // 만들기 - FileNotFoundException 발생 - 10번 줄
		wtf.makeDirectories("C:\\java2\\file\\dir");
		// 결과적으로 java2만 생성됨
		// 왜냐하면 tory는 순차적으로 폴더마다 만들라는 명령어를 넣어야하는데
		// 그게 아니라서...아래와 같이 해야한다.
		// wtf.makeDirectory("C:\\java");
		// wtf.makeDirectory("C:\\java\\file");
		// wtf.makeDirectory("C:\\java\\file\\dir");
		
		// 우리가 직접 java2에 폴더를 생성했어요		
		List<String> fileDesc = new ArrayList<>();
		fileDesc.add("반갑습니다. 반갑습니다. 고양이는 야옹야옹 베리는 냐옹냐옹!"); // 파일에 내용을 직접 작성해 보기 
		// wtf.makeAndWriteFile("C:\\java2\\file\\dir", "writeTest.txt", fileDesc);
		wtf.makeAndWriteFile("C:\\java3\\file\\dir", "writeTest.txt", fileDesc);
	}
}
