package cd_test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ct_Memo6 {
	public static void main(String[] args) {
		int[] arr = {0, 1,1,0};
		
		int[] answer = {};
        List<Integer> stk = new ArrayList<>();
        
        for(int i=0; i<arr.length;){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else{
                if(stk.get(stk.size()-1)==arr[i]){
                    stk.remove(stk.size()-1);
                     i++;
                }
                else{
                    stk.add(arr[i]);
                     i++;
                }
            }
        }
        //0
        int index=0;
        if(stk.size()==0) {
        	answer = new int[] {-1};
        }else {
        	answer = new int[stk.size()];
        }
        
        
        for(int i=0; i<stk.size(); i++) {      	
        	answer[index++] = stk.get(i);
        }
        
        System.out.println(Arrays.toString(answer));
    
        
        	
        	
	}
}
