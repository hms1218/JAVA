package ex02_break;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//1~50사이의 난수를 생성하고
		//난수를 맞추는 프로그램 만들기
		//적은 값이 난수보다 작으면
		//"맞춰야할 숫자가 더 큽니다."
		//적은 값이 난수보다 크면
		//"맞춰야할 숫자가 더 작습니다."
		
		//정답을 x번만에 맞췄습니다.
		
		//경우의 수 
		//1. 난수를 맞추는 경우 -> if()
		//2. 난수보다 큰 경우 -> if()
		//3. 난수보다 작은 경우 -> if()
		
		//반복횟수를 구하기 어려우니까
		//while문을 써보는게 어떨까?
		
		Random rd = new Random();
		int random = rd.nextInt(50)+1;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cnt = 0;
		
		// random!=num -> true
		while(true) { 
			System.out.println("숫자 입력:");
			num = sc.nextInt();
			cnt++;
			if(num==random) {
				System.out.println("정답");
				System.out.printf("정답을 %d번만에 맞췄습니다.",cnt);
				break;
			}
			else if(num < random) {
				System.out.println("맞춰야할 숫자가 더 큽니다.");
			}
			else if(num > random) {
				System.out.println("맞춰야할 숫자가 더 작습니다.");	
			}
			
		}
		
//		for(int i=0; i<1;) {
//			System.out.println("숫자 입력:");
//			num = sc.nextInt();
//			cnt++;
//			if(num==random) {
//				System.out.println("정답");
//				System.out.printf("정답을 %d번만에 맞췄습니다.",cnt);
//				break;
//			}
//			else if(num < random) {
//				System.out.println("맞춰야할 숫자가 더 큽니다.");
//				continue;
//			}
//			else if(num > random) {
//				System.out.println("맞춰야할 숫자가 더 작습니다.");
//				continue;
//			}
//		}
		
		
		
		
		
		
	}
}
