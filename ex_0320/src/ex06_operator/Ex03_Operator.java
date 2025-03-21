package ex06_operator;

import java.util.Scanner;

public class Ex03_Operator {
	public static void main(String[] args) {
		//비트연산자
		//논리 연산자와 유사하지만 bit단위의 연산만 가능하다.
		//& 논리곱(AND) : 두 항이 모두 참이면 참, 아니면 거짓
		//| 논리합(OR) : 두 항 중 하나라도 참이면 참, 아니면 거짓
		//^ 배타적논리합(XOR) : 두 항이 다르면 참, 같으면 거짓
		//~ 부정(NOT) : 참을 거짓으로, 거짓을 참으로 연산
		
		int a = 10;//1010
		int b = 7;//0111
		int c = a & b; //0010 -> 2
		System.out.println("c : " + c);
		
		int a2 = 12; //1100
		int b2 = 8; //1000
		int c2 = a2 | b2; //1100 -> 12
		System.out.println("c2 : " + c2);
		
		int a3 = 9; //1001
		int b3 = 11; //1011
		int c3 = a3 ^ b3; //0010 -> 2
		System.out.println("c3 : "+c3);
		
		int x = 7; //0111
		System.out.println("~x : "+ ~x); //1000 ->8
		//~x -> -(x+1)

		//시프트 연산자
		//비트의 이동
		// <<, >>
		
		x = 10; // 1010
		int result = x << 1; // 0001 0100 -> 16 + 4 = 20
		System.out.println(result);
		result = x >> 1; // 0000 0101 -> 5
		System.out.println(result);
		
		//삼항연산자
		//조건식 ? 참일 때 실행할 명령 : 거짓일 때 실행할 명령;
		
		int i = 10;
		int i2 = 15;
		result = ++i >= i2 ? 1 : 0;
		System.out.println("result : "+result);
		
		//test
		//다음의 결과값을 예상하여 쓰시오
		int x1 = 5;
		int y1 = x1++; //-> 5(+1)
		
		System.out.println("x1의 값 : " + x1); //x1 = 6
		System.out.println("y1의 값 : " + y1); //y = 5
		
		//다음 연산의 결과를 예상하여 쓰시오
		int x2 = 10;
		int y2 = 20;
		int z2 = (++x2) + (y2--); //11 + 20(-1) = 31
		System.out.println(z2);
		
		//다음 연산의 결과를 예상하여 쓰시오
		//int a = 10;
		//int b = 12;
		//++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b 12) > 10;
		//11>=12,false||9<=12,false,false&&1>=0true,false&&22-12=10>10false
		//a=22
		//23>=12||9<=12&&1>=0&&20>10;
		//t||t&&t&&t
		//true
		//11>=12||9<=12&&1>=0&&20>10
		//f||t&&t&&t
		//true
		
		//국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		//1. 세 과목에 대한 합계 출력하기
		//2. 평균 출력하기 (합계/3.0)
		
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격
		//아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int korean = sc.nextInt();
		System.out.println("영어 : ");
		int english = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		float avg = (korean+english+math)/3;
		System.out.printf("평균 : %f ",avg);
		
		if(korean>=40 && english>=40 && math>=40 && avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		
		
		
	}
}
