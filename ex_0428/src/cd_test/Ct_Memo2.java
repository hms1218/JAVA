package cd_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ct_Memo2 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},{4,5,6},{7,8,9}};
		int[][] answer = {};
		//4행 3열
		//1 2 3 0
		//4 5 6 0
		//7 8 0 0
		//9 0 0 0
		
		//2행 3열
		//1 2 3
		//4 5 6
		//0 0 0
		List<Integer> list = new ArrayList<>();
		for(int[] rows : arr) {
			list.add(rows.length);
		}
		int columns_max = Collections.max(list);
		int rows_max = arr.length;
		
		if(rows_max > columns_max) {
			answer = new int[rows_max][rows_max];
			for(int i=0; i<rows_max; i++) {
				for(int j=0; j<arr[i].length; j++) {
					answer[i][j] = arr[i][j];
				}
				for(int k=arr[i].length; k<rows_max; k++) {
					answer[i][k] = 0;
				}
			}
		}else if(rows_max < columns_max) {
			answer = new int[columns_max][columns_max];
			for(int i=0; i<rows_max; i++) {
				for(int j=0; j<arr[i].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
			for(int i=rows_max; i<columns_max; i++) {
				for(int k=rows_max; k<columns_max; k++) {
					answer[i][k] = 0;
				}
			}
		}else {
			answer = new int[rows_max][columns_max];
			for(int i=0; i<rows_max; i++) {
				for(int j=0; j<columns_max; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		}
		
		
		System.out.println(Arrays.deepToString(answer));
		
		
	}
}

//arraycopy 를 사용하는 방법
//arr[i] 줄을 0번째부터 array[i] 줄의 0번째칸으로 arr[0].length 길이만큼 복사해서 넣는다

//int max = Math.max(arr.length, arr[0].length);
//int[][] array = new int[max][max];
//
//for (int i = 0; i < arr.length; i++) {
//    System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
//}
//return array;




