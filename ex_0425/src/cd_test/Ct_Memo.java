package cd_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ct_Memo {
	public static void main(String[] args) {
		//기초문제 : 2의 영역
		
		int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};
		List<Integer> list = new ArrayList<>();
//		List<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 2) {
				list.add(i);
			}
		}
		
		int size = 0;
		if(list.size()==0) {
			size = 1;
		}else{
			size = list.get(list.size()-1) - list.get(0)+1;
		}
		
		int[] answer = new int[size];
		
		int index = 0;
		if(list.size()==0) {
//			answer.add(-1);
			answer[index++] = -1;
		}else if(list.size()>=1) {
			for(int i=list.get(0); i<=list.get(list.size()-1); i++) {
//				answer.add(arr[i]);
				answer[index++] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
}

//for(int i=0; i<arr.length; i++) {
//	if(arr[i] == 2) {
//		list.add(i);
//	}
//}
//
//if(list.size()==0) {
//	answer.add(-1);
//}else if(list.size()>=1) {
//	for(int i=list.get(0); i<=list.get(list.size()-1); i++) {
//		answer.add(arr[i]);
//	}
//}



