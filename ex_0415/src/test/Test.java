package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class A {
    void show() { System.out.println("A"); }
}

class B extends A {
    void show() { System.out.println("B"); }
}

public class Test {
	public static void main(String[] args) {
		List<? extends Number> list = new ArrayList<Integer>();
//		list.add(100);
		
		ArrayList<Person> p_list = new ArrayList<>();
		
		Person p = new Person();
		
		p_list.add(p);
		System.out.println(p);
		System.out.println(p_list.get(0));
		
		p_list.get(0).setName("홍길동");
		p_list.get(0).setAge(30);
		
		System.out.println(p_list.get(0).getName());
		System.out.println(p_list.get(0).getAge());
		
		p_list.add(p);
		
		p_list.get(1).setName("홍길동d");
		p_list.get(1).setAge(302);
		
		System.out.println(p_list.get(1).getName());
		System.out.println(p_list.get(1).getAge());
		
		Student s = new Student("홍길동",20);
		
		s.printInfo();
		
		A obj = new B();
        obj.show();
		
        List<String> words = Arrays.asList("apple", "dog", "banana", "cat", "grape");
//      문자열 리스트에서 길이가 4 이상인 문자열만 필터링하여, 알파벳 순으로 정렬 후 출력하는 스트림 코드를 작성하시오.
		words.stream().filter(x -> x.length() >= 4).sorted().forEach(System.out::println);
		
		
		
	}
}
