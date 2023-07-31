package baseball;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BaseballStream {

	public static void main(String[] args) {
		
		// 파일 불러오기 
		File battingFile = new File("C:\\Users\\User\\Downloads\\baseballdatabank-master\\baseballdatabank-master\\core", "Batting.csv");
		
		// 파일을 스트림으로 읽어온다
		// string으로 반환하는데 그게 생각보다 메모리를 많이 잡지 않아요
		// try catch로 잡고 
		try {
			Files.lines(battingFile.toPath())
			     .skip(3)
			     .map(line -> new BattingVO(line.split(",")))
			     .forEach((vo) ->{
			    	 System.out.println(vo.getPlayerId());
			     });
		} catch (IOException e) {

			e.printStackTrace();
		} 
		
		
		System.out.println(Integer.MAX_VALUE);
	}

}
