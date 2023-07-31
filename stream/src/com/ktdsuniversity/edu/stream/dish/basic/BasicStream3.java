package com.ktdsuniversity.edu.stream.dish.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BasicStream3 {
	
	public static void main(String[] args) {
		List<DishVO> dishes = new ArrayList<>();
		dishes.add(new DishVO("Pork", 1000, "MEET"));
		dishes.add(new DishVO("Salmon", 500, "FISH"));
		dishes.add(new DishVO("Beef", 1200, "MEET"));
		dishes.add(new DishVO("Chicken", 900, "MEET"));
		dishes.add(new DishVO("Pizza", 1500, "OTHER"));
		dishes.add(new DishVO("Rice", 300, "OTHER"));
		dishes.add(new DishVO("French Fries", 700, "OTHER"));
		
		// 칼로리가 1200미만인 요리 중 아무거나 하나 가져오기
		Optional<DishVO> anyDish = 
				dishes.stream()
			  .filter((dish)->dish.getCalories() < 1200)
			  .findAny();
		DishVO one = anyDish.get();
		System.out.println(one.getCalories());
		
		// 칼로리가 100 미만인 요리 중 아무거나 하나 가져와라
		Optional<DishVO> anyLowCaloryDish = 
				dishes.stream()
			  .filter((dish)->dish.getCalories() < 100)
			  .findAny();
		
		DishVO lowCaloryDish = 
				anyLowCaloryDish.orElse(new DishVO("기본 요리", 10, "OTHER"));
		System.out.println(lowCaloryDish.getName());
		System.out.println(lowCaloryDish.getCalories());
		
		
		// 칼로리가 500미만인 요리 중 아무거나 하나 가져와사 
		anyLowCaloryDish = 
				dishes.stream()
			  .filter((dish)->dish.getCalories() < 500)
			  .findAny();
		
		lowCaloryDish = 
				anyLowCaloryDish.orElse(new DishVO("기본 요리", 10, "OTHER"));
		System.out.println(lowCaloryDish.getName());
		System.out.println(lowCaloryDish.getCalories());
		
		// stream : 내부 반복자
		// peak : stream 내부의 값을 임시로 출력하고자 할 때 사용되는 함수 for
		// limit : 
		// parallelStream : 병렬처리를 하는 내부 반복자 (데이터의 수가 매우 많을 때)
		// filter : stream 내의 데이터를 정제하는 것(파라미터 -> booleab 반환) predicate
		// map : sream내의 데이터 형태를 변경하는 것(파라미터 -> 변경된 값 반환) function
		// flatMap : 함수 내에서 만들어진 다른 형태릐 stream을 원본 스트림으로 변환 function
		// distinct : stream 내부 데이터 중 중복된 값만 제거
		// sorted : 정렬을 해주는 함수
		// count : stream 내부의 요소 개수를 세어주는 최종함수
		// forEach : stream 내부의 값을 반복해주는 최종함수
		// collect : stream 내부의 값 중 가장 첫 번째 요소를 반환시키는 최종 함수 optional
		// findAny : stream 내부의 값을 임시로 출력하고자 할 때 사용되는 함수(forEach와 동일함)
		// findFirst : stream 내부의 값 중 아무거나 하나를 반환시키는 최종 함수 optional
		// skip : 
	}

}
