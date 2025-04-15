package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(3);
		hs.add(5);
		hs.add(1);
		hs.add(2);
		
		System.out.println(hs);
		
		List<Integer> numberList = Arrays.asList(1,1,2,2,3,3,4,5,6,7,8,8,9);
		Set<Integer> numberSet = new HashSet<>(numberList);
		
		//Collection -> 인터페이스 
		//List   Set -> 인터페이스
		//AL	 HS  -> 
		
		System.out.println(numberList);
		System.out.println(numberSet); // 중복을 제거해줌(HashSet)
		
		List<Integer> result_list = new ArrayList<>(numberSet);
		
		System.out.println(result_list);
		
		
		
	}
}
