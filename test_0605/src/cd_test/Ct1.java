package cd_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ct1 {
	public static void main(String[] args) {
		int[] nums = {3,1,2,3}; // N마리
		
		int num = nums.length / 2; // num = N/2
		
		List<Integer> list = new ArrayList<>();
		
		for(int a : nums) {
			list.add(a);
		}
		
		System.out.println(list.get(0));
		
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list2); //중복제거 리스트
		
		System.out.println("숫자개수 : ");
		
	}
}

//N마리중 N/2마리 가져갈 수 있음
//같은 종류는 같은 번호
//ex) 4마리 [3,1,2,3] : 3번 2마리, 1번 1마리, 2번 1마리

// N/2 <= 중복 제외 모든 숫자갯수 => N/2
// N/2 > 중복 제외 모든 숫자갯수 => 중복 제외 모든 숫자 갯수 