package ex02_lamda;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex03_Function {
	public static void main(String[] args) {
		//컬렉션 프레임워크의 인터페이스에 일부는 함수형 인터페이스를 사용한다.
		//Arrays.asList(1,2,3).forEach(null);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		
		//void accept(T t)
		//list에 들어있는 요소를 하나씩 꺼내서 출력을 해라
		list.forEach(System.out::println); // x -> System.out.println(x)
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		hs.forEach(System.out::println);
		
		
		
	}
}
