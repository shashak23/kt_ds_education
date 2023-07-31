package com.ktdsuniversity.edu.stream.dish.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStream2 {

	public static void main(String[] args) {
		List<DishVO> dishes = new ArrayList<>();
		dishes.add(new DishVO("Pork", 1000, "MEET"));
		dishes.add(new DishVO("Salmon", 500, "FISH"));
		dishes.add(new DishVO("Beef", 1200, "MEET"));
		dishes.add(new DishVO("Chicken", 900, "MEET"));
		dishes.add(new DishVO("Pizza", 1500, "OTHER"));
		dishes.add(new DishVO("Rice", 300, "OTHER"));
		dishes.add(new DishVO("French Fries", 700, "OTHER"));

		// 함수형 언어의 특징
//		Predicate<Integer> isOddNumber = (number) -> number % 2 == 1;
//		boolean isOdd = isOddNumber.test(51);
//		System.out.println(isOdd);
//		
//		Function<Integer, Predicate<Integer>> oddFuncion =
//				(number) -> ((number2)-> number % 2 == 1);
		
		
		// 채식 요리만 출력해 보기
		// 1. 람다
		dishes.stream()
			  .filter((dish)-> dish.isVegeterian())
			  .forEach((dish)->{
				  System.out.println(dish.getName());
			  });
		
		
		// 2. 메소드 레퍼런스
		dishes.stream()
		      .filter(DishVO :: isVegeterian) // 람다 헤더, 람다 바디, 화살표 모두 생략
		      //.map((dish)-> dish.getName()) // 이 줄과 아랫줄을 같은 뜻이다.
		      .map(DishVO::getName)
		      .forEach(System.out::println);
		// 결과적으로 1번 코드와 2번 코드는 같은 것이다.
		
		// 요리의 종류가 meet인 것만 골라 요리명만 list에 할당하기
		dishes.stream()
			  .filter((dish)-> dish.getCategory().equals("MEET"))
			  .map(DishVO::getName)
			  .collect(Collectors.toList());
		
		List<String> meetDishName =
				dishes.stream()
				      .filter((dish)->dish.getCategory().equals("MEET"))
				      .map(DishVO::getName)
				      .collect(Collectors.toList());
		
		System.out.println(meetDishName);
	
	// 배열을 이르스로 변경해서 짝수만 골라내 중복요소 제거한 후 리스트로 변환한다.
		Integer[] numberArray = {1,2,3,4,5,1,2,3};
		// 배열을 리스트로 변경해 보아요
		List<Integer> numberList = Arrays.asList(numberArray);
		
		// numberlist를 stream으로 변경해 짝수만 걸러낸 후,
		// 중복요소를 제거하고 리스트로 변환
		List<Integer> evenList = numberList.stream()
				  .filter((number)-> number % 2 == 0)
				  .distinct()
				  .collect(Collectors.toList());
		System.out.println(evenList);
	
		StringBuffer sb = new StringBuffer();
		// 이렇게 양이 많을때에는 alt + shifh + a 눌러서 편집기 켜서
		// 범위를 정하고 키를 순서대로 누르는데
		// 이 때 엔터를 함부로 하지 않도록 주의하자 !
		sb.append(" 기본 용어\n\n");
		sb.append("Class  개체를 만들기 위한 템플릿 또는 청사진입니다. 개체의 attribute, constructe, method를 정의합니다. ");
		sb.append("Object 클래스의 인스턴스. 개체에는 클래스에 의해 정의된 속성과 메소드가 있습니다.");
		sb.append("Method  특정 작업을 수행하기 위해 개체에서 호출할 수 있는 함수 또는 루틴입니다.");
		sb.append("Inheritance 한 클래스가 부모 클래스에서 속성과 메서드를 상속하는 기능입니다. 이를 통해 코드를 재사용하고"  );
		sb.append("보다 전문화돈 클래스를 생성할 수 있습니다.         ");
		sb.append("Interface 클래스가 구현해야하는 메서드 집합입니다. 인터페이스는 따라야 할 과정에 대한 계약을 정의하는데"  );
		sb.append("사용합니다.                           ");
		sb.append("Package  관련 클래스 및 인터페이스의 그룹입니다. 패키지는 코드를 구성하고 이름 충돌을 방지하는데 사용됩니다."  );
		sb.append("JRE Java Runtime Environmen 자바 응용 프로그램이 실행되는 sw 환경, 여기에는 JVM과 라이브러리 세트 및 기타 파일이 포함됩니다.");
		sb.append("JDK Java Development Kit: JRE, 컴파일러 및 기타 도구를 포함하여 JAVA 애플리케이션을 개발하기 위한 도구 세");
		sb.append("JIT(just in Time)Compile 런타임에 java 바이트 코드를 기계 코드로 컴파일하는 JVM의 기능입니다. 이는 java ' 애플리케이션의 성능을 향상시킵니다.");
		sb.append("Gargabe Collection 프로그램에서 더이상 사용하지 않는 메모리를 자동으로 해제하는 JVM의 기능입니다. 이는 메모리 누수 및 기타 메모리 관련 문제를 방지하 도움이 됩니다.");  
		sb.append("primitive type 기본타입, 8종류, 크게 정수형/실수형/문자형 그리고 논리형 타입으로 나뉨. "  );
		sb.append(" 정수형  byte, short, int, long      ");
		sb.append(" 실수형  float, double             ");
		sb.append(" 문자형  char                       ");
		sb.append(" 논리형  boolean 기본값은 false        ");
		sb.append("이외 나머지를 reference type이라고 함");
		String posting = sb.toString();
		// 띄어쓰기를 가지고 다 잘라서 그 중에 길이사 몇글자 이상인 것만 가져와서
		// 그 중에 3개만 추리는 것을 할 거에요! 
		List<String> wordList =
				Arrays.asList(posting.split(" ")) // 띄어쓰기를 반드시 해야함, 배열을 리스트로 바꾸는 방법 첫 번째!
					  .stream()
					  .map((word)-> {
						  word = word.trim();
						  // 한글과 영어 숫자, 스페이스 다 제외하고
						  // 전부 공백으로 덮어라 
						  word = word.replaceAll("[^가-힣a-zA-Z0-9]", "");
						  return word;
					  })
					  // 맵이 변경시켜준 데이터를 가지고 와서 6개 이상만 가지고 와서 
					  .filter((word) -> word.length() >=6)
					  .distinct() // 중복제거하고
					  .limit(3)   
					  .skip(2)  // 두 개를 건너뛰기
					  .collect(Collectors.toList());
		System.out.println(wordList);
		
		// 엔터를 기준으로 데이터를 잘라 배열로 만든 후, 리스트로 변환한다.
		Arrays.asList(posting.split("\n"))
			  // 스트림으로 변환한다/
			  //.stream() // 여기까지는 Stream<Strin>으로 만들어졌을 거에요 
			  .parallelStream()  // 병렬처리 스트림
			  .peek(System.out::println)
			  //데이터의 형태를 바꾼다. 한 줄의 텍스트를 띄어쓰기 기준으로 잘라 배열로 만든다.
			  // .map((line) -> Stream.of(line.split(" ")) ) // 여기서 Stream<String>으로 바꿔준다.
			  // 위의 상태로는 작업이 어려우니 이걸 평면화 시켜주는 flaftmap이 필요함
			  .flatMap((line) -> Stream.of(line.split(" ")) )
			  //출력해본다
			  .forEach(System.out::println);
	}

}
