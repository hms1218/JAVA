package ex04_exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		int[] x = {1,2,3,4,5};
		
		mt.maxFinder(x);
		
		int r = 2;
		
		mt.circleArea(r);
		System.out.println(mt.circleRound(r));
		
		mt.calculator(1,2,'+');
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("정수 입력 : ");
//			int number = sc.nextInt();
//			if(mt.check(number).equals("정답!")) {
//				System.out.println(mt.cnt+"회 만에 정답입니다.");
//				break;
//			} else {
//				System.out.println(mt.check(number));
//				mt.cnt++;
//			}
//		}
		Random rd = new Random();
		int[] random = new int[100];
		
		mt.PrintGraph(random);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
