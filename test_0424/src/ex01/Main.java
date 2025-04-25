package ex01;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {	
		Exam e = new Exam();
		//4번 문제
		int[] i_arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
		System.out.println(Arrays.toString(e.removeDuplicates(i_arr)));
		
		//5번 문제
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		System.out.println(e.max(f_arr));
		
		//6번 문제
		Student s = new Student("홍길동",30,20250424);
//		System.out.printf("이름 : %s, 나이 : %d, 학번 : %d\n",s.name,s.age,s.studentNum);
//		s.info();
		System.out.println(s.info());
		
		//7번 문제
		String text = "apple banana apple apple orange banana apple orange orange";
		Map<String,Integer> map = e.wordFrequency(text);
		
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			String name = m.getKey();
			int count = m.getValue();
			System.out.println(name + " : " + count);
		}
		
		
		//9번 문제
		int num = 12345;
		System.out.println(e.sumOfDigits(12345));
		
		//10번 문제
		Box<Integer> box = new Box<>(); 
		box.setValue(10);
		System.out.println("Integer 박스의 값: " + box.getValue());
		
		Box<String> box2 = new Box<>(); 
		box2.setValue("Hello, Generics!");
		System.out.println("String 박스의 값: " + box2.getValue());
		
		Box<Double> box3 = new Box<>(); 
		box3.setValue(3.14);
		System.out.println("Integer 박스의 값: " + box3.getValue());
		
	}
}
