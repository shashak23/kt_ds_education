package com.ktdsuiversity.edu.fileread;

import java.io.File;

public class Recursive {
	
	public void printAllItems(File dir) {
		// 존재하는지 확인
		// 존재하는지? && 폴더명인지 확인!
		if(dir.exists() && dir.isDirectory()) {
			File[] itemInDir = dir.listFiles(); // 반환할 때만 listFiles를 씀
			// 아이템이 널이면 종료해라 라는 걸 적어주기 
			if(itemInDir == null) {
				return;
			}
			// 배열이니까 반복을 시킴
			for (File item : itemInDir) {
				//너가 지금 보고 있는 아이템이 폴더야?
				if(item.isDirectory()) {
					//호출을 한번 더 하기 - 폴더일 때
					printAllItems(item);
				}
				else {
					// 폴더가 아니면 파일이겠쬬?
					// 그 전체 경로를 출력해라
					System.out.println(item.getAbsolutePath());
				}
				
			}
		}
		else {
			System.out.println(dir.getAbsolutePath());
		}
	}

	public void print(int n) {
		System.out.println("Hello" + n);
		
		if( n< 5) {
			print(n+1);
		}
		System.out.println("End" + n);
	}
	
	public static void main(String[] args) {
		Recursive r = new Recursive();
		//r.print(0);
		
		r.printAllItems(new File("C:\\"));
	}
}
