package tryCatch;

import java.util.Scanner;

public class TryMain2 {
	public static void main(String[] args) {
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			System.out.println("결과 : " + x);
		} catch (Exception e) {
			String s = sc.next();
			System.out.println(s+"은(는) 정수가 아닙니다.");
		}
	}
}

//정수 : 100
//결과 : 100

//정수 : aab
//결과 : aab은(는) 정수가 아닙니다.