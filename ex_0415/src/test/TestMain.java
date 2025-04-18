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
        
        String number = "123";
        int x = 0;
        
        for(int i=0; i<number.length(); i++) {
        	
        }
        
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        
        for(int[] query : queries) {
        	int s = query[0];
        	int e = query[1];
        	String word = "";
        	for(int i= e; i>= s; i--) {
        		word += my_string.charAt(i); 
        	}
        	String start = my_string.substring(0,s);
        	String end = my_string.substring(e+1);
        	
        	my_string = start + word + end;
        };
        
//        int[] num_list = {4,2,6,1,7,6};
//        int[] answer = {};
//        int n = 2;
//        
//        if(num_list.length % 2 == 0){
//            answer = new int[num_list.length / n];
//        } else{
//            answer = new int[num_list.length / n +1];
//        }
//        
//        int index = 0;
//        
//        for(int i=0; i<num_list.length; i+=n){ 
//            answer[index++] = num_list[i];
//        }
//        
//        Arrays.sort(num_list);
//        System.out.println(Arrays.toString(num_list));
        
        
        
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        
        String answer = "";
        List<String> list = new ArrayList<>();
        
    	for(int i=0; i<my_strings.length; i++){
            list.add(my_strings[i].substring(parts[i][0],parts[i][1]+1));
        }
        
  
        for(int j=0; j<list.size(); j++) {
        	answer += list.get(j);
        }
        
        System.out.println(answer);
        
        my_string = "ProgrammerS123";
        answer = my_string.substring(my_string.length()-11);
        System.out.println(answer);
        
        my_string = "xxxxixxxx";
        
        System.out.println(Arrays.toString(my_string.split("x")));
        
        int[] a = {};
        String[] s = my_string.split("x",-1);
        
        System.out.println(Arrays.toString(s));
        
        if(my_string.endsWith("x")){
            a = new int[s.length+1];
        }else{
            a = new int[s.length];
        }
        
        for(int i=0; i<my_string.split("x").length; i++) {
        	a[i] = s[i].length();
        }
        System.out.println(Arrays.toString(a));
       
        
		
	}
}
