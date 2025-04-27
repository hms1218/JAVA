package cd_test;

import java.math.BigInteger;

public class Ct_Memo7 {
	public static void main(String[] args) {
		//두 수의 합
		String a = "18446744073709551615";
        String b = "287346502836570928366";
        
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        
        BigInteger sum = big1.add(big2);
        String answer = sum.toString();
        
        //BigInteger -> 무한대까지 가능
        //연산을 하기위해서는 메서드 사용해야함
        //ex) 덧셈 -> a.add(b); -> a+b
	}
}
