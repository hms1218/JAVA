package cd_test;

import java.util.Arrays;

public class Ct_Memo4 {
	public static void main(String[] args) {
		int[] arr = {1,2};
		int[] answer = {};
		int count = 0;

		if(arr.length==1) {
			answer = new int[1];
			answer = arr;
		}else {
			while(true) {
				if((int)Math.pow(2, count) < arr.length && arr.length <= (int)Math.pow(2, count+1)) {
					answer = new int[(int)Math.pow(2, count+1)];
					for(int i=0; i<arr.length; i++) {
						answer[i] =arr[i];
					}
					break;
				}else {
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
