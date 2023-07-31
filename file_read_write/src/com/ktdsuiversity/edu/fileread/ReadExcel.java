package com.ktdsuiversity.edu.fileread;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// application을 만들 때 반드시 필요한 부분
public class ReadExcel {

	public static void main(String[] args) {
		// work book < - excel file
		 // sheet < - sheet
		  //row < - 1행....
		   // cell < - a열....
		
		// 엑셀파일 읽어올 준비하기
		File excelFile = new File("C:\\Java Exam", "exceltest.xlsx");
		
		// 할당하기 
		Workbook readExcelWorkBook = null;

		// 확인하기 
		try {
			readExcelWorkBook = new XSSFWorkbook(excelFile);
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 여기까지 엑셀파일 가져오기 
		
		if (readExcelWorkBook != null) {
			
			// sheet 가져오기
			// 가장 첫번째 시트를 가져오기 
			// import 는 ss를 하기 !!
			Sheet sheet = readExcelWorkBook.getSheetAt(0);
			// 데이터가 존재하는 마지막 행 번호.
			int rowCount = sheet.getLastRowNum();
			for(int i=0; i <= rowCount; i++) {
				// row 확인하기 
				Row row = sheet.getRow(i);
				
				// 행안에 데이터가 존재하는 마지막 열의 번호 
				int cellCount = row.getLastCellNum();
				
				for(int j=0; j < cellCount; j++) {
					Cell cell = row.getCell(j);
					
					// 엑셀에 입력된 값을 출력 
					System.out.println(cell.getStringCellValue());
				}
			}
			
			// 파이프로부터 닫아주는 코드를 작성 
			try {
				readExcelWorkBook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
