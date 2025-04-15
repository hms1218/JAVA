package test;

import java.util.ArrayList;
import java.util.List;

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
	}
}
