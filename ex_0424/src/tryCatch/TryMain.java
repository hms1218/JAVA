package tryCatch;

import java.util.Scanner;

public class TryMain {
	public static void main(String[] args) {
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			System.out.println("입력받은 수 : "+x);
		} catch (Exception e) {
			System.out.println("정수만 입력가능");
		}
		
	}
}

//정수를 입력 받은 경우
//정수 : 100
//입력받은 수 : 100

//정수를 입력 받지 않은 경우
//정수 : aaa
//정수만 입력가능