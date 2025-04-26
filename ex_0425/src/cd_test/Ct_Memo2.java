package cd_test;

import java.util.Arrays;

public class Ct_Memo2 {
	public static void main(String[] args) {
		//배열 조각하기
		//Arrays.copyOfRange(배열, 시작인덱스, 마지막인덱스)
		//시작인덱스 ~ 마지막-1 인덱스 까지 자름(복사)
		//내가 원하는 범위의 배열을 복사하기 ( 배열을 자를 때 유용하다.)
		
		int[] arr = {7,8,9,10};
		int[] query = {4,1,2};

		int[] answer = new int[10];
        int index = 0;
        
        for(int i=0; i<query.length; i++){
            if(i%2==0) {
            	arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            	System.out.println(Arrays.toString(arr));
            }else {
            	arr = Arrays.copyOfRange(arr, query[i], arr.length);
            	System.out.println(Arrays.toString(arr));

            }
        }
        
        
        
	}
}
