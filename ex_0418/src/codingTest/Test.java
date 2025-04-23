package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		String[] intStrs = {"0123456789","9876543210","9999999999999"};
//		int k = 50000;
//		int s = 5;
//		int l = 5;
//		
//		int[] answer = {};
//		answer = new int[3];
//		
//		int index = 0;
//        for(String string : intStrs){
//            answer[index++] = Integer.parseInt(string.substring(s,l+1));
//        }
//        
//        System.out.println(answer);
        
//		String myString = "dxxccxbbbxxaaaa";
//		String[] answer = myString.split("x");
//		List<String> list = new ArrayList<>(Arrays.asList(answer));
//        
//		Collections.sort(list);
//		
//		for(int i=0; i<list.size(); i++) {
//			list.remove("");
//		}
//		
//		System.out.println(list);
//        
//        System.out.println(Arrays.toString(answer));
		
//		String binomial = "0 - 7777";
//		String[] b = binomial.split(" ");
//		int answer = 0;
//		
//		int x = Integer.parseInt(b[0]);
//		int y = Integer.parseInt(b[2]);
//		
//		switch(b[1]) {
//			case "+" :
//				answer = x+y;
//				break;
//			case "-" : 
//				answer = x-y;
//				break;
//			case "*" :
//				answer = x*y;
//				break;
//		}
//		
//		System.out.println(Arrays.toString(b));
//		System.out.println(x-y);
//		System.out.println(answer);
		
//		int[][] board = {{0,1,2},{1,2,3},{2,3,4},{3,4,5}};
//		int k =2;
//		int answer = 0;
//		int sum = 0;
//		for(int i=0; i<board.length; i++) {
//			for(int j=0; j<board[i].length; j++) {
//				if(i+j<=k) {
//					sum += board[i][j];
//				}
//			}
//		}
//		
//		System.out.println(sum);
        
//		int arr[] = {3, 2, 4, 1, 3};
//		boolean flag[] = {true, false, true, false, false};
//		
//		int[] answer = {};
//        List<Integer> list = new ArrayList<>();
//        
//        for(int i=0; i<flag.length; i++){
//            if(flag[i]==true){
//                for(int j=0; j<arr[i]*2; j++) {
//                	list.add(arr[i]);
//                }
//                System.out.println("add: "+list);
//            }else {
//            	for(int j=0; j<arr[i]; j++) {
//            		list.remove(list.size()-1);
//            	}
//            	System.out.println("remove: "+list);
//            }
//            
//        }
//        
//        System.out.println("result: " + list);
        
//        int[] arr = {0, 1, 2, 3, 4};
//        int[][] queries = {{0,1},{1,2},{2,3}};
//        int[] answer = {};
//        
//        for(int[] query : queries) {
//        	int s = query[0];
//        	int e = query[1];
//        	for(int i=s; i<=e; i++) {
//        		arr[i] = arr[i]+1;
//        	}
//        }
//        
//        System.out.println(Arrays.toString(arr));
        
//        String s = "apporoograpemmemprs";
//        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
//        
//		System.out.println(list);
//		
//		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
//		Arrays.sort(arr, Collections.reverseOrder());
//		Arrays.sort(indices);
//		System.out.println(Arrays.toString(indices));
//		
//		for(int i=indices.length-1; i>=0; i--){
//            list.remove(indices[i]);
//        }
//		System.out.println(list);
		
		int[] num_list = {12, 4, 15, 1, 14};	
		int count = 0;
		
        for(int i=0; i<num_list.length;){
        	if(num_list[i]==1) {
            	i++;
            	continue;
            }
        	
            if(num_list[i]%2==0){
                num_list[i] = num_list[i] / 2;
                count++;
            }else{
                num_list[i] = (num_list[i]-1) / 2;
                count++;
            }
        }
        
        System.out.println(count);
        
        
	}
}
