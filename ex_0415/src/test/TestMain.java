package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Person1 {
    String name;
}

public class TestMain {
	public static void main(String[] args) {
		
		Change c_lamda = (String string) -> {return string.toUpperCase();};  
		
		System.out.println(c_lamda.upper("hello"));
		
		
        Person1 p1 = new Person1();
        p1.name = "Alice";

        Person1 p2 = p1;
        p2.name = "Bob";

        System.out.println(p1.name);
        
        // 80점 이상인 학생만 출력하세요
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 72);
        scores.put("Charlie", 90);
       
        Set<Map.Entry<String, Integer>> students = scores.entrySet();
		
		for(Map.Entry<String, Integer> student : students) {
			if(student.getValue() >= 80) {
			System.out.println(student.getKey());
			}
		}

		String number = "123";
		int answer = 0;
		
//		for(int i=0; i<number.length(); i++) {
//			char c = number.charAt(i);
//			answer += c - '0';
//		}
//		System.out.println(answer);
		
		String[] list = number.split("");

		int sum = 0;
		for(int i=0; i<number.length(); i++) {
			sum += Integer.parseInt(list[i]);
		}
		answer = sum % 9;
		
		int a=2;
		int b=2;
		int c=2;
		int d=2;
		
		if((a==b)&&(b==c)&&(c==d)&&(d==a)) {
			System.out.println(a);
		}
		
		
		
		
		
	}
}
