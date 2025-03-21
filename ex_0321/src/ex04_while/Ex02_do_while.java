package ex04_while;

import java.util.Scanner;

public class Ex02_do_while {
	public static void main(String[] args) {
		//while문과 같이 조건을 만족할 때까지 반복한다.
		//다만, while문과 다른 점은 먼저 루프를 한 번 실행한 후
		//조건식을 검사한다는 점이다.
		//즉, 조건식의 결과와 상관없이 무조건 한 번은 실행한다.
		
		//do{
		//	반복하고자 하는 명령
		//}while(조건식)
		
		int i = 11;
		do {
			System.out.println(i);
		}while(i<=10);
		
		//1~10까지의 총합
		int j = 0;
		int sum = 0;
		do {
			sum += j;
			j++;
		}while(j<=10);
		System.out.println(sum);
		
		//비밀번호 확인 프로그램 만들기
		//사용자로부터 비밀번호를 입력받아 올바른 비밀번호가
		//입력될때까지 계속 입력을 요구하는 프로그램 만들기
		//비밀번호는 9486
		
		//비밀번호를 입력하세요 : 1234
		//비밀번호가 틀렸습니다. 다시 입력하세요.
		//비밀번호를 입력하세요: 9486
		//접속 성공!
		boolean q = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요 : ");
		int k = sc.nextInt();
		int password = 9486;
		do {
			if(k==password){
				System.out.println("접속 성공!");
				q = false;
			}
			else {
			System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
			System.out.println("비밀번호를 입력하세요 : ");
			k = sc.nextInt();
			}
		}while(q);
		
		//학생의 국어,영어,수학 점수를 입력받는다.
		//단, 각 과목은 40점 이상이어야 하며,
		//40점 미만이면 해당 과목 점수를 다시 입력받아야 한다.
		
//		boolean s = true;
//		System.out.println("국어 점수:");
//		int korean = sc.nextInt();
//		System.out.println("영어 점수:");
//		int english = sc.nextInt();
//		System.out.println("수학 점수:");
//		int math = sc.nextInt();
//		do {			
//			if((korean>=40) && (english>=40) && (math>=40)) {
//				System.out.println("합격");
//				s = false;
//			}
//			else{
//				System.out.println("점수를 다시 입력하세요");
//				System.out.println("국어 점수:");
//				korean = sc.nextInt();
//				System.out.println("영어 점수:");
//				english = sc.nextInt();
//				System.out.println("수학 점수:");
//				math = sc.nextInt();
//			}
//		}while(s);
		
		
		
		
		
		
	} 
}
