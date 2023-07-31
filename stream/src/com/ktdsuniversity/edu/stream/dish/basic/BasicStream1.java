package com.ktdsuniversity.edu.stream.dish.basic;

import java.util.ArrayList;
import java.util.List;

// 객체 지향형이 아닌 함수형 자바임 ************ 
public class BasicStream1 {

	public static void main(String[] args) {
		// list를 스트림으로 만드는 형태가 많다고 함.
		List<DishVO> dishes = new ArrayList<>();
		dishes.add(new DishVO("Pork", 1000, "MEET"));
		dishes.add(new DishVO("Salmon", 500, "FISH"));
		dishes.add(new DishVO("Beef", 1200, "MEET"));
		dishes.add(new DishVO("Chicken", 900, "MEET"));
		dishes.add(new DishVO("Pizza", 1500, "OTHER"));
		dishes.add(new DishVO("Rice", 300, "OTHER"));
		dishes.add(new DishVO("French Fries", 700, "OTHER"));

		dishes.stream()
				// filter = 조건식에 맞는 것 들만 추려냄.
				// 람다로 구현해야하고, 할 수 있는 것들은 predicate 에서 T 제네릭 하에서 메소드가 정의되지 않은 것
				// 어레이 리스트의 디시 메소드를 호출하여, 람다
				.filter((dish) -> {
					System.out.println(">> " + dish.getCalories());
					return dish.getCalories() <= 400;
				})
				// 원래는 람다에 중괄호 사용 시, 반환값이 없어야하나 filter에서는 boolean 변수로 반환값이 필수이기때문에
				// 임의로 반환시켜줌

				// Stream 에서 최종함수가 실행될 경우,
				// Stream은 재활용하랴
				.forEach((dish) -> {
					System.out.println(dish.getName());
					System.out.println(dish.getCalories());
					System.out.println(dish.getCategory());
				});
		// 스트림을 반환하지 않는 모든 함수들은 최종 함수다.
		// stream 에서 fliter/foreach 반복.
		// fliter 에 해당하는 정답은 forEach서 반복됨

		// 요리명이 5글자 이상인것 만 출력해보기.
		dishes.stream().filter((dish) -> dish.getName().length() >= 5)
						.forEach((dish) -> {
			System.out.println("::: " + dish.getName());
		});

		// 요리명이 5글자 미만인것만 출력해보기
		dishes.stream().filter((dish) -> dish.getName().length() < 5)
						.forEach((dish) -> {
			System.out.println("<< " + dish.getName());
		});

		dishes.stream().filter((dish) -> dish.getName().startsWith("P"))
						.forEach((dish) -> {
			System.out.println(" P " + dish.getName());
		});

		dishes.stream().filter((dish) -> dish.getCategory() == "OTHER")
						.forEach((dish) -> {
			System.out.println("OTHER " + dish.getName());
		});

		// 500칼로리 미만인 음식은 몇개냐? list에서는 list.size로 이용 가능
		long count = dishes.stream().filter((dish) -> dish.getCalories() < 500)
				.count();
		System.out.println(count);

		// 500보다 칼로리가 큰 요리들 중 요리명이 6자리 이상인것만 출력해보기
		dishes.stream().filter((dish) -> dish.getCalories() > 500 
										&& dish.getName().length() > 6)
				// 혹은 filter를 여러개 사용해서 "&& dish.~ " 대신 아래 코드로 대체 가능
				// .filter ((dish) -> dish.getName().length() > 6 )
				.forEach((dish) -> {
					System.out.println("* " + dish.getCalories());
					System.out.println("* " + dish.getName());
				});
		// filter, forEach, count
		// filter : 데이터를 필터링 (Predicate(T) -> boolean) : 중간함수
		// forEach : 데이터를 반복 (Consumer: (T) -> void : 최종함수
		// count : 데이터의 개수 (파라미터 없음) 개수만 반환(long) : 최종함수

		// map : 데이터의 형태를 변경 (Function: (T) -> R) : 중간함수
		// 각 요리의 이름을 요리명의 길이로 변경
		dishes.stream().map((dish) -> dish.getName().length()) // 제네릭 DishVO를 int로 바꾼다.
				.distinct() // 값이 같은 것들은 모두 제거한다.
				.forEach((len) -> {// len은 변수명임
					System.out.println(len);
				});

	}
}
