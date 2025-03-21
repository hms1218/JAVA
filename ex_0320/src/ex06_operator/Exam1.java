package ex06_operator;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
				//1. 세 과목에 대한 합계 출력하기
				//2. 평균 출력하기 (합계/3.0)
				
				//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
				//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격
				//아니면 불합격
				
				Scanner sc = new Scanner(System.in);
				
//				System.out.println("국어점수 : ");
//				int korean = sc.nextInt();
//				System.out.println("영어점수 : ");
//				int english = sc.nextInt();
//				System.out.println("수학점수 : ");
//				int math = sc.nextInt();
//				
//				int total = (korean+english+math);
//				float avg = (float)total / 3;
//				System.out.println("총점 : "+total);
//				System.out.println("평균 : "+avg);
//				
//				String result = (korean>=40 && english>=40 && math>=40 && avg>=60 ? "합격" : "불합격");
//				System.out.println(result);
//				if(korean>=40 && english>=40 && math>=40 && avg>=60) {
//					System.out.println("합격");
//				}else {
//					System.out.println("불합격");
//				}
				
				//-------------------------------------------------------
				
				//상자 하나에는 농구공이 5개 들어갈 수 있다.
				//x개의 농구공을 담기 위한 박스의 개수를 구하세요.
				//농구공의 개수는 키보드를 통해 입력받습니다.
				
//				System.out.println("농구공 개수: ");
//				int basketBall = sc.nextInt();
//				
//				int box = (basketBall % 5 == 0) ? basketBall/5 : basketBall/5+1;
//				System.out.println("박스의 개수 : " + box);
				
				//-------------------------------------------------------
				
				//과수원이 있다.
				//배,사과,오렌지를 키우고 있는데 하루에 생산되는 양은
				//각각 5,7,5개이다.
				//과수원에서 하루에 생산되는 총 개수를 출력하고,
				//시간당 전체 과일의 생산 개수를 출력하시오.
				//평균값을 담는 변수는 float으로 할 것.
				
				
				int fruit1 = 5;
				int fruit2 = 7;
				int fruit3 = 5;
				int total = fruit1+fruit2+fruit3;
				float avg = (float)total/24;
				System.out.println("총 개수 :"+total);
				System.out.println("평균 생산 개수 :"+avg);
				
				
				
				
				
				
				
	}
}
