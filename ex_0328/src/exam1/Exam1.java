package exam1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//정수가 아닌걸 입력했을 때
		//해당값은 정수가 아닙니다 라고 출력하기
		//정수 : 100
		//결과 : 100
		
		//정수 : aab
		//결과 : aab은(는) 정수가 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		
//		try {
//			System.out.print("정수 : ");
//			int num = sc.nextInt();
//			System.out.print("결과 : "+num);
//		} catch (InputMismatchException e) {
//			System.out.print("결과 : "+ sc.next() + "은(는) 정수가 아닙니다.");
//		}
		
		System.out.println("정수 입력 : ");
		String str = "";
		try {
			str = sc.next();
			int num = Integer.parseInt(str);
			System.out.println("결과 : " + num);
		} catch (Exception e) {
			System.out.println(str+"은 정수가 아닙니다");
		}
		
	}
}
