package ex01_if;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//삼항연산자로 만들었던 x개의 농구공을 담기위한 박스의 개수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("농구공의 개수 : ");
		int basketBall = sc.nextInt();
		int box = basketBall / 5;
		
		if(basketBall % 5 == 0) {
			System.out.println("박스의 개수 : "+box);
		} else {
			System.out.println("박스의 개수 : "+(box+1));
		}
		
		//상자 하나에는 농구공이 5개 들어갈 수 있다.
		//x개의 농구공을 담기 위한 박스의 개수를 구하세요.
		//농구공의 개수는 키보드를 통해 입력받습니다.
		//System.out.println("농구공 개수: ");
		//int basketBall = sc.nextInt();		
		//int box = (basketBall % 5 == 0) ? basketBall/5 : basketBall/5+1;
		//System.out.println("박스의 개수 : " + box);
		
		
	}
}
