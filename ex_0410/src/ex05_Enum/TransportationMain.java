package ex05_Enum;

import java.util.Arrays;

public class TransportationMain {
	public static void main(String[] args) {
		//각 운송수단별 100을 갔을 때 금액 출력
		//name : xxx, 100km - fare : xxx
		
		Transportation[] trans = Transportation.values();
		
		for(Transportation t : trans) {
			System.out.println("name : "+ t.name() + ", 100km - fare : " + t.totalFare(100)+"원");
		}
		
		
	}
}
