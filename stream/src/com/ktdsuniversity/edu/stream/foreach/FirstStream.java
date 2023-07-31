package com.ktdsuniversity.edu.stream.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FirstStream {

	// 기존에 배운 것 
	public void foreach() {
//	
//		List<Integer> numberList = new ArrayList<>();
//		numberList.add(1);
//		numberList.add(2);
//		numberList.add(3);
//		numberList.add(4);
//		numberList.add(5);
//		numberList.add(6);
//		numberList.add(7);
//		numberList.add(8);
//		numberList.add(9);
//		numberList.add(10);
//		
//		for(int number : numberList) {
//			System.out.println(number);
//		}
	}
	
	// steam으로 바꾸기 
	public void streamForeach() {
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		numberList.add(8);
		numberList.add(9);
		numberList.add(10);
		
		// 반복은 해주는 메소드 중에서 우리는 foreach를 사용할 거에요
		
		Stream<Integer> numberStream = numberList.stream();
//		numberStream.forEach(new Consumer<Integer>() {

			// foreach가 반복이 아니고 stream이 반복되는 것!
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
			
//		}); 
		// 위의 몇줄과 아래줄의 내용은 같은 내용이다. : 메소드를 구현하는 것 = 람다식
		// 타입 생략도 가능함 Integer 가 없어도 잘 나옵니다.
//		numberStream.forEach((Integer t) -> System.out.println(t));
		// 여러 줄을 출력해야하는 경우네느 {}를 사용하여 -> 뒤에 작성하여 반환할수가 있다.
//		numberStream.forEach((t) -> {
//					System.out.println("현재 숫자는" + t + "입니다");
//					System.out.println(t);
//					});
		// 이렇게도 사용이 가능하다
		numberList.stream()
				  .forEach(t -> System.out.println(t));
	}
	
	public static void main(String[] args) {
		FirstStream fs = new FirstStream();
		fs.streamForeach();
		
	}
}
