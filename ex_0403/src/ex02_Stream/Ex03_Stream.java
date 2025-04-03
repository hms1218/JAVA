package ex02_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex03_Stream {
	public static void main(String[] args) {
		//1. forEach()
		//모든 요소에 대해 작업 수행(보통 출력용)
		Stream.of("A","B","C")
			.forEach(System.out::println);
		
		System.out.println("---------------------");
		
		//2. collect()
		//스트림을 List,Set,Map 등으로 모을 때 사용
		List<String> result = Stream.of("apple","banana")
				.collect(Collectors.toList());
		
		//3. count()
		//요소의 개수를 long타입으로 반환
		long count = Stream.of("a","b","c").count();
		System.out.println(count);
		
		//Comparator
		//함수형 인터페이스
		//두 객체를 비교해서 정렬 순서를 정의하는 역할
		//java.util 패키지에 포함
		//람다식이나 메서드 참조로 자주 사용됨
		
		
		//4. min()
		//최솟값을 Optional로 반환
		Optional<String> min = Stream.of("dog","cat","zebra")
				.min(Comparator.naturalOrder());
		System.out.println(min.get());
		
		//5. max()
		Optional<String> max = Stream.of("dog","cat","zebra")
				.max(Comparator.naturalOrder());
		System.out.println(max.get());
		
		//6. anyMatch()
		//하나라도 조건이 만족하는지
		boolean hasShort = Stream.of("Java","go","Python")
				.anyMatch(t -> t.length() <= 2);
		System.out.println("hasShort : " + hasShort);
		
		//7. allMatch()
		//모든 요소가 조건을 만족하는지 판별
		boolean allLong = Stream.of("Java","Kotlin")
				.allMatch(t -> t.length() >= 4);
		System.out.println("allLong : " + allLong);
		
		//8. reduce()
		//스트림 요소를 누적해서 하나의 값으로 줄인다.(합계, 곱, 문자열 결합 등)
		//T result = stream.reduce(identity, accumulator);
		//identity : 초기값 (0, "")
		//accumulator : 누적함수 (a,b) -> a+b; 더한 값을 다시 a로 넣음 / a는 초기값,b는 요소
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sum = list.stream().reduce(0, (a,b) -> a+b);
		System.out.println("list의 모든 요소의 총 합 : " + sum);
		
		
		
		
	}
}
