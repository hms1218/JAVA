package ex02_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01_Stream {
	public static void main(String[] args) {
		//1. 배열로부터 생성
		String[] fruits = {"Apple","Banana","Cherry"};
		Stream<String> fruitStream = Arrays.stream(fruits);
		
		fruitStream.forEach(System.out::println);
		
		//기본자료형의 배열
		//IntStream, DoubleStream, LongStream으로 처리된다.
		int[] numbers = {1,2,3,4};
		IntStream numberStream = Arrays.stream(numbers);
		
		numberStream.forEach(System.out::println);
		
		//2. 컬렉션으로부터 생성
		List<String> names = Arrays.asList("Alice","Bob","Charlie");
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		
		//3. Stream.of()로 직접 생성
		//메서드 안에 직접 값을 나열해서 스트림을 만들 수 있다.
		Stream<String> stream = Stream.of("A","B","C");
		stream.forEach(System.out::println);
		
		//4. 비어있는 스트림 생성
		//처음부터 아무 요소도 없는 빈 스트림을 생성
		//Stream.empty()를 사용한다.
		Stream<String> emptyStream = Stream.empty();
		System.out.println(emptyStream.count());
		
		//5. 기본형스트림
		//
		
		//내부반복
		//개발자가 반복을 제어하지 않고, 스트림이 알아서 요소들을 반복하면서 처리하는 방법
		//어떻게 반복할지는 스트림이 정하고, 반복하면서 무엇을 할지를 정하면 된다.
		
		//지연연산(Lazy Evaluation)
		//중간 연산은 최종 연산이 실행되기 전까지 아무 일도 하지 않는다.
		//최종 연산이 호출될 때까지 연기되는 처리방식이다.
		
		//불변성(Immutable)
		//원본데이터는 변경하지 않는다.
		
		//일회성
		//스트림은 최종연산이 끝나면 다시 중간연산을 할 수 없다.
		
		//최종연산
		//스트림 파이프라인의 마지막에 실행되는 연산
		//스트림이 소비(consumed)되고, 실제 데이터가 처리된다.
		//중간 연산들을 실행하게 하는 트리거이자, 스트림의 결과를 만드는 연산
		//특징 :
		//스트림을 종료시키며, 다시 사용할 수 없다.
		//값을 반환한다.
		
		
		
	}
}
