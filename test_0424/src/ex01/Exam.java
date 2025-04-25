package ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exam {
	
	//4번문제
	public int[] removeDuplicates(int[] i_arr) {
		Set<Integer> list = new HashSet<>();
		int[] answer = new int[5];
		for(int i=0; i<i_arr.length; i++) {
			list.add(i_arr[i]);
		}
		
		List<Integer> lists = new ArrayList<>(list);
		
		for(int i=0; i<lists.size(); i++) {
			answer[i] = lists.get(i);
		}
		
		return answer;
		
	}
	
	//	- 메서드명 : removeDuplicates
	//	- 매개변수 : 정수형 배열
	//	- 반환값 : 정수형 배열
	
	//5번문제
	public int max(int[] f_arr) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<f_arr.length; i++) {
			list.add(f_arr[i]);
		}
		int max_num = Collections.max(list);
		return max_num;
	}
	
	//7번문제
	public Map<String, Integer> wordFrequency(String text){
		Map<String,Integer> map = new HashMap<>();
		
		String[] textArray = text.split(" ");
		
		for(int i=0; i<textArray.length; i++) {
			map.put(textArray[i], map.getOrDefault(textArray[i], 0)+1);
		}
		
		return map;
	}
	
	//9번 문제
	public int sumOfDigits(int num) {
		int sum = 0;
		while(true) {
			sum += num % 10;
			num = num / 10;
			if(num == 0) {
				break;
			}
		}
		return sum;
	}
	

	
}
