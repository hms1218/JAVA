package test;

import java.util.ArrayList;
import java.util.Arrays;
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
        
//		예를 들어 지갑의 크기가 30 * 15이고 지폐의 크기가 26 * 17이라면 
//		한번 반으로 접어 13 * 17 크기로 만든 뒤 
//		90도 돌려서 지갑에 넣을 수 있습니다. 
//		지폐를 접을 때는 다음과 같은 규칙을 지킵니다.
		
//		지폐를 접을 때는 항상 길이가 긴 쪽을 반으로 접습니다.
//		접기 전 길이가 홀수였다면 접은 후 소수점 이하는 버립니다.
//		접힌 지폐를 그대로 또는 90도 돌려서 지갑에 넣을 수 있다면 그만 접습니다.
		
		int[] wallet = {50,50};
		int[] bill = {80,30};
		boolean b = true;
		int count = 0;
		
		while(b) {
			if((wallet[0]>=bill[0]&&wallet[1]>=bill[1]) || (wallet[0]>=bill[1]&&wallet[1]>=bill[0])) {	
				break;
			}else {
				count++;
				
				if(bill[0]>bill[1]) {
					if(bill[0] % 2 ==1) {
						bill[0] = (int) Math.floor(bill[0] / 2.0);
					}
					else {
						bill[0] = bill[0] / 2;
					}
				}else {
					if(bill[1] % 2 ==1) {
						bill[1] = (int) Math.floor(bill[1] / 2.0);
					}
					else {
						bill[1] = bill[1] / 2;
					}
				}
				
			}
			
			
		}
		
		System.out.println(count);
		
		String[][] park = {
						  	{"A", "A", "-1", "B", "B", "B", "B", "-1"},
						  	{"A", "A", "-1", "B", "B", "B", "B", "-1"},
						  	{"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
						  	{"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
						  	{"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
						  	{"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
		};
		
		for(int i=0; i<park.length; i++) {
			for(int j=0; j<park[i].length; j++) {
				
			}
		}
		
		
		
		
		
		
		
		
	}
}
