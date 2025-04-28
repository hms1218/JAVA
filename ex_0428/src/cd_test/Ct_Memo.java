package cd_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ct_Memo {
	public static void main(String[] args) {
		//무작위로 k개수 뽑기
		
		int[] arr = {11,11,11,1,1,2,1};
		int k = 2;
		int[] answer = new int[k];
		
//		Set<Integer> set = new HashSet<>();
//		
//		for(int i=0; i<arr.length; i++) {
//			set.add(arr[i]);
//		}
		
		List<Integer> list  = new ArrayList<>();
		
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(list.contains(arr[i])) {
				continue;
			}else {
				list.add(arr[i]);
			}
		}
		System.out.println(list);
		
		if(list.size() < k) {
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
			for(int j=list.size(); j<k; j++) {
				answer[j] = -1;
			}
		}else {
			for(int i=0; i<k; i++) {
				answer[i] = list.get(i);
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
}

//랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다. 
//적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후, 
//지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
//
//이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
//
//정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 
//완성될 배열을 return 하는 solution 함수를 완성해 주세요.
//
//단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.